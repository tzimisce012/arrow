---
title: arrow.aql - arrow-query-language
---

[arrow-query-language](../index.html) / [arrow.aql](./index.html)

## Package arrow.aql

### Types

| [Count](-count/index.html) | `interface Count<F>` |
| [From](-from/index.html) | `interface From<F>` |
| [GroupBy](-group-by/index.html) | `interface GroupBy<F>` |
| [Ord](-ord/index.html) | `sealed class Ord<X>` |
| [OrderBy](-order-by/index.html) | `interface OrderBy<F>` |
| [Query](-query/index.html) | `data class Query<out F, A, out Z>` |
| [Select](-select/index.html) | `interface Select<F>`<br>`select` allows obtaining and transforming data from any data source containing `A` given a function `(A) -> B` where `A` denotes the input type and `B` the transformed type. |
| [Sum](-sum/index.html) | `interface Sum<F>` |
| [Union](-union/index.html) | `interface Union<F>` |
| [Where](-where/index.html) | `interface Where<F>` |

### Type Aliases

| [Selection](-selection.html) | `typealias Selection<A, Z> = `[`A`](-selection.html#A)`.() -> `[`Z`](-selection.html#Z) |
| [Source](-source.html) | `typealias Source<F, A> = Kind<`[`F`](-source.html#F)`, `[`A`](-source.html#A)`>` |

