---
title: arrow.aql.instances.option.groupBy - arrow-query-language
---

[arrow-query-language](../index.html) / [arrow.aql.instances.option.groupBy](./index.html)

## Package arrow.aql.instances.option.groupBy

### Extensions for External Classes

| [arrow.core.Option](arrow.core.-option/index.html) |  |

### Functions

| [foldable](foldable.html) | `fun foldable(): Foldable<ForOption>` |
| [groupBy](group-by.html) | `infix fun <A, Z, X> `[`Query`](../arrow.aql/-query/index.html)`<ForOption, `[`A`](group-by.html#A)`, `[`Z`](group-by.html#Z)`>.groupBy(group: `[`Z`](group-by.html#Z)`.() -> `[`X`](group-by.html#X)`): `[`Query`](../arrow.aql/-query/index.html)`<ForId, `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`X`](group-by.html#X)`, `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Z`](group-by.html#Z)`>>, `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`X`](group-by.html#X)`, `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Z`](group-by.html#Z)`>>>` |
| [value](value.html) | `fun <Z, X> `[`Query`](../arrow.aql/-query/index.html)`<ForListK, `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`X`](value.html#X)`, `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Z`](value.html#Z)`>>, `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`X`](value.html#X)`, `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Z`](value.html#Z)`>>>.value(): `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`X`](value.html#X)`, `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Z`](value.html#Z)`>>` |

