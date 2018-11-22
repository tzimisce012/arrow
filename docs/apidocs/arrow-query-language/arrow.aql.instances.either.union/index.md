---
title: arrow.aql.instances.either.union - arrow-query-language
---

[arrow-query-language](../index.html) / [arrow.aql.instances.either.union](./index.html)

## Package arrow.aql.instances.either.union

### Extensions for External Classes

| [arrow.core.Either](arrow.core.-either/index.html) |  |

### Functions

| [foldable](foldable.html) | `fun <L> foldable(): Foldable<Kind<ForEither, `[`L`](foldable.html#L)`>>` |
| [union](union.html) | `infix fun <L, A, B, Z> `[`Query`](../arrow.aql/-query/index.html)`<Kind<ForEither, `[`L`](union.html#L)`>, `[`A`](union.html#A)`, `[`Z`](union.html#Z)`>.union(query: `[`Query`](../arrow.aql/-query/index.html)`<Kind<ForEither, `[`L`](union.html#L)`>, `[`B`](union.html#B)`, `[`Z`](union.html#Z)`>): `[`Query`](../arrow.aql/-query/index.html)`<ForListK, `[`Z`](union.html#Z)`, `[`Z`](union.html#Z)`>` |

