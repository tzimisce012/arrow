---
title: Async - arrow-effects
---

[arrow-effects](../../index.html) / [arrow.effects.typeclasses](../index.html) / [Async](./index.html)

# Async

`interface Async<F> : `[`MonadDefer`](../-monad-defer/index.html)`<`[`F`](index.html#F)`>`



The context required to run an asynchronous computation that may fail.

### Functions

| [async](async.html) | `abstract fun <A> async(fa: `[`Proc`](../-proc.html)`<`[`A`](async.html#A)`>): Kind<`[`F`](index.html#F)`, `[`A`](async.html#A)`>` |
| [continueOn](continue-on.html) | `abstract fun <A> Kind<`[`F`](index.html#F)`, `[`A`](continue-on.html#A)`>.continueOn(ctx: `[`CoroutineContext`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.coroutines/-coroutine-context/index.html)`): Kind<`[`F`](index.html#F)`, `[`A`](continue-on.html#A)`>`<br>`open suspend fun <A> MonadContinuation<`[`F`](index.html#F)`, `[`A`](continue-on.html#A)`>.continueOn(ctx: `[`CoroutineContext`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.coroutines/-coroutine-context/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [defer](defer.html) | `open fun <A> defer(ctx: `[`CoroutineContext`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.coroutines/-coroutine-context/index.html)`, f: () -> Kind<`[`F`](index.html#F)`, `[`A`](defer.html#A)`>): Kind<`[`F`](index.html#F)`, `[`A`](defer.html#A)`>` |
| [invoke](invoke.html) | `open operator fun <A> invoke(ctx: `[`CoroutineContext`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.coroutines/-coroutine-context/index.html)`, f: () -> `[`A`](invoke.html#A)`): Kind<`[`F`](index.html#F)`, `[`A`](invoke.html#A)`>` |
| [never](never.html) | `open fun <A> never(): Kind<`[`F`](index.html#F)`, `[`A`](never.html#A)`>` |

### Inherited Functions

| [bindingCancellable](../-monad-defer/binding-cancellable.html) | `open fun <B> bindingCancellable(c: suspend `[`MonadDeferCancellableContinuation`](../-monad-defer-cancellable-continuation/index.html)`<`[`F`](../-monad-defer/index.html#F)`, *>.() -> `[`B`](../-monad-defer/binding-cancellable.html#B)`): Tuple2<Kind<`[`F`](../-monad-defer/index.html#F)`, `[`B`](../-monad-defer/binding-cancellable.html#B)`>, `[`Disposable`](../-disposable.html)`>`<br>Entry point for monad bindings which enables for comprehensions. The underlying impl is based on coroutines. A coroutines is initiated and inside [MonadDeferCancellableContinuation](../-monad-defer-cancellable-continuation/index.html) suspended yielding to [Monad.flatMap](#). Once all the flatMap binds are completed the underlying monad is returned from the act of executing the coroutine |
| [defer](../-monad-defer/defer.html) | `abstract fun <A> defer(fa: () -> Kind<`[`F`](../-monad-defer/index.html#F)`, `[`A`](../-monad-defer/defer.html#A)`>): Kind<`[`F`](../-monad-defer/index.html#F)`, `[`A`](../-monad-defer/defer.html#A)`>` |
| [deferUnsafe](../-monad-defer/defer-unsafe.html) | `open fun <A> deferUnsafe(f: () -> Either<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, `[`A`](../-monad-defer/defer-unsafe.html#A)`>): Kind<`[`F`](../-monad-defer/index.html#F)`, `[`A`](../-monad-defer/defer-unsafe.html#A)`>` |
| [delay](../-monad-defer/delay.html) | `open fun <A> delay(f: () -> `[`A`](../-monad-defer/delay.html#A)`): Kind<`[`F`](../-monad-defer/index.html#F)`, `[`A`](../-monad-defer/delay.html#A)`>` |
| [invoke](../-monad-defer/invoke.html) | `open operator fun <A> ~~invoke~~(f: () -> `[`A`](../-monad-defer/invoke.html#A)`): Kind<`[`F`](../-monad-defer/index.html#F)`, `[`A`](../-monad-defer/invoke.html#A)`>` |
| [lazy](../-monad-defer/lazy.html) | `open fun lazy(): Kind<`[`F`](../-monad-defer/index.html#F)`, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>` |

### Inheritors

| [Effect](../-effect/index.html) | `interface Effect<F> : `[`Async`](./index.html)`<`[`F`](../-effect/index.html#F)`>`<br> |




## Type Class Hierarchy

<canvas id="arrow.effects.typeclasses-hierarchy-diagram"></canvas>
<script>
  drawNomNomlDiagram('arrow.effects.typeclasses-hierarchy-diagram', 'arrow.effects.typeclasses-diagram.nomnol')
</script>

