---
title: StateT.map2 - arrow-data
---

[arrow-data](../../index.html) / [arrow.data](../index.html) / [StateT](index.html) / [map2](./map2.html)

# map2

`fun <B, Z> map2(MF: Monad<`[`F`](index.html#F)`>, sb: `[`StateT`](index.html)`<`[`F`](index.html#F)`, `[`S`](index.html#S)`, `[`B`](map2.html#B)`>, fn: (`[`A`](index.html#A)`, `[`B`](map2.html#B)`) -> `[`Z`](map2.html#Z)`): `[`StateT`](index.html)`<`[`F`](index.html#F)`, `[`S`](index.html#S)`, `[`Z`](map2.html#Z)`>`

Combine with another [StateT](index.html) of same context [F](index.html#F) and state [S](index.html#S).

### Parameters

`sb` - other state with value of type `B`.

`f` - the function to apply.

`MF` - [Monad](#) for the context [F](index.html#F).