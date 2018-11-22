---
title: arrow.instances.try.functor.arrow.Kind - arrow-instances-core
---

[arrow-instances-core](../../index.html) / [arrow.instances.try.functor](../index.html) / [arrow.Kind](./index.html)

### Extensions for arrow.Kind

| [as](as.html) | `fun <A, B> Kind<ForTry, `[`A`](as.html#A)`>.as(arg1: `[`B`](as.html#B)`): Try<`[`B`](as.html#B)`>` |
| [fproduct](fproduct.html) | `fun <A, B> Kind<ForTry, `[`A`](fproduct.html#A)`>.fproduct(arg1: (`[`A`](fproduct.html#A)`) -> `[`B`](fproduct.html#B)`): Try<Tuple2<`[`A`](fproduct.html#A)`, `[`B`](fproduct.html#B)`>>` |
| [imap](imap.html) | `fun <A, B> Kind<ForTry, `[`A`](imap.html#A)`>.imap(arg1: (`[`A`](imap.html#A)`) -> `[`B`](imap.html#B)`, arg2: (`[`B`](imap.html#B)`) -> `[`A`](imap.html#A)`): Try<`[`B`](imap.html#B)`>` |
| [map](map.html) | `fun <A, B> Kind<ForTry, `[`A`](map.html#A)`>.map(arg1: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): Try<`[`B`](map.html#B)`>` |
| [tupleLeft](tuple-left.html) | `fun <A, B> Kind<ForTry, `[`A`](tuple-left.html#A)`>.tupleLeft(arg1: `[`B`](tuple-left.html#B)`): Try<Tuple2<`[`B`](tuple-left.html#B)`, `[`A`](tuple-left.html#A)`>>` |
| [tupleRight](tuple-right.html) | `fun <A, B> Kind<ForTry, `[`A`](tuple-right.html#A)`>.tupleRight(arg1: `[`B`](tuple-right.html#B)`): Try<Tuple2<`[`A`](tuple-right.html#A)`, `[`B`](tuple-right.html#B)`>>` |
| [void](void.html) | `fun <A> Kind<ForTry, `[`A`](void.html#A)`>.void(): Try<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>` |
| [widen](widen.html) | `fun <B, A : `[`B`](widen.html#B)`> Kind<ForTry, `[`A`](widen.html#A)`>.widen(): Try<`[`B`](widen.html#B)`>` |

