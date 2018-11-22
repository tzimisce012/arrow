---
title: arrow.instances.kleisli.functor.arrow.Kind - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances.kleisli.functor](../index.html) / [arrow.Kind](./index.html)

### Extensions for arrow.Kind

| [as](as.html) | `fun <F, D, A, B> Kind<Kind<Kind<ForKleisli, `[`F`](as.html#F)`>, `[`D`](as.html#D)`>, `[`A`](as.html#A)`>.as(arg1: `[`B`](as.html#B)`, FF: Functor<`[`F`](as.html#F)`>): Kind<`[`D`](as.html#D)`, `[`B`](as.html#B)`>` |
| [fproduct](fproduct.html) | `fun <F, D, A, B> Kind<Kind<Kind<ForKleisli, `[`F`](fproduct.html#F)`>, `[`D`](fproduct.html#D)`>, `[`A`](fproduct.html#A)`>.fproduct(arg1: (`[`A`](fproduct.html#A)`) -> `[`B`](fproduct.html#B)`, FF: Functor<`[`F`](fproduct.html#F)`>): Kind<`[`D`](fproduct.html#D)`, Tuple2<`[`A`](fproduct.html#A)`, `[`B`](fproduct.html#B)`>>` |
| [imap](imap.html) | `fun <F, D, A, B> Kind<Kind<Kind<ForKleisli, `[`F`](imap.html#F)`>, `[`D`](imap.html#D)`>, `[`A`](imap.html#A)`>.imap(arg1: (`[`A`](imap.html#A)`) -> `[`B`](imap.html#B)`, arg2: (`[`B`](imap.html#B)`) -> `[`A`](imap.html#A)`, FF: Functor<`[`F`](imap.html#F)`>): Kind<`[`D`](imap.html#D)`, `[`B`](imap.html#B)`>` |
| [map](map.html) | `fun <F, D, A, B> Kind<Kind<Kind<ForKleisli, `[`F`](map.html#F)`>, `[`D`](map.html#D)`>, `[`A`](map.html#A)`>.map(arg1: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`, FF: Functor<`[`F`](map.html#F)`>): Kind<`[`D`](map.html#D)`, `[`B`](map.html#B)`>` |
| [tupleLeft](tuple-left.html) | `fun <F, D, A, B> Kind<Kind<Kind<ForKleisli, `[`F`](tuple-left.html#F)`>, `[`D`](tuple-left.html#D)`>, `[`A`](tuple-left.html#A)`>.tupleLeft(arg1: `[`B`](tuple-left.html#B)`, FF: Functor<`[`F`](tuple-left.html#F)`>): Kind<`[`D`](tuple-left.html#D)`, Tuple2<`[`B`](tuple-left.html#B)`, `[`A`](tuple-left.html#A)`>>` |
| [tupleRight](tuple-right.html) | `fun <F, D, A, B> Kind<Kind<Kind<ForKleisli, `[`F`](tuple-right.html#F)`>, `[`D`](tuple-right.html#D)`>, `[`A`](tuple-right.html#A)`>.tupleRight(arg1: `[`B`](tuple-right.html#B)`, FF: Functor<`[`F`](tuple-right.html#F)`>): Kind<`[`D`](tuple-right.html#D)`, Tuple2<`[`A`](tuple-right.html#A)`, `[`B`](tuple-right.html#B)`>>` |
| [void](void.html) | `fun <F, D, A> Kind<Kind<Kind<ForKleisli, `[`F`](void.html#F)`>, `[`D`](void.html#D)`>, `[`A`](void.html#A)`>.void(FF: Functor<`[`F`](void.html#F)`>): Kind<`[`D`](void.html#D)`, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>` |
| [widen](widen.html) | `fun <F, D, B, A : `[`B`](widen.html#B)`> Kind<Kind<Kind<ForKleisli, `[`F`](widen.html#F)`>, `[`D`](widen.html#D)`>, `[`A`](widen.html#A)`>.widen(FF: Functor<`[`F`](widen.html#F)`>): Kind<`[`D`](widen.html#D)`, `[`B`](widen.html#B)`>` |

