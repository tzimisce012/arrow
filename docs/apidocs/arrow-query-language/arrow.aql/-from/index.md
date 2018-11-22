---
title: From - arrow-query-language
---

[arrow-query-language](../../index.html) / [arrow.aql](../index.html) / [From](./index.html)

# From

`interface From<F>`

### Functions

| [applicative](applicative.html) | `abstract fun applicative(): Applicative<`[`F`](index.html#F)`>` |
| [join](join.html) | `open infix fun <A, B> `[`Source`](../-source.html)`<`[`F`](index.html#F)`, `[`A`](join.html#A)`>.join(fb: `[`Source`](../-source.html)`<`[`F`](index.html#F)`, `[`B`](join.html#B)`>): `[`Source`](../-source.html)`<`[`F`](index.html#F)`, Tuple2<`[`A`](join.html#A)`, `[`B`](join.html#B)`>>`<br>`open fun <A, B, C> `[`Source`](../-source.html)`<`[`F`](index.html#F)`, Tuple2<`[`A`](join.html#A)`, `[`B`](join.html#B)`>>.join(fc: `[`Source`](../-source.html)`<`[`F`](index.html#F)`, `[`C`](join.html#C)`>, dummy: `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)` = Unit): `[`Source`](../-source.html)`<`[`F`](index.html#F)`, Tuple3<`[`A`](join.html#A)`, `[`B`](join.html#B)`, `[`C`](join.html#C)`>>`<br>`open infix fun <A, B, Z, X> `[`Query`](../-query/index.html)`<`[`F`](index.html#F)`, `[`A`](join.html#A)`, `[`Z`](join.html#Z)`>.join(query: `[`Query`](../-query/index.html)`<`[`F`](index.html#F)`, `[`B`](join.html#B)`, `[`X`](join.html#X)`>): `[`Query`](../-query/index.html)`<`[`F`](index.html#F)`, Tuple2<`[`A`](join.html#A)`, `[`B`](join.html#B)`>, Tuple2<`[`Z`](join.html#Z)`, `[`X`](join.html#X)`>>` |

### Inheritors

| [EitherFrom](../../arrow.aql.instances/-either-from/index.html) | `interface EitherFrom<L> : `[`From`](./index.html)`<EitherPartialOf<`[`L`](../../arrow.aql.instances/-either-from/index.html#L)`>>` |
| [EvalFrom](../../arrow.aql.instances/-eval-from/index.html) | `interface EvalFrom : `[`From`](./index.html)`<ForEval>` |
| [Function0From](../../arrow.aql.instances/-function0-from/index.html) | `interface Function0From : `[`From`](./index.html)`<ForFunction0>` |
| [IdFrom](../../arrow.aql.instances/-id-from/index.html) | `interface IdFrom : `[`From`](./index.html)`<ForId>` |
| [ListFrom](../../arrow.aql.instances/-list-from/index.html) | `interface ListFrom : `[`From`](./index.html)`<ForListK>` |
| [NonEmptyListFrom](../../arrow.aql.instances/-non-empty-list-from/index.html) | `interface NonEmptyListFrom : `[`From`](./index.html)`<ForNonEmptyList>` |
| [OptionFrom](../../arrow.aql.instances/-option-from/index.html) | `interface OptionFrom : `[`From`](./index.html)`<ForOption>` |
| [SequenceFrom](../../arrow.aql.instances/-sequence-from/index.html) | `interface SequenceFrom : `[`From`](./index.html)`<ForSequenceK>` |
| [TryFrom](../../arrow.aql.instances/-try-from/index.html) | `interface TryFrom : `[`From`](./index.html)`<ForTry>` |

