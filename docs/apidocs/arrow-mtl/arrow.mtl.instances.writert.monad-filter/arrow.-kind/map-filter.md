---
title: mapFilter - arrow-mtl
---

[arrow-mtl](../../index.html) / [arrow.mtl.instances.writert.monadFilter](../index.html) / [arrow.Kind](index.html) / [mapFilter](./map-filter.html)

# mapFilter

`@JvmName("mapFilter") fun <F, W, A, B> Kind<Kind<Kind<ForWriterT, `[`F`](map-filter.html#F)`>, `[`W`](map-filter.html#W)`>, `[`A`](map-filter.html#A)`>.mapFilter(f: (`[`A`](map-filter.html#A)`) -> Option<`[`B`](map-filter.html#B)`>, FF: `[`MonadFilter`](../../arrow.mtl.typeclasses/-monad-filter/index.html)`<`[`F`](map-filter.html#F)`>, MM: Monoid<`[`W`](map-filter.html#W)`>): Kind<`[`W`](map-filter.html#W)`, `[`B`](map-filter.html#B)`>`