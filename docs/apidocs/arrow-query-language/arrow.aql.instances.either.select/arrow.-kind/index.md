---
title: arrow.aql.instances.either.select.arrow.Kind - arrow-query-language
---

[arrow-query-language](../../index.html) / [arrow.aql.instances.either.select](../index.html) / [arrow.Kind](./index.html)

### Extensions for arrow.Kind

| [query](query.html) | `infix fun <L, A, Z> Kind<Kind<ForEither, `[`L`](query.html#L)`>, `[`A`](query.html#A)`>.query(f: Kind<Kind<ForEither, `[`L`](query.html#L)`>, `[`A`](query.html#A)`>.() -> `[`Z`](query.html#Z)`): `[`Z`](query.html#Z) |
| [select](select.html) | `infix fun <L, A, Z> Kind<Kind<ForEither, `[`L`](select.html#L)`>, `[`A`](select.html#A)`>.select(f: `[`A`](select.html#A)`.() -> `[`Z`](select.html#Z)`): `[`Query`](../../arrow.aql/-query/index.html)`<Kind<ForEither, `[`L`](select.html#L)`>, `[`A`](select.html#A)`, `[`Z`](select.html#Z)`>` |
| [selectAll](select-all.html) | `fun <L, A> Kind<Kind<ForEither, `[`L`](select-all.html#L)`>, `[`A`](select-all.html#A)`>.selectAll(): `[`Query`](../../arrow.aql/-query/index.html)`<Kind<ForEither, `[`L`](select-all.html#L)`>, `[`A`](select-all.html#A)`, `[`A`](select-all.html#A)`>` |

