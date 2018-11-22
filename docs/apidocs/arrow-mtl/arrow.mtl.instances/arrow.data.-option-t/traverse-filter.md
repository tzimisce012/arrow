---
title: traverseFilter - arrow-mtl
---

[arrow-mtl](../../index.html) / [arrow.mtl.instances](../index.html) / [arrow.data.OptionT](index.html) / [traverseFilter](./traverse-filter.html)

# traverseFilter

`fun <F, G, A, B> OptionT<`[`F`](traverse-filter.html#F)`, `[`A`](traverse-filter.html#A)`>.traverseFilter(f: (`[`A`](traverse-filter.html#A)`) -> Kind<`[`G`](traverse-filter.html#G)`, Option<`[`B`](traverse-filter.html#B)`>>, GA: Applicative<`[`G`](traverse-filter.html#G)`>, FF: Traverse<`[`F`](traverse-filter.html#F)`>): Kind<`[`G`](traverse-filter.html#G)`, OptionT<`[`F`](traverse-filter.html#F)`, `[`B`](traverse-filter.html#B)`>>`