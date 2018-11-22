---
title: arrow.instances.mapk.traverse.arrow.Kind - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances.mapk.traverse](../index.html) / [arrow.Kind](./index.html)

### Extensions for arrow.Kind

| [flatTraverse](flat-traverse.html) | `fun <K, G, A, B> Kind<Kind<ForMapK, `[`K`](flat-traverse.html#K)`>, `[`A`](flat-traverse.html#A)`>.flatTraverse(arg1: Monad<Kind<ForMapK, `[`K`](flat-traverse.html#K)`>>, arg2: Applicative<`[`G`](flat-traverse.html#G)`>, arg3: (`[`A`](flat-traverse.html#A)`) -> Kind<`[`G`](flat-traverse.html#G)`, Kind<Kind<ForMapK, `[`K`](flat-traverse.html#K)`>, `[`B`](flat-traverse.html#B)`>>): Kind<`[`G`](flat-traverse.html#G)`, Kind<Kind<ForMapK, `[`K`](flat-traverse.html#K)`>, `[`B`](flat-traverse.html#B)`>>` |
| [map](map.html) | `fun <K, A, B> Kind<Kind<ForMapK, `[`K`](map.html#K)`>, `[`A`](map.html#A)`>.map(arg1: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): MapK<`[`K`](map.html#K)`, `[`B`](map.html#B)`>` |
| [sequence](sequence.html) | `fun <K, G, A> Kind<Kind<ForMapK, `[`K`](sequence.html#K)`>, Kind<`[`G`](sequence.html#G)`, `[`A`](sequence.html#A)`>>.sequence(arg1: Applicative<`[`G`](sequence.html#G)`>): Kind<`[`G`](sequence.html#G)`, Kind<Kind<ForMapK, `[`K`](sequence.html#K)`>, `[`A`](sequence.html#A)`>>` |
| [traverse](traverse.html) | `fun <K, G, A, B> Kind<Kind<ForMapK, `[`K`](traverse.html#K)`>, `[`A`](traverse.html#A)`>.traverse(arg1: Applicative<`[`G`](traverse.html#G)`>, arg2: (`[`A`](traverse.html#A)`) -> Kind<`[`G`](traverse.html#G)`, `[`B`](traverse.html#B)`>): Kind<`[`G`](traverse.html#G)`, Kind<Kind<ForMapK, `[`K`](traverse.html#K)`>, `[`B`](traverse.html#B)`>>` |

