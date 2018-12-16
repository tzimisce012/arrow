package arrow.instances

import arrow.Kind
import arrow.core.*
import arrow.data.*
import arrow.deprecation.ExtensionsDSLDeprecated
import arrow.extension
import arrow.instances.listk.foldable.foldLeft
import arrow.typeclasses.*
import arrow.data.combineK as listCombineK
import kotlin.collections.plus as listPlus

@extension
interface ListKSemigroupInstance<A> : Semigroup<ListK<A>> {
  override fun ListK<A>.combine(b: ListK<A>): ListK<A> =
    (this.listPlus(b)).k()
}

@extension
interface ListKMonoidInstance<A> : Monoid<ListK<A>>, ListKSemigroupInstance<A> {
  override fun empty(): ListK<A> =
    emptyList<A>().k()
}

@extension
interface ListKEqInstance<A> : Eq<ListKOf<A>> {

  fun EQ(): Eq<A>

  override fun ListKOf<A>.eqv(b: ListKOf<A>): Boolean =
    fix().zip(b.fix()) { aa, bb -> EQ().run { aa.eqv(bb) } }.fold(true) { acc, bool ->
      acc && bool
    }
}

@extension
interface ListKShowInstance<A> : Show<ListKOf<A>> {
  override fun ListKOf<A>.show(): String =
    toString()
}

@extension
interface ListKFunctorInstance : Functor<ForListK> {
  override fun <A, B> ListKOf<A>.map(f: (A) -> B): ListK<B> =
    fix().map(f)
}

@extension
interface ListKApplicativeInstance : Applicative<ForListK> {
  override fun <A, B> ListKOf<A>.ap(ff: ListKOf<(A) -> B>): ListK<B> =
    fix().ap(ff)

  override fun <A, B> ListKOf<A>.map(f: (A) -> B): ListK<B> =
    fix().map(f)

  override fun <A, B, Z> ListKOf<A>.map2(fb: ListKOf<B>, f: (Tuple2<A, B>) -> Z): ListK<Z> =
    fix().map2(fb, f)

  override fun <A> just(a: A): ListK<A> =
    ListK.just(a)
}

@extension
interface ListKMonadInstance : Monad<ForListK> {
  override fun <A, B> ListKOf<A>.ap(ff: ListKOf<(A) -> B>): ListK<B> =
    fix().ap(ff)

  override fun <A, B> ListKOf<A>.flatMap(f: (A) -> ListKOf<B>): ListK<B> =
    fix().flatMap(f)

  override fun <A, B> tailRecM(a: A, f: kotlin.Function1<A, ListKOf<Either<A, B>>>): ListK<B> =
    ListK.tailRecM(a, f)

  override fun <A, B> ListKOf<A>.map(f: (A) -> B): ListK<B> =
    fix().map(f)

  override fun <A, B, Z> ListKOf<A>.map2(fb: ListKOf<B>, f: (Tuple2<A, B>) -> Z): ListK<Z> =
    fix().map2(fb, f)

  override fun <A> just(a: A): ListK<A> =
    ListK.just(a)
}

@extension
interface ListKFoldableInstance : Foldable<ForListK> {
  override fun <A, B> ListKOf<A>.foldLeft(b: B, f: (B, A) -> B): B =
    fix().foldLeft(b, f)

  override fun <A, B> ListKOf<A>.foldRight(lb: Eval<B>, f: (A, Eval<B>) -> Eval<B>): Eval<B> =
    fix().foldRight(lb, f)

  override fun <A> ListKOf<A>.isEmpty(): kotlin.Boolean =
    fix().isEmpty()
}

@extension
interface ListKTraverseInstance : Traverse<ForListK> {
  override fun <A, B> ListKOf<A>.map(f: (A) -> B): ListK<B> =
    fix().map(f)

  override fun <G, A, B> ListKOf<A>.traverse(AP: Applicative<G>, f: (A) -> Kind<G, B>): Kind<G, ListK<B>> =
    fix().traverse(AP, f)

  override fun <A, B> ListKOf<A>.foldLeft(b: B, f: (B, A) -> B): B =
    fix().foldLeft(b, f)

  override fun <A, B> ListKOf<A>.foldRight(lb: Eval<B>, f: (A, Eval<B>) -> Eval<B>): Eval<B> =
    fix().foldRight(lb, f)

  override fun <A> ListKOf<A>.isEmpty(): Boolean =
    fix().isEmpty()
}

@extension
interface ListKSemigroupKInstance : SemigroupK<ForListK> {
  override fun <A> ListKOf<A>.combineK(y: ListKOf<A>): ListK<A> =
    fix().listCombineK(y)
}

@extension
interface ListKMonoidKInstance : MonoidK<ForListK> {
  override fun <A> empty(): ListK<A> =
    ListK.empty()

  override fun <A> ListKOf<A>.combineK(y: ListKOf<A>): ListK<A> =
    fix().listCombineK(y)
}

@extension
interface ListKHashInstance<A> : Hash<ListKOf<A>>, ListKEqInstance<A> {

  fun HA(): Hash<A>

  override fun EQ(): Eq<A> = HA()

  override fun ListKOf<A>.hash(): Int = foldLeft(1) { hash, a ->
    31 * hash + HA().run { a.hash() }
  }
}

object ListKContext : ListKMonadInstance, ListKTraverseInstance, ListKMonoidKInstance {
  override fun <A, B> ListKOf<A>.map(f: (A) -> B): ListK<B> =
    fix().map(f)
}

@Deprecated(ExtensionsDSLDeprecated)
infix fun <A> ForListK.Companion.extensions(f: ListKContext.() -> A): A =
  f(ListKContext)
