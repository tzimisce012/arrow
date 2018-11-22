---
title: WriterT.flatMap - arrow-data
---

[arrow-data](../../index.html) / [arrow.data](../index.html) / [WriterT](index.html) / [flatMap](./flat-map.html)

# flatMap

`fun <B> flatMap(MF: Monad<`[`F`](index.html#F)`>, SG: Semigroup<`[`W`](index.html#W)`>, f: (`[`A`](index.html#A)`) -> `[`WriterT`](index.html)`<`[`F`](index.html#F)`, `[`W`](index.html#W)`, `[`B`](flat-map.html#B)`>): `[`WriterT`](index.html)`<`[`F`](index.html#F)`, `[`W`](index.html#W)`, `[`B`](flat-map.html#B)`>`