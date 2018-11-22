---
title: SortedMapKTraverseInstance - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [SortedMapKTraverseInstance](./index.html)

# SortedMapKTraverseInstance

`interface SortedMapKTraverseInstance<A : `[`Comparable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html)`<`[`A`](index.html#A)`>> : Traverse<SortedMapKPartialOf<`[`A`](index.html#A)`>>, `[`SortedMapKFoldableInstance`](../-sorted-map-k-foldable-instance/index.html)`<`[`A`](index.html#A)`>`

### Functions

| [traverse](traverse.html) | `open fun <G, B, C> SortedMapKOf<`[`A`](index.html#A)`, `[`B`](traverse.html#B)`>.traverse(AP: Applicative<`[`G`](traverse.html#G)`>, f: (`[`B`](traverse.html#B)`) -> Kind<`[`G`](traverse.html#G)`, `[`C`](traverse.html#C)`>): Kind<`[`G`](traverse.html#G)`, Kind<SortedMapKPartialOf<`[`A`](index.html#A)`>, `[`C`](traverse.html#C)`>>` |

### Inheritors

| [SortedMapKContext](../-sorted-map-k-context/index.html) | `class SortedMapKContext<K : `[`Comparable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html)`<`[`K`](../-sorted-map-k-context/index.html#K)`>> : `[`SortedMapKTraverseInstance`](./index.html)`<`[`K`](../-sorted-map-k-context/index.html#K)`>` |

