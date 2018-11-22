---
title: StateT.product - arrow-data
---

[arrow-data](../../index.html) / [arrow.data](../index.html) / [StateT](index.html) / [product](./product.html)

# product

`fun <B> product(MF: Monad<`[`F`](index.html#F)`>, sb: `[`StateT`](index.html)`<`[`F`](index.html#F)`, `[`S`](index.html#S)`, `[`B`](product.html#B)`>): `[`StateT`](index.html)`<`[`F`](index.html#F)`, `[`S`](index.html#S)`, Tuple2<`[`A`](index.html#A)`, `[`B`](product.html#B)`>>`

Create a product of the value types of [StateT](index.html).

### Parameters

`sb` - other stateful computation.

`MF` - [Monad](#) for the context [F](index.html#F).