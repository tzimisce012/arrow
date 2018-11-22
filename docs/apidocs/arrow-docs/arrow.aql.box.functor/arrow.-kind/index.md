---
title: arrow.aql.box.functor.arrow.Kind - arrow-docs
---

[arrow-docs](../../index.html) / [arrow.aql.box.functor](../index.html) / [arrow.Kind](./index.html)

### Extensions for arrow.Kind

| [as](as.html) | `fun <A, B> Kind<`[`ForBox`](../../arrow.aql/-for-box.html)`, `[`A`](as.html#A)`>.as(arg1: `[`B`](as.html#B)`): `[`Box`](../../arrow.aql/-box/index.html)`<`[`B`](as.html#B)`>` |
| [fproduct](fproduct.html) | `fun <A, B> Kind<`[`ForBox`](../../arrow.aql/-for-box.html)`, `[`A`](fproduct.html#A)`>.fproduct(arg1: (`[`A`](fproduct.html#A)`) -> `[`B`](fproduct.html#B)`): `[`Box`](../../arrow.aql/-box/index.html)`<Tuple2<`[`A`](fproduct.html#A)`, `[`B`](fproduct.html#B)`>>` |
| [imap](imap.html) | `fun <A, B> Kind<`[`ForBox`](../../arrow.aql/-for-box.html)`, `[`A`](imap.html#A)`>.imap(arg1: (`[`A`](imap.html#A)`) -> `[`B`](imap.html#B)`, arg2: (`[`B`](imap.html#B)`) -> `[`A`](imap.html#A)`): `[`Box`](../../arrow.aql/-box/index.html)`<`[`B`](imap.html#B)`>` |
| [map](map.html) | `fun <A, B> Kind<`[`ForBox`](../../arrow.aql/-for-box.html)`, `[`A`](map.html#A)`>.map(arg1: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): `[`Box`](../../arrow.aql/-box/index.html)`<`[`B`](map.html#B)`>` |
| [tupleLeft](tuple-left.html) | `fun <A, B> Kind<`[`ForBox`](../../arrow.aql/-for-box.html)`, `[`A`](tuple-left.html#A)`>.tupleLeft(arg1: `[`B`](tuple-left.html#B)`): `[`Box`](../../arrow.aql/-box/index.html)`<Tuple2<`[`B`](tuple-left.html#B)`, `[`A`](tuple-left.html#A)`>>` |
| [tupleRight](tuple-right.html) | `fun <A, B> Kind<`[`ForBox`](../../arrow.aql/-for-box.html)`, `[`A`](tuple-right.html#A)`>.tupleRight(arg1: `[`B`](tuple-right.html#B)`): `[`Box`](../../arrow.aql/-box/index.html)`<Tuple2<`[`A`](tuple-right.html#A)`, `[`B`](tuple-right.html#B)`>>` |
| [void](void.html) | `fun <A> Kind<`[`ForBox`](../../arrow.aql/-for-box.html)`, `[`A`](void.html#A)`>.void(): `[`Box`](../../arrow.aql/-box/index.html)`<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>` |
| [widen](widen.html) | `fun <B, A : `[`B`](widen.html#B)`> Kind<`[`ForBox`](../../arrow.aql/-for-box.html)`, `[`A`](widen.html#A)`>.widen(): `[`Box`](../../arrow.aql/-box/index.html)`<`[`B`](widen.html#B)`>` |

