---
title: SequenceKFilterIndexInstance - arrow-optics
---

[arrow-optics](../../index.html) / [arrow.optics.instances](../index.html) / [SequenceKFilterIndexInstance](./index.html)

# SequenceKFilterIndexInstance

`@extension interface SequenceKFilterIndexInstance<A> : `[`FilterIndex`](../../arrow.optics.typeclasses/-filter-index/index.html)`<SequenceK<`[`A`](index.html#A)`>, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, `[`A`](index.html#A)`>`

[FilterIndex](../../arrow.optics.typeclasses/-filter-index/index.html) instance definition for [SequenceK](#).

### Functions

| [filter](filter.html) | `open fun filter(p: (`[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`Traversal`](../../arrow.optics/-traversal.html)`<SequenceK<`[`A`](index.html#A)`>, `[`A`](index.html#A)`>`<br>Filter the foci [A](../../arrow.optics.typeclasses/-filter-index/index.html#A) of a [Traversal](../../arrow.optics/-traversal.html) with the predicate [p](../../arrow.optics.typeclasses/-filter-index/filter.html#arrow.optics.typeclasses.FilterIndex$filter(kotlin.Function1((arrow.optics.typeclasses.FilterIndex.I, kotlin.Boolean)))/p). |

