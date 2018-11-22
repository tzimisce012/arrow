---
title: Union - arrow-query-language
---

[arrow-query-language](../../index.html) / [arrow.aql](../index.html) / [Union](./index.html)

# Union

`interface Union<F>`

### Functions

| [foldable](foldable.html) | `abstract fun foldable(): Foldable<`[`F`](index.html#F)`>` |
| [union](union.html) | `open infix fun <A, B, Z> `[`Query`](../-query/index.html)`<`[`F`](index.html#F)`, `[`A`](union.html#A)`, `[`Z`](union.html#Z)`>.union(query: `[`Query`](../-query/index.html)`<`[`F`](index.html#F)`, `[`B`](union.html#B)`, `[`Z`](union.html#Z)`>): `[`Query`](../-query/index.html)`<ForListK, `[`Z`](union.html#Z)`, `[`Z`](union.html#Z)`>` |

### Inheritors

| [EitherUnion](../../arrow.aql.instances/-either-union/index.html) | `interface EitherUnion<L> : `[`Union`](./index.html)`<EitherPartialOf<`[`L`](../../arrow.aql.instances/-either-union/index.html#L)`>>` |
| [ListUnion](../../arrow.aql.instances/-list-union/index.html) | `interface ListUnion : `[`Union`](./index.html)`<ForListK>` |
| [NonEmptyListUnion](../../arrow.aql.instances/-non-empty-list-union/index.html) | `interface NonEmptyListUnion : `[`Union`](./index.html)`<ForNonEmptyList>` |
| [OptionUnion](../../arrow.aql.instances/-option-union/index.html) | `interface OptionUnion : `[`Union`](./index.html)`<ForOption>` |
| [SequenceUnion](../../arrow.aql.instances/-sequence-union/index.html) | `interface SequenceUnion : `[`Union`](./index.html)`<ForSequenceK>` |
| [TryUnion](../../arrow.aql.instances/-try-union/index.html) | `interface TryUnion : `[`Union`](./index.html)`<ForTry>` |

