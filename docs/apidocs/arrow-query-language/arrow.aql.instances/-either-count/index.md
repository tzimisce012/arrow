---
title: EitherCount - arrow-query-language
---

[arrow-query-language](../../index.html) / [arrow.aql.instances](../index.html) / [EitherCount](./index.html)

# EitherCount

`@extension interface EitherCount<L> : `[`Count`](../../arrow.aql/-count/index.html)`<EitherPartialOf<`[`L`](index.html#L)`>>`

### Functions

| [foldable](foldable.html) | `open fun foldable(): Foldable<EitherPartialOf<`[`L`](index.html#L)`>>` |

### Inherited Functions

| [count](../../arrow.aql/-count/count.html) | `open fun <A, Z> `[`Query`](../../arrow.aql/-query/index.html)`<`[`F`](../../arrow.aql/-count/index.html#F)`, `[`A`](../../arrow.aql/-count/count.html#A)`, `[`Z`](../../arrow.aql/-count/count.html#Z)`>.count(): `[`Query`](../../arrow.aql/-query/index.html)`<ForListK, `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`, `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`>` |
| [value](../../arrow.aql/-count/value.html) | `open fun `[`Query`](../../arrow.aql/-query/index.html)`<ForListK, `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`, `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`>.value(): `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) |

