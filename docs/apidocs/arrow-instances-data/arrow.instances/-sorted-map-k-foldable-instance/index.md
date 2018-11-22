---
title: SortedMapKFoldableInstance - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [SortedMapKFoldableInstance](./index.html)

# SortedMapKFoldableInstance

`interface SortedMapKFoldableInstance<A : `[`Comparable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html)`<`[`A`](index.html#A)`>> : Foldable<SortedMapKPartialOf<`[`A`](index.html#A)`>>`

### Functions

| [foldLeft](fold-left.html) | `open fun <B, C> SortedMapKOf<`[`A`](index.html#A)`, `[`B`](fold-left.html#B)`>.foldLeft(b: `[`C`](fold-left.html#C)`, f: (`[`C`](fold-left.html#C)`, `[`B`](fold-left.html#B)`) -> `[`C`](fold-left.html#C)`): `[`C`](fold-left.html#C) |
| [foldRight](fold-right.html) | `open fun <B, C> SortedMapKOf<`[`A`](index.html#A)`, `[`B`](fold-right.html#B)`>.foldRight(lb: Eval<`[`C`](fold-right.html#C)`>, f: (`[`B`](fold-right.html#B)`, Eval<`[`C`](fold-right.html#C)`>) -> Eval<`[`C`](fold-right.html#C)`>): Eval<`[`C`](fold-right.html#C)`>` |

### Inheritors

| [SortedMapKTraverseInstance](../-sorted-map-k-traverse-instance/index.html) | `interface SortedMapKTraverseInstance<A : `[`Comparable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html)`<`[`A`](../-sorted-map-k-traverse-instance/index.html#A)`>> : Traverse<SortedMapKPartialOf<`[`A`](../-sorted-map-k-traverse-instance/index.html#A)`>>, `[`SortedMapKFoldableInstance`](./index.html)`<`[`A`](../-sorted-map-k-traverse-instance/index.html#A)`>` |

