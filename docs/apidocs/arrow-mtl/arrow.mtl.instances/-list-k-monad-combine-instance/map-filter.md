---
title: ListKMonadCombineInstance.mapFilter - arrow-mtl
---

[arrow-mtl](../../index.html) / [arrow.mtl.instances](../index.html) / [ListKMonadCombineInstance](index.html) / [mapFilter](./map-filter.html)

# mapFilter

`open fun <A, B> Kind<ForListK, `[`A`](map-filter.html#A)`>.mapFilter(f: (`[`A`](map-filter.html#A)`) -> Option<`[`B`](map-filter.html#B)`>): ListK<`[`B`](map-filter.html#B)`>`

Overrides [MonadFilter.mapFilter](../../arrow.mtl.typeclasses/-monad-filter/map-filter.html)

A combined map and filter. Filtering is handled via Option instead of Boolean such that the output type B can be different than the input type A.

