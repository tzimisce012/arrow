---
title: arrow.instances.const.traverse.arrow.Kind - arrow-instances-core
---

[arrow-instances-core](../../index.html) / [arrow.instances.const.traverse](../index.html) / [arrow.Kind](./index.html)

### Extensions for arrow.Kind

| [flatTraverse](flat-traverse.html) | `fun <X, G, A, B> Kind<Kind<ForConst, `[`X`](flat-traverse.html#X)`>, `[`A`](flat-traverse.html#A)`>.flatTraverse(arg1: Monad<Kind<ForConst, `[`X`](flat-traverse.html#X)`>>, arg2: Applicative<`[`G`](flat-traverse.html#G)`>, arg3: (`[`A`](flat-traverse.html#A)`) -> Kind<`[`G`](flat-traverse.html#G)`, Kind<Kind<ForConst, `[`X`](flat-traverse.html#X)`>, `[`B`](flat-traverse.html#B)`>>): Kind<`[`G`](flat-traverse.html#G)`, Kind<Kind<ForConst, `[`X`](flat-traverse.html#X)`>, `[`B`](flat-traverse.html#B)`>>` |
| [map](map.html) | `fun <X, A, B> Kind<Kind<ForConst, `[`X`](map.html#X)`>, `[`A`](map.html#A)`>.map(arg1: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): Const<`[`X`](map.html#X)`, `[`B`](map.html#B)`>` |
| [sequence](sequence.html) | `fun <X, G, A> Kind<Kind<ForConst, `[`X`](sequence.html#X)`>, Kind<`[`G`](sequence.html#G)`, `[`A`](sequence.html#A)`>>.sequence(arg1: Applicative<`[`G`](sequence.html#G)`>): Kind<`[`G`](sequence.html#G)`, Kind<Kind<ForConst, `[`X`](sequence.html#X)`>, `[`A`](sequence.html#A)`>>` |
| [traverse](traverse.html) | `fun <X, G, A, B> Kind<Kind<ForConst, `[`X`](traverse.html#X)`>, `[`A`](traverse.html#A)`>.traverse(arg1: Applicative<`[`G`](traverse.html#G)`>, arg2: (`[`A`](traverse.html#A)`) -> Kind<`[`G`](traverse.html#G)`, `[`B`](traverse.html#B)`>): Kind<`[`G`](traverse.html#G)`, Kind<Kind<ForConst, `[`X`](traverse.html#X)`>, `[`B`](traverse.html#B)`>>` |

