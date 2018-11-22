---
title: arrow.free.instances.cofree.functor.arrow.Kind - arrow-instances-free
---

[arrow-instances-free](../../index.html) / [arrow.free.instances.cofree.functor](../index.html) / [arrow.Kind](./index.html)

### Extensions for arrow.Kind

| [as](as.html) | `fun <S, A, B> Kind<Kind<ForCofree, `[`S`](as.html#S)`>, `[`A`](as.html#A)`>.as(arg1: `[`B`](as.html#B)`): Cofree<`[`S`](as.html#S)`, `[`B`](as.html#B)`>` |
| [fproduct](fproduct.html) | `fun <S, A, B> Kind<Kind<ForCofree, `[`S`](fproduct.html#S)`>, `[`A`](fproduct.html#A)`>.fproduct(arg1: (`[`A`](fproduct.html#A)`) -> `[`B`](fproduct.html#B)`): Cofree<`[`S`](fproduct.html#S)`, Tuple2<`[`A`](fproduct.html#A)`, `[`B`](fproduct.html#B)`>>` |
| [imap](imap.html) | `fun <S, A, B> Kind<Kind<ForCofree, `[`S`](imap.html#S)`>, `[`A`](imap.html#A)`>.imap(arg1: (`[`A`](imap.html#A)`) -> `[`B`](imap.html#B)`, arg2: (`[`B`](imap.html#B)`) -> `[`A`](imap.html#A)`): Cofree<`[`S`](imap.html#S)`, `[`B`](imap.html#B)`>` |
| [map](map.html) | `fun <S, A, B> Kind<Kind<ForCofree, `[`S`](map.html#S)`>, `[`A`](map.html#A)`>.map(arg1: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): Cofree<`[`S`](map.html#S)`, `[`B`](map.html#B)`>` |
| [tupleLeft](tuple-left.html) | `fun <S, A, B> Kind<Kind<ForCofree, `[`S`](tuple-left.html#S)`>, `[`A`](tuple-left.html#A)`>.tupleLeft(arg1: `[`B`](tuple-left.html#B)`): Cofree<`[`S`](tuple-left.html#S)`, Tuple2<`[`B`](tuple-left.html#B)`, `[`A`](tuple-left.html#A)`>>` |
| [tupleRight](tuple-right.html) | `fun <S, A, B> Kind<Kind<ForCofree, `[`S`](tuple-right.html#S)`>, `[`A`](tuple-right.html#A)`>.tupleRight(arg1: `[`B`](tuple-right.html#B)`): Cofree<`[`S`](tuple-right.html#S)`, Tuple2<`[`A`](tuple-right.html#A)`, `[`B`](tuple-right.html#B)`>>` |
| [void](void.html) | `fun <S, A> Kind<Kind<ForCofree, `[`S`](void.html#S)`>, `[`A`](void.html#A)`>.void(): Cofree<`[`S`](void.html#S)`, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>` |
| [widen](widen.html) | `fun <S, B, A : `[`B`](widen.html#B)`> Kind<Kind<ForCofree, `[`S`](widen.html#S)`>, `[`A`](widen.html#A)`>.widen(): Cofree<`[`S`](widen.html#S)`, `[`B`](widen.html#B)`>` |

