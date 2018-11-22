---
title: arrow.instances.ior.traverse.arrow.Kind - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances.ior.traverse](../index.html) / [arrow.Kind](./index.html)

### Extensions for arrow.Kind

| [flatTraverse](flat-traverse.html) | `fun <L, G, A, B> Kind<Kind<ForIor, `[`L`](flat-traverse.html#L)`>, `[`A`](flat-traverse.html#A)`>.flatTraverse(arg1: Monad<Kind<ForIor, `[`L`](flat-traverse.html#L)`>>, arg2: Applicative<`[`G`](flat-traverse.html#G)`>, arg3: (`[`A`](flat-traverse.html#A)`) -> Kind<`[`G`](flat-traverse.html#G)`, Kind<Kind<ForIor, `[`L`](flat-traverse.html#L)`>, `[`B`](flat-traverse.html#B)`>>): Kind<`[`G`](flat-traverse.html#G)`, Kind<Kind<ForIor, `[`L`](flat-traverse.html#L)`>, `[`B`](flat-traverse.html#B)`>>` |
| [map](map.html) | `fun <L, A, B> Kind<Kind<ForIor, `[`L`](map.html#L)`>, `[`A`](map.html#A)`>.map(arg1: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): Ior<`[`L`](map.html#L)`, `[`B`](map.html#B)`>` |
| [sequence](sequence.html) | `fun <L, G, A> Kind<Kind<ForIor, `[`L`](sequence.html#L)`>, Kind<`[`G`](sequence.html#G)`, `[`A`](sequence.html#A)`>>.sequence(arg1: Applicative<`[`G`](sequence.html#G)`>): Kind<`[`G`](sequence.html#G)`, Kind<Kind<ForIor, `[`L`](sequence.html#L)`>, `[`A`](sequence.html#A)`>>` |
| [traverse](traverse.html) | `fun <L, G, A, B> Kind<Kind<ForIor, `[`L`](traverse.html#L)`>, `[`A`](traverse.html#A)`>.traverse(arg1: Applicative<`[`G`](traverse.html#G)`>, arg2: (`[`A`](traverse.html#A)`) -> Kind<`[`G`](traverse.html#G)`, `[`B`](traverse.html#B)`>): Kind<`[`G`](traverse.html#G)`, Kind<Kind<ForIor, `[`L`](traverse.html#L)`>, `[`B`](traverse.html#B)`>>` |

