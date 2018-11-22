---
title: ConcurrentEffect - arrow-effects
---

[arrow-effects](../../index.html) / [arrow.effects.typeclasses](../index.html) / [ConcurrentEffect](./index.html)

# ConcurrentEffect

`interface ConcurrentEffect<F> : `[`Effect`](../-effect/index.html)`<`[`F`](index.html#F)`>`



### Functions

| [runAsyncCancellable](run-async-cancellable.html) | `abstract fun <A> Kind<`[`F`](index.html#F)`, `[`A`](run-async-cancellable.html#A)`>.runAsyncCancellable(cb: (Either<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, `[`A`](run-async-cancellable.html#A)`>) -> Kind<`[`F`](index.html#F)`, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>): Kind<`[`F`](index.html#F)`, `[`Disposable`](../-disposable.html)`>` |

### Inherited Functions

| [runAsync](../-effect/run-async.html) | `abstract fun <A> Kind<`[`F`](../-effect/index.html#F)`, `[`A`](../-effect/run-async.html#A)`>.runAsync(cb: (Either<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, `[`A`](../-effect/run-async.html#A)`>) -> Kind<`[`F`](../-effect/index.html#F)`, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>): Kind<`[`F`](../-effect/index.html#F)`, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>` |

### Extension Functions

| [parMapCancellable2](../../arrow.effects.internal/par-map-cancellable2.html) | `fun <F, A, B, C> `[`ConcurrentEffect`](./index.html)`<`[`F`](../../arrow.effects.internal/par-map-cancellable2.html#F)`>.parMapCancellable2(ctx: <ERROR CLASS>, ioA: Kind<`[`F`](../../arrow.effects.internal/par-map-cancellable2.html#F)`, `[`A`](../../arrow.effects.internal/par-map-cancellable2.html#A)`>, ioB: Kind<`[`F`](../../arrow.effects.internal/par-map-cancellable2.html#F)`, `[`B`](../../arrow.effects.internal/par-map-cancellable2.html#B)`>, f: (`[`A`](../../arrow.effects.internal/par-map-cancellable2.html#A)`, `[`B`](../../arrow.effects.internal/par-map-cancellable2.html#B)`) -> `[`C`](../../arrow.effects.internal/par-map-cancellable2.html#C)`, start: (Kind<`[`F`](../../arrow.effects.internal/par-map-cancellable2.html#F)`, `[`Disposable`](../-disposable.html)`>) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Proc`](../-proc.html)`<`[`C`](../../arrow.effects.internal/par-map-cancellable2.html#C)`>` |
| [parMapCancellable3](../../arrow.effects.internal/par-map-cancellable3.html) | `fun <F, A, B, C, D> `[`ConcurrentEffect`](./index.html)`<`[`F`](../../arrow.effects.internal/par-map-cancellable3.html#F)`>.parMapCancellable3(ctx: <ERROR CLASS>, ioA: Kind<`[`F`](../../arrow.effects.internal/par-map-cancellable3.html#F)`, `[`A`](../../arrow.effects.internal/par-map-cancellable3.html#A)`>, ioB: Kind<`[`F`](../../arrow.effects.internal/par-map-cancellable3.html#F)`, `[`B`](../../arrow.effects.internal/par-map-cancellable3.html#B)`>, ioC: Kind<`[`F`](../../arrow.effects.internal/par-map-cancellable3.html#F)`, `[`C`](../../arrow.effects.internal/par-map-cancellable3.html#C)`>, f: (`[`A`](../../arrow.effects.internal/par-map-cancellable3.html#A)`, `[`B`](../../arrow.effects.internal/par-map-cancellable3.html#B)`, `[`C`](../../arrow.effects.internal/par-map-cancellable3.html#C)`) -> `[`D`](../../arrow.effects.internal/par-map-cancellable3.html#D)`, start: (Kind<`[`F`](../../arrow.effects.internal/par-map-cancellable3.html#F)`, `[`Disposable`](../-disposable.html)`>) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Proc`](../-proc.html)`<`[`D`](../../arrow.effects.internal/par-map-cancellable3.html#D)`>` |




## Type Class Hierarchy

<canvas id="arrow.effects.typeclasses-hierarchy-diagram"></canvas>
<script>
  drawNomNomlDiagram('arrow.effects.typeclasses-hierarchy-diagram', 'arrow.effects.typeclasses-diagram.nomnol')
</script>

