---
title: StateT.set - arrow-data
---

[arrow-data](../../index.html) / [arrow.data](../index.html) / [StateT](index.html) / [set](./set.html)

# set

`fun <F, S> set(AF: Applicative<`[`F`](set.html#F)`>, s: `[`S`](set.html#S)`): `[`StateT`](index.html)`<`[`F`](set.html#F)`, `[`S`](set.html#S)`, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>`

Set the state to a value [s](set.html#arrow.data.StateT.Companion$set(arrow.typeclasses.Applicative((arrow.data.StateT.Companion.set.F)), arrow.data.StateT.Companion.set.S)/s) and return [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html).

### Parameters

`AF` - [Applicative](#) for the context [F](set.html#F).

`s` - value to set.