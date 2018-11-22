---
title: arrow.aql.instances.list.where - arrow-query-language
---

[arrow-query-language](../index.html) / [arrow.aql.instances.list.where](./index.html)

## Package arrow.aql.instances.list.where

### Types

| [List](-list/index.html) | `object List` |

### Functions

| [functorFilter](functor-filter.html) | `fun functorFilter(): FunctorFilter<ForListK>` |
| [having](having.html) | `infix fun <A, Z> `[`Query`](../arrow.aql/-query/index.html)`<ForListK, `[`A`](having.html#A)`, `[`Z`](having.html#Z)`>.having(predicate: `[`A`](having.html#A)`.() -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`Query`](../arrow.aql/-query/index.html)`<ForListK, `[`A`](having.html#A)`, `[`Z`](having.html#Z)`>` |
| [where](where.html) | `infix fun <A, Z> `[`Query`](../arrow.aql/-query/index.html)`<ForListK, `[`A`](where.html#A)`, `[`Z`](where.html#Z)`>.where(predicate: `[`A`](where.html#A)`.() -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`Query`](../arrow.aql/-query/index.html)`<ForListK, `[`A`](where.html#A)`, `[`Z`](where.html#Z)`>` |
| [whereSelection](where-selection.html) | `infix fun <A, Z> `[`Query`](../arrow.aql/-query/index.html)`<ForListK, `[`A`](where-selection.html#A)`, `[`Z`](where-selection.html#Z)`>.whereSelection(predicate: `[`Z`](where-selection.html#Z)`.() -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`Query`](../arrow.aql/-query/index.html)`<ForListK, `[`A`](where-selection.html#A)`, `[`Z`](where-selection.html#Z)`>` |

