---
title: FilterIndex - arrow-optics
---

[arrow-optics](../../index.html) / [arrow.optics.typeclasses](../index.html) / [FilterIndex](./index.html)

# FilterIndex

`interface FilterIndex<S, I, A>`



[FilterIndex](./index.html) provides a [Traversal](../../arrow.optics/-traversal.html) for a structure [S](index.html#S) with all its foci [A](index.html#A) whose index [I](index.html#I) satisfies a predicate.

### Parameters

`S` - source of [Traversal](../../arrow.optics/-traversal.html)

`I` - index that uniquely identifies every focus of the [Traversal](../../arrow.optics/-traversal.html)

`A` - focus that is supposed to be unique for a given pair [S](index.html#S) and [I](index.html#I)

### Functions

| [filter](filter.html) | `abstract fun filter(p: Predicate<`[`I`](index.html#I)`>): `[`Traversal`](../../arrow.optics/-traversal.html)`<`[`S`](index.html#S)`, `[`A`](index.html#A)`>`<br>Filter the foci [A](index.html#A) of a [Traversal](../../arrow.optics/-traversal.html) with the predicate [p](filter.html#arrow.optics.typeclasses.FilterIndex$filter(kotlin.Function1((arrow.optics.typeclasses.FilterIndex.I, kotlin.Boolean)))/p). |

### Companion Object Functions

| [fromIso](from-iso.html) | `fun <S, A, I, B> fromIso(FI: `[`FilterIndex`](./index.html)`<`[`A`](from-iso.html#A)`, `[`I`](from-iso.html#I)`, `[`B`](from-iso.html#B)`>, iso: `[`Iso`](../../arrow.optics/-iso.html)`<`[`S`](from-iso.html#S)`, `[`A`](from-iso.html#A)`>): `[`FilterIndex`](./index.html)`<`[`S`](from-iso.html#S)`, `[`I`](from-iso.html#I)`, `[`B`](from-iso.html#B)`>`<br>Lift an instance of [FilterIndex](./index.html) using an [Iso](../../arrow.optics/-iso.html) |
| [fromTraverse](from-traverse.html) | `fun <S, A> fromTraverse(zipWithIndex: (Kind<`[`S`](from-traverse.html#S)`, `[`A`](from-traverse.html#A)`>) -> Kind<`[`S`](from-traverse.html#S)`, Tuple2<`[`A`](from-traverse.html#A)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>>, traverse: Traverse<`[`S`](from-traverse.html#S)`>): `[`FilterIndex`](./index.html)`<Kind<`[`S`](from-traverse.html#S)`, `[`A`](from-traverse.html#A)`>, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, `[`A`](from-traverse.html#A)`>`<br>Create an instance of [FilterIndex](./index.html) from a [Traverse](#) and a function `Kind<S, A>) -> Kind<S, Tuple2<A, Int>>` |

### Inheritors

| [ListFilterIndexInstance](../../arrow.optics.instances/-list-filter-index-instance/index.html) | `interface ListFilterIndexInstance<A> : `[`FilterIndex`](./index.html)`<`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`A`](../../arrow.optics.instances/-list-filter-index-instance/index.html#A)`>, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, `[`A`](../../arrow.optics.instances/-list-filter-index-instance/index.html#A)`>`<br>[FilterIndex](./index.html) instance definition for [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html). |
| [ListKFilterIndexInstance](../../arrow.optics.instances/-list-k-filter-index-instance/index.html) | `interface ListKFilterIndexInstance<A> : `[`FilterIndex`](./index.html)`<ListK<`[`A`](../../arrow.optics.instances/-list-k-filter-index-instance/index.html#A)`>, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, `[`A`](../../arrow.optics.instances/-list-k-filter-index-instance/index.html#A)`>`<br>[FilterIndex](./index.html) instance definition for [ListK](#). |
| [MapFilterIndexInstance](../../arrow.optics.instances/-map-filter-index-instance/index.html) | `interface MapFilterIndexInstance<K, V> : `[`FilterIndex`](./index.html)`<`[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`K`](../../arrow.optics.instances/-map-filter-index-instance/index.html#K)`, `[`V`](../../arrow.optics.instances/-map-filter-index-instance/index.html#V)`>, `[`K`](../../arrow.optics.instances/-map-filter-index-instance/index.html#K)`, `[`V`](../../arrow.optics.instances/-map-filter-index-instance/index.html#V)`>`<br>[FilterIndex](./index.html) instance definition for [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html). |
| [MapKFilterIndexInstance](../../arrow.optics.instances/-map-k-filter-index-instance/index.html) | `interface MapKFilterIndexInstance<K, V> : `[`FilterIndex`](./index.html)`<MapK<`[`K`](../../arrow.optics.instances/-map-k-filter-index-instance/index.html#K)`, `[`V`](../../arrow.optics.instances/-map-k-filter-index-instance/index.html#V)`>, `[`K`](../../arrow.optics.instances/-map-k-filter-index-instance/index.html#K)`, `[`V`](../../arrow.optics.instances/-map-k-filter-index-instance/index.html#V)`>`<br>[FilterIndex](./index.html) instance definition for [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html). |
| [NonEmptyListFilterIndexInstance](../../arrow.optics.instances/-non-empty-list-filter-index-instance/index.html) | `interface NonEmptyListFilterIndexInstance<A> : `[`FilterIndex`](./index.html)`<NonEmptyList<`[`A`](../../arrow.optics.instances/-non-empty-list-filter-index-instance/index.html#A)`>, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, `[`A`](../../arrow.optics.instances/-non-empty-list-filter-index-instance/index.html#A)`>`<br>[FilterIndex](./index.html) instance definition for [NonEmptyList](#). |
| [SequenceKFilterIndexInstance](../../arrow.optics.instances/-sequence-k-filter-index-instance/index.html) | `interface SequenceKFilterIndexInstance<A> : `[`FilterIndex`](./index.html)`<SequenceK<`[`A`](../../arrow.optics.instances/-sequence-k-filter-index-instance/index.html#A)`>, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, `[`A`](../../arrow.optics.instances/-sequence-k-filter-index-instance/index.html#A)`>`<br>[FilterIndex](./index.html) instance definition for [SequenceK](#). |
| [StringFilterIndexInstance](../../arrow.optics.instances/-string-filter-index-instance/index.html) | `interface StringFilterIndexInstance : `[`FilterIndex`](./index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, `[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)`>`<br>[FilterIndex](./index.html) instance for [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html). It allows filtering of every [Char](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html) in a [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) by its index's position. |




## Type Class Hierarchy

<canvas id="arrow.optics.typeclasses-hierarchy-diagram"></canvas>
<script>
  drawNomNomlDiagram('arrow.optics.typeclasses-hierarchy-diagram', 'arrow.optics.typeclasses-diagram.nomnol')
</script>

