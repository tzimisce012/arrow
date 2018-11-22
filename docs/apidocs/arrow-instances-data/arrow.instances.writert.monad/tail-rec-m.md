---
title: tailRecM - arrow-instances-data
---

[arrow-instances-data](../index.html) / [arrow.instances.writert.monad](index.html) / [tailRecM](./tail-rec-m.html)

# tailRecM

`@JvmName("tailRecM") fun <F, W, A, B> tailRecM(arg0: `[`A`](tail-rec-m.html#A)`, arg1: (`[`A`](tail-rec-m.html#A)`) -> Kind<Kind<Kind<ForWriterT, `[`F`](tail-rec-m.html#F)`>, `[`W`](tail-rec-m.html#W)`>, Either<`[`A`](tail-rec-m.html#A)`, `[`B`](tail-rec-m.html#B)`>>, MF: Monad<`[`F`](tail-rec-m.html#F)`>, MM: Monoid<`[`W`](tail-rec-m.html#W)`>): Kind<`[`W`](tail-rec-m.html#W)`, `[`B`](tail-rec-m.html#B)`>`