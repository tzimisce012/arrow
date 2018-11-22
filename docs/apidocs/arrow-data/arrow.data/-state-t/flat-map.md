---
title: StateT.flatMap - arrow-data
---

[arrow-data](../../index.html) / [arrow.data](../index.html) / [StateT](index.html) / [flatMap](./flat-map.html)

# flatMap

`fun <B> flatMap(MF: Monad<`[`F`](index.html#F)`>, fas: (`[`A`](index.html#A)`) -> `[`StateTOf`](../-state-t-of.html)`<`[`F`](index.html#F)`, `[`S`](index.html#S)`, `[`B`](flat-map.html#B)`>): `[`StateT`](index.html)`<`[`F`](index.html#F)`, `[`S`](index.html#S)`, `[`B`](flat-map.html#B)`>`

Map the value [A](index.html#A) to another [StateT](index.html) object for the same state [S](index.html#S) and context [F](index.html#F) and flatten the structure.

### Parameters

`fas` - the function to apply.

`MF` - [Monad](#) for the context [F](index.html#F).