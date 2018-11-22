---
title: foldMap - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances.coproduct.foldable](../index.html) / [arrow.Kind](index.html) / [foldMap](./fold-map.html)

# foldMap

`@JvmName("foldMap") fun <F, G, A, B> Kind<Kind<Kind<ForCoproduct, `[`F`](fold-map.html#F)`>, `[`G`](fold-map.html#G)`>, `[`A`](fold-map.html#A)`>.foldMap(arg1: Monoid<`[`B`](fold-map.html#B)`>, arg2: (`[`A`](fold-map.html#A)`) -> `[`B`](fold-map.html#B)`, FF: Foldable<`[`F`](fold-map.html#F)`>, FG: Foldable<`[`G`](fold-map.html#G)`>): `[`B`](fold-map.html#B)