---
title: arrow.effects.typeclasses - arrow-effects
---

[arrow-effects](../index.html) / [arrow.effects.typeclasses](./index.html)

## Package arrow.effects.typeclasses

### Types

| [Async](-async/index.html) | `interface Async<F> : `[`MonadDefer`](-monad-defer/index.html)`<`[`F`](-async/index.html#F)`>`<br> |
| [Bracket](-bracket/index.html) | `interface Bracket<F, E> : MonadError<`[`F`](-bracket/index.html#F)`, `[`E`](-bracket/index.html#E)`>`<br> |
| [ConcurrentEffect](-concurrent-effect/index.html) | `interface ConcurrentEffect<F> : `[`Effect`](-effect/index.html)`<`[`F`](-concurrent-effect/index.html#F)`>`<br> |
| [Duration](-duration/index.html) | `data class Duration` |
| [Effect](-effect/index.html) | `interface Effect<F> : `[`Async`](-async/index.html)`<`[`F`](-effect/index.html#F)`>`<br> |
| [ExitCase](-exit-case/index.html) | `sealed class ExitCase<out E>` |
| [Fiber](-fiber/index.html) | `interface Fiber<F, A>`<br>[Fiber](-fiber/index.html) represents the pure result of an [Async](-async/index.html) data type being started concurrently and that can be either joined or canceled. |
| [MonadDefer](-monad-defer/index.html) | `interface MonadDefer<F> : MonadThrow<`[`F`](-monad-defer/index.html#F)`>, `[`Bracket`](-bracket/index.html)`<`[`F`](-monad-defer/index.html#F)`, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>`<br> |
| [MonadDeferCancellableContinuation](-monad-defer-cancellable-continuation/index.html) | `open class MonadDeferCancellableContinuation<F, A> : MonadErrorContinuation<`[`F`](-monad-defer-cancellable-continuation/index.html#F)`, `[`A`](-monad-defer-cancellable-continuation/index.html#A)`>, `[`MonadDefer`](-monad-defer/index.html)`<`[`F`](-monad-defer-cancellable-continuation/index.html#F)`>` |

### Type Aliases

| [Disposable](-disposable.html) | `typealias Disposable = () -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [Proc](-proc.html) | `typealias Proc<A> = ((Either<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, `[`A`](-proc.html#A)`>) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>An asynchronous computation that might fail. |

### Extensions for External Classes

| [arrow.core.Either](arrow.core.-either/index.html) |  |
| [kotlin.Int](kotlin.-int/index.html) |  |
| [kotlin.Long](kotlin.-long/index.html) |  |




## Type Class Hierarchy

<canvas id="arrow.effects.typeclasses-hierarchy-diagram"></canvas>
<script>
  drawNomNomlDiagram('arrow.effects.typeclasses-hierarchy-diagram', 'arrow.effects.typeclasses-diagram.nomnol')
</script>

