---
title: OrderBy - arrow-query-language
---

[arrow-query-language](../../index.html) / [arrow.aql](../index.html) / [OrderBy](./index.html)

# OrderBy

`interface OrderBy<F>`

### Functions

| [foldable](foldable.html) | `abstract fun foldable(): Foldable<`[`F`](index.html#F)`>` |
| [orderBy](order-by.html) | `open infix fun <A, Z> `[`Query`](../-query/index.html)`<`[`F`](index.html#F)`, `[`A`](order-by.html#A)`, `[`Z`](order-by.html#Z)`>.orderBy(ord: `[`Ord`](../-ord/index.html)`<`[`Z`](order-by.html#Z)`>): `[`Query`](../-query/index.html)`<ForId, `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Z`](order-by.html#Z)`>, `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Z`](order-by.html#Z)`>>` |
| [orderMap](order-map.html) | `open infix fun <X, Z> `[`Query`](../-query/index.html)`<ForId, `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`X`](order-map.html#X)`, `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Z`](order-map.html#Z)`>>, `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`X`](order-map.html#X)`, `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Z`](order-map.html#Z)`>>>.orderMap(ord: `[`Ord`](../-ord/index.html)`<`[`X`](order-map.html#X)`>): `[`Query`](../-query/index.html)`<ForId, `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`X`](order-map.html#X)`, `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Z`](order-map.html#Z)`>>, `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`X`](order-map.html#X)`, `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Z`](order-map.html#Z)`>>>` |
| [value](value.html) | `open fun <Z> `[`Query`](../-query/index.html)`<ForId, `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Z`](value.html#Z)`>, `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Z`](value.html#Z)`>>.value(): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Z`](value.html#Z)`>`<br>`open fun <Z, X> `[`Query`](../-query/index.html)`<ForId, `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`X`](value.html#X)`, `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Z`](value.html#Z)`>>, `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`X`](value.html#X)`, `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Z`](value.html#Z)`>>>.value(dummy: `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)` = Unit): `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`X`](value.html#X)`, `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Z`](value.html#Z)`>>` |

### Inheritors

| [EitherOrderBy](../../arrow.aql.instances/-either-order-by/index.html) | `interface EitherOrderBy<L> : `[`OrderBy`](./index.html)`<EitherPartialOf<`[`L`](../../arrow.aql.instances/-either-order-by/index.html#L)`>>` |
| [ListOrderBy](../../arrow.aql.instances/-list-order-by/index.html) | `interface ListOrderBy : `[`OrderBy`](./index.html)`<ForListK>` |
| [NonEmptyListOrderBy](../../arrow.aql.instances/-non-empty-list-order-by/index.html) | `interface NonEmptyListOrderBy : `[`OrderBy`](./index.html)`<ForNonEmptyList>` |
| [OptionOrderBy](../../arrow.aql.instances/-option-order-by/index.html) | `interface OptionOrderBy : `[`OrderBy`](./index.html)`<ForOption>` |
| [SequenceOrderBy](../../arrow.aql.instances/-sequence-order-by/index.html) | `interface SequenceOrderBy : `[`OrderBy`](./index.html)`<ForSequenceK>` |
| [TryOrderBy](../../arrow.aql.instances/-try-order-by/index.html) | `interface TryOrderBy : `[`OrderBy`](./index.html)`<ForTry>` |

