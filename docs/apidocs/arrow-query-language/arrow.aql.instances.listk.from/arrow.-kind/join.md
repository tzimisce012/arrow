---
title: join - arrow-query-language
---

[arrow-query-language](../../index.html) / [arrow.aql.instances.listk.from](../index.html) / [arrow.Kind](index.html) / [join](./join.html)

# join

`@JvmName("join") infix fun <A, B> Kind<ForListK, `[`A`](join.html#A)`>.join(fb: Kind<ForListK, `[`B`](join.html#B)`>): ListK<Tuple2<`[`A`](join.html#A)`, `[`B`](join.html#B)`>>`
`@JvmName("join1") fun <A, B, C> Kind<ForListK, Tuple2<`[`A`](join.html#A)`, `[`B`](join.html#B)`>>.join(fc: Kind<ForListK, `[`C`](join.html#C)`>): ListK<Tuple3<`[`A`](join.html#A)`, `[`B`](join.html#B)`, `[`C`](join.html#C)`>>`