---
title: WriterTMonadInstance.tailRecM - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [WriterTMonadInstance](index.html) / [tailRecM](./tail-rec-m.html)

# tailRecM

`open fun <A, B> tailRecM(a: `[`A`](tail-rec-m.html#A)`, f: (`[`A`](tail-rec-m.html#A)`) -> Kind<WriterTPartialOf<`[`F`](index.html#F)`, `[`W`](index.html#W)`>, Either<`[`A`](tail-rec-m.html#A)`, `[`B`](tail-rec-m.html#B)`>>): WriterT<`[`F`](index.html#F)`, `[`W`](index.html#W)`, `[`B`](tail-rec-m.html#B)`>`