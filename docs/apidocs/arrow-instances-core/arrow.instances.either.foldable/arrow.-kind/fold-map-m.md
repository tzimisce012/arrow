---
title: foldMapM - arrow-instances-core
---

[arrow-instances-core](../../index.html) / [arrow.instances.either.foldable](../index.html) / [arrow.Kind](index.html) / [foldMapM](./fold-map-m.html)

# foldMapM

`@JvmName("foldMapM") fun <L, G, A, B, MA : Monad<`[`G`](fold-map-m.html#G)`>, MO : Monoid<`[`B`](fold-map-m.html#B)`>> Kind<Kind<ForEither, `[`L`](fold-map-m.html#L)`>, `[`A`](fold-map-m.html#A)`>.foldMapM(arg1: `[`MA`](fold-map-m.html#MA)`, arg2: `[`MO`](fold-map-m.html#MO)`, arg3: (`[`A`](fold-map-m.html#A)`) -> Kind<`[`G`](fold-map-m.html#G)`, `[`B`](fold-map-m.html#B)`>): Kind<`[`G`](fold-map-m.html#G)`, `[`B`](fold-map-m.html#B)`>`