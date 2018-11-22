---
title: arrow.aql.box.groupBy - arrow-docs
---

[arrow-docs](../index.html) / [arrow.aql.box.groupBy](./index.html)

## Package arrow.aql.box.groupBy

### Functions

| [foldable](foldable.html) | `fun foldable(): Foldable<`[`ForBox`](../arrow.aql/-for-box.html)`>` |
| [groupBy](group-by.html) | `infix fun <A, Z, X> Query<`[`ForBox`](../arrow.aql/-for-box.html)`, `[`A`](group-by.html#A)`, `[`Z`](group-by.html#Z)`>.groupBy(arg1: `[`Z`](group-by.html#Z)`.() -> `[`X`](group-by.html#X)`): Query<ForId, `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`X`](group-by.html#X)`, `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Z`](group-by.html#Z)`>>, `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`X`](group-by.html#X)`, `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Z`](group-by.html#Z)`>>>` |
| [value](value.html) | `fun <Z, X> Query<ForListK, `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`X`](value.html#X)`, `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Z`](value.html#Z)`>>, `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`X`](value.html#X)`, `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Z`](value.html#Z)`>>>.value(): `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`X`](value.html#X)`, `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Z`](value.html#Z)`>>` |

### Companion Object Functions

| [groupBy](group-by.html) | `fun Box.Companion.groupBy(): `[`BoxGroupBy`](../arrow.aql/-box-group-by/index.html) |

