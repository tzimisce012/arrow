---
title: join - arrow-query-language
---

[arrow-query-language](../../index.html) / [arrow.aql.instances.eval.from](../index.html) / [arrow.Kind](index.html) / [join](./join.html)

# join

`@JvmName("join") infix fun <A, B> Kind<ForEval, `[`A`](join.html#A)`>.join(fb: Kind<ForEval, `[`B`](join.html#B)`>): Eval<Tuple2<`[`A`](join.html#A)`, `[`B`](join.html#B)`>>`
`@JvmName("join1") fun <A, B, C> Kind<ForEval, Tuple2<`[`A`](join.html#A)`, `[`B`](join.html#B)`>>.join(fc: Kind<ForEval, `[`C`](join.html#C)`>): Eval<Tuple3<`[`A`](join.html#A)`, `[`B`](join.html#B)`, `[`C`](join.html#C)`>>`