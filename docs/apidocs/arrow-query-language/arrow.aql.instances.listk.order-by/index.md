---
title: arrow.aql.instances.listk.orderBy - arrow-query-language
---

[arrow-query-language](../index.html) / [arrow.aql.instances.listk.orderBy](./index.html)

## Package arrow.aql.instances.listk.orderBy

### Extensions for External Classes

| [arrow.data.ListK](arrow.data.-list-k/index.html) |  |

### Functions

| [foldable](foldable.html) | `fun foldable(): Foldable<ForListK>` |
| [orderBy](order-by.html) | `infix fun <A, Z> `[`Query`](../arrow.aql/-query/index.html)`<ForListK, `[`A`](order-by.html#A)`, `[`Z`](order-by.html#Z)`>.orderBy(ord: `[`Ord`](../arrow.aql/-ord/index.html)`<`[`Z`](order-by.html#Z)`>): `[`Query`](../arrow.aql/-query/index.html)`<ForId, `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Z`](order-by.html#Z)`>, `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Z`](order-by.html#Z)`>>` |
| [orderMap](order-map.html) | `infix fun <X, Z> `[`Query`](../arrow.aql/-query/index.html)`<ForId, `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`X`](order-map.html#X)`, `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Z`](order-map.html#Z)`>>, `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`X`](order-map.html#X)`, `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Z`](order-map.html#Z)`>>>.orderMap(ord: `[`Ord`](../arrow.aql/-ord/index.html)`<`[`X`](order-map.html#X)`>): `[`Query`](../arrow.aql/-query/index.html)`<ForId, `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`X`](order-map.html#X)`, `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Z`](order-map.html#Z)`>>, `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`X`](order-map.html#X)`, `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Z`](order-map.html#Z)`>>>` |
| [value](value.html) | `fun <Z> `[`Query`](../arrow.aql/-query/index.html)`<ForId, `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Z`](value.html#Z)`>, `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Z`](value.html#Z)`>>.value(): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Z`](value.html#Z)`>`<br>`fun <Z, X> `[`Query`](../arrow.aql/-query/index.html)`<ForId, `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`X`](value.html#X)`, `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Z`](value.html#Z)`>>, `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`X`](value.html#X)`, `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Z`](value.html#Z)`>>>.value(): `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`X`](value.html#X)`, `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Z`](value.html#Z)`>>` |

