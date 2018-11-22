---
title: foldMapM - arrow-instances-core
---

[arrow-instances-core](../../index.html) / [arrow.instances.const.foldable](../index.html) / [arrow.Kind](index.html) / [foldMapM](./fold-map-m.html)

# foldMapM

`@JvmName("foldMapM") fun <A, G, B, MA : Monad<`[`G`](fold-map-m.html#G)`>, MO : Monoid<`[`B`](fold-map-m.html#B)`>> Kind<Kind<ForConst, `[`A`](fold-map-m.html#A)`>, `[`A`](fold-map-m.html#A)`>.foldMapM(arg1: `[`MA`](fold-map-m.html#MA)`, arg2: `[`MO`](fold-map-m.html#MO)`, arg3: (`[`A`](fold-map-m.html#A)`) -> Kind<`[`G`](fold-map-m.html#G)`, `[`B`](fold-map-m.html#B)`>): Kind<`[`G`](fold-map-m.html#G)`, `[`B`](fold-map-m.html#B)`>`