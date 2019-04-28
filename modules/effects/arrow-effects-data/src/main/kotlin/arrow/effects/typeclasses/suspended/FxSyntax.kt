package arrow.effects.typeclasses.suspended

import arrow.Kind
import arrow.core.Either
import arrow.core.EitherOf
import arrow.core.OptionOf
import arrow.core.TryOf
import arrow.core.fix
import arrow.core.identity
import arrow.data.extensions.list.traverse.traverse
import arrow.data.fix
import arrow.effects.typeclasses.Concurrent
import arrow.effects.typeclasses.ExitCase
import arrow.effects.typeclasses.Fiber
import arrow.typeclasses.suspended.BindSyntax
import kotlin.coroutines.CoroutineContext

interface FxSyntax<F> : Concurrent<F>, BindSyntax<F> {

  val context: CoroutineContext

  suspend fun <A> effectIdentity(a: A): A = a

  @Suppress("PropertyName")
  val NonBlocking: CoroutineContext
    get() = dispatchers().default()

  fun <A, B> CoroutineContext.parTraverse(
    effects: Iterable<Kind<F, A>>,
    f: (A) -> B
  ): Kind<F, List<B>> =
    effects.fold(mutableListOf<Kind<F, Fiber<F, B>>>()) { acc, fa ->
      acc.add(fork(fa.map(f)))
      acc
    }.traverse(this@FxSyntax) { kind ->
      kind.flatMap { (join, _) -> join }
    }.map { it.fix() }

  fun <A> CoroutineContext.parSequence(effects: Iterable<Kind<F, A>>): Kind<F, List<A>> =
    parTraverse(effects, ::identity)

  fun <A> ensure(fa: suspend () -> A, error: () -> Throwable, predicate: (A) -> Boolean): Kind<F, A> =
    effect(fa).ensure(error, predicate)

  fun <A> CoroutineContext.effect(f: suspend () -> A): Kind<F, A> =
    defer(this@effect) { f.effect() }

  fun <A> (suspend () -> A).effect(unit: Unit = Unit): Kind<F, A> = effect(this)

  fun <A, B> (suspend (A) -> B).effect(): (Kind<F, A>) -> Kind<F, B> = { fa ->
    fa.flatMap { a ->
      effect { this(a) }
    }
  }

  fun <A, B, C> (suspend (A, B) -> C).effect(): (Kind<F, A>, Kind<F, B>) -> Kind<F, C> =
    { ka, kb ->
      ka.flatMap { a ->
        kb.flatMap { b ->
          effect { this(a, b) }
        }
      }
    }

  fun <A, B, C, D> (suspend (A, B, C) -> D).effect(): (Kind<F, A>, Kind<F, B>, Kind<F, C>) -> Kind<F, D> =
    { fa, fb, fc ->
      fa.flatMap { a ->
        fb.flatMap { b ->
          fc.flatMap { c ->
            effect { this(a, b, c) }
          }
        }
      }
    }

  fun <A, B> (suspend (A) -> B).flatLiftM(unit: Unit = Unit): (A) -> Kind<F, B> = { a ->
    effect { this(a) }
  }

  fun <A, B, C> (suspend (A, B) -> C).flatLiftM(): (A, B) -> Kind<F, C> = { a, b ->
    effect { this(a, b) }
  }

  fun <A, B, C, D> (suspend (A, B, C) -> D).flatLiftM(): (A, B, C) -> Kind<F, D> = { a, b, c ->
    effect { this(a, b, c) }
  }

  suspend fun <A> handleError(fa: suspend () -> A, recover: suspend (Throwable) -> A): Kind<F, A> =
    effect(fa).handleErrorWith(recover.flatLiftM())

  suspend fun <A> OptionOf<A>.getOrRaiseError(f: () -> Throwable): Kind<F, A> =
    this@getOrRaiseError.fromOption(f)

  suspend fun <A, B> EitherOf<B, A>.getOrRaiseError(unit: Unit = Unit, f: (B) -> Throwable): Kind<F, A> =
    this@getOrRaiseError.fix().fromEither(f)

  suspend fun <A> TryOf<A>.getOrRaiseError(f: (Throwable) -> Throwable): Kind<F, A> =
    this@getOrRaiseError.fromTry(f)

  suspend fun <A> attempt(fa: suspend () -> A): Kind<F, Either<Throwable, A>> =
    effect(fa).attempt()

  fun <A, B> bracketCase(
    f: suspend () -> A,
    release: suspend (A, ExitCase<Throwable>) -> Unit,
    use: suspend (A) -> B
  ): Kind<F, B> =
    effect(f).bracketCase(release.flatLiftM(), use.flatLiftM())

  fun <A, B> bracket(
    f: suspend () -> A,
    release: suspend (A) -> Unit,
    use: suspend (A) -> B
  ): Kind<F, B> =
    effect(f).bracket(release.flatLiftM(), use.flatLiftM())

  fun <A> uncancelable(f: suspend () -> A): Kind<F, A> =
    effect(f).uncancelable()

  fun <A> guarantee(
    f: suspend () -> A,
    finalizer: suspend () -> Unit
  ): Kind<F, A> =
    f.effect().guarantee(finalizer.effect())

  fun <A> Kind<F, A>.guaranteeCase(
    unit: Unit = Unit,
    finalizer: suspend (ExitCase<Throwable>) -> Unit
  ): Kind<F, A> =
    guaranteeCase(finalizer.flatLiftM())

  fun <A, B> Iterable<suspend () -> A>.traverse(f: suspend (A) -> B): Kind<F, List<B>> =
    effect { map { fa: suspend () -> A -> f(fa()) } }

  fun <A> Iterable<suspend () -> A>.sequence(): Kind<F, List<A>> =
    traverse(::effectIdentity)

  fun <A, B> Iterable<suspend () -> A>.flatTraverse(f: suspend (A) -> List<B>): Kind<F, List<B>> =
    effect { flatMap { f(it()) } }

  fun <A> Iterable<Iterable<suspend () -> A>>.flatSequence(): Kind<F, List<A>> =
    flatten().sequence()
}
