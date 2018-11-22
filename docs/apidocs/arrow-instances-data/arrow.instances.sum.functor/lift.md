---
title: lift - arrow-instances-data
---

[arrow-instances-data](../index.html) / [arrow.instances.sum.functor](index.html) / [lift](./lift.html)

# lift

`@JvmName("lift") fun <F, G, A, B> lift(arg0: (`[`A`](lift.html#A)`) -> `[`B`](lift.html#B)`, FF: Functor<`[`F`](lift.html#F)`>, FG: Functor<`[`G`](lift.html#G)`>): (Kind<Kind<Kind<ForSum, `[`F`](lift.html#F)`>, `[`G`](lift.html#G)`>, `[`A`](lift.html#A)`>) -> Kind<Kind<Kind<ForSum, `[`F`](lift.html#F)`>, `[`G`](lift.html#G)`>, `[`B`](lift.html#B)`>`