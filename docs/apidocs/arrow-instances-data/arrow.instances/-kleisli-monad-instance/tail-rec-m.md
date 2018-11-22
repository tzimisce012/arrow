---
title: KleisliMonadInstance.tailRecM - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [KleisliMonadInstance](index.html) / [tailRecM](./tail-rec-m.html)

# tailRecM

`open fun <A, B> tailRecM(a: `[`A`](tail-rec-m.html#A)`, f: (`[`A`](tail-rec-m.html#A)`) -> KleisliOf<`[`F`](index.html#F)`, `[`D`](index.html#D)`, Either<`[`A`](tail-rec-m.html#A)`, `[`B`](tail-rec-m.html#B)`>>): Kleisli<`[`F`](index.html#F)`, `[`D`](index.html#D)`, `[`B`](tail-rec-m.html#B)`>`