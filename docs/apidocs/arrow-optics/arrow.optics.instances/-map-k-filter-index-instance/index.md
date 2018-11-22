---
title: MapKFilterIndexInstance - arrow-optics
---

[arrow-optics](../../index.html) / [arrow.optics.instances](../index.html) / [MapKFilterIndexInstance](./index.html)

# MapKFilterIndexInstance

`@extension interface MapKFilterIndexInstance<K, V> : `[`FilterIndex`](../../arrow.optics.typeclasses/-filter-index/index.html)`<MapK<`[`K`](index.html#K)`, `[`V`](index.html#V)`>, `[`K`](index.html#K)`, `[`V`](index.html#V)`>`

[FilterIndex](../../arrow.optics.typeclasses/-filter-index/index.html) instance definition for [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html).

### Functions

| [filter](filter.html) | `open fun filter(p: (`[`K`](index.html#K)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`Traversal`](../../arrow.optics/-traversal.html)`<MapK<`[`K`](index.html#K)`, `[`V`](index.html#V)`>, `[`V`](index.html#V)`>`<br>Filter the foci [A](../../arrow.optics.typeclasses/-filter-index/index.html#A) of a [Traversal](../../arrow.optics/-traversal.html) with the predicate [p](../../arrow.optics.typeclasses/-filter-index/filter.html#arrow.optics.typeclasses.FilterIndex$filter(kotlin.Function1((arrow.optics.typeclasses.FilterIndex.I, kotlin.Boolean)))/p). |

