---
title: TryWhere - arrow-query-language
---

[arrow-query-language](../../index.html) / [arrow.aql.instances](../index.html) / [TryWhere](./index.html)

# TryWhere

`@extension interface TryWhere : `[`Where`](../../arrow.aql/-where/index.html)`<ForTry>`

### Functions

| [functorFilter](functor-filter.html) | `open fun functorFilter(): FunctorFilter<ForTry>` |

### Inherited Functions

| [having](../../arrow.aql/-where/having.html) | `open infix fun <A, Z> `[`Query`](../../arrow.aql/-query/index.html)`<`[`F`](../../arrow.aql/-where/index.html#F)`, `[`A`](../../arrow.aql/-where/having.html#A)`, `[`Z`](../../arrow.aql/-where/having.html#Z)`>.having(predicate: `[`A`](../../arrow.aql/-where/having.html#A)`.() -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`Query`](../../arrow.aql/-query/index.html)`<`[`F`](../../arrow.aql/-where/index.html#F)`, `[`A`](../../arrow.aql/-where/having.html#A)`, `[`Z`](../../arrow.aql/-where/having.html#Z)`>` |
| [where](../../arrow.aql/-where/where.html) | `open infix fun <A, Z> `[`Query`](../../arrow.aql/-query/index.html)`<`[`F`](../../arrow.aql/-where/index.html#F)`, `[`A`](../../arrow.aql/-where/where.html#A)`, `[`Z`](../../arrow.aql/-where/where.html#Z)`>.where(predicate: `[`A`](../../arrow.aql/-where/where.html#A)`.() -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`Query`](../../arrow.aql/-query/index.html)`<`[`F`](../../arrow.aql/-where/index.html#F)`, `[`A`](../../arrow.aql/-where/where.html#A)`, `[`Z`](../../arrow.aql/-where/where.html#Z)`>` |
| [whereSelection](../../arrow.aql/-where/where-selection.html) | `open infix fun <A, Z> `[`Query`](../../arrow.aql/-query/index.html)`<`[`F`](../../arrow.aql/-where/index.html#F)`, `[`A`](../../arrow.aql/-where/where-selection.html#A)`, `[`Z`](../../arrow.aql/-where/where-selection.html#Z)`>.whereSelection(predicate: `[`Z`](../../arrow.aql/-where/where-selection.html#Z)`.() -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`Query`](../../arrow.aql/-query/index.html)`<`[`F`](../../arrow.aql/-where/index.html#F)`, `[`A`](../../arrow.aql/-where/where-selection.html#A)`, `[`Z`](../../arrow.aql/-where/where-selection.html#Z)`>` |

