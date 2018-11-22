---
title: arrow.instances.day.functor.arrow.Kind - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances.day.functor](../index.html) / [arrow.Kind](./index.html)

### Extensions for arrow.Kind

| [as](as.html) | `fun <F, G, A, B> Kind<Kind<Kind<ForDay, `[`F`](as.html#F)`>, `[`G`](as.html#G)`>, `[`A`](as.html#A)`>.as(arg1: `[`B`](as.html#B)`): Kind<`[`G`](as.html#G)`, `[`B`](as.html#B)`>` |
| [fproduct](fproduct.html) | `fun <F, G, A, B> Kind<Kind<Kind<ForDay, `[`F`](fproduct.html#F)`>, `[`G`](fproduct.html#G)`>, `[`A`](fproduct.html#A)`>.fproduct(arg1: (`[`A`](fproduct.html#A)`) -> `[`B`](fproduct.html#B)`): Kind<`[`G`](fproduct.html#G)`, Tuple2<`[`A`](fproduct.html#A)`, `[`B`](fproduct.html#B)`>>` |
| [imap](imap.html) | `fun <F, G, A, B> Kind<Kind<Kind<ForDay, `[`F`](imap.html#F)`>, `[`G`](imap.html#G)`>, `[`A`](imap.html#A)`>.imap(arg1: (`[`A`](imap.html#A)`) -> `[`B`](imap.html#B)`, arg2: (`[`B`](imap.html#B)`) -> `[`A`](imap.html#A)`): Kind<`[`G`](imap.html#G)`, `[`B`](imap.html#B)`>` |
| [map](map.html) | `fun <F, G, A, B> Kind<Kind<Kind<ForDay, `[`F`](map.html#F)`>, `[`G`](map.html#G)`>, `[`A`](map.html#A)`>.map(arg1: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): Kind<`[`G`](map.html#G)`, `[`B`](map.html#B)`>` |
| [tupleLeft](tuple-left.html) | `fun <F, G, A, B> Kind<Kind<Kind<ForDay, `[`F`](tuple-left.html#F)`>, `[`G`](tuple-left.html#G)`>, `[`A`](tuple-left.html#A)`>.tupleLeft(arg1: `[`B`](tuple-left.html#B)`): Kind<`[`G`](tuple-left.html#G)`, Tuple2<`[`B`](tuple-left.html#B)`, `[`A`](tuple-left.html#A)`>>` |
| [tupleRight](tuple-right.html) | `fun <F, G, A, B> Kind<Kind<Kind<ForDay, `[`F`](tuple-right.html#F)`>, `[`G`](tuple-right.html#G)`>, `[`A`](tuple-right.html#A)`>.tupleRight(arg1: `[`B`](tuple-right.html#B)`): Kind<`[`G`](tuple-right.html#G)`, Tuple2<`[`A`](tuple-right.html#A)`, `[`B`](tuple-right.html#B)`>>` |
| [void](void.html) | `fun <F, G, A> Kind<Kind<Kind<ForDay, `[`F`](void.html#F)`>, `[`G`](void.html#G)`>, `[`A`](void.html#A)`>.void(): Kind<`[`G`](void.html#G)`, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>` |
| [widen](widen.html) | `fun <F, G, B, A : `[`B`](widen.html#B)`> Kind<Kind<Kind<ForDay, `[`F`](widen.html#F)`>, `[`G`](widen.html#G)`>, `[`A`](widen.html#A)`>.widen(): Kind<`[`G`](widen.html#G)`, `[`B`](widen.html#B)`>` |

