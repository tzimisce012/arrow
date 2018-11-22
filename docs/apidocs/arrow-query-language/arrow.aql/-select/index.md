---
title: Select - arrow-query-language
---

[arrow-query-language](../../index.html) / [arrow.aql](../index.html) / [Select](./index.html)

# Select

`interface Select<F>`

`select` allows obtaining and transforming data from any data source containing
`A` given a function `(A) -> B` where `A` denotes the input type and `B` the
transformed type.

Select represents a selection of data from a given data source.
The underlying implementation delegates directly to the [functor](functor.html) instance
and continues the fluid builder or infix style expression

### Functions

| [functor](functor.html) | `abstract fun functor(): Functor<`[`F`](index.html#F)`>` |
| [query](query.html) | `open infix fun <A, Z> `[`Source`](../-source.html)`<`[`F`](index.html#F)`, `[`A`](query.html#A)`>.query(f: `[`Source`](../-source.html)`<`[`F`](index.html#F)`, `[`A`](query.html#A)`>.() -> `[`Z`](query.html#Z)`): `[`Z`](query.html#Z) |
| [select](select.html) | `open infix fun <A, Z> `[`Source`](../-source.html)`<`[`F`](index.html#F)`, `[`A`](select.html#A)`>.select(f: `[`Selection`](../-selection.html)`<`[`A`](select.html#A)`, `[`Z`](select.html#Z)`>): `[`Query`](../-query/index.html)`<`[`F`](index.html#F)`, `[`A`](select.html#A)`, `[`Z`](select.html#Z)`>`<br>Commented method or class |
| [selectAll](select-all.html) | `open fun <A> `[`Source`](../-source.html)`<`[`F`](index.html#F)`, `[`A`](select-all.html#A)`>.selectAll(): `[`Query`](../-query/index.html)`<`[`F`](index.html#F)`, `[`A`](select-all.html#A)`, `[`A`](select-all.html#A)`>` |
| [value](value.html) | `open fun <A, Z> `[`Query`](../-query/index.html)`<`[`F`](index.html#F)`, `[`A`](value.html#A)`, `[`Z`](value.html#Z)`>.value(): `[`Source`](../-source.html)`<`[`F`](index.html#F)`, `[`Z`](value.html#Z)`>` |

### Inheritors

| [EitherSelect](../../arrow.aql.instances/-either-select/index.html) | `interface EitherSelect<L> : `[`Select`](./index.html)`<EitherPartialOf<`[`L`](../../arrow.aql.instances/-either-select/index.html#L)`>>` |
| [EvalSelect](../../arrow.aql.instances/-eval-select/index.html) | `interface EvalSelect : `[`Select`](./index.html)`<ForEval>` |
| [Function0Select](../../arrow.aql.instances/-function0-select/index.html) | `interface Function0Select : `[`Select`](./index.html)`<ForFunction0>` |
| [IdSelect](../../arrow.aql.instances/-id-select/index.html) | `interface IdSelect : `[`Select`](./index.html)`<ForId>` |
| [ListSelect](../../arrow.aql.instances/-list-select/index.html) | `interface ListSelect : `[`Select`](./index.html)`<ForListK>` |
| [NonEmptyListSelect](../../arrow.aql.instances/-non-empty-list-select/index.html) | `interface NonEmptyListSelect : `[`Select`](./index.html)`<ForNonEmptyList>` |
| [OptionSelect](../../arrow.aql.instances/-option-select/index.html) | `interface OptionSelect : `[`Select`](./index.html)`<ForOption>` |
| [SequenceSelect](../../arrow.aql.instances/-sequence-select/index.html) | `interface SequenceSelect : `[`Select`](./index.html)`<ForSequenceK>` |
| [TrySelect](../../arrow.aql.instances/-try-select/index.html) | `interface TrySelect : `[`Select`](./index.html)`<ForTry>` |

