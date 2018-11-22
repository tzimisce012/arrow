---
title: Count - arrow-query-language
---

[arrow-query-language](../../index.html) / [arrow.aql](../index.html) / [Count](./index.html)

# Count

`interface Count<F>`

### Functions

| [count](count.html) | `open fun <A, Z> `[`Query`](../-query/index.html)`<`[`F`](index.html#F)`, `[`A`](count.html#A)`, `[`Z`](count.html#Z)`>.count(): `[`Query`](../-query/index.html)`<ForListK, `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`, `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`>` |
| [foldable](foldable.html) | `abstract fun foldable(): Foldable<`[`F`](index.html#F)`>` |
| [value](value.html) | `open fun `[`Query`](../-query/index.html)`<ForListK, `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`, `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`>.value(): `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) |

### Inheritors

| [EitherCount](../../arrow.aql.instances/-either-count/index.html) | `interface EitherCount<L> : `[`Count`](./index.html)`<EitherPartialOf<`[`L`](../../arrow.aql.instances/-either-count/index.html#L)`>>` |
| [ListCount](../../arrow.aql.instances/-list-count/index.html) | `interface ListCount : `[`Count`](./index.html)`<ForListK>` |
| [NonEmptyListCount](../../arrow.aql.instances/-non-empty-list-count/index.html) | `interface NonEmptyListCount : `[`Count`](./index.html)`<ForNonEmptyList>` |
| [OptionCount](../../arrow.aql.instances/-option-count/index.html) | `interface OptionCount : `[`Count`](./index.html)`<ForOption>` |
| [SequenceCount](../../arrow.aql.instances/-sequence-count/index.html) | `interface SequenceCount : `[`Count`](./index.html)`<ForSequenceK>` |
| [TryCount](../../arrow.aql.instances/-try-count/index.html) | `interface TryCount : `[`Count`](./index.html)`<ForTry>` |

