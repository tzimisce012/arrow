---
title: sequence - arrow-instances-core
---

[arrow-instances-core](../../index.html) / [arrow.instances](../index.html) / [arrow.Kind](index.html) / [sequence](./sequence.html)

# sequence

`fun <A, G> IdOf<Kind<`[`G`](sequence.html#G)`, `[`A`](sequence.html#A)`>>.sequence(GA: Applicative<`[`G`](sequence.html#G)`>): Kind<`[`G`](sequence.html#G)`, Id<`[`A`](sequence.html#A)`>>`
`fun <A, G> OptionOf<Kind<`[`G`](sequence.html#G)`, `[`A`](sequence.html#A)`>>.sequence(GA: Applicative<`[`G`](sequence.html#G)`>): Kind<`[`G`](sequence.html#G)`, Option<`[`A`](sequence.html#A)`>>`
`fun <A, G> TryOf<Kind<`[`G`](sequence.html#G)`, `[`A`](sequence.html#A)`>>.sequence(GA: Applicative<`[`G`](sequence.html#G)`>): Kind<`[`G`](sequence.html#G)`, Try<`[`A`](sequence.html#A)`>>`
`fun <F, G, A> Tuple2Of<`[`F`](sequence.html#F)`, Kind<`[`G`](sequence.html#G)`, `[`A`](sequence.html#A)`>>.sequence(GA: Applicative<`[`G`](sequence.html#G)`>): Kind<`[`G`](sequence.html#G)`, Tuple2<`[`F`](sequence.html#F)`, `[`A`](sequence.html#A)`>>`