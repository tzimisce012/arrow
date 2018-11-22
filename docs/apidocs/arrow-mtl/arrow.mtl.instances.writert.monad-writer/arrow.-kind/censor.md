---
title: censor - arrow-mtl
---

[arrow-mtl](../../index.html) / [arrow.mtl.instances.writert.monadWriter](../index.html) / [arrow.Kind](index.html) / [censor](./censor.html)

# censor

`@JvmName("censor") fun <F, W, A> Kind<Kind<Kind<ForWriterT, `[`F`](censor.html#F)`>, `[`W`](censor.html#W)`>, `[`A`](censor.html#A)`>.censor(f: (`[`W`](censor.html#W)`) -> `[`W`](censor.html#W)`, MF: Monad<`[`F`](censor.html#F)`>, MM: Monoid<`[`W`](censor.html#W)`>): Kind<`[`W`](censor.html#W)`, `[`A`](censor.html#A)`>`