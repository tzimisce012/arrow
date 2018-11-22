---
title: join - arrow-query-language
---

[arrow-query-language](../../index.html) / [arrow.aql.instances.either.from](../index.html) / [arrow.Kind](index.html) / [join](./join.html)

# join

`@JvmName("join") infix fun <L, A, B> Kind<Kind<ForEither, `[`L`](join.html#L)`>, `[`A`](join.html#A)`>.join(fb: Kind<Kind<ForEither, `[`L`](join.html#L)`>, `[`B`](join.html#B)`>): Either<`[`L`](join.html#L)`, Tuple2<`[`A`](join.html#A)`, `[`B`](join.html#B)`>>`
`@JvmName("join1") fun <L, A, B, C> Kind<Kind<ForEither, `[`L`](join.html#L)`>, Tuple2<`[`A`](join.html#A)`, `[`B`](join.html#B)`>>.join(fc: Kind<Kind<ForEither, `[`L`](join.html#L)`>, `[`C`](join.html#C)`>): Either<`[`L`](join.html#L)`, Tuple3<`[`A`](join.html#A)`, `[`B`](join.html#B)`, `[`C`](join.html#C)`>>`