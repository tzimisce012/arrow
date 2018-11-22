---
title: StateT.transform - arrow-data
---

[arrow-data](../../index.html) / [arrow.data](../index.html) / [StateT](index.html) / [transform](./transform.html)

# transform

`fun <B> transform(FF: Functor<`[`F`](index.html#F)`>, f: (Tuple2<`[`S`](index.html#S)`, `[`A`](index.html#A)`>) -> Tuple2<`[`S`](index.html#S)`, `[`B`](transform.html#B)`>): `[`StateT`](index.html)`<`[`F`](index.html#F)`, `[`S`](index.html#S)`, `[`B`](transform.html#B)`>`

Transform the product of state [S](index.html#S) and value [A](index.html#A) to an another product of state [S](index.html#S) and an arbitrary type [B](transform.html#B).

### Parameters

`f` - the function to apply.

`FF` - [Functor](#) for the context [F](index.html#F).