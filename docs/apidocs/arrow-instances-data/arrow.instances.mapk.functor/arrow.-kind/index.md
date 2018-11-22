---
title: arrow.instances.mapk.functor.arrow.Kind - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances.mapk.functor](../index.html) / [arrow.Kind](./index.html)

### Extensions for arrow.Kind

| [as](as.html) | `fun <K, A, B> Kind<Kind<ForMapK, `[`K`](as.html#K)`>, `[`A`](as.html#A)`>.as(arg1: `[`B`](as.html#B)`): MapK<`[`K`](as.html#K)`, `[`B`](as.html#B)`>` |
| [fproduct](fproduct.html) | `fun <K, A, B> Kind<Kind<ForMapK, `[`K`](fproduct.html#K)`>, `[`A`](fproduct.html#A)`>.fproduct(arg1: (`[`A`](fproduct.html#A)`) -> `[`B`](fproduct.html#B)`): MapK<`[`K`](fproduct.html#K)`, Tuple2<`[`A`](fproduct.html#A)`, `[`B`](fproduct.html#B)`>>` |
| [imap](imap.html) | `fun <K, A, B> Kind<Kind<ForMapK, `[`K`](imap.html#K)`>, `[`A`](imap.html#A)`>.imap(arg1: (`[`A`](imap.html#A)`) -> `[`B`](imap.html#B)`, arg2: (`[`B`](imap.html#B)`) -> `[`A`](imap.html#A)`): MapK<`[`K`](imap.html#K)`, `[`B`](imap.html#B)`>` |
| [map](map.html) | `fun <K, A, B> Kind<Kind<ForMapK, `[`K`](map.html#K)`>, `[`A`](map.html#A)`>.map(arg1: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): MapK<`[`K`](map.html#K)`, `[`B`](map.html#B)`>` |
| [tupleLeft](tuple-left.html) | `fun <K, A, B> Kind<Kind<ForMapK, `[`K`](tuple-left.html#K)`>, `[`A`](tuple-left.html#A)`>.tupleLeft(arg1: `[`B`](tuple-left.html#B)`): MapK<`[`K`](tuple-left.html#K)`, Tuple2<`[`B`](tuple-left.html#B)`, `[`A`](tuple-left.html#A)`>>` |
| [tupleRight](tuple-right.html) | `fun <K, A, B> Kind<Kind<ForMapK, `[`K`](tuple-right.html#K)`>, `[`A`](tuple-right.html#A)`>.tupleRight(arg1: `[`B`](tuple-right.html#B)`): MapK<`[`K`](tuple-right.html#K)`, Tuple2<`[`A`](tuple-right.html#A)`, `[`B`](tuple-right.html#B)`>>` |
| [void](void.html) | `fun <K, A> Kind<Kind<ForMapK, `[`K`](void.html#K)`>, `[`A`](void.html#A)`>.void(): MapK<`[`K`](void.html#K)`, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>` |
| [widen](widen.html) | `fun <K, B, A : `[`B`](widen.html#B)`> Kind<Kind<ForMapK, `[`K`](widen.html#K)`>, `[`A`](widen.html#A)`>.widen(): MapK<`[`K`](widen.html#K)`, `[`B`](widen.html#B)`>` |

