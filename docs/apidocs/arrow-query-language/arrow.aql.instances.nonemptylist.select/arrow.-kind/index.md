---
title: arrow.aql.instances.nonemptylist.select.arrow.Kind - arrow-query-language
---

[arrow-query-language](../../index.html) / [arrow.aql.instances.nonemptylist.select](../index.html) / [arrow.Kind](./index.html)

### Extensions for arrow.Kind

| [query](query.html) | `infix fun <A, Z> Kind<ForNonEmptyList, `[`A`](query.html#A)`>.query(f: Kind<ForNonEmptyList, `[`A`](query.html#A)`>.() -> `[`Z`](query.html#Z)`): `[`Z`](query.html#Z) |
| [select](select.html) | `infix fun <A, Z> Kind<ForNonEmptyList, `[`A`](select.html#A)`>.select(f: `[`A`](select.html#A)`.() -> `[`Z`](select.html#Z)`): `[`Query`](../../arrow.aql/-query/index.html)`<ForNonEmptyList, `[`A`](select.html#A)`, `[`Z`](select.html#Z)`>` |
| [selectAll](select-all.html) | `fun <A> Kind<ForNonEmptyList, `[`A`](select-all.html#A)`>.selectAll(): `[`Query`](../../arrow.aql/-query/index.html)`<ForNonEmptyList, `[`A`](select-all.html#A)`, `[`A`](select-all.html#A)`>` |

