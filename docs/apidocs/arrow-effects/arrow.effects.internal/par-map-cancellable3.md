---
title: parMapCancellable3 - arrow-effects
---

[arrow-effects](../index.html) / [arrow.effects.internal](index.html) / [parMapCancellable3](./par-map-cancellable3.html)

# parMapCancellable3

`fun <F, A, B, C, D> `[`ConcurrentEffect`](../arrow.effects.typeclasses/-concurrent-effect/index.html)`<`[`F`](par-map-cancellable3.html#F)`>.parMapCancellable3(ctx: <ERROR CLASS>, ioA: Kind<`[`F`](par-map-cancellable3.html#F)`, `[`A`](par-map-cancellable3.html#A)`>, ioB: Kind<`[`F`](par-map-cancellable3.html#F)`, `[`B`](par-map-cancellable3.html#B)`>, ioC: Kind<`[`F`](par-map-cancellable3.html#F)`, `[`C`](par-map-cancellable3.html#C)`>, f: (`[`A`](par-map-cancellable3.html#A)`, `[`B`](par-map-cancellable3.html#B)`, `[`C`](par-map-cancellable3.html#C)`) -> `[`D`](par-map-cancellable3.html#D)`, start: (Kind<`[`F`](par-map-cancellable3.html#F)`, `[`Disposable`](../arrow.effects.typeclasses/-disposable.html)`>) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Proc`](../arrow.effects.typeclasses/-proc.html)`<`[`D`](par-map-cancellable3.html#D)`>`