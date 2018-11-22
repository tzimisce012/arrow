---
title: ListKFilterIndexInstance - arrow-optics
---

[arrow-optics](../../index.html) / [arrow.optics.instances](../index.html) / [ListKFilterIndexInstance](./index.html)

# ListKFilterIndexInstance

`@extension interface ListKFilterIndexInstance<A> : `[`FilterIndex`](../../arrow.optics.typeclasses/-filter-index/index.html)`<ListK<`[`A`](index.html#A)`>, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, `[`A`](index.html#A)`>`

[FilterIndex](../../arrow.optics.typeclasses/-filter-index/index.html) instance definition for [ListK](#).

### Functions

| [filter](filter.html) | `open fun filter(p: (`[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`Traversal`](../../arrow.optics/-traversal.html)`<ListK<`[`A`](index.html#A)`>, `[`A`](index.html#A)`>`<br>Filter the foci [A](../../arrow.optics.typeclasses/-filter-index/index.html#A) of a [Traversal](../../arrow.optics/-traversal.html) with the predicate [p](../../arrow.optics.typeclasses/-filter-index/filter.html#arrow.optics.typeclasses.FilterIndex$filter(kotlin.Function1((arrow.optics.typeclasses.FilterIndex.I, kotlin.Boolean)))/p). |

