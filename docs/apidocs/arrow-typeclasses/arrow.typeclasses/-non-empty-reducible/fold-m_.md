---
title: NonEmptyReducible.foldM_ - arrow-typeclasses
---

[arrow-typeclasses](../../index.html) / [arrow.typeclasses](../index.html) / [NonEmptyReducible](index.html) / [foldM_](./fold-m_.html)

# foldM_

`open fun <A, B> Kind<`[`F`](index.html#F)`, `[`A`](fold-m_.html#A)`>.foldM_(M: `[`Monad`](../-monad/index.html)`<`[`G`](index.html#G)`>, z: `[`B`](fold-m_.html#B)`, f: (`[`B`](fold-m_.html#B)`, `[`A`](fold-m_.html#A)`) -> Kind<`[`G`](index.html#G)`, `[`B`](fold-m_.html#B)`>): Kind<`[`G`](index.html#G)`, `[`B`](fold-m_.html#B)`>`