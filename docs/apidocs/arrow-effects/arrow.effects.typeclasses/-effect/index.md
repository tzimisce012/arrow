---
title: Effect - arrow-effects
---

[arrow-effects](../../index.html) / [arrow.effects.typeclasses](../index.html) / [Effect](./index.html)

# Effect

`interface Effect<F> : `[`Async`](../-async/index.html)`<`[`F`](index.html#F)`>`



### Functions

| [runAsync](run-async.html) | `abstract fun <A> Kind<`[`F`](index.html#F)`, `[`A`](run-async.html#A)`>.runAsync(cb: (Either<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, `[`A`](run-async.html#A)`>) -> Kind<`[`F`](index.html#F)`, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>): Kind<`[`F`](index.html#F)`, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>` |

### Inherited Functions

| [async](../-async/async.html) | `abstract fun <A> async(fa: `[`Proc`](../-proc.html)`<`[`A`](../-async/async.html#A)`>): Kind<`[`F`](../-async/index.html#F)`, `[`A`](../-async/async.html#A)`>` |
| [continueOn](../-async/continue-on.html) | `abstract fun <A> Kind<`[`F`](../-async/index.html#F)`, `[`A`](../-async/continue-on.html#A)`>.continueOn(ctx: `[`CoroutineContext`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.coroutines/-coroutine-context/index.html)`): Kind<`[`F`](../-async/index.html#F)`, `[`A`](../-async/continue-on.html#A)`>`<br>`open suspend fun <A> MonadContinuation<`[`F`](../-async/index.html#F)`, `[`A`](../-async/continue-on.html#A)`>.continueOn(ctx: `[`CoroutineContext`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.coroutines/-coroutine-context/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [defer](../-async/defer.html) | `open fun <A> defer(ctx: `[`CoroutineContext`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.coroutines/-coroutine-context/index.html)`, f: () -> Kind<`[`F`](../-async/index.html#F)`, `[`A`](../-async/defer.html#A)`>): Kind<`[`F`](../-async/index.html#F)`, `[`A`](../-async/defer.html#A)`>` |
| [invoke](../-async/invoke.html) | `open operator fun <A> invoke(ctx: `[`CoroutineContext`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.coroutines/-coroutine-context/index.html)`, f: () -> `[`A`](../-async/invoke.html#A)`): Kind<`[`F`](../-async/index.html#F)`, `[`A`](../-async/invoke.html#A)`>` |
| [never](../-async/never.html) | `open fun <A> never(): Kind<`[`F`](../-async/index.html#F)`, `[`A`](../-async/never.html#A)`>` |

### Inheritors

| [ConcurrentEffect](../-concurrent-effect/index.html) | `interface ConcurrentEffect<F> : `[`Effect`](./index.html)`<`[`F`](../-concurrent-effect/index.html#F)`>`<br> |




## Type Class Hierarchy

<canvas id="arrow.effects.typeclasses-hierarchy-diagram"></canvas>
<script>
  drawNomNomlDiagram('arrow.effects.typeclasses-hierarchy-diagram', 'arrow.effects.typeclasses-diagram.nomnol')
</script>

