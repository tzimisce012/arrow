---
title: Sum - arrow-query-language
---

[arrow-query-language](../../index.html) / [arrow.aql](../index.html) / [Sum](./index.html)

# Sum

`interface Sum<F>`

### Functions

| [foldable](foldable.html) | `abstract fun foldable(): Foldable<`[`F`](index.html#F)`>` |
| [sum](sum.html) | `open infix fun <A, Z> `[`Query`](../-query/index.html)`<`[`F`](index.html#F)`, `[`A`](sum.html#A)`, `[`Z`](sum.html#Z)`>.sum(f: `[`A`](sum.html#A)`.() -> `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`): `[`Query`](../-query/index.html)`<ForId, `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`, `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`>` |
| [value](value.html) | `open fun `[`Query`](../-query/index.html)`<ForId, `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`, `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`>.value(): `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) |

### Inheritors

| [EitherSum](../../arrow.aql.instances/-either-sum/index.html) | `interface EitherSum<L> : `[`Sum`](./index.html)`<EitherPartialOf<`[`L`](../../arrow.aql.instances/-either-sum/index.html#L)`>>` |
| [ListSum](../../arrow.aql.instances/-list-sum/index.html) | `interface ListSum : `[`Sum`](./index.html)`<ForListK>` |
| [NonEmptyListSum](../../arrow.aql.instances/-non-empty-list-sum/index.html) | `interface NonEmptyListSum : `[`Sum`](./index.html)`<ForNonEmptyList>` |
| [OptionSum](../../arrow.aql.instances/-option-sum/index.html) | `interface OptionSum : `[`Sum`](./index.html)`<ForOption>` |
| [SequenceSum](../../arrow.aql.instances/-sequence-sum/index.html) | `interface SequenceSum : `[`Sum`](./index.html)`<ForSequenceK>` |
| [TrySum](../../arrow.aql.instances/-try-sum/index.html) | `interface TrySum : `[`Sum`](./index.html)`<ForTry>` |

