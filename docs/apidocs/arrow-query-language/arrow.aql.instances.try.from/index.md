---
title: arrow.aql.instances.try.from - arrow-query-language
---

[arrow-query-language](../index.html) / [arrow.aql.instances.try.from](./index.html)

## Package arrow.aql.instances.try.from

### Extensions for External Classes

| [arrow.Kind](arrow.-kind/index.html) |  |
| [arrow.core.Try](arrow.core.-try/index.html) |  |

### Functions

| [applicative](applicative.html) | `fun applicative(): Applicative<ForTry>` |
| [join](join.html) | `infix fun <A, B, Z, X> `[`Query`](../arrow.aql/-query/index.html)`<ForTry, `[`A`](join.html#A)`, `[`Z`](join.html#Z)`>.join(query: `[`Query`](../arrow.aql/-query/index.html)`<ForTry, `[`B`](join.html#B)`, `[`X`](join.html#X)`>): `[`Query`](../arrow.aql/-query/index.html)`<ForTry, Tuple2<`[`A`](join.html#A)`, `[`B`](join.html#B)`>, Tuple2<`[`Z`](join.html#Z)`, `[`X`](join.html#X)`>>` |

