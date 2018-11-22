---
title: arrow.instances.tuple2.functor.arrow.Kind - arrow-instances-core
---

[arrow-instances-core](../../index.html) / [arrow.instances.tuple2.functor](../index.html) / [arrow.Kind](./index.html)

### Extensions for arrow.Kind

| [as](as.html) | `fun <F, A, B> Kind<Kind<ForTuple2, `[`F`](as.html#F)`>, `[`A`](as.html#A)`>.as(arg1: `[`B`](as.html#B)`): Tuple2<`[`F`](as.html#F)`, `[`B`](as.html#B)`>` |
| [fproduct](fproduct.html) | `fun <F, A, B> Kind<Kind<ForTuple2, `[`F`](fproduct.html#F)`>, `[`A`](fproduct.html#A)`>.fproduct(arg1: (`[`A`](fproduct.html#A)`) -> `[`B`](fproduct.html#B)`): Tuple2<`[`F`](fproduct.html#F)`, Tuple2<`[`A`](fproduct.html#A)`, `[`B`](fproduct.html#B)`>>` |
| [imap](imap.html) | `fun <F, A, B> Kind<Kind<ForTuple2, `[`F`](imap.html#F)`>, `[`A`](imap.html#A)`>.imap(arg1: (`[`A`](imap.html#A)`) -> `[`B`](imap.html#B)`, arg2: (`[`B`](imap.html#B)`) -> `[`A`](imap.html#A)`): Tuple2<`[`F`](imap.html#F)`, `[`B`](imap.html#B)`>` |
| [map](map.html) | `fun <F, A, B> Kind<Kind<ForTuple2, `[`F`](map.html#F)`>, `[`A`](map.html#A)`>.map(arg1: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): Tuple2<`[`F`](map.html#F)`, `[`B`](map.html#B)`>` |
| [tupleLeft](tuple-left.html) | `fun <F, A, B> Kind<Kind<ForTuple2, `[`F`](tuple-left.html#F)`>, `[`A`](tuple-left.html#A)`>.tupleLeft(arg1: `[`B`](tuple-left.html#B)`): Tuple2<`[`F`](tuple-left.html#F)`, Tuple2<`[`B`](tuple-left.html#B)`, `[`A`](tuple-left.html#A)`>>` |
| [tupleRight](tuple-right.html) | `fun <F, A, B> Kind<Kind<ForTuple2, `[`F`](tuple-right.html#F)`>, `[`A`](tuple-right.html#A)`>.tupleRight(arg1: `[`B`](tuple-right.html#B)`): Tuple2<`[`F`](tuple-right.html#F)`, Tuple2<`[`A`](tuple-right.html#A)`, `[`B`](tuple-right.html#B)`>>` |
| [void](void.html) | `fun <F, A> Kind<Kind<ForTuple2, `[`F`](void.html#F)`>, `[`A`](void.html#A)`>.void(): Tuple2<`[`F`](void.html#F)`, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>` |
| [widen](widen.html) | `fun <F, B, A : `[`B`](widen.html#B)`> Kind<Kind<ForTuple2, `[`F`](widen.html#F)`>, `[`A`](widen.html#A)`>.widen(): Tuple2<`[`F`](widen.html#F)`, `[`B`](widen.html#B)`>` |

