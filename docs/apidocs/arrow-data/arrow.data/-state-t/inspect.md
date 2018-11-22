---
title: StateT.inspect - arrow-data
---

[arrow-data](../../index.html) / [arrow.data](../index.html) / [StateT](index.html) / [inspect](./inspect.html)

# inspect

`fun <F, S, T> inspect(AF: Applicative<`[`F`](inspect.html#F)`>, f: (`[`S`](inspect.html#S)`) -> `[`T`](inspect.html#T)`): `[`StateT`](index.html)`<`[`F`](inspect.html#F)`, `[`S`](inspect.html#S)`, `[`T`](inspect.html#T)`>`

Inspect a value of the state [S](inspect.html#S) with [f](inspect.html#arrow.data.StateT.Companion$inspect(arrow.typeclasses.Applicative((arrow.data.StateT.Companion.inspect.F)), kotlin.Function1((arrow.data.StateT.Companion.inspect.S, arrow.data.StateT.Companion.inspect.T)))/f) `(S) -> T` without modifying the state.

### Parameters

`AF` - [Applicative](#) for the context [F](inspect.html#F).

`f` - the function applied to inspect [T](inspect.html#T) from [S](inspect.html#S).