---
title: arrow.instances.sequence.traverse.kotlin.sequences.Sequence - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances.sequence.traverse](../index.html) / [kotlin.sequences.Sequence](./index.html)

### Extensions for kotlin.sequences.Sequence

| [flatTraverse](flat-traverse.html) | `fun <G, A, B> `[`Sequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.sequences/-sequence/index.html)`<`[`A`](flat-traverse.html#A)`>.flatTraverse(arg1: Monad<ForSequenceK>, arg2: Applicative<`[`G`](flat-traverse.html#G)`>, arg3: (`[`A`](flat-traverse.html#A)`) -> Kind<`[`G`](flat-traverse.html#G)`, Kind<ForSequenceK, `[`B`](flat-traverse.html#B)`>>): Kind<`[`G`](flat-traverse.html#G)`, Kind<ForSequenceK, `[`B`](flat-traverse.html#B)`>>` |
| [map](map.html) | `fun <A, B> `[`Sequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.sequences/-sequence/index.html)`<`[`A`](map.html#A)`>.map(arg1: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): `[`Sequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.sequences/-sequence/index.html)`<`[`B`](map.html#B)`>` |
| [sequence](sequence.html) | `fun <G, A> `[`Sequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.sequences/-sequence/index.html)`<Kind<`[`G`](sequence.html#G)`, `[`A`](sequence.html#A)`>>.sequence(arg1: Applicative<`[`G`](sequence.html#G)`>): Kind<`[`G`](sequence.html#G)`, Kind<ForSequenceK, `[`A`](sequence.html#A)`>>` |
| [traverse](traverse.html) | `fun <G, A, B> `[`Sequence`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.sequences/-sequence/index.html)`<`[`A`](traverse.html#A)`>.traverse(arg1: Applicative<`[`G`](traverse.html#G)`>, arg2: (`[`A`](traverse.html#A)`) -> Kind<`[`G`](traverse.html#G)`, `[`B`](traverse.html#B)`>): Kind<`[`G`](traverse.html#G)`, Kind<ForSequenceK, `[`B`](traverse.html#B)`>>` |

