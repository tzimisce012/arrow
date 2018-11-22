---
title: join - arrow-query-language
---

[arrow-query-language](../../index.html) / [arrow.aql.instances.function0.from](../index.html) / [arrow.Kind](index.html) / [join](./join.html)

# join

`@JvmName("join") infix fun <A, B> Kind<ForFunction0, `[`A`](join.html#A)`>.join(fb: Kind<ForFunction0, `[`B`](join.html#B)`>): () -> Tuple2<`[`A`](join.html#A)`, `[`B`](join.html#B)`>`
`@JvmName("join1") fun <A, B, C> Kind<ForFunction0, Tuple2<`[`A`](join.html#A)`, `[`B`](join.html#B)`>>.join(fc: Kind<ForFunction0, `[`C`](join.html#C)`>): () -> Tuple3<`[`A`](join.html#A)`, `[`B`](join.html#B)`, `[`C`](join.html#C)`>`