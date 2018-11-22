---
title: arrow.instances.either.functor.arrow.Kind - arrow-instances-core
---

[arrow-instances-core](../../index.html) / [arrow.instances.either.functor](../index.html) / [arrow.Kind](./index.html)

### Extensions for arrow.Kind

| [as](as.html) | `fun <L, A, B> Kind<Kind<ForEither, `[`L`](as.html#L)`>, `[`A`](as.html#A)`>.as(arg1: `[`B`](as.html#B)`): Either<`[`L`](as.html#L)`, `[`B`](as.html#B)`>` |
| [fproduct](fproduct.html) | `fun <L, A, B> Kind<Kind<ForEither, `[`L`](fproduct.html#L)`>, `[`A`](fproduct.html#A)`>.fproduct(arg1: (`[`A`](fproduct.html#A)`) -> `[`B`](fproduct.html#B)`): Either<`[`L`](fproduct.html#L)`, Tuple2<`[`A`](fproduct.html#A)`, `[`B`](fproduct.html#B)`>>` |
| [imap](imap.html) | `fun <L, A, B> Kind<Kind<ForEither, `[`L`](imap.html#L)`>, `[`A`](imap.html#A)`>.imap(arg1: (`[`A`](imap.html#A)`) -> `[`B`](imap.html#B)`, arg2: (`[`B`](imap.html#B)`) -> `[`A`](imap.html#A)`): Either<`[`L`](imap.html#L)`, `[`B`](imap.html#B)`>` |
| [map](map.html) | `fun <L, A, B> Kind<Kind<ForEither, `[`L`](map.html#L)`>, `[`A`](map.html#A)`>.map(arg1: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): Either<`[`L`](map.html#L)`, `[`B`](map.html#B)`>` |
| [tupleLeft](tuple-left.html) | `fun <L, A, B> Kind<Kind<ForEither, `[`L`](tuple-left.html#L)`>, `[`A`](tuple-left.html#A)`>.tupleLeft(arg1: `[`B`](tuple-left.html#B)`): Either<`[`L`](tuple-left.html#L)`, Tuple2<`[`B`](tuple-left.html#B)`, `[`A`](tuple-left.html#A)`>>` |
| [tupleRight](tuple-right.html) | `fun <L, A, B> Kind<Kind<ForEither, `[`L`](tuple-right.html#L)`>, `[`A`](tuple-right.html#A)`>.tupleRight(arg1: `[`B`](tuple-right.html#B)`): Either<`[`L`](tuple-right.html#L)`, Tuple2<`[`A`](tuple-right.html#A)`, `[`B`](tuple-right.html#B)`>>` |
| [void](void.html) | `fun <L, A> Kind<Kind<ForEither, `[`L`](void.html#L)`>, `[`A`](void.html#A)`>.void(): Either<`[`L`](void.html#L)`, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>` |
| [widen](widen.html) | `fun <L, B, A : `[`B`](widen.html#B)`> Kind<Kind<ForEither, `[`L`](widen.html#L)`>, `[`A`](widen.html#A)`>.widen(): Either<`[`L`](widen.html#L)`, `[`B`](widen.html#B)`>` |

