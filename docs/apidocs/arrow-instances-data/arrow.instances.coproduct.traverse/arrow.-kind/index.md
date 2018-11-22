---
title: arrow.instances.coproduct.traverse.arrow.Kind - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances.coproduct.traverse](../index.html) / [arrow.Kind](./index.html)

### Extensions for arrow.Kind

| [flatTraverse](flat-traverse.html) | `fun <F, G, A, B> Kind<Kind<Kind<ForCoproduct, `[`F`](flat-traverse.html#F)`>, `[`G`](flat-traverse.html#G)`>, `[`A`](flat-traverse.html#A)`>.flatTraverse(arg1: Monad<Kind<Kind<ForCoproduct, `[`F`](flat-traverse.html#F)`>, `[`G`](flat-traverse.html#G)`>>, arg2: Applicative<`[`G`](flat-traverse.html#G)`>, arg3: (`[`A`](flat-traverse.html#A)`) -> Kind<`[`G`](flat-traverse.html#G)`, Kind<Kind<Kind<ForCoproduct, `[`F`](flat-traverse.html#F)`>, `[`G`](flat-traverse.html#G)`>, `[`B`](flat-traverse.html#B)`>>, TF: Traverse<`[`F`](flat-traverse.html#F)`>, TG: Traverse<`[`G`](flat-traverse.html#G)`>): Kind<`[`G`](flat-traverse.html#G)`, Kind<Kind<Kind<ForCoproduct, `[`F`](flat-traverse.html#F)`>, `[`G`](flat-traverse.html#G)`>, `[`B`](flat-traverse.html#B)`>>` |
| [map](map.html) | `fun <F, G, A, B> Kind<Kind<Kind<ForCoproduct, `[`F`](map.html#F)`>, `[`G`](map.html#G)`>, `[`A`](map.html#A)`>.map(arg1: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`, TF: Traverse<`[`F`](map.html#F)`>, TG: Traverse<`[`G`](map.html#G)`>): Kind<`[`G`](map.html#G)`, `[`B`](map.html#B)`>` |
| [sequence](sequence.html) | `fun <F, G, A> Kind<Kind<Kind<ForCoproduct, `[`F`](sequence.html#F)`>, `[`G`](sequence.html#G)`>, Kind<`[`G`](sequence.html#G)`, `[`A`](sequence.html#A)`>>.sequence(arg1: Applicative<`[`G`](sequence.html#G)`>, TF: Traverse<`[`F`](sequence.html#F)`>, TG: Traverse<`[`G`](sequence.html#G)`>): Kind<`[`G`](sequence.html#G)`, Kind<Kind<Kind<ForCoproduct, `[`F`](sequence.html#F)`>, `[`G`](sequence.html#G)`>, `[`A`](sequence.html#A)`>>` |
| [traverse](traverse.html) | `fun <F, G, A, B> Kind<Kind<Kind<ForCoproduct, `[`F`](traverse.html#F)`>, `[`G`](traverse.html#G)`>, `[`A`](traverse.html#A)`>.traverse(arg1: Applicative<`[`G`](traverse.html#G)`>, arg2: (`[`A`](traverse.html#A)`) -> Kind<`[`G`](traverse.html#G)`, `[`B`](traverse.html#B)`>, TF: Traverse<`[`F`](traverse.html#F)`>, TG: Traverse<`[`G`](traverse.html#G)`>): Kind<`[`G`](traverse.html#G)`, Kind<Kind<Kind<ForCoproduct, `[`F`](traverse.html#F)`>, `[`G`](traverse.html#G)`>, `[`B`](traverse.html#B)`>>` |

