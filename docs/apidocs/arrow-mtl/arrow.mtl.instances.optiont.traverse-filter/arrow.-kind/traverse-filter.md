---
title: traverseFilter - arrow-mtl
---

[arrow-mtl](../../index.html) / [arrow.mtl.instances.optiont.traverseFilter](../index.html) / [arrow.Kind](index.html) / [traverseFilter](./traverse-filter.html)

# traverseFilter

`@JvmName("traverseFilter") fun <F, G, A, B> Kind<Kind<ForOptionT, `[`F`](traverse-filter.html#F)`>, `[`A`](traverse-filter.html#A)`>.traverseFilter(AP: Applicative<`[`G`](traverse-filter.html#G)`>, f: (`[`A`](traverse-filter.html#A)`) -> Kind<`[`G`](traverse-filter.html#G)`, Option<`[`B`](traverse-filter.html#B)`>>, FFF: `[`TraverseFilter`](../../arrow.mtl.typeclasses/-traverse-filter/index.html)`<`[`F`](traverse-filter.html#F)`>): Kind<`[`G`](traverse-filter.html#G)`, Kind<Kind<ForOptionT, `[`F`](traverse-filter.html#F)`>, `[`B`](traverse-filter.html#B)`>>`