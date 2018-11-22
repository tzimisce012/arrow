---
title: tailRecM - arrow-instances-data
---

[arrow-instances-data](../index.html) / [arrow.instances.statet.monad](index.html) / [tailRecM](./tail-rec-m.html)

# tailRecM

`@JvmName("tailRecM") fun <F, S, A, B> tailRecM(arg0: `[`A`](tail-rec-m.html#A)`, arg1: (`[`A`](tail-rec-m.html#A)`) -> Kind<Kind<Kind<ForStateT, `[`F`](tail-rec-m.html#F)`>, `[`S`](tail-rec-m.html#S)`>, Either<`[`A`](tail-rec-m.html#A)`, `[`B`](tail-rec-m.html#B)`>>, MF: Monad<`[`F`](tail-rec-m.html#F)`>): Kind<`[`S`](tail-rec-m.html#S)`, `[`B`](tail-rec-m.html#B)`>`