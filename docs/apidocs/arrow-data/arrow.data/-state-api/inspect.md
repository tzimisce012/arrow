---
title: StateApi.inspect - arrow-data
---

[arrow-data](../../index.html) / [arrow.data](../index.html) / [StateApi](index.html) / [inspect](./inspect.html)

# inspect

`fun <S, T> inspect(f: (`[`S`](inspect.html#S)`) -> `[`T`](inspect.html#T)`): `[`State`](../-state.html)`<`[`S`](inspect.html#S)`, `[`T`](inspect.html#T)`>`

Inspect a value of the state [S](inspect.html#S) with [f](inspect.html#arrow.data.StateApi$inspect(kotlin.Function1((arrow.data.StateApi.inspect.S, arrow.data.StateApi.inspect.T)))/f) `(S) -> T` without modifying the state.

### Parameters

`f` - the function applied to inspect [T](inspect.html#T) from [S](inspect.html#S).