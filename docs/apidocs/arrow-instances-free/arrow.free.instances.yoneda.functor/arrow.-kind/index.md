---
title: arrow.free.instances.yoneda.functor.arrow.Kind - arrow-instances-free
---

[arrow-instances-free](../../index.html) / [arrow.free.instances.yoneda.functor](../index.html) / [arrow.Kind](./index.html)

### Extensions for arrow.Kind

| [as](as.html) | `fun <U, A, B> Kind<Kind<ForYoneda, `[`U`](as.html#U)`>, `[`A`](as.html#A)`>.as(arg1: `[`B`](as.html#B)`): Yoneda<`[`U`](as.html#U)`, `[`B`](as.html#B)`>` |
| [fproduct](fproduct.html) | `fun <U, A, B> Kind<Kind<ForYoneda, `[`U`](fproduct.html#U)`>, `[`A`](fproduct.html#A)`>.fproduct(arg1: (`[`A`](fproduct.html#A)`) -> `[`B`](fproduct.html#B)`): Yoneda<`[`U`](fproduct.html#U)`, Tuple2<`[`A`](fproduct.html#A)`, `[`B`](fproduct.html#B)`>>` |
| [imap](imap.html) | `fun <U, A, B> Kind<Kind<ForYoneda, `[`U`](imap.html#U)`>, `[`A`](imap.html#A)`>.imap(arg1: (`[`A`](imap.html#A)`) -> `[`B`](imap.html#B)`, arg2: (`[`B`](imap.html#B)`) -> `[`A`](imap.html#A)`): Yoneda<`[`U`](imap.html#U)`, `[`B`](imap.html#B)`>` |
| [map](map.html) | `fun <U, A, B> Kind<Kind<ForYoneda, `[`U`](map.html#U)`>, `[`A`](map.html#A)`>.map(arg1: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): Yoneda<`[`U`](map.html#U)`, `[`B`](map.html#B)`>` |
| [tupleLeft](tuple-left.html) | `fun <U, A, B> Kind<Kind<ForYoneda, `[`U`](tuple-left.html#U)`>, `[`A`](tuple-left.html#A)`>.tupleLeft(arg1: `[`B`](tuple-left.html#B)`): Yoneda<`[`U`](tuple-left.html#U)`, Tuple2<`[`B`](tuple-left.html#B)`, `[`A`](tuple-left.html#A)`>>` |
| [tupleRight](tuple-right.html) | `fun <U, A, B> Kind<Kind<ForYoneda, `[`U`](tuple-right.html#U)`>, `[`A`](tuple-right.html#A)`>.tupleRight(arg1: `[`B`](tuple-right.html#B)`): Yoneda<`[`U`](tuple-right.html#U)`, Tuple2<`[`A`](tuple-right.html#A)`, `[`B`](tuple-right.html#B)`>>` |
| [void](void.html) | `fun <U, A> Kind<Kind<ForYoneda, `[`U`](void.html#U)`>, `[`A`](void.html#A)`>.void(): Yoneda<`[`U`](void.html#U)`, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>` |
| [widen](widen.html) | `fun <U, B, A : `[`B`](widen.html#B)`> Kind<Kind<ForYoneda, `[`U`](widen.html#U)`>, `[`A`](widen.html#A)`>.widen(): Yoneda<`[`U`](widen.html#U)`, `[`B`](widen.html#B)`>` |

