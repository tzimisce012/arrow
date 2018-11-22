---
title: WriterT.tailRecM - arrow-data
---

[arrow-data](../../index.html) / [arrow.data](../index.html) / [WriterT](index.html) / [tailRecM](./tail-rec-m.html)

# tailRecM

`fun <F, W, A, B> tailRecM(MF: Monad<`[`F`](tail-rec-m.html#F)`>, a: `[`A`](tail-rec-m.html#A)`, f: (`[`A`](tail-rec-m.html#A)`) -> Kind<`[`WriterTPartialOf`](../-writer-t-partial-of.html)`<`[`F`](tail-rec-m.html#F)`, `[`W`](tail-rec-m.html#W)`>, Either<`[`A`](tail-rec-m.html#A)`, `[`B`](tail-rec-m.html#B)`>>): `[`WriterT`](index.html)`<`[`F`](tail-rec-m.html#F)`, `[`W`](tail-rec-m.html#W)`, `[`B`](tail-rec-m.html#B)`>`