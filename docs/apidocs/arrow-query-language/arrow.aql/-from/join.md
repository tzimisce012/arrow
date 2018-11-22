---
title: From.join - arrow-query-language
---

[arrow-query-language](../../index.html) / [arrow.aql](../index.html) / [From](index.html) / [join](./join.html)

# join

`open infix fun <A, B> `[`Source`](../-source.html)`<`[`F`](index.html#F)`, `[`A`](join.html#A)`>.join(fb: `[`Source`](../-source.html)`<`[`F`](index.html#F)`, `[`B`](join.html#B)`>): `[`Source`](../-source.html)`<`[`F`](index.html#F)`, Tuple2<`[`A`](join.html#A)`, `[`B`](join.html#B)`>>`
`open fun <A, B, C> `[`Source`](../-source.html)`<`[`F`](index.html#F)`, Tuple2<`[`A`](join.html#A)`, `[`B`](join.html#B)`>>.join(fc: `[`Source`](../-source.html)`<`[`F`](index.html#F)`, `[`C`](join.html#C)`>, dummy: `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)` = Unit): `[`Source`](../-source.html)`<`[`F`](index.html#F)`, Tuple3<`[`A`](join.html#A)`, `[`B`](join.html#B)`, `[`C`](join.html#C)`>>`
`open infix fun <A, B, Z, X> `[`Query`](../-query/index.html)`<`[`F`](index.html#F)`, `[`A`](join.html#A)`, `[`Z`](join.html#Z)`>.join(query: `[`Query`](../-query/index.html)`<`[`F`](index.html#F)`, `[`B`](join.html#B)`, `[`X`](join.html#X)`>): `[`Query`](../-query/index.html)`<`[`F`](index.html#F)`, Tuple2<`[`A`](join.html#A)`, `[`B`](join.html#B)`>, Tuple2<`[`Z`](join.html#Z)`, `[`X`](join.html#X)`>>`