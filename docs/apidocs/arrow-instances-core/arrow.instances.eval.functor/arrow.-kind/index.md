---
title: arrow.instances.eval.functor.arrow.Kind - arrow-instances-core
---

[arrow-instances-core](../../index.html) / [arrow.instances.eval.functor](../index.html) / [arrow.Kind](./index.html)

### Extensions for arrow.Kind

| [as](as.html) | `fun <A, B> Kind<ForEval, `[`A`](as.html#A)`>.as(arg1: `[`B`](as.html#B)`): Eval<`[`B`](as.html#B)`>` |
| [fproduct](fproduct.html) | `fun <A, B> Kind<ForEval, `[`A`](fproduct.html#A)`>.fproduct(arg1: (`[`A`](fproduct.html#A)`) -> `[`B`](fproduct.html#B)`): Eval<Tuple2<`[`A`](fproduct.html#A)`, `[`B`](fproduct.html#B)`>>` |
| [imap](imap.html) | `fun <A, B> Kind<ForEval, `[`A`](imap.html#A)`>.imap(arg1: (`[`A`](imap.html#A)`) -> `[`B`](imap.html#B)`, arg2: (`[`B`](imap.html#B)`) -> `[`A`](imap.html#A)`): Eval<`[`B`](imap.html#B)`>` |
| [map](map.html) | `fun <A, B> Kind<ForEval, `[`A`](map.html#A)`>.map(arg1: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): Eval<`[`B`](map.html#B)`>` |
| [tupleLeft](tuple-left.html) | `fun <A, B> Kind<ForEval, `[`A`](tuple-left.html#A)`>.tupleLeft(arg1: `[`B`](tuple-left.html#B)`): Eval<Tuple2<`[`B`](tuple-left.html#B)`, `[`A`](tuple-left.html#A)`>>` |
| [tupleRight](tuple-right.html) | `fun <A, B> Kind<ForEval, `[`A`](tuple-right.html#A)`>.tupleRight(arg1: `[`B`](tuple-right.html#B)`): Eval<Tuple2<`[`A`](tuple-right.html#A)`, `[`B`](tuple-right.html#B)`>>` |
| [void](void.html) | `fun <A> Kind<ForEval, `[`A`](void.html#A)`>.void(): Eval<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>` |
| [widen](widen.html) | `fun <B, A : `[`B`](widen.html#B)`> Kind<ForEval, `[`A`](widen.html#A)`>.widen(): Eval<`[`B`](widen.html#B)`>` |

