---
title: Traverse.sequence - arrow-typeclasses
---

[arrow-typeclasses](../../index.html) / [arrow.typeclasses](../index.html) / [Traverse](index.html) / [sequence](./sequence.html)

# sequence

`open fun <G, A> Kind<`[`F`](index.html#F)`, Kind<`[`G`](sequence.html#G)`, `[`A`](sequence.html#A)`>>.sequence(AG: `[`Applicative`](../-applicative/index.html)`<`[`G`](sequence.html#G)`>): Kind<`[`G`](sequence.html#G)`, Kind<`[`F`](index.html#F)`, `[`A`](sequence.html#A)`>>`

Thread all the G effects through the F structure to invert the structure from F&lt;G&gt; to G&lt;F&gt;.

