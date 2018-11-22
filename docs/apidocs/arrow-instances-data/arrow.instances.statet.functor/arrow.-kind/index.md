---
title: arrow.instances.statet.functor.arrow.Kind - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances.statet.functor](../index.html) / [arrow.Kind](./index.html)

### Extensions for arrow.Kind

| [as](as.html) | `fun <F, S, A, B> Kind<Kind<Kind<ForStateT, `[`F`](as.html#F)`>, `[`S`](as.html#S)`>, `[`A`](as.html#A)`>.as(arg1: `[`B`](as.html#B)`, FF: Functor<`[`F`](as.html#F)`>): Kind<`[`S`](as.html#S)`, `[`B`](as.html#B)`>` |
| [fproduct](fproduct.html) | `fun <F, S, A, B> Kind<Kind<Kind<ForStateT, `[`F`](fproduct.html#F)`>, `[`S`](fproduct.html#S)`>, `[`A`](fproduct.html#A)`>.fproduct(arg1: (`[`A`](fproduct.html#A)`) -> `[`B`](fproduct.html#B)`, FF: Functor<`[`F`](fproduct.html#F)`>): Kind<`[`S`](fproduct.html#S)`, Tuple2<`[`A`](fproduct.html#A)`, `[`B`](fproduct.html#B)`>>` |
| [imap](imap.html) | `fun <F, S, A, B> Kind<Kind<Kind<ForStateT, `[`F`](imap.html#F)`>, `[`S`](imap.html#S)`>, `[`A`](imap.html#A)`>.imap(arg1: (`[`A`](imap.html#A)`) -> `[`B`](imap.html#B)`, arg2: (`[`B`](imap.html#B)`) -> `[`A`](imap.html#A)`, FF: Functor<`[`F`](imap.html#F)`>): Kind<`[`S`](imap.html#S)`, `[`B`](imap.html#B)`>` |
| [map](map.html) | `fun <F, S, A, B> Kind<Kind<Kind<ForStateT, `[`F`](map.html#F)`>, `[`S`](map.html#S)`>, `[`A`](map.html#A)`>.map(arg1: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`, FF: Functor<`[`F`](map.html#F)`>): Kind<`[`S`](map.html#S)`, `[`B`](map.html#B)`>` |
| [tupleLeft](tuple-left.html) | `fun <F, S, A, B> Kind<Kind<Kind<ForStateT, `[`F`](tuple-left.html#F)`>, `[`S`](tuple-left.html#S)`>, `[`A`](tuple-left.html#A)`>.tupleLeft(arg1: `[`B`](tuple-left.html#B)`, FF: Functor<`[`F`](tuple-left.html#F)`>): Kind<`[`S`](tuple-left.html#S)`, Tuple2<`[`B`](tuple-left.html#B)`, `[`A`](tuple-left.html#A)`>>` |
| [tupleRight](tuple-right.html) | `fun <F, S, A, B> Kind<Kind<Kind<ForStateT, `[`F`](tuple-right.html#F)`>, `[`S`](tuple-right.html#S)`>, `[`A`](tuple-right.html#A)`>.tupleRight(arg1: `[`B`](tuple-right.html#B)`, FF: Functor<`[`F`](tuple-right.html#F)`>): Kind<`[`S`](tuple-right.html#S)`, Tuple2<`[`A`](tuple-right.html#A)`, `[`B`](tuple-right.html#B)`>>` |
| [void](void.html) | `fun <F, S, A> Kind<Kind<Kind<ForStateT, `[`F`](void.html#F)`>, `[`S`](void.html#S)`>, `[`A`](void.html#A)`>.void(FF: Functor<`[`F`](void.html#F)`>): Kind<`[`S`](void.html#S)`, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>` |
| [widen](widen.html) | `fun <F, S, B, A : `[`B`](widen.html#B)`> Kind<Kind<Kind<ForStateT, `[`F`](widen.html#F)`>, `[`S`](widen.html#S)`>, `[`A`](widen.html#A)`>.widen(FF: Functor<`[`F`](widen.html#F)`>): Kind<`[`S`](widen.html#S)`, `[`B`](widen.html#B)`>` |

