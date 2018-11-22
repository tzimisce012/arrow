---
title: Foldable.foldMapM - arrow-typeclasses
---

[arrow-typeclasses](../../index.html) / [arrow.typeclasses](../index.html) / [Foldable](index.html) / [foldMapM](./fold-map-m.html)

# foldMapM

`open fun <G, A, B, MA : `[`Monad`](../-monad/index.html)`<`[`G`](fold-map-m.html#G)`>, MO : `[`Monoid`](../-monoid/index.html)`<`[`B`](fold-map-m.html#B)`>> Kind<`[`F`](index.html#F)`, `[`A`](fold-map-m.html#A)`>.foldMapM(ma: `[`MA`](fold-map-m.html#MA)`, mo: `[`MO`](fold-map-m.html#MO)`, f: (`[`A`](fold-map-m.html#A)`) -> Kind<`[`G`](fold-map-m.html#G)`, `[`B`](fold-map-m.html#B)`>): Kind<`[`G`](fold-map-m.html#G)`, `[`B`](fold-map-m.html#B)`>`

Monadic folding on F by mapping A values to G, combining the B values using the given Monoid instance.

Similar to foldM, but using a Monoid.

