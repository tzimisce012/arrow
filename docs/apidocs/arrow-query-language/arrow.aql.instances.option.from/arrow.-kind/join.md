---
title: join - arrow-query-language
---

[arrow-query-language](../../index.html) / [arrow.aql.instances.option.from](../index.html) / [arrow.Kind](index.html) / [join](./join.html)

# join

`@JvmName("join") infix fun <A, B> Kind<ForOption, `[`A`](join.html#A)`>.join(fb: Kind<ForOption, `[`B`](join.html#B)`>): Option<Tuple2<`[`A`](join.html#A)`, `[`B`](join.html#B)`>>`
`@JvmName("join1") fun <A, B, C> Kind<ForOption, Tuple2<`[`A`](join.html#A)`, `[`B`](join.html#B)`>>.join(fc: Kind<ForOption, `[`C`](join.html#C)`>): Option<Tuple3<`[`A`](join.html#A)`, `[`B`](join.html#B)`, `[`C`](join.html#C)`>>`