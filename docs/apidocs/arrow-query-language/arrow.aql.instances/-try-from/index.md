---
title: TryFrom - arrow-query-language
---

[arrow-query-language](../../index.html) / [arrow.aql.instances](../index.html) / [TryFrom](./index.html)

# TryFrom

`@extension interface TryFrom : `[`From`](../../arrow.aql/-from/index.html)`<ForTry>`

### Functions

| [applicative](applicative.html) | `open fun applicative(): Applicative<ForTry>` |

### Inherited Functions

| [join](../../arrow.aql/-from/join.html) | `open infix fun <A, B> `[`Source`](../../arrow.aql/-source.html)`<`[`F`](../../arrow.aql/-from/index.html#F)`, `[`A`](../../arrow.aql/-from/join.html#A)`>.join(fb: `[`Source`](../../arrow.aql/-source.html)`<`[`F`](../../arrow.aql/-from/index.html#F)`, `[`B`](../../arrow.aql/-from/join.html#B)`>): `[`Source`](../../arrow.aql/-source.html)`<`[`F`](../../arrow.aql/-from/index.html#F)`, Tuple2<`[`A`](../../arrow.aql/-from/join.html#A)`, `[`B`](../../arrow.aql/-from/join.html#B)`>>`<br>`open fun <A, B, C> `[`Source`](../../arrow.aql/-source.html)`<`[`F`](../../arrow.aql/-from/index.html#F)`, Tuple2<`[`A`](../../arrow.aql/-from/join.html#A)`, `[`B`](../../arrow.aql/-from/join.html#B)`>>.join(fc: `[`Source`](../../arrow.aql/-source.html)`<`[`F`](../../arrow.aql/-from/index.html#F)`, `[`C`](../../arrow.aql/-from/join.html#C)`>, dummy: `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)` = Unit): `[`Source`](../../arrow.aql/-source.html)`<`[`F`](../../arrow.aql/-from/index.html#F)`, Tuple3<`[`A`](../../arrow.aql/-from/join.html#A)`, `[`B`](../../arrow.aql/-from/join.html#B)`, `[`C`](../../arrow.aql/-from/join.html#C)`>>`<br>`open infix fun <A, B, Z, X> `[`Query`](../../arrow.aql/-query/index.html)`<`[`F`](../../arrow.aql/-from/index.html#F)`, `[`A`](../../arrow.aql/-from/join.html#A)`, `[`Z`](../../arrow.aql/-from/join.html#Z)`>.join(query: `[`Query`](../../arrow.aql/-query/index.html)`<`[`F`](../../arrow.aql/-from/index.html#F)`, `[`B`](../../arrow.aql/-from/join.html#B)`, `[`X`](../../arrow.aql/-from/join.html#X)`>): `[`Query`](../../arrow.aql/-query/index.html)`<`[`F`](../../arrow.aql/-from/index.html#F)`, Tuple2<`[`A`](../../arrow.aql/-from/join.html#A)`, `[`B`](../../arrow.aql/-from/join.html#B)`>, Tuple2<`[`Z`](../../arrow.aql/-from/join.html#Z)`, `[`X`](../../arrow.aql/-from/join.html#X)`>>` |

