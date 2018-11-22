---
title: StateT.setF - arrow-data
---

[arrow-data](../../index.html) / [arrow.data](../index.html) / [StateT](index.html) / [setF](./set-f.html)

# setF

`fun <F, S> setF(AF: Applicative<`[`F`](set-f.html#F)`>, s: Kind<`[`F`](set-f.html#F)`, `[`S`](set-f.html#S)`>): `[`StateT`](index.html)`<`[`F`](set-f.html#F)`, `[`S`](set-f.html#S)`, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>`

Set the state to a value [s](set-f.html#arrow.data.StateT.Companion$setF(arrow.typeclasses.Applicative((arrow.data.StateT.Companion.setF.F)), arrow.Kind((arrow.data.StateT.Companion.setF.F, arrow.data.StateT.Companion.setF.S)))/s) of type `Kind<F, S>` and return [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html).

### Parameters

`AF` - [Applicative](#) for the context [F](set-f.html#F).

`s` - value to set.