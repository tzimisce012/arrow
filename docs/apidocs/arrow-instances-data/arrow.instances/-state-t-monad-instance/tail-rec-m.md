---
title: StateTMonadInstance.tailRecM - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [StateTMonadInstance](index.html) / [tailRecM](./tail-rec-m.html)

# tailRecM

`open fun <A, B> tailRecM(a: `[`A`](tail-rec-m.html#A)`, f: (`[`A`](tail-rec-m.html#A)`) -> StateTOf<`[`F`](index.html#F)`, `[`S`](index.html#S)`, Either<`[`A`](tail-rec-m.html#A)`, `[`B`](tail-rec-m.html#B)`>>): StateT<`[`F`](index.html#F)`, `[`S`](index.html#S)`, `[`B`](tail-rec-m.html#B)`>`