---
title: Where - arrow-query-language
---

[arrow-query-language](../../index.html) / [arrow.aql](../index.html) / [Where](./index.html)

# Where

`interface Where<F>`

### Functions

| [functorFilter](functor-filter.html) | `abstract fun functorFilter(): FunctorFilter<`[`F`](index.html#F)`>` |
| [having](having.html) | `open infix fun <A, Z> `[`Query`](../-query/index.html)`<`[`F`](index.html#F)`, `[`A`](having.html#A)`, `[`Z`](having.html#Z)`>.having(predicate: `[`A`](having.html#A)`.() -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`Query`](../-query/index.html)`<`[`F`](index.html#F)`, `[`A`](having.html#A)`, `[`Z`](having.html#Z)`>` |
| [where](where.html) | `open infix fun <A, Z> `[`Query`](../-query/index.html)`<`[`F`](index.html#F)`, `[`A`](where.html#A)`, `[`Z`](where.html#Z)`>.where(predicate: `[`A`](where.html#A)`.() -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`Query`](../-query/index.html)`<`[`F`](index.html#F)`, `[`A`](where.html#A)`, `[`Z`](where.html#Z)`>` |
| [whereSelection](where-selection.html) | `open infix fun <A, Z> `[`Query`](../-query/index.html)`<`[`F`](index.html#F)`, `[`A`](where-selection.html#A)`, `[`Z`](where-selection.html#Z)`>.whereSelection(predicate: `[`Z`](where-selection.html#Z)`.() -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`Query`](../-query/index.html)`<`[`F`](index.html#F)`, `[`A`](where-selection.html#A)`, `[`Z`](where-selection.html#Z)`>` |

### Inheritors

| [ListWhere](../../arrow.aql.instances/-list-where/index.html) | `interface ListWhere : `[`Where`](./index.html)`<ForListK>` |
| [NonEmptyListWhere](../../arrow.aql.instances/-non-empty-list-where/index.html) | `interface NonEmptyListWhere : `[`Where`](./index.html)`<ForNonEmptyList>` |
| [OptionWhere](../../arrow.aql.instances/-option-where/index.html) | `interface OptionWhere : `[`Where`](./index.html)`<ForOption>` |
| [SequenceWhere](../../arrow.aql.instances/-sequence-where/index.html) | `interface SequenceWhere : `[`Where`](./index.html)`<ForSequenceK>` |
| [TryWhere](../../arrow.aql.instances/-try-where/index.html) | `interface TryWhere : `[`Where`](./index.html)`<ForTry>` |

