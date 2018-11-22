---
title: arrow.instances.const.functor.arrow.Kind - arrow-instances-core
---

[arrow-instances-core](../../index.html) / [arrow.instances.const.functor](../index.html) / [arrow.Kind](./index.html)

### Extensions for arrow.Kind

| [as](as.html) | `fun <A, B> Kind<Kind<ForConst, `[`A`](as.html#A)`>, `[`A`](as.html#A)`>.as(arg1: `[`B`](as.html#B)`): Const<`[`A`](as.html#A)`, `[`B`](as.html#B)`>` |
| [fproduct](fproduct.html) | `fun <A, B> Kind<Kind<ForConst, `[`A`](fproduct.html#A)`>, `[`A`](fproduct.html#A)`>.fproduct(arg1: (`[`A`](fproduct.html#A)`) -> `[`B`](fproduct.html#B)`): Const<`[`A`](fproduct.html#A)`, Tuple2<`[`A`](fproduct.html#A)`, `[`B`](fproduct.html#B)`>>` |
| [imap](imap.html) | `fun <A, B> Kind<Kind<ForConst, `[`A`](imap.html#A)`>, `[`A`](imap.html#A)`>.imap(arg1: (`[`A`](imap.html#A)`) -> `[`B`](imap.html#B)`, arg2: (`[`B`](imap.html#B)`) -> `[`A`](imap.html#A)`): Const<`[`A`](imap.html#A)`, `[`B`](imap.html#B)`>` |
| [map](map.html) | `fun <A, B> Kind<Kind<ForConst, `[`A`](map.html#A)`>, `[`A`](map.html#A)`>.map(arg1: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): Const<`[`A`](map.html#A)`, `[`B`](map.html#B)`>` |
| [tupleLeft](tuple-left.html) | `fun <A, B> Kind<Kind<ForConst, `[`A`](tuple-left.html#A)`>, `[`A`](tuple-left.html#A)`>.tupleLeft(arg1: `[`B`](tuple-left.html#B)`): Const<`[`A`](tuple-left.html#A)`, Tuple2<`[`B`](tuple-left.html#B)`, `[`A`](tuple-left.html#A)`>>` |
| [tupleRight](tuple-right.html) | `fun <A, B> Kind<Kind<ForConst, `[`A`](tuple-right.html#A)`>, `[`A`](tuple-right.html#A)`>.tupleRight(arg1: `[`B`](tuple-right.html#B)`): Const<`[`A`](tuple-right.html#A)`, Tuple2<`[`A`](tuple-right.html#A)`, `[`B`](tuple-right.html#B)`>>` |
| [void](void.html) | `fun <A> Kind<Kind<ForConst, `[`A`](void.html#A)`>, `[`A`](void.html#A)`>.void(): Const<`[`A`](void.html#A)`, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>` |
| [widen](widen.html) | `fun <A, B> Kind<Kind<ForConst, `[`A`](widen.html#A)`>, `[`A`](widen.html#A)`>.widen(): Const<`[`A`](widen.html#A)`, `[`B`](widen.html#B)`>` |

