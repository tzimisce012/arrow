---
title: arrow.instances.optiont.functor.arrow.Kind - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances.optiont.functor](../index.html) / [arrow.Kind](./index.html)

### Extensions for arrow.Kind

| [as](as.html) | `fun <F, A, B> Kind<Kind<ForOptionT, `[`F`](as.html#F)`>, `[`A`](as.html#A)`>.as(arg1: `[`B`](as.html#B)`, FF: Functor<`[`F`](as.html#F)`>): OptionT<`[`F`](as.html#F)`, `[`B`](as.html#B)`>` |
| [fproduct](fproduct.html) | `fun <F, A, B> Kind<Kind<ForOptionT, `[`F`](fproduct.html#F)`>, `[`A`](fproduct.html#A)`>.fproduct(arg1: (`[`A`](fproduct.html#A)`) -> `[`B`](fproduct.html#B)`, FF: Functor<`[`F`](fproduct.html#F)`>): OptionT<`[`F`](fproduct.html#F)`, Tuple2<`[`A`](fproduct.html#A)`, `[`B`](fproduct.html#B)`>>` |
| [imap](imap.html) | `fun <F, A, B> Kind<Kind<ForOptionT, `[`F`](imap.html#F)`>, `[`A`](imap.html#A)`>.imap(arg1: (`[`A`](imap.html#A)`) -> `[`B`](imap.html#B)`, arg2: (`[`B`](imap.html#B)`) -> `[`A`](imap.html#A)`, FF: Functor<`[`F`](imap.html#F)`>): OptionT<`[`F`](imap.html#F)`, `[`B`](imap.html#B)`>` |
| [map](map.html) | `fun <F, A, B> Kind<Kind<ForOptionT, `[`F`](map.html#F)`>, `[`A`](map.html#A)`>.map(arg1: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`, FF: Functor<`[`F`](map.html#F)`>): OptionT<`[`F`](map.html#F)`, `[`B`](map.html#B)`>` |
| [tupleLeft](tuple-left.html) | `fun <F, A, B> Kind<Kind<ForOptionT, `[`F`](tuple-left.html#F)`>, `[`A`](tuple-left.html#A)`>.tupleLeft(arg1: `[`B`](tuple-left.html#B)`, FF: Functor<`[`F`](tuple-left.html#F)`>): OptionT<`[`F`](tuple-left.html#F)`, Tuple2<`[`B`](tuple-left.html#B)`, `[`A`](tuple-left.html#A)`>>` |
| [tupleRight](tuple-right.html) | `fun <F, A, B> Kind<Kind<ForOptionT, `[`F`](tuple-right.html#F)`>, `[`A`](tuple-right.html#A)`>.tupleRight(arg1: `[`B`](tuple-right.html#B)`, FF: Functor<`[`F`](tuple-right.html#F)`>): OptionT<`[`F`](tuple-right.html#F)`, Tuple2<`[`A`](tuple-right.html#A)`, `[`B`](tuple-right.html#B)`>>` |
| [void](void.html) | `fun <F, A> Kind<Kind<ForOptionT, `[`F`](void.html#F)`>, `[`A`](void.html#A)`>.void(FF: Functor<`[`F`](void.html#F)`>): OptionT<`[`F`](void.html#F)`, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>` |
| [widen](widen.html) | `fun <F, B, A : `[`B`](widen.html#B)`> Kind<Kind<ForOptionT, `[`F`](widen.html#F)`>, `[`A`](widen.html#A)`>.widen(FF: Functor<`[`F`](widen.html#F)`>): OptionT<`[`F`](widen.html#F)`, `[`B`](widen.html#B)`>` |

