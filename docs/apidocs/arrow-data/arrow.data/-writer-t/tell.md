---
title: WriterT.tell - arrow-data
---

[arrow-data](../../index.html) / [arrow.data](../index.html) / [WriterT](index.html) / [tell](./tell.html)

# tell

`fun tell(MF: Monad<`[`F`](index.html#F)`>, SG: Semigroup<`[`W`](index.html#W)`>, w: `[`W`](index.html#W)`): `[`WriterT`](index.html)`<`[`F`](index.html#F)`, `[`W`](index.html#W)`, `[`A`](index.html#A)`>`
`fun <F, W> tell(AF: Applicative<`[`F`](tell.html#F)`>, l: `[`W`](tell.html#W)`): `[`WriterT`](index.html)`<`[`F`](tell.html#F)`, `[`W`](tell.html#W)`, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>`