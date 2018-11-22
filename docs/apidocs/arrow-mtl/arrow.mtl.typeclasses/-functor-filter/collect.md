---
title: FunctorFilter.collect - arrow-mtl
---

[arrow-mtl](../../index.html) / [arrow.mtl.typeclasses](../index.html) / [FunctorFilter](index.html) / [collect](./collect.html)

# collect

`open fun <A, B> Kind<`[`F`](index.html#F)`, `[`A`](collect.html#A)`>.collect(f: PartialFunction<`[`A`](collect.html#A)`, `[`B`](collect.html#B)`>): Kind<`[`F`](index.html#F)`, `[`B`](collect.html#B)`>`

Similar to mapFilter but uses a partial function instead of a function that returns an Option.

