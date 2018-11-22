---
title: TryGroupBy - arrow-query-language
---

[arrow-query-language](../../index.html) / [arrow.aql.instances](../index.html) / [TryGroupBy](./index.html)

# TryGroupBy

`@extension interface TryGroupBy : `[`GroupBy`](../../arrow.aql/-group-by/index.html)`<ForTry>`

### Functions

| [foldable](foldable.html) | `open fun foldable(): Foldable<ForTry>` |

### Inherited Functions

| [groupBy](../../arrow.aql/-group-by/group-by.html) | `open infix fun <A, Z, X> `[`Query`](../../arrow.aql/-query/index.html)`<`[`F`](../../arrow.aql/-group-by/index.html#F)`, `[`A`](../../arrow.aql/-group-by/group-by.html#A)`, `[`Z`](../../arrow.aql/-group-by/group-by.html#Z)`>.groupBy(group: `[`Z`](../../arrow.aql/-group-by/group-by.html#Z)`.() -> `[`X`](../../arrow.aql/-group-by/group-by.html#X)`): `[`Query`](../../arrow.aql/-query/index.html)`<ForId, `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`X`](../../arrow.aql/-group-by/group-by.html#X)`, `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Z`](../../arrow.aql/-group-by/group-by.html#Z)`>>, `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`X`](../../arrow.aql/-group-by/group-by.html#X)`, `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Z`](../../arrow.aql/-group-by/group-by.html#Z)`>>>` |
| [value](../../arrow.aql/-group-by/value.html) | `open fun <Z, X> `[`Query`](../../arrow.aql/-query/index.html)`<ForListK, `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`X`](../../arrow.aql/-group-by/value.html#X)`, `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Z`](../../arrow.aql/-group-by/value.html#Z)`>>, `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`X`](../../arrow.aql/-group-by/value.html#X)`, `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Z`](../../arrow.aql/-group-by/value.html#Z)`>>>.value(): `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`X`](../../arrow.aql/-group-by/value.html#X)`, `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Z`](../../arrow.aql/-group-by/value.html#Z)`>>` |

