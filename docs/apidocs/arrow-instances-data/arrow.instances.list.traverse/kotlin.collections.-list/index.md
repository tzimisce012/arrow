---
title: arrow.instances.list.traverse.kotlin.collections.List - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances.list.traverse](../index.html) / [kotlin.collections.List](./index.html)

### Extensions for kotlin.collections.List

| [flatTraverse](flat-traverse.html) | `fun <G, A, B> `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`A`](flat-traverse.html#A)`>.flatTraverse(arg1: Monad<ForListK>, arg2: Applicative<`[`G`](flat-traverse.html#G)`>, arg3: (`[`A`](flat-traverse.html#A)`) -> Kind<`[`G`](flat-traverse.html#G)`, Kind<ForListK, `[`B`](flat-traverse.html#B)`>>): Kind<`[`G`](flat-traverse.html#G)`, Kind<ForListK, `[`B`](flat-traverse.html#B)`>>` |
| [map](map.html) | `fun <A, B> `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`A`](map.html#A)`>.map(arg1: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`B`](map.html#B)`>` |
| [sequence](sequence.html) | `fun <G, A> `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<Kind<`[`G`](sequence.html#G)`, `[`A`](sequence.html#A)`>>.sequence(arg1: Applicative<`[`G`](sequence.html#G)`>): Kind<`[`G`](sequence.html#G)`, Kind<ForListK, `[`A`](sequence.html#A)`>>` |
| [traverse](traverse.html) | `fun <G, A, B> `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`A`](traverse.html#A)`>.traverse(arg1: Applicative<`[`G`](traverse.html#G)`>, arg2: (`[`A`](traverse.html#A)`) -> Kind<`[`G`](traverse.html#G)`, `[`B`](traverse.html#B)`>): Kind<`[`G`](traverse.html#G)`, Kind<ForListK, `[`B`](traverse.html#B)`>>` |

