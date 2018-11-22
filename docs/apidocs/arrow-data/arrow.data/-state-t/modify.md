---
title: StateT.modify - arrow-data
---

[arrow-data](../../index.html) / [arrow.data](../index.html) / [StateT](index.html) / [modify](./modify.html)

# modify

`fun <F, S> modify(AF: Applicative<`[`F`](modify.html#F)`>, f: (`[`S`](modify.html#S)`) -> `[`S`](modify.html#S)`): `[`StateT`](index.html)`<`[`F`](modify.html#F)`, `[`S`](modify.html#S)`, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>`

Modify the state with [f](modify.html#arrow.data.StateT.Companion$modify(arrow.typeclasses.Applicative((arrow.data.StateT.Companion.modify.F)), kotlin.Function1((arrow.data.StateT.Companion.modify.S, )))/f) `(S) -> S` and return [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html).

### Parameters

`AF` - [Applicative](#) for the context [F](modify.html#F).

`f` - the modify function to apply.