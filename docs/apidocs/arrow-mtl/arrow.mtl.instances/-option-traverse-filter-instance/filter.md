---
title: OptionTraverseFilterInstance.filter - arrow-mtl
---

[arrow-mtl](../../index.html) / [arrow.mtl.instances](../index.html) / [OptionTraverseFilterInstance](index.html) / [filter](./filter.html)

# filter

`open fun <A> Kind<ForOption, `[`A`](filter.html#A)`>.filter(f: (`[`A`](filter.html#A)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): Option<`[`A`](filter.html#A)`>`

Overrides [TraverseFilter.filter](../../arrow.mtl.typeclasses/-traverse-filter/filter.html)

Apply a filter to a structure such that the output structure contains all A elements in the input structure that satisfy the predicate f but none
that don't.

