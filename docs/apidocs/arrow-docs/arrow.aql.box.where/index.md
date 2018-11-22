---
title: arrow.aql.box.where - arrow-docs
---

[arrow-docs](../index.html) / [arrow.aql.box.where](./index.html)

## Package arrow.aql.box.where

### Functions

| [functorFilter](functor-filter.html) | `fun functorFilter(): FunctorFilter<`[`ForBox`](../arrow.aql/-for-box.html)`>` |
| [having](having.html) | `infix fun <A, Z> Query<`[`ForBox`](../arrow.aql/-for-box.html)`, `[`A`](having.html#A)`, `[`Z`](having.html#Z)`>.having(arg1: `[`A`](having.html#A)`.() -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): Query<`[`ForBox`](../arrow.aql/-for-box.html)`, `[`A`](having.html#A)`, `[`Z`](having.html#Z)`>` |
| [where](where.html) | `infix fun <A, Z> Query<`[`ForBox`](../arrow.aql/-for-box.html)`, `[`A`](where.html#A)`, `[`Z`](where.html#Z)`>.where(arg1: `[`A`](where.html#A)`.() -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): Query<`[`ForBox`](../arrow.aql/-for-box.html)`, `[`A`](where.html#A)`, `[`Z`](where.html#Z)`>` |
| [whereSelection](where-selection.html) | `infix fun <A, Z> Query<`[`ForBox`](../arrow.aql/-for-box.html)`, `[`A`](where-selection.html#A)`, `[`Z`](where-selection.html#Z)`>.whereSelection(arg1: `[`Z`](where-selection.html#Z)`.() -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): Query<`[`ForBox`](../arrow.aql/-for-box.html)`, `[`A`](where-selection.html#A)`, `[`Z`](where-selection.html#Z)`>` |

### Companion Object Functions

| [where](where.html) | `fun Box.Companion.where(): `[`BoxWhere`](../arrow.aql/-box-where/index.html) |

