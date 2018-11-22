---
title: lift - arrow-instances-data
---

[arrow-instances-data](../index.html) / [arrow.instances.statet.functor](index.html) / [lift](./lift.html)

# lift

`@JvmName("lift") fun <F, S, A, B> lift(arg0: (`[`A`](lift.html#A)`) -> `[`B`](lift.html#B)`, FF: Functor<`[`F`](lift.html#F)`>): (Kind<Kind<Kind<ForStateT, `[`F`](lift.html#F)`>, `[`S`](lift.html#S)`>, `[`A`](lift.html#A)`>) -> Kind<Kind<Kind<ForStateT, `[`F`](lift.html#F)`>, `[`S`](lift.html#S)`>, `[`B`](lift.html#B)`>`