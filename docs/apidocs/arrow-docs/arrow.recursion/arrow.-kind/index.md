---
title: arrow.recursion.arrow.Kind - arrow-docs
---

[arrow-docs](../../index.html) / [arrow.recursion](../index.html) / [arrow.Kind](./index.html)

### Extensions for arrow.Kind

| [as](as.html) | `fun <A, B> Kind<`[`ForIntListPattern`](../-for-int-list-pattern.html)`, `[`A`](as.html#A)`>.as(arg1: `[`B`](as.html#B)`): `[`IntListPattern`](../-int-list-pattern.html)`<`[`B`](as.html#B)`>` |
| [fix](fix.html) | `fun <A> `[`ConsPatternOf`](../-cons-pattern-of.html)`<`[`A`](fix.html#A)`>.fix(): `[`ConsPattern`](../-cons-pattern/index.html)`<`[`A`](fix.html#A)`>`<br>`fun <A> `[`IntListPatternOf`](../-int-list-pattern-of.html)`<`[`A`](fix.html#A)`>.fix(): `[`IntListPattern`](../-int-list-pattern.html)`<`[`A`](fix.html#A)`>` |
| [fproduct](fproduct.html) | `fun <A, B> Kind<`[`ForIntListPattern`](../-for-int-list-pattern.html)`, `[`A`](fproduct.html#A)`>.fproduct(arg1: (`[`A`](fproduct.html#A)`) -> `[`B`](fproduct.html#B)`): `[`IntListPattern`](../-int-list-pattern.html)`<Tuple2<`[`A`](fproduct.html#A)`, `[`B`](fproduct.html#B)`>>` |
| [imap](imap.html) | `fun <A, B> Kind<`[`ForIntListPattern`](../-for-int-list-pattern.html)`, `[`A`](imap.html#A)`>.imap(arg1: (`[`A`](imap.html#A)`) -> `[`B`](imap.html#B)`, arg2: (`[`B`](imap.html#B)`) -> `[`A`](imap.html#A)`): `[`IntListPattern`](../-int-list-pattern.html)`<`[`B`](imap.html#B)`>` |
| [map](map.html) | `fun <A, B> Kind<`[`ForIntListPattern`](../-for-int-list-pattern.html)`, `[`A`](map.html#A)`>.map(arg1: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): `[`IntListPattern`](../-int-list-pattern.html)`<`[`B`](map.html#B)`>` |
| [tupleLeft](tuple-left.html) | `fun <A, B> Kind<`[`ForIntListPattern`](../-for-int-list-pattern.html)`, `[`A`](tuple-left.html#A)`>.tupleLeft(arg1: `[`B`](tuple-left.html#B)`): `[`IntListPattern`](../-int-list-pattern.html)`<Tuple2<`[`B`](tuple-left.html#B)`, `[`A`](tuple-left.html#A)`>>` |
| [tupleRight](tuple-right.html) | `fun <A, B> Kind<`[`ForIntListPattern`](../-for-int-list-pattern.html)`, `[`A`](tuple-right.html#A)`>.tupleRight(arg1: `[`B`](tuple-right.html#B)`): `[`IntListPattern`](../-int-list-pattern.html)`<Tuple2<`[`A`](tuple-right.html#A)`, `[`B`](tuple-right.html#B)`>>` |
| [void](void.html) | `fun <A> Kind<`[`ForIntListPattern`](../-for-int-list-pattern.html)`, `[`A`](void.html#A)`>.void(): `[`IntListPattern`](../-int-list-pattern.html)`<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>` |
| [widen](widen.html) | `fun <B, A : `[`B`](widen.html#B)`> Kind<`[`ForIntListPattern`](../-for-int-list-pattern.html)`, `[`A`](widen.html#A)`>.widen(): `[`IntListPattern`](../-int-list-pattern.html)`<`[`B`](widen.html#B)`>` |

