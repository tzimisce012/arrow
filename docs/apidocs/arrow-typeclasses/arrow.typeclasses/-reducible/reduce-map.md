---
title: Reducible.reduceMap - arrow-typeclasses
---

[arrow-typeclasses](../../index.html) / [arrow.typeclasses](../index.html) / [Reducible](index.html) / [reduceMap](./reduce-map.html)

# reduceMap

`open fun <A, B> Kind<`[`F`](index.html#F)`, `[`A`](reduce-map.html#A)`>.reduceMap(SG: `[`Semigroup`](../-semigroup/index.html)`<`[`B`](reduce-map.html#B)`>, f: (`[`A`](reduce-map.html#A)`) -> `[`B`](reduce-map.html#B)`): `[`B`](reduce-map.html#B)

Apply f to each element of fa and combine them using the given Semigroup.

