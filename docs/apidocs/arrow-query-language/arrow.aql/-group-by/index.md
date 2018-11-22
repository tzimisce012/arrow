---
title: GroupBy - arrow-query-language
---

[arrow-query-language](../../index.html) / [arrow.aql](../index.html) / [GroupBy](./index.html)

# GroupBy

`interface GroupBy<F>`

### Functions

| [foldable](foldable.html) | `abstract fun foldable(): Foldable<`[`F`](index.html#F)`>` |
| [groupBy](group-by.html) | `open infix fun <A, Z, X> `[`Query`](../-query/index.html)`<`[`F`](index.html#F)`, `[`A`](group-by.html#A)`, `[`Z`](group-by.html#Z)`>.groupBy(group: `[`Z`](group-by.html#Z)`.() -> `[`X`](group-by.html#X)`): `[`Query`](../-query/index.html)`<ForId, `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`X`](group-by.html#X)`, `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Z`](group-by.html#Z)`>>, `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`X`](group-by.html#X)`, `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Z`](group-by.html#Z)`>>>` |
| [value](value.html) | `open fun <Z, X> `[`Query`](../-query/index.html)`<ForListK, `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`X`](value.html#X)`, `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Z`](value.html#Z)`>>, `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`X`](value.html#X)`, `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Z`](value.html#Z)`>>>.value(): `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`X`](value.html#X)`, `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Z`](value.html#Z)`>>` |

### Inheritors

| [EitherGroupBy](../../arrow.aql.instances/-either-group-by/index.html) | `interface EitherGroupBy<L> : `[`GroupBy`](./index.html)`<EitherPartialOf<`[`L`](../../arrow.aql.instances/-either-group-by/index.html#L)`>>` |
| [ListGroupBy](../../arrow.aql.instances/-list-group-by/index.html) | `interface ListGroupBy : `[`GroupBy`](./index.html)`<ForListK>` |
| [NonEmptyListGroupBy](../../arrow.aql.instances/-non-empty-list-group-by/index.html) | `interface NonEmptyListGroupBy : `[`GroupBy`](./index.html)`<ForNonEmptyList>` |
| [OptionGroupBy](../../arrow.aql.instances/-option-group-by/index.html) | `interface OptionGroupBy : `[`GroupBy`](./index.html)`<ForOption>` |
| [SequenceGroupBy](../../arrow.aql.instances/-sequence-group-by/index.html) | `interface SequenceGroupBy : `[`GroupBy`](./index.html)`<ForSequenceK>` |
| [TryGroupBy](../../arrow.aql.instances/-try-group-by/index.html) | `interface TryGroupBy : `[`GroupBy`](./index.html)`<ForTry>` |

