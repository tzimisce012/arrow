---
title: OptionT.tailRecM - arrow-data
---

[arrow-data](../../index.html) / [arrow.data](../index.html) / [OptionT](index.html) / [tailRecM](./tail-rec-m.html)

# tailRecM

`fun <F, A, B> tailRecM(MF: Monad<`[`F`](tail-rec-m.html#F)`>, a: `[`A`](tail-rec-m.html#A)`, f: (`[`A`](tail-rec-m.html#A)`) -> `[`OptionTOf`](../-option-t-of.html)`<`[`F`](tail-rec-m.html#F)`, Either<`[`A`](tail-rec-m.html#A)`, `[`B`](tail-rec-m.html#B)`>>): `[`OptionT`](index.html)`<`[`F`](tail-rec-m.html#F)`, `[`B`](tail-rec-m.html#B)`>`