---
title: parMapCancellable2 - arrow-effects
---

[arrow-effects](../index.html) / [arrow.effects.internal](index.html) / [parMapCancellable2](./par-map-cancellable2.html)

# parMapCancellable2

`fun <F, A, B, C> `[`ConcurrentEffect`](../arrow.effects.typeclasses/-concurrent-effect/index.html)`<`[`F`](par-map-cancellable2.html#F)`>.parMapCancellable2(ctx: <ERROR CLASS>, ioA: Kind<`[`F`](par-map-cancellable2.html#F)`, `[`A`](par-map-cancellable2.html#A)`>, ioB: Kind<`[`F`](par-map-cancellable2.html#F)`, `[`B`](par-map-cancellable2.html#B)`>, f: (`[`A`](par-map-cancellable2.html#A)`, `[`B`](par-map-cancellable2.html#B)`) -> `[`C`](par-map-cancellable2.html#C)`, start: (Kind<`[`F`](par-map-cancellable2.html#F)`, `[`Disposable`](../arrow.effects.typeclasses/-disposable.html)`>) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Proc`](../arrow.effects.typeclasses/-proc.html)`<`[`C`](par-map-cancellable2.html#C)`>`