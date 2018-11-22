---
title: arrow.aql.instances.sequencek.select.arrow.Kind - arrow-query-language
---

[arrow-query-language](../../index.html) / [arrow.aql.instances.sequencek.select](../index.html) / [arrow.Kind](./index.html)

### Extensions for arrow.Kind

| [query](query.html) | `infix fun <A, Z> Kind<ForSequenceK, `[`A`](query.html#A)`>.query(f: Kind<ForSequenceK, `[`A`](query.html#A)`>.() -> `[`Z`](query.html#Z)`): `[`Z`](query.html#Z) |
| [select](select.html) | `infix fun <A, Z> Kind<ForSequenceK, `[`A`](select.html#A)`>.select(f: `[`A`](select.html#A)`.() -> `[`Z`](select.html#Z)`): `[`Query`](../../arrow.aql/-query/index.html)`<ForSequenceK, `[`A`](select.html#A)`, `[`Z`](select.html#Z)`>` |
| [selectAll](select-all.html) | `fun <A> Kind<ForSequenceK, `[`A`](select-all.html#A)`>.selectAll(): `[`Query`](../../arrow.aql/-query/index.html)`<ForSequenceK, `[`A`](select-all.html#A)`, `[`A`](select-all.html#A)`>` |

