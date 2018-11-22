---
title: MapFilterIndexInstance - arrow-optics
---

[arrow-optics](../../index.html) / [arrow.optics.instances](../index.html) / [MapFilterIndexInstance](./index.html)

# MapFilterIndexInstance

`interface MapFilterIndexInstance<K, V> : `[`FilterIndex`](../../arrow.optics.typeclasses/-filter-index/index.html)`<`[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`K`](index.html#K)`, `[`V`](index.html#V)`>, `[`K`](index.html#K)`, `[`V`](index.html#V)`>`

[FilterIndex](../../arrow.optics.typeclasses/-filter-index/index.html) instance definition for [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html).

### Functions

| [filter](filter.html) | `open fun filter(p: Predicate<`[`K`](index.html#K)`>): `[`Traversal`](../../arrow.optics/-traversal.html)`<`[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`K`](index.html#K)`, `[`V`](index.html#V)`>, `[`V`](index.html#V)`>`<br>Filter the foci [A](../../arrow.optics.typeclasses/-filter-index/index.html#A) of a [Traversal](../../arrow.optics/-traversal.html) with the predicate [p](../../arrow.optics.typeclasses/-filter-index/filter.html#arrow.optics.typeclasses.FilterIndex$filter(kotlin.Function1((arrow.optics.typeclasses.FilterIndex.I, kotlin.Boolean)))/p). |

### Companion Object Functions

| [invoke](invoke.html) | `operator fun <K, V> invoke(): `[`MapFilterIndexInstance`](./index.html)`<`[`K`](invoke.html#K)`, `[`V`](invoke.html#V)`>`<br>Operator overload to instantiate typeclass instance. |

