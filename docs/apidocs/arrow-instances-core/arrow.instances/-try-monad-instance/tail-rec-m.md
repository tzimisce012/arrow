---
title: TryMonadInstance.tailRecM - arrow-instances-core
---

[arrow-instances-core](../../index.html) / [arrow.instances](../index.html) / [TryMonadInstance](index.html) / [tailRecM](./tail-rec-m.html)

# tailRecM

`open fun <A, B> tailRecM(a: `[`A`](tail-rec-m.html#A)`, f: (`[`A`](tail-rec-m.html#A)`) -> TryOf<Either<`[`A`](tail-rec-m.html#A)`, `[`B`](tail-rec-m.html#B)`>>): Try<`[`B`](tail-rec-m.html#B)`>`