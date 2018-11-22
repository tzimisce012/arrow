---
title: join - arrow-query-language
---

[arrow-query-language](../../index.html) / [arrow.aql.instances.nonemptylist.from](../index.html) / [arrow.Kind](index.html) / [join](./join.html)

# join

`@JvmName("join") infix fun <A, B> Kind<ForNonEmptyList, `[`A`](join.html#A)`>.join(fb: Kind<ForNonEmptyList, `[`B`](join.html#B)`>): NonEmptyList<Tuple2<`[`A`](join.html#A)`, `[`B`](join.html#B)`>>`
`@JvmName("join1") fun <A, B, C> Kind<ForNonEmptyList, Tuple2<`[`A`](join.html#A)`, `[`B`](join.html#B)`>>.join(fc: Kind<ForNonEmptyList, `[`C`](join.html#C)`>): NonEmptyList<Tuple3<`[`A`](join.html#A)`, `[`B`](join.html#B)`, `[`C`](join.html#C)`>>`