---
title: Kleisli.flatMap - arrow-data
---

[arrow-data](../../index.html) / [arrow.data](../index.html) / [Kleisli](index.html) / [flatMap](./flat-map.html)

# flatMap

`fun <B> flatMap(MF: Monad<`[`F`](index.html#F)`>, f: (`[`A`](index.html#A)`) -> `[`Kleisli`](index.html)`<`[`F`](index.html#F)`, `[`D`](index.html#D)`, `[`B`](flat-map.html#B)`>): `[`Kleisli`](index.html)`<`[`F`](index.html#F)`, `[`D`](index.html#D)`, `[`B`](flat-map.html#B)`>`

FlatMap the end of the arrow [A](index.html#A) to another [Kleisli](index.html) arrow for the same start [D](index.html#D) and context [F](index.html#F).

### Parameters

`f` - the function to flatmap.

`MF` - [Monad](#) for the context [F](index.html#F).