---
title: foldMapM - arrow-effects-rx2-instances
---

[arrow-effects-rx2-instances](../../index.html) / [arrow.effects.observablek.foldable](../index.html) / [arrow.Kind](index.html) / [foldMapM](./fold-map-m.html)

# foldMapM

`@JvmName("foldMapM") fun <G, A, B, MA : Monad<`[`G`](fold-map-m.html#G)`>, MO : Monoid<`[`B`](fold-map-m.html#B)`>> Kind<ForObservableK, `[`A`](fold-map-m.html#A)`>.foldMapM(arg1: `[`MA`](fold-map-m.html#MA)`, arg2: `[`MO`](fold-map-m.html#MO)`, arg3: (`[`A`](fold-map-m.html#A)`) -> Kind<`[`G`](fold-map-m.html#G)`, `[`B`](fold-map-m.html#B)`>): Kind<`[`G`](fold-map-m.html#G)`, `[`B`](fold-map-m.html#B)`>`