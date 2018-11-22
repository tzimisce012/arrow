---
title: arrow.instances.tuple2.traverse.arrow.Kind - arrow-instances-core
---

[arrow-instances-core](../../index.html) / [arrow.instances.tuple2.traverse](../index.html) / [arrow.Kind](./index.html)

### Extensions for arrow.Kind

| [flatTraverse](flat-traverse.html) | `fun <F, G, A, B> Kind<Kind<ForTuple2, `[`F`](flat-traverse.html#F)`>, `[`A`](flat-traverse.html#A)`>.flatTraverse(arg1: Monad<Kind<ForTuple2, `[`F`](flat-traverse.html#F)`>>, arg2: Applicative<`[`G`](flat-traverse.html#G)`>, arg3: (`[`A`](flat-traverse.html#A)`) -> Kind<`[`G`](flat-traverse.html#G)`, Kind<Kind<ForTuple2, `[`F`](flat-traverse.html#F)`>, `[`B`](flat-traverse.html#B)`>>): Kind<`[`G`](flat-traverse.html#G)`, Kind<Kind<ForTuple2, `[`F`](flat-traverse.html#F)`>, `[`B`](flat-traverse.html#B)`>>` |
| [map](map.html) | `fun <F, A, B> Kind<Kind<ForTuple2, `[`F`](map.html#F)`>, `[`A`](map.html#A)`>.map(arg1: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): Tuple2<`[`F`](map.html#F)`, `[`B`](map.html#B)`>` |
| [sequence](sequence.html) | `fun <F, G, A> Kind<Kind<ForTuple2, `[`F`](sequence.html#F)`>, Kind<`[`G`](sequence.html#G)`, `[`A`](sequence.html#A)`>>.sequence(arg1: Applicative<`[`G`](sequence.html#G)`>): Kind<`[`G`](sequence.html#G)`, Kind<Kind<ForTuple2, `[`F`](sequence.html#F)`>, `[`A`](sequence.html#A)`>>` |
| [traverse](traverse.html) | `fun <F, G, A, B> Kind<Kind<ForTuple2, `[`F`](traverse.html#F)`>, `[`A`](traverse.html#A)`>.traverse(arg1: Applicative<`[`G`](traverse.html#G)`>, arg2: (`[`A`](traverse.html#A)`) -> Kind<`[`G`](traverse.html#G)`, `[`B`](traverse.html#B)`>): Kind<`[`G`](traverse.html#G)`, Kind<Kind<ForTuple2, `[`F`](traverse.html#F)`>, `[`B`](traverse.html#B)`>>` |

