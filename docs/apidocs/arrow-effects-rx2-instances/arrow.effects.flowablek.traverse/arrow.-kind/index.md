---
title: arrow.effects.flowablek.traverse.arrow.Kind - arrow-effects-rx2-instances
---

[arrow-effects-rx2-instances](../../index.html) / [arrow.effects.flowablek.traverse](../index.html) / [arrow.Kind](./index.html)

### Extensions for arrow.Kind

| [flatTraverse](flat-traverse.html) | `fun <G, A, B> Kind<ForFlowableK, `[`A`](flat-traverse.html#A)`>.flatTraverse(arg1: Monad<ForFlowableK>, arg2: Applicative<`[`G`](flat-traverse.html#G)`>, arg3: (`[`A`](flat-traverse.html#A)`) -> Kind<`[`G`](flat-traverse.html#G)`, Kind<ForFlowableK, `[`B`](flat-traverse.html#B)`>>): Kind<`[`G`](flat-traverse.html#G)`, Kind<ForFlowableK, `[`B`](flat-traverse.html#B)`>>` |
| [map](map.html) | `fun <A, B> Kind<ForFlowableK, `[`A`](map.html#A)`>.map(arg1: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): FlowableK<`[`B`](map.html#B)`>` |
| [sequence](sequence.html) | `fun <G, A> Kind<ForFlowableK, Kind<`[`G`](sequence.html#G)`, `[`A`](sequence.html#A)`>>.sequence(arg1: Applicative<`[`G`](sequence.html#G)`>): Kind<`[`G`](sequence.html#G)`, Kind<ForFlowableK, `[`A`](sequence.html#A)`>>` |
| [traverse](traverse.html) | `fun <G, A, B> Kind<ForFlowableK, `[`A`](traverse.html#A)`>.traverse(arg1: Applicative<`[`G`](traverse.html#G)`>, arg2: (`[`A`](traverse.html#A)`) -> Kind<`[`G`](traverse.html#G)`, `[`B`](traverse.html#B)`>): Kind<`[`G`](traverse.html#G)`, Kind<ForFlowableK, `[`B`](traverse.html#B)`>>` |

