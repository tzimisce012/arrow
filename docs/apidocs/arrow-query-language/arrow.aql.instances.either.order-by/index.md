---
title: arrow.aql.instances.either.orderBy - arrow-query-language
---

[arrow-query-language](../index.html) / [arrow.aql.instances.either.orderBy](./index.html)

## Package arrow.aql.instances.either.orderBy

### Extensions for External Classes

| [arrow.core.Either](arrow.core.-either/index.html) |  |

### Functions

| [foldable](foldable.html) | `fun <L> foldable(): Foldable<Kind<ForEither, `[`L`](foldable.html#L)`>>` |
| [orderBy](order-by.html) | `infix fun <L, A, Z> `[`Query`](../arrow.aql/-query/index.html)`<Kind<ForEither, `[`L`](order-by.html#L)`>, `[`A`](order-by.html#A)`, `[`Z`](order-by.html#Z)`>.orderBy(ord: `[`Ord`](../arrow.aql/-ord/index.html)`<`[`Z`](order-by.html#Z)`>): `[`Query`](../arrow.aql/-query/index.html)`<ForId, `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Z`](order-by.html#Z)`>, `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Z`](order-by.html#Z)`>>` |
| [orderMap](order-map.html) | `infix fun <L, X, Z> `[`Query`](../arrow.aql/-query/index.html)`<ForId, `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`X`](order-map.html#X)`, `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Z`](order-map.html#Z)`>>, `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`X`](order-map.html#X)`, `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Z`](order-map.html#Z)`>>>.orderMap(ord: `[`Ord`](../arrow.aql/-ord/index.html)`<`[`X`](order-map.html#X)`>): `[`Query`](../arrow.aql/-query/index.html)`<ForId, `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`X`](order-map.html#X)`, `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Z`](order-map.html#Z)`>>, `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`X`](order-map.html#X)`, `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Z`](order-map.html#Z)`>>>` |
| [value](value.html) | `fun <L, Z> `[`Query`](../arrow.aql/-query/index.html)`<ForId, `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Z`](value.html#Z)`>, `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Z`](value.html#Z)`>>.value(): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Z`](value.html#Z)`>`<br>`fun <L, Z, X> `[`Query`](../arrow.aql/-query/index.html)`<ForId, `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`X`](value.html#X)`, `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Z`](value.html#Z)`>>, `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`X`](value.html#X)`, `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Z`](value.html#Z)`>>>.value(): `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`X`](value.html#X)`, `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Z`](value.html#Z)`>>` |

