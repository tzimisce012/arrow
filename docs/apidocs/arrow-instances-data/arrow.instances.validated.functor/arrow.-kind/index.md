---
title: arrow.instances.validated.functor.arrow.Kind - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances.validated.functor](../index.html) / [arrow.Kind](./index.html)

### Extensions for arrow.Kind

| [as](as.html) | `fun <E, A, B> Kind<Kind<ForValidated, `[`E`](as.html#E)`>, `[`A`](as.html#A)`>.as(arg1: `[`B`](as.html#B)`): Validated<`[`E`](as.html#E)`, `[`B`](as.html#B)`>` |
| [fproduct](fproduct.html) | `fun <E, A, B> Kind<Kind<ForValidated, `[`E`](fproduct.html#E)`>, `[`A`](fproduct.html#A)`>.fproduct(arg1: (`[`A`](fproduct.html#A)`) -> `[`B`](fproduct.html#B)`): Validated<`[`E`](fproduct.html#E)`, Tuple2<`[`A`](fproduct.html#A)`, `[`B`](fproduct.html#B)`>>` |
| [imap](imap.html) | `fun <E, A, B> Kind<Kind<ForValidated, `[`E`](imap.html#E)`>, `[`A`](imap.html#A)`>.imap(arg1: (`[`A`](imap.html#A)`) -> `[`B`](imap.html#B)`, arg2: (`[`B`](imap.html#B)`) -> `[`A`](imap.html#A)`): Validated<`[`E`](imap.html#E)`, `[`B`](imap.html#B)`>` |
| [map](map.html) | `fun <E, A, B> Kind<Kind<ForValidated, `[`E`](map.html#E)`>, `[`A`](map.html#A)`>.map(arg1: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): Validated<`[`E`](map.html#E)`, `[`B`](map.html#B)`>` |
| [tupleLeft](tuple-left.html) | `fun <E, A, B> Kind<Kind<ForValidated, `[`E`](tuple-left.html#E)`>, `[`A`](tuple-left.html#A)`>.tupleLeft(arg1: `[`B`](tuple-left.html#B)`): Validated<`[`E`](tuple-left.html#E)`, Tuple2<`[`B`](tuple-left.html#B)`, `[`A`](tuple-left.html#A)`>>` |
| [tupleRight](tuple-right.html) | `fun <E, A, B> Kind<Kind<ForValidated, `[`E`](tuple-right.html#E)`>, `[`A`](tuple-right.html#A)`>.tupleRight(arg1: `[`B`](tuple-right.html#B)`): Validated<`[`E`](tuple-right.html#E)`, Tuple2<`[`A`](tuple-right.html#A)`, `[`B`](tuple-right.html#B)`>>` |
| [void](void.html) | `fun <E, A> Kind<Kind<ForValidated, `[`E`](void.html#E)`>, `[`A`](void.html#A)`>.void(): Validated<`[`E`](void.html#E)`, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>` |
| [widen](widen.html) | `fun <E, B, A : `[`B`](widen.html#B)`> Kind<Kind<ForValidated, `[`E`](widen.html#E)`>, `[`A`](widen.html#A)`>.widen(): Validated<`[`E`](widen.html#E)`, `[`B`](widen.html#B)`>` |

