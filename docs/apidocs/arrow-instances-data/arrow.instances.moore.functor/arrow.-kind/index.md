---
title: arrow.instances.moore.functor.arrow.Kind - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances.moore.functor](../index.html) / [arrow.Kind](./index.html)

### Extensions for arrow.Kind

| [as](as.html) | `fun <V, A, B> Kind<Kind<ForMoore, `[`V`](as.html#V)`>, `[`A`](as.html#A)`>.as(arg1: `[`B`](as.html#B)`): Moore<`[`V`](as.html#V)`, `[`B`](as.html#B)`>` |
| [fproduct](fproduct.html) | `fun <V, A, B> Kind<Kind<ForMoore, `[`V`](fproduct.html#V)`>, `[`A`](fproduct.html#A)`>.fproduct(arg1: (`[`A`](fproduct.html#A)`) -> `[`B`](fproduct.html#B)`): Moore<`[`V`](fproduct.html#V)`, Tuple2<`[`A`](fproduct.html#A)`, `[`B`](fproduct.html#B)`>>` |
| [imap](imap.html) | `fun <V, A, B> Kind<Kind<ForMoore, `[`V`](imap.html#V)`>, `[`A`](imap.html#A)`>.imap(arg1: (`[`A`](imap.html#A)`) -> `[`B`](imap.html#B)`, arg2: (`[`B`](imap.html#B)`) -> `[`A`](imap.html#A)`): Moore<`[`V`](imap.html#V)`, `[`B`](imap.html#B)`>` |
| [map](map.html) | `fun <V, A, B> Kind<Kind<ForMoore, `[`V`](map.html#V)`>, `[`A`](map.html#A)`>.map(arg1: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): Moore<`[`V`](map.html#V)`, `[`B`](map.html#B)`>` |
| [tupleLeft](tuple-left.html) | `fun <V, A, B> Kind<Kind<ForMoore, `[`V`](tuple-left.html#V)`>, `[`A`](tuple-left.html#A)`>.tupleLeft(arg1: `[`B`](tuple-left.html#B)`): Moore<`[`V`](tuple-left.html#V)`, Tuple2<`[`B`](tuple-left.html#B)`, `[`A`](tuple-left.html#A)`>>` |
| [tupleRight](tuple-right.html) | `fun <V, A, B> Kind<Kind<ForMoore, `[`V`](tuple-right.html#V)`>, `[`A`](tuple-right.html#A)`>.tupleRight(arg1: `[`B`](tuple-right.html#B)`): Moore<`[`V`](tuple-right.html#V)`, Tuple2<`[`A`](tuple-right.html#A)`, `[`B`](tuple-right.html#B)`>>` |
| [void](void.html) | `fun <V, A> Kind<Kind<ForMoore, `[`V`](void.html#V)`>, `[`A`](void.html#A)`>.void(): Moore<`[`V`](void.html#V)`, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>` |
| [widen](widen.html) | `fun <V, B, A : `[`B`](widen.html#B)`> Kind<Kind<ForMoore, `[`V`](widen.html#V)`>, `[`A`](widen.html#A)`>.widen(): Moore<`[`V`](widen.html#V)`, `[`B`](widen.html#B)`>` |

