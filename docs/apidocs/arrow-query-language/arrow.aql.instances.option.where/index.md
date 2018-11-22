---
title: arrow.aql.instances.option.where - arrow-query-language
---

[arrow-query-language](../index.html) / [arrow.aql.instances.option.where](./index.html)

## Package arrow.aql.instances.option.where

### Extensions for External Classes

| [arrow.core.Option](arrow.core.-option/index.html) |  |

### Functions

| [functorFilter](functor-filter.html) | `fun functorFilter(): FunctorFilter<ForOption>` |
| [having](having.html) | `infix fun <A, Z> `[`Query`](../arrow.aql/-query/index.html)`<ForOption, `[`A`](having.html#A)`, `[`Z`](having.html#Z)`>.having(predicate: `[`A`](having.html#A)`.() -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`Query`](../arrow.aql/-query/index.html)`<ForOption, `[`A`](having.html#A)`, `[`Z`](having.html#Z)`>` |
| [where](where.html) | `infix fun <A, Z> `[`Query`](../arrow.aql/-query/index.html)`<ForOption, `[`A`](where.html#A)`, `[`Z`](where.html#Z)`>.where(predicate: `[`A`](where.html#A)`.() -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`Query`](../arrow.aql/-query/index.html)`<ForOption, `[`A`](where.html#A)`, `[`Z`](where.html#Z)`>` |
| [whereSelection](where-selection.html) | `infix fun <A, Z> `[`Query`](../arrow.aql/-query/index.html)`<ForOption, `[`A`](where-selection.html#A)`, `[`Z`](where-selection.html#Z)`>.whereSelection(predicate: `[`Z`](where-selection.html#Z)`.() -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`Query`](../arrow.aql/-query/index.html)`<ForOption, `[`A`](where-selection.html#A)`, `[`Z`](where-selection.html#Z)`>` |

