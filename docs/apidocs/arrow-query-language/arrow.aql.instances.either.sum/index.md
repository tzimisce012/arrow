---
title: arrow.aql.instances.either.sum - arrow-query-language
---

[arrow-query-language](../index.html) / [arrow.aql.instances.either.sum](./index.html)

## Package arrow.aql.instances.either.sum

### Extensions for External Classes

| [arrow.core.Either](arrow.core.-either/index.html) |  |

### Functions

| [foldable](foldable.html) | `fun <L> foldable(): Foldable<Kind<ForEither, `[`L`](foldable.html#L)`>>` |
| [sum](sum.html) | `infix fun <L, A, Z> `[`Query`](../arrow.aql/-query/index.html)`<Kind<ForEither, `[`L`](sum.html#L)`>, `[`A`](sum.html#A)`, `[`Z`](sum.html#Z)`>.sum(f: `[`A`](sum.html#A)`.() -> `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`): `[`Query`](../arrow.aql/-query/index.html)`<ForId, `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`, `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`>` |
| [value](value.html) | `fun <L> `[`Query`](../arrow.aql/-query/index.html)`<ForId, `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`, `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`>.value(): `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) |

