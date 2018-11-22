---
title: join - arrow-query-language
---

[arrow-query-language](../../index.html) / [arrow.aql.instances.try.from](../index.html) / [arrow.Kind](index.html) / [join](./join.html)

# join

`@JvmName("join") infix fun <A, B> Kind<ForTry, `[`A`](join.html#A)`>.join(fb: Kind<ForTry, `[`B`](join.html#B)`>): Try<Tuple2<`[`A`](join.html#A)`, `[`B`](join.html#B)`>>`
`@JvmName("join1") fun <A, B, C> Kind<ForTry, Tuple2<`[`A`](join.html#A)`, `[`B`](join.html#B)`>>.join(fc: Kind<ForTry, `[`C`](join.html#C)`>): Try<Tuple3<`[`A`](join.html#A)`, `[`B`](join.html#B)`, `[`C`](join.html#C)`>>`