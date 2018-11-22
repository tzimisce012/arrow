---
title: map - arrow-data
---

[arrow-data](../index.html) / [arrow.data](index.html) / [map](./map.html)

# map

`fun <D, A, B> `[`Reader`](-reader.html)`<`[`D`](map.html#D)`, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): `[`Reader`](-reader.html)`<`[`D`](map.html#D)`, `[`B`](map.html#B)`>`

Map the result of the computation [A](map.html#A) to [B](map.html#B) given a function [f](map.html#arrow.data$map(arrow.data.Kleisli((arrow.core.ForId, arrow.data.map.D, arrow.data.map.A)), kotlin.Function1((arrow.data.map.A, arrow.data.map.B)))/f).

### Parameters

`f` - the function to apply.`fun <S, T, P1, R> `[`State`](-state.html)`<`[`S`](map.html#S)`, `[`T`](map.html#T)`>.map(sx: `[`State`](-state.html)`<`[`S`](map.html#S)`, `[`P1`](map.html#P1)`>, f: (`[`T`](map.html#T)`, `[`P1`](map.html#P1)`) -> `[`R`](map.html#R)`): `[`State`](-state.html)`<`[`S`](map.html#S)`, `[`R`](map.html#R)`>`
`fun <S, T, R> `[`State`](-state.html)`<`[`S`](map.html#S)`, `[`T`](map.html#T)`>.map(f: (`[`T`](map.html#T)`) -> `[`R`](map.html#R)`): `[`State`](-state.html)`<`[`S`](map.html#S)`, `[`R`](map.html#R)`>`