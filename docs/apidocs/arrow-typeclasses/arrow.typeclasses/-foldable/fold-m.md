---
title: Foldable.foldM - arrow-typeclasses
---

[arrow-typeclasses](../../index.html) / [arrow.typeclasses](../index.html) / [Foldable](index.html) / [foldM](./fold-m.html)

# foldM

`open fun <G, A, B> Kind<`[`F`](index.html#F)`, `[`A`](fold-m.html#A)`>.foldM(M: `[`Monad`](../-monad/index.html)`<`[`G`](fold-m.html#G)`>, z: `[`B`](fold-m.html#B)`, f: (`[`B`](fold-m.html#B)`, `[`A`](fold-m.html#A)`) -> Kind<`[`G`](fold-m.html#G)`, `[`B`](fold-m.html#B)`>): Kind<`[`G`](fold-m.html#G)`, `[`B`](fold-m.html#B)`>`

Left associative monadic folding on F.

The default implementation of this is based on foldL, and thus will always fold across the entire structure.
Certain structures are able to implement this in such a way that folds can be short-circuited (not traverse the
entirety of the structure), depending on the G result produced at a given step.

