---
title: arrow.instances.function1.functor.arrow.Kind - arrow-instances-core
---

[arrow-instances-core](../../index.html) / [arrow.instances.function1.functor](../index.html) / [arrow.Kind](./index.html)

### Extensions for arrow.Kind

| [as](as.html) | `fun <I, A, B> Kind<Kind<ForFunction1, `[`I`](as.html#I)`>, `[`A`](as.html#A)`>.as(arg1: `[`B`](as.html#B)`): (`[`I`](as.html#I)`) -> `[`B`](as.html#B) |
| [fproduct](fproduct.html) | `fun <I, A, B> Kind<Kind<ForFunction1, `[`I`](fproduct.html#I)`>, `[`A`](fproduct.html#A)`>.fproduct(arg1: (`[`A`](fproduct.html#A)`) -> `[`B`](fproduct.html#B)`): (`[`I`](fproduct.html#I)`) -> Tuple2<`[`A`](fproduct.html#A)`, `[`B`](fproduct.html#B)`>` |
| [imap](imap.html) | `fun <I, A, B> Kind<Kind<ForFunction1, `[`I`](imap.html#I)`>, `[`A`](imap.html#A)`>.imap(arg1: (`[`A`](imap.html#A)`) -> `[`B`](imap.html#B)`, arg2: (`[`B`](imap.html#B)`) -> `[`A`](imap.html#A)`): (`[`I`](imap.html#I)`) -> `[`B`](imap.html#B) |
| [map](map.html) | `fun <I, A, B> Kind<Kind<ForFunction1, `[`I`](map.html#I)`>, `[`A`](map.html#A)`>.map(arg1: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): (`[`I`](map.html#I)`) -> `[`B`](map.html#B) |
| [tupleLeft](tuple-left.html) | `fun <I, A, B> Kind<Kind<ForFunction1, `[`I`](tuple-left.html#I)`>, `[`A`](tuple-left.html#A)`>.tupleLeft(arg1: `[`B`](tuple-left.html#B)`): (`[`I`](tuple-left.html#I)`) -> Tuple2<`[`B`](tuple-left.html#B)`, `[`A`](tuple-left.html#A)`>` |
| [tupleRight](tuple-right.html) | `fun <I, A, B> Kind<Kind<ForFunction1, `[`I`](tuple-right.html#I)`>, `[`A`](tuple-right.html#A)`>.tupleRight(arg1: `[`B`](tuple-right.html#B)`): (`[`I`](tuple-right.html#I)`) -> Tuple2<`[`A`](tuple-right.html#A)`, `[`B`](tuple-right.html#B)`>` |
| [void](void.html) | `fun <I, A> Kind<Kind<ForFunction1, `[`I`](void.html#I)`>, `[`A`](void.html#A)`>.void(): (`[`I`](void.html#I)`) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [widen](widen.html) | `fun <I, B, A : `[`B`](widen.html#B)`> Kind<Kind<ForFunction1, `[`I`](widen.html#I)`>, `[`A`](widen.html#A)`>.widen(): (`[`I`](widen.html#I)`) -> `[`B`](widen.html#B) |

