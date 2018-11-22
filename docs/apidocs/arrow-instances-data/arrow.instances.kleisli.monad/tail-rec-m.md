---
title: tailRecM - arrow-instances-data
---

[arrow-instances-data](../index.html) / [arrow.instances.kleisli.monad](index.html) / [tailRecM](./tail-rec-m.html)

# tailRecM

`@JvmName("tailRecM") fun <F, D, A, B> tailRecM(arg0: `[`A`](tail-rec-m.html#A)`, arg1: (`[`A`](tail-rec-m.html#A)`) -> Kind<Kind<Kind<ForKleisli, `[`F`](tail-rec-m.html#F)`>, `[`D`](tail-rec-m.html#D)`>, Either<`[`A`](tail-rec-m.html#A)`, `[`B`](tail-rec-m.html#B)`>>, MF: Monad<`[`F`](tail-rec-m.html#F)`>): Kind<`[`D`](tail-rec-m.html#D)`, `[`B`](tail-rec-m.html#B)`>`