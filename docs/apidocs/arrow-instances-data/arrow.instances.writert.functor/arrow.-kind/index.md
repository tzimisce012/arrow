---
title: arrow.instances.writert.functor.arrow.Kind - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances.writert.functor](../index.html) / [arrow.Kind](./index.html)

### Extensions for arrow.Kind

| [as](as.html) | `fun <F, W, A, B> Kind<Kind<Kind<ForWriterT, `[`F`](as.html#F)`>, `[`W`](as.html#W)`>, `[`A`](as.html#A)`>.as(arg1: `[`B`](as.html#B)`, FF: Functor<`[`F`](as.html#F)`>): Kind<`[`W`](as.html#W)`, `[`B`](as.html#B)`>` |
| [fproduct](fproduct.html) | `fun <F, W, A, B> Kind<Kind<Kind<ForWriterT, `[`F`](fproduct.html#F)`>, `[`W`](fproduct.html#W)`>, `[`A`](fproduct.html#A)`>.fproduct(arg1: (`[`A`](fproduct.html#A)`) -> `[`B`](fproduct.html#B)`, FF: Functor<`[`F`](fproduct.html#F)`>): Kind<`[`W`](fproduct.html#W)`, Tuple2<`[`A`](fproduct.html#A)`, `[`B`](fproduct.html#B)`>>` |
| [imap](imap.html) | `fun <F, W, A, B> Kind<Kind<Kind<ForWriterT, `[`F`](imap.html#F)`>, `[`W`](imap.html#W)`>, `[`A`](imap.html#A)`>.imap(arg1: (`[`A`](imap.html#A)`) -> `[`B`](imap.html#B)`, arg2: (`[`B`](imap.html#B)`) -> `[`A`](imap.html#A)`, FF: Functor<`[`F`](imap.html#F)`>): Kind<`[`W`](imap.html#W)`, `[`B`](imap.html#B)`>` |
| [map](map.html) | `fun <F, W, A, B> Kind<Kind<Kind<ForWriterT, `[`F`](map.html#F)`>, `[`W`](map.html#W)`>, `[`A`](map.html#A)`>.map(arg1: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`, FF: Functor<`[`F`](map.html#F)`>): Kind<`[`W`](map.html#W)`, `[`B`](map.html#B)`>` |
| [tupleLeft](tuple-left.html) | `fun <F, W, A, B> Kind<Kind<Kind<ForWriterT, `[`F`](tuple-left.html#F)`>, `[`W`](tuple-left.html#W)`>, `[`A`](tuple-left.html#A)`>.tupleLeft(arg1: `[`B`](tuple-left.html#B)`, FF: Functor<`[`F`](tuple-left.html#F)`>): Kind<`[`W`](tuple-left.html#W)`, Tuple2<`[`B`](tuple-left.html#B)`, `[`A`](tuple-left.html#A)`>>` |
| [tupleRight](tuple-right.html) | `fun <F, W, A, B> Kind<Kind<Kind<ForWriterT, `[`F`](tuple-right.html#F)`>, `[`W`](tuple-right.html#W)`>, `[`A`](tuple-right.html#A)`>.tupleRight(arg1: `[`B`](tuple-right.html#B)`, FF: Functor<`[`F`](tuple-right.html#F)`>): Kind<`[`W`](tuple-right.html#W)`, Tuple2<`[`A`](tuple-right.html#A)`, `[`B`](tuple-right.html#B)`>>` |
| [void](void.html) | `fun <F, W, A> Kind<Kind<Kind<ForWriterT, `[`F`](void.html#F)`>, `[`W`](void.html#W)`>, `[`A`](void.html#A)`>.void(FF: Functor<`[`F`](void.html#F)`>): Kind<`[`W`](void.html#W)`, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>` |
| [widen](widen.html) | `fun <F, W, B, A : `[`B`](widen.html#B)`> Kind<Kind<Kind<ForWriterT, `[`F`](widen.html#F)`>, `[`W`](widen.html#W)`>, `[`A`](widen.html#A)`>.widen(FF: Functor<`[`F`](widen.html#F)`>): Kind<`[`W`](widen.html#W)`, `[`B`](widen.html#B)`>` |

