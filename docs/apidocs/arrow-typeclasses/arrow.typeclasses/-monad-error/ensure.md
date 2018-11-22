---
title: MonadError.ensure - arrow-typeclasses
---

[arrow-typeclasses](../../index.html) / [arrow.typeclasses](../index.html) / [MonadError](index.html) / [ensure](./ensure.html)

# ensure

`open fun <A> Kind<`[`F`](index.html#F)`, `[`A`](ensure.html#A)`>.ensure(error: () -> `[`E`](index.html#E)`, predicate: (`[`A`](ensure.html#A)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): Kind<`[`F`](index.html#F)`, `[`A`](ensure.html#A)`>`