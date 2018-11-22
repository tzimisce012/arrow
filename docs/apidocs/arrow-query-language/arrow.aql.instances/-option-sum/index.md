---
title: OptionSum - arrow-query-language
---

[arrow-query-language](../../index.html) / [arrow.aql.instances](../index.html) / [OptionSum](./index.html)

# OptionSum

`@extension interface OptionSum : `[`Sum`](../../arrow.aql/-sum/index.html)`<ForOption>`

### Functions

| [foldable](foldable.html) | `open fun foldable(): Foldable<ForOption>` |

### Inherited Functions

| [sum](../../arrow.aql/-sum/sum.html) | `open infix fun <A, Z> `[`Query`](../../arrow.aql/-query/index.html)`<`[`F`](../../arrow.aql/-sum/index.html#F)`, `[`A`](../../arrow.aql/-sum/sum.html#A)`, `[`Z`](../../arrow.aql/-sum/sum.html#Z)`>.sum(f: `[`A`](../../arrow.aql/-sum/sum.html#A)`.() -> `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`): `[`Query`](../../arrow.aql/-query/index.html)`<ForId, `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`, `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`>` |
| [value](../../arrow.aql/-sum/value.html) | `open fun `[`Query`](../../arrow.aql/-query/index.html)`<ForId, `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`, `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`>.value(): `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) |

