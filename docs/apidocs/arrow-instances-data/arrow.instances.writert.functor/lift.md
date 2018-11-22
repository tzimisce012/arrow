---
title: lift - arrow-instances-data
---

[arrow-instances-data](../index.html) / [arrow.instances.writert.functor](index.html) / [lift](./lift.html)

# lift

`@JvmName("lift") fun <F, W, A, B> lift(arg0: (`[`A`](lift.html#A)`) -> `[`B`](lift.html#B)`, FF: Functor<`[`F`](lift.html#F)`>): (Kind<Kind<Kind<ForWriterT, `[`F`](lift.html#F)`>, `[`W`](lift.html#W)`>, `[`A`](lift.html#A)`>) -> Kind<Kind<Kind<ForWriterT, `[`F`](lift.html#F)`>, `[`W`](lift.html#W)`>, `[`B`](lift.html#B)`>`