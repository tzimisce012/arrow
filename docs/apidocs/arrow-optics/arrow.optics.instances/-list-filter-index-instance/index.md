---
title: ListFilterIndexInstance - arrow-optics
---

[arrow-optics](../../index.html) / [arrow.optics.instances](../index.html) / [ListFilterIndexInstance](./index.html)

# ListFilterIndexInstance

`interface ListFilterIndexInstance<A> : `[`FilterIndex`](../../arrow.optics.typeclasses/-filter-index/index.html)`<`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`A`](index.html#A)`>, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, `[`A`](index.html#A)`>`

[FilterIndex](../../arrow.optics.typeclasses/-filter-index/index.html) instance definition for [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html).

### Functions

| [filter](filter.html) | `open fun filter(p: (`[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`Traversal`](../../arrow.optics/-traversal.html)`<`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`A`](index.html#A)`>, `[`A`](index.html#A)`>`<br>Filter the foci [A](../../arrow.optics.typeclasses/-filter-index/index.html#A) of a [Traversal](../../arrow.optics/-traversal.html) with the predicate [p](../../arrow.optics.typeclasses/-filter-index/filter.html#arrow.optics.typeclasses.FilterIndex$filter(kotlin.Function1((arrow.optics.typeclasses.FilterIndex.I, kotlin.Boolean)))/p). |

### Companion Object Functions

| [invoke](invoke.html) | `operator fun <A> invoke(): `[`ListFilterIndexInstance`](./index.html)`<`[`A`](invoke.html#A)`>`<br>Operator overload to instantiate typeclass instance. |

