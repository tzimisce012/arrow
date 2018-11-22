---
title: IOMonadInstance.tailRecM - arrow-effects-instances
---

[arrow-effects-instances](../../index.html) / [arrow.effects.instances](../index.html) / [IOMonadInstance](index.html) / [tailRecM](./tail-rec-m.html)

# tailRecM

`open fun <A, B> tailRecM(a: `[`A`](tail-rec-m.html#A)`, f: (`[`A`](tail-rec-m.html#A)`) -> IOOf<Either<`[`A`](tail-rec-m.html#A)`, `[`B`](tail-rec-m.html#B)`>>): IO<`[`B`](tail-rec-m.html#B)`>`