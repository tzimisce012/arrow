---
title: arrow.effects.observablek.traverse.arrow.Kind - arrow-effects-rx2-instances
---

[arrow-effects-rx2-instances](../../index.html) / [arrow.effects.observablek.traverse](../index.html) / [arrow.Kind](./index.html)

### Extensions for arrow.Kind

| [flatTraverse](flat-traverse.html) | `fun <G, A, B> Kind<ForObservableK, `[`A`](flat-traverse.html#A)`>.flatTraverse(arg1: Monad<ForObservableK>, arg2: Applicative<`[`G`](flat-traverse.html#G)`>, arg3: (`[`A`](flat-traverse.html#A)`) -> Kind<`[`G`](flat-traverse.html#G)`, Kind<ForObservableK, `[`B`](flat-traverse.html#B)`>>): Kind<`[`G`](flat-traverse.html#G)`, Kind<ForObservableK, `[`B`](flat-traverse.html#B)`>>` |
| [map](map.html) | `fun <A, B> Kind<ForObservableK, `[`A`](map.html#A)`>.map(arg1: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): ObservableK<`[`B`](map.html#B)`>` |
| [sequence](sequence.html) | `fun <G, A> Kind<ForObservableK, Kind<`[`G`](sequence.html#G)`, `[`A`](sequence.html#A)`>>.sequence(arg1: Applicative<`[`G`](sequence.html#G)`>): Kind<`[`G`](sequence.html#G)`, Kind<ForObservableK, `[`A`](sequence.html#A)`>>` |
| [traverse](traverse.html) | `fun <G, A, B> Kind<ForObservableK, `[`A`](traverse.html#A)`>.traverse(arg1: Applicative<`[`G`](traverse.html#G)`>, arg2: (`[`A`](traverse.html#A)`) -> Kind<`[`G`](traverse.html#G)`, `[`B`](traverse.html#B)`>): Kind<`[`G`](traverse.html#G)`, Kind<ForObservableK, `[`B`](traverse.html#B)`>>` |

