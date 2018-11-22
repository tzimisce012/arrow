---
title: MonadDefer - arrow-effects
---

[arrow-effects](../../index.html) / [arrow.effects.typeclasses](../index.html) / [MonadDefer](./index.html)

# MonadDefer

`interface MonadDefer<F> : MonadThrow<`[`F`](index.html#F)`>, `[`Bracket`](../-bracket/index.html)`<`[`F`](index.html#F)`, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>`



The context required to defer evaluating a safe computation.

### Functions

| [bindingCancellable](binding-cancellable.html) | `open fun <B> bindingCancellable(c: suspend `[`MonadDeferCancellableContinuation`](../-monad-defer-cancellable-continuation/index.html)`<`[`F`](index.html#F)`, *>.() -> `[`B`](binding-cancellable.html#B)`): Tuple2<Kind<`[`F`](index.html#F)`, `[`B`](binding-cancellable.html#B)`>, `[`Disposable`](../-disposable.html)`>`<br>Entry point for monad bindings which enables for comprehensions. The underlying impl is based on coroutines. A coroutines is initiated and inside [MonadDeferCancellableContinuation](../-monad-defer-cancellable-continuation/index.html) suspended yielding to [Monad.flatMap](#). Once all the flatMap binds are completed the underlying monad is returned from the act of executing the coroutine |
| [defer](defer.html) | `abstract fun <A> defer(fa: () -> Kind<`[`F`](index.html#F)`, `[`A`](defer.html#A)`>): Kind<`[`F`](index.html#F)`, `[`A`](defer.html#A)`>` |
| [deferUnsafe](defer-unsafe.html) | `open fun <A> deferUnsafe(f: () -> Either<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, `[`A`](defer-unsafe.html#A)`>): Kind<`[`F`](index.html#F)`, `[`A`](defer-unsafe.html#A)`>` |
| [delay](delay.html) | `open fun <A> delay(f: () -> `[`A`](delay.html#A)`): Kind<`[`F`](index.html#F)`, `[`A`](delay.html#A)`>` |
| [invoke](invoke.html) | `open operator fun <A> ~~invoke~~(f: () -> `[`A`](invoke.html#A)`): Kind<`[`F`](index.html#F)`, `[`A`](invoke.html#A)`>` |
| [lazy](lazy.html) | `open fun lazy(): Kind<`[`F`](index.html#F)`, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>` |

### Inherited Functions

| [bracket](../-bracket/bracket.html) | `open fun <A, B> Kind<`[`F`](../-bracket/index.html#F)`, `[`A`](../-bracket/bracket.html#A)`>.bracket(release: (`[`A`](../-bracket/bracket.html#A)`) -> Kind<`[`F`](../-bracket/index.html#F)`, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>, use: (`[`A`](../-bracket/bracket.html#A)`) -> Kind<`[`F`](../-bracket/index.html#F)`, `[`B`](../-bracket/bracket.html#B)`>): Kind<`[`F`](../-bracket/index.html#F)`, `[`B`](../-bracket/bracket.html#B)`>`<br>Meant for specifying tasks with safe resource acquisition and release in the face of errors and interruption. It would be the the equivalent of `try/catch/finally` statements in mainstream imperative languages for resource acquisition and release. |
| [bracketCase](../-bracket/bracket-case.html) | `abstract fun <A, B> Kind<`[`F`](../-bracket/index.html#F)`, `[`A`](../-bracket/bracket-case.html#A)`>.bracketCase(release: (`[`A`](../-bracket/bracket-case.html#A)`, `[`ExitCase`](../-exit-case/index.html)`<`[`E`](../-bracket/index.html#E)`>) -> Kind<`[`F`](../-bracket/index.html#F)`, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>, use: (`[`A`](../-bracket/bracket-case.html#A)`) -> Kind<`[`F`](../-bracket/index.html#F)`, `[`B`](../-bracket/bracket-case.html#B)`>): Kind<`[`F`](../-bracket/index.html#F)`, `[`B`](../-bracket/bracket-case.html#B)`>`<br>A generalized version of [bracket](../-bracket/bracket.html) which uses [ExitCase](../-exit-case/index.html) to distinguish between different exit cases when releasing the acquired resource. |
| [guarantee](../-bracket/guarantee.html) | `open fun <A> Kind<`[`F`](../-bracket/index.html#F)`, `[`A`](../-bracket/guarantee.html#A)`>.guarantee(finalizer: Kind<`[`F`](../-bracket/index.html#F)`, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>): Kind<`[`F`](../-bracket/index.html#F)`, `[`A`](../-bracket/guarantee.html#A)`>`<br>Executes the given `finalizer` when the source is finished, either in success or in error, or if canceled. |
| [guaranteeCase](../-bracket/guarantee-case.html) | `open fun <A> Kind<`[`F`](../-bracket/index.html#F)`, `[`A`](../-bracket/guarantee-case.html#A)`>.guaranteeCase(finalizer: (`[`ExitCase`](../-exit-case/index.html)`<`[`E`](../-bracket/index.html#E)`>) -> Kind<`[`F`](../-bracket/index.html#F)`, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>): Kind<`[`F`](../-bracket/index.html#F)`, `[`A`](../-bracket/guarantee-case.html#A)`>`<br>Executes the given `finalizer` when the source is finished, either in success or in error, or if canceled, allowing for differentiating between exit conditions. That's thanks to the [ExitCase](../-exit-case/index.html) argument of the finalizer. |
| [uncancelable](../-bracket/uncancelable.html) | `open fun <A> Kind<`[`F`](../-bracket/index.html#F)`, `[`A`](../-bracket/uncancelable.html#A)`>.uncancelable(): Kind<`[`F`](../-bracket/index.html#F)`, `[`A`](../-bracket/uncancelable.html#A)`>`<br>Meant for ensuring a given task continues execution even when interrupted. |

### Inheritors

| [Async](../-async/index.html) | `interface Async<F> : `[`MonadDefer`](./index.html)`<`[`F`](../-async/index.html#F)`>`<br> |
| [MonadDeferCancellableContinuation](../-monad-defer-cancellable-continuation/index.html) | `open class MonadDeferCancellableContinuation<F, A> : MonadErrorContinuation<`[`F`](../-monad-defer-cancellable-continuation/index.html#F)`, `[`A`](../-monad-defer-cancellable-continuation/index.html#A)`>, `[`MonadDefer`](./index.html)`<`[`F`](../-monad-defer-cancellable-continuation/index.html#F)`>` |




## Type Class Hierarchy

<canvas id="arrow.effects.typeclasses-hierarchy-diagram"></canvas>
<script>
  drawNomNomlDiagram('arrow.effects.typeclasses-hierarchy-diagram', 'arrow.effects.typeclasses-diagram.nomnol')
</script>

