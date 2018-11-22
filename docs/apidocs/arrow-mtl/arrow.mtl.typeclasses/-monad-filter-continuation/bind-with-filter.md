---
title: MonadFilterContinuation.bindWithFilter - arrow-mtl
---

[arrow-mtl](../../index.html) / [arrow.mtl.typeclasses](../index.html) / [MonadFilterContinuation](index.html) / [bindWithFilter](./bind-with-filter.html)

# bindWithFilter

`suspend fun <B> Kind<`[`F`](index.html#F)`, `[`B`](bind-with-filter.html#B)`>.bindWithFilter(f: (`[`B`](bind-with-filter.html#B)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`B`](bind-with-filter.html#B)

Binds only if the given predicate matches the inner value otherwise binds into the Monad `empty()` value
on `MonadFilter` instances

