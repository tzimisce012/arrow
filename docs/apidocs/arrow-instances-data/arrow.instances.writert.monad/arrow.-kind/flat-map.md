---
title: flatMap - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances.writert.monad](../index.html) / [arrow.Kind](index.html) / [flatMap](./flat-map.html)

# flatMap

`@JvmName("flatMap") fun <F, W, A, B> Kind<Kind<Kind<ForWriterT, `[`F`](flat-map.html#F)`>, `[`W`](flat-map.html#W)`>, `[`A`](flat-map.html#A)`>.flatMap(arg1: (`[`A`](flat-map.html#A)`) -> Kind<Kind<Kind<ForWriterT, `[`F`](flat-map.html#F)`>, `[`W`](flat-map.html#W)`>, `[`B`](flat-map.html#B)`>, MF: Monad<`[`F`](flat-map.html#F)`>, MM: Monoid<`[`W`](flat-map.html#W)`>): Kind<`[`W`](flat-map.html#W)`, `[`B`](flat-map.html#B)`>`