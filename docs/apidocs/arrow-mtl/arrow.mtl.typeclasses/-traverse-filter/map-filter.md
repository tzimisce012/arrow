---
title: TraverseFilter.mapFilter - arrow-mtl
---

[arrow-mtl](../../index.html) / [arrow.mtl.typeclasses](../index.html) / [TraverseFilter](index.html) / [mapFilter](./map-filter.html)

# mapFilter

`open fun <A, B> Kind<`[`F`](index.html#F)`, `[`A`](map-filter.html#A)`>.mapFilter(f: (`[`A`](map-filter.html#A)`) -> Option<`[`B`](map-filter.html#B)`>): Kind<`[`F`](index.html#F)`, `[`B`](map-filter.html#B)`>`

Overrides [FunctorFilter.mapFilter](../-functor-filter/map-filter.html)

A combined map and filter. Filtering is handled via Option instead of Boolean such that the output type B can be different than the input type A.

