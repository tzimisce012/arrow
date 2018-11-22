---
title: arrow.instances.coproduct.functor.arrow.Kind - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances.coproduct.functor](../index.html) / [arrow.Kind](./index.html)

### Extensions for arrow.Kind

| [as](as.html) | `fun <F, G, A, B> Kind<Kind<Kind<ForCoproduct, `[`F`](as.html#F)`>, `[`G`](as.html#G)`>, `[`A`](as.html#A)`>.as(arg1: `[`B`](as.html#B)`, FF: Functor<`[`F`](as.html#F)`>, FG: Functor<`[`G`](as.html#G)`>): Kind<`[`G`](as.html#G)`, `[`B`](as.html#B)`>` |
| [fproduct](fproduct.html) | `fun <F, G, A, B> Kind<Kind<Kind<ForCoproduct, `[`F`](fproduct.html#F)`>, `[`G`](fproduct.html#G)`>, `[`A`](fproduct.html#A)`>.fproduct(arg1: (`[`A`](fproduct.html#A)`) -> `[`B`](fproduct.html#B)`, FF: Functor<`[`F`](fproduct.html#F)`>, FG: Functor<`[`G`](fproduct.html#G)`>): Kind<`[`G`](fproduct.html#G)`, Tuple2<`[`A`](fproduct.html#A)`, `[`B`](fproduct.html#B)`>>` |
| [imap](imap.html) | `fun <F, G, A, B> Kind<Kind<Kind<ForCoproduct, `[`F`](imap.html#F)`>, `[`G`](imap.html#G)`>, `[`A`](imap.html#A)`>.imap(arg1: (`[`A`](imap.html#A)`) -> `[`B`](imap.html#B)`, arg2: (`[`B`](imap.html#B)`) -> `[`A`](imap.html#A)`, FF: Functor<`[`F`](imap.html#F)`>, FG: Functor<`[`G`](imap.html#G)`>): Kind<`[`G`](imap.html#G)`, `[`B`](imap.html#B)`>` |
| [map](map.html) | `fun <F, G, A, B> Kind<Kind<Kind<ForCoproduct, `[`F`](map.html#F)`>, `[`G`](map.html#G)`>, `[`A`](map.html#A)`>.map(arg1: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`, FF: Functor<`[`F`](map.html#F)`>, FG: Functor<`[`G`](map.html#G)`>): Kind<`[`G`](map.html#G)`, `[`B`](map.html#B)`>` |
| [tupleLeft](tuple-left.html) | `fun <F, G, A, B> Kind<Kind<Kind<ForCoproduct, `[`F`](tuple-left.html#F)`>, `[`G`](tuple-left.html#G)`>, `[`A`](tuple-left.html#A)`>.tupleLeft(arg1: `[`B`](tuple-left.html#B)`, FF: Functor<`[`F`](tuple-left.html#F)`>, FG: Functor<`[`G`](tuple-left.html#G)`>): Kind<`[`G`](tuple-left.html#G)`, Tuple2<`[`B`](tuple-left.html#B)`, `[`A`](tuple-left.html#A)`>>` |
| [tupleRight](tuple-right.html) | `fun <F, G, A, B> Kind<Kind<Kind<ForCoproduct, `[`F`](tuple-right.html#F)`>, `[`G`](tuple-right.html#G)`>, `[`A`](tuple-right.html#A)`>.tupleRight(arg1: `[`B`](tuple-right.html#B)`, FF: Functor<`[`F`](tuple-right.html#F)`>, FG: Functor<`[`G`](tuple-right.html#G)`>): Kind<`[`G`](tuple-right.html#G)`, Tuple2<`[`A`](tuple-right.html#A)`, `[`B`](tuple-right.html#B)`>>` |
| [void](void.html) | `fun <F, G, A> Kind<Kind<Kind<ForCoproduct, `[`F`](void.html#F)`>, `[`G`](void.html#G)`>, `[`A`](void.html#A)`>.void(FF: Functor<`[`F`](void.html#F)`>, FG: Functor<`[`G`](void.html#G)`>): Kind<`[`G`](void.html#G)`, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>` |
| [widen](widen.html) | `fun <F, G, B, A : `[`B`](widen.html#B)`> Kind<Kind<Kind<ForCoproduct, `[`F`](widen.html#F)`>, `[`G`](widen.html#G)`>, `[`A`](widen.html#A)`>.widen(FF: Functor<`[`F`](widen.html#F)`>, FG: Functor<`[`G`](widen.html#G)`>): Kind<`[`G`](widen.html#G)`, `[`B`](widen.html#B)`>` |

