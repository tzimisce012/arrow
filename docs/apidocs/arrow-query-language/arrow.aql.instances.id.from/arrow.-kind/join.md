---
title: join - arrow-query-language
---

[arrow-query-language](../../index.html) / [arrow.aql.instances.id.from](../index.html) / [arrow.Kind](index.html) / [join](./join.html)

# join

`@JvmName("join") infix fun <A, B> Kind<ForId, `[`A`](join.html#A)`>.join(fb: Kind<ForId, `[`B`](join.html#B)`>): Id<Tuple2<`[`A`](join.html#A)`, `[`B`](join.html#B)`>>`
`@JvmName("join1") fun <A, B, C> Kind<ForId, Tuple2<`[`A`](join.html#A)`, `[`B`](join.html#B)`>>.join(fc: Kind<ForId, `[`C`](join.html#C)`>): Id<Tuple3<`[`A`](join.html#A)`, `[`B`](join.html#B)`, `[`C`](join.html#C)`>>`