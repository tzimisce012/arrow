---
title: StateT.map - arrow-data
---

[arrow-data](../../index.html) / [arrow.data](../index.html) / [StateT](index.html) / [map](./map.html)

# map

`fun <B> map(FF: Functor<`[`F`](index.html#F)`>, f: (`[`A`](index.html#A)`) -> `[`B`](map.html#B)`): `[`StateT`](index.html)`<`[`F`](index.html#F)`, `[`S`](index.html#S)`, `[`B`](map.html#B)`>`

Map current value [A](index.html#A) given a function [f](map.html#arrow.data.StateT$map(arrow.typeclasses.Functor((arrow.data.StateT.F)), kotlin.Function1((arrow.data.StateT.A, arrow.data.StateT.map.B)))/f).

### Parameters

`f` - the function to apply.

`FF` - [Functor](#) for the context [F](index.html#F).