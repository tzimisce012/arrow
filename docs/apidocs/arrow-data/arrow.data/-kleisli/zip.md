---
title: Kleisli.zip - arrow-data
---

[arrow-data](../../index.html) / [arrow.data](../index.html) / [Kleisli](index.html) / [zip](./zip.html)

# zip

`fun <B> zip(MF: Monad<`[`F`](index.html#F)`>, o: `[`Kleisli`](index.html)`<`[`F`](index.html#F)`, `[`D`](index.html#D)`, `[`B`](zip.html#B)`>): `[`Kleisli`](index.html)`<`[`F`](index.html#F)`, `[`D`](index.html#D)`, Tuple2<`[`A`](index.html#A)`, `[`B`](zip.html#B)`>>`

Zip with another [Kleisli](index.html) arrow.

### Parameters

`o` - other [Kleisli](index.html) to zip with.

`MF` - [Monad](#) for the context [F](index.html#F).