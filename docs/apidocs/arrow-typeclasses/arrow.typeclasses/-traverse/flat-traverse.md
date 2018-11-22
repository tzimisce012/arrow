---
title: Traverse.flatTraverse - arrow-typeclasses
---

[arrow-typeclasses](../../index.html) / [arrow.typeclasses](../index.html) / [Traverse](index.html) / [flatTraverse](./flat-traverse.html)

# flatTraverse

`open fun <G, A, B> Kind<`[`F`](index.html#F)`, `[`A`](flat-traverse.html#A)`>.flatTraverse(MF: `[`Monad`](../-monad/index.html)`<`[`F`](index.html#F)`>, AG: `[`Applicative`](../-applicative/index.html)`<`[`G`](flat-traverse.html#G)`>, f: (`[`A`](flat-traverse.html#A)`) -> Kind<`[`G`](flat-traverse.html#G)`, Kind<`[`F`](index.html#F)`, `[`B`](flat-traverse.html#B)`>>): Kind<`[`G`](flat-traverse.html#G)`, Kind<`[`F`](index.html#F)`, `[`B`](flat-traverse.html#B)`>>`