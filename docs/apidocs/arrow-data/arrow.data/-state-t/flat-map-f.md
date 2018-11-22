---
title: StateT.flatMapF - arrow-data
---

[arrow-data](../../index.html) / [arrow.data](../index.html) / [StateT](index.html) / [flatMapF](./flat-map-f.html)

# flatMapF

`fun <B> flatMapF(MF: Monad<`[`F`](index.html#F)`>, faf: (`[`A`](index.html#A)`) -> Kind<`[`F`](index.html#F)`, `[`B`](flat-map-f.html#B)`>): `[`StateT`](index.html)`<`[`F`](index.html#F)`, `[`S`](index.html#S)`, `[`B`](flat-map-f.html#B)`>`

Map the value [A](index.html#A) to a arbitrary type [B](flat-map-f.html#B) that is within the context of [F](index.html#F).

### Parameters

`faf` - the function to apply.

`MF` - [Monad](#) for the context [F](index.html#F).