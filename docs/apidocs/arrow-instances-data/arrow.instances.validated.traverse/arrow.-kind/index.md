---
title: arrow.instances.validated.traverse.arrow.Kind - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances.validated.traverse](../index.html) / [arrow.Kind](./index.html)

### Extensions for arrow.Kind

| [flatTraverse](flat-traverse.html) | `fun <E, G, A, B> Kind<Kind<ForValidated, `[`E`](flat-traverse.html#E)`>, `[`A`](flat-traverse.html#A)`>.flatTraverse(arg1: Monad<Kind<ForValidated, `[`E`](flat-traverse.html#E)`>>, arg2: Applicative<`[`G`](flat-traverse.html#G)`>, arg3: (`[`A`](flat-traverse.html#A)`) -> Kind<`[`G`](flat-traverse.html#G)`, Kind<Kind<ForValidated, `[`E`](flat-traverse.html#E)`>, `[`B`](flat-traverse.html#B)`>>): Kind<`[`G`](flat-traverse.html#G)`, Kind<Kind<ForValidated, `[`E`](flat-traverse.html#E)`>, `[`B`](flat-traverse.html#B)`>>` |
| [map](map.html) | `fun <E, A, B> Kind<Kind<ForValidated, `[`E`](map.html#E)`>, `[`A`](map.html#A)`>.map(arg1: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): Validated<`[`E`](map.html#E)`, `[`B`](map.html#B)`>` |
| [sequence](sequence.html) | `fun <E, G, A> Kind<Kind<ForValidated, `[`E`](sequence.html#E)`>, Kind<`[`G`](sequence.html#G)`, `[`A`](sequence.html#A)`>>.sequence(arg1: Applicative<`[`G`](sequence.html#G)`>): Kind<`[`G`](sequence.html#G)`, Kind<Kind<ForValidated, `[`E`](sequence.html#E)`>, `[`A`](sequence.html#A)`>>` |
| [traverse](traverse.html) | `fun <E, G, A, B> Kind<Kind<ForValidated, `[`E`](traverse.html#E)`>, `[`A`](traverse.html#A)`>.traverse(arg1: Applicative<`[`G`](traverse.html#G)`>, arg2: (`[`A`](traverse.html#A)`) -> Kind<`[`G`](traverse.html#G)`, `[`B`](traverse.html#B)`>): Kind<`[`G`](traverse.html#G)`, Kind<Kind<ForValidated, `[`E`](traverse.html#E)`>, `[`B`](traverse.html#B)`>>` |

