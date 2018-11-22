---
title: Kleisli.map - arrow-data
---

[arrow-data](../../index.html) / [arrow.data](../index.html) / [Kleisli](index.html) / [map](./map.html)

# map

`fun <B> map(FF: Functor<`[`F`](index.html#F)`>, f: (`[`A`](index.html#A)`) -> `[`B`](map.html#B)`): `[`Kleisli`](index.html)`<`[`F`](index.html#F)`, `[`D`](index.html#D)`, `[`B`](map.html#B)`>`

Map the end of the arrow [A](index.html#A) to [B](map.html#B) given a function [f](map.html#arrow.data.Kleisli$map(arrow.typeclasses.Functor((arrow.data.Kleisli.F)), kotlin.Function1((arrow.data.Kleisli.A, arrow.data.Kleisli.map.B)))/f).

### Parameters

`f` - the function to apply.

`FF` - [Functor](#) for the context [F](index.html#F).