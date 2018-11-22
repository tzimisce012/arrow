---
title: foldMapM - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances.coproduct.foldable](../index.html) / [arrow.Kind](index.html) / [foldMapM](./fold-map-m.html)

# foldMapM

`@JvmName("foldMapM") fun <F, G, A, B, MA : Monad<`[`G`](fold-map-m.html#G)`>, MO : Monoid<`[`B`](fold-map-m.html#B)`>> Kind<Kind<Kind<ForCoproduct, `[`F`](fold-map-m.html#F)`>, `[`G`](fold-map-m.html#G)`>, `[`A`](fold-map-m.html#A)`>.foldMapM(arg1: `[`MA`](fold-map-m.html#MA)`, arg2: `[`MO`](fold-map-m.html#MO)`, arg3: (`[`A`](fold-map-m.html#A)`) -> Kind<`[`G`](fold-map-m.html#G)`, `[`B`](fold-map-m.html#B)`>, FF: Foldable<`[`F`](fold-map-m.html#F)`>, FG: Foldable<`[`G`](fold-map-m.html#G)`>): Kind<`[`G`](fold-map-m.html#G)`, `[`B`](fold-map-m.html#B)`>`