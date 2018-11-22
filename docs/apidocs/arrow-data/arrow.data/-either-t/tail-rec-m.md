---
title: EitherT.tailRecM - arrow-data
---

[arrow-data](../../index.html) / [arrow.data](../index.html) / [EitherT](index.html) / [tailRecM](./tail-rec-m.html)

# tailRecM

`fun <F, L, A, B> tailRecM(MF: Monad<`[`F`](tail-rec-m.html#F)`>, a: `[`A`](tail-rec-m.html#A)`, f: (`[`A`](tail-rec-m.html#A)`) -> `[`EitherTOf`](../-either-t-of.html)`<`[`F`](tail-rec-m.html#F)`, `[`L`](tail-rec-m.html#L)`, Either<`[`A`](tail-rec-m.html#A)`, `[`B`](tail-rec-m.html#B)`>>): `[`EitherT`](index.html)`<`[`F`](tail-rec-m.html#F)`, `[`L`](tail-rec-m.html#L)`, `[`B`](tail-rec-m.html#B)`>`