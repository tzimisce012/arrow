---
title: NonEmptyListSum - arrow-query-language
---

[arrow-query-language](../../index.html) / [arrow.aql.instances](../index.html) / [NonEmptyListSum](./index.html)

# NonEmptyListSum

`@extension interface NonEmptyListSum : `[`Sum`](../../arrow.aql/-sum/index.html)`<ForNonEmptyList>`

### Functions

| [foldable](foldable.html) | `open fun foldable(): Foldable<ForNonEmptyList>` |

### Inherited Functions

| [sum](../../arrow.aql/-sum/sum.html) | `open infix fun <A, Z> `[`Query`](../../arrow.aql/-query/index.html)`<`[`F`](../../arrow.aql/-sum/index.html#F)`, `[`A`](../../arrow.aql/-sum/sum.html#A)`, `[`Z`](../../arrow.aql/-sum/sum.html#Z)`>.sum(f: `[`A`](../../arrow.aql/-sum/sum.html#A)`.() -> `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`): `[`Query`](../../arrow.aql/-query/index.html)`<ForId, `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`, `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`>` |
| [value](../../arrow.aql/-sum/value.html) | `open fun `[`Query`](../../arrow.aql/-query/index.html)`<ForId, `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`, `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`>.value(): `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) |

