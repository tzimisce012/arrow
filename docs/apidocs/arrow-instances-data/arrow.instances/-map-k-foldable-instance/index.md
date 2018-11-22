---
title: MapKFoldableInstance - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [MapKFoldableInstance](./index.html)

# MapKFoldableInstance

`@extension interface MapKFoldableInstance<K> : Foldable<MapKPartialOf<`[`K`](index.html#K)`>>`

### Functions

| [foldLeft](fold-left.html) | `open fun <A, B> Kind<MapKPartialOf<`[`K`](index.html#K)`>, `[`A`](fold-left.html#A)`>.foldLeft(b: `[`B`](fold-left.html#B)`, f: (`[`B`](fold-left.html#B)`, `[`A`](fold-left.html#A)`) -> `[`B`](fold-left.html#B)`): `[`B`](fold-left.html#B) |
| [foldRight](fold-right.html) | `open fun <A, B> Kind<MapKPartialOf<`[`K`](index.html#K)`>, `[`A`](fold-right.html#A)`>.foldRight(lb: Eval<`[`B`](fold-right.html#B)`>, f: (`[`A`](fold-right.html#A)`, Eval<`[`B`](fold-right.html#B)`>) -> Eval<`[`B`](fold-right.html#B)`>): Eval<`[`B`](fold-right.html#B)`>` |

### Inheritors

| [MapKTraverseInstance](../-map-k-traverse-instance/index.html) | `interface MapKTraverseInstance<K> : Traverse<MapKPartialOf<`[`K`](../-map-k-traverse-instance/index.html#K)`>>, `[`MapKFoldableInstance`](./index.html)`<`[`K`](../-map-k-traverse-instance/index.html#K)`>` |

