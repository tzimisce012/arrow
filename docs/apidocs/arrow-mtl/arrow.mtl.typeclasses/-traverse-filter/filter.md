---
title: TraverseFilter.filter - arrow-mtl
---

[arrow-mtl](../../index.html) / [arrow.mtl.typeclasses](../index.html) / [TraverseFilter](index.html) / [filter](./filter.html)

# filter

`open fun <A> Kind<`[`F`](index.html#F)`, `[`A`](filter.html#A)`>.filter(f: (`[`A`](filter.html#A)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): Kind<`[`F`](index.html#F)`, `[`A`](filter.html#A)`>`

Overrides [FunctorFilter.filter](../-functor-filter/filter.html)

Apply a filter to a structure such that the output structure contains all A elements in the input structure that satisfy the predicate f but none
that don't.

