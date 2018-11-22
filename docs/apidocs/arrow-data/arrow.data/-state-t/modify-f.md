---
title: StateT.modifyF - arrow-data
---

[arrow-data](../../index.html) / [arrow.data](../index.html) / [StateT](index.html) / [modifyF](./modify-f.html)

# modifyF

`fun <F, S> modifyF(AF: Applicative<`[`F`](modify-f.html#F)`>, f: (`[`S`](modify-f.html#S)`) -> Kind<`[`F`](modify-f.html#F)`, `[`S`](modify-f.html#S)`>): `[`StateT`](index.html)`<`[`F`](modify-f.html#F)`, `[`S`](modify-f.html#S)`, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>`

Modify the state with an [Applicative](#) function [f](modify-f.html#arrow.data.StateT.Companion$modifyF(arrow.typeclasses.Applicative((arrow.data.StateT.Companion.modifyF.F)), kotlin.Function1((arrow.data.StateT.Companion.modifyF.S, arrow.Kind((arrow.data.StateT.Companion.modifyF.F, )))))/f) `(S) -> Kind<F, S>` and return [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html).

### Parameters

`AF` - [Applicative](#) for the context [F](modify-f.html#F).

`f` - the modify function to apply.