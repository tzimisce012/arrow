---
title: foldMapM - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances.optiont.foldable](../index.html) / [arrow.Kind](index.html) / [foldMapM](./fold-map-m.html)

# foldMapM

`@JvmName("foldMapM") fun <F, G, A, B, MA : Monad<`[`G`](fold-map-m.html#G)`>, MO : Monoid<`[`B`](fold-map-m.html#B)`>> Kind<Kind<ForOptionT, `[`F`](fold-map-m.html#F)`>, `[`A`](fold-map-m.html#A)`>.foldMapM(arg1: `[`MA`](fold-map-m.html#MA)`, arg2: `[`MO`](fold-map-m.html#MO)`, arg3: (`[`A`](fold-map-m.html#A)`) -> Kind<`[`G`](fold-map-m.html#G)`, `[`B`](fold-map-m.html#B)`>, FFF: Foldable<`[`F`](fold-map-m.html#F)`>): Kind<`[`G`](fold-map-m.html#G)`, `[`B`](fold-map-m.html#B)`>`