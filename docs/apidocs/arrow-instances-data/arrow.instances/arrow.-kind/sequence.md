---
title: sequence - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [arrow.Kind](index.html) / [sequence](./sequence.html)

# sequence

`fun <F, G, A, B> EitherTOf<`[`F`](sequence.html#F)`, `[`A`](sequence.html#A)`, Kind<`[`G`](sequence.html#G)`, `[`B`](sequence.html#B)`>>.sequence(FF: Traverse<`[`F`](sequence.html#F)`>, GA: Applicative<`[`G`](sequence.html#G)`>): Kind<`[`G`](sequence.html#G)`, EitherT<`[`F`](sequence.html#F)`, `[`A`](sequence.html#A)`, `[`B`](sequence.html#B)`>>`
`fun <F, G, A> OptionTOf<`[`F`](sequence.html#F)`, Kind<`[`G`](sequence.html#G)`, `[`A`](sequence.html#A)`>>.sequence(FF: Traverse<`[`F`](sequence.html#F)`>, GA: Applicative<`[`G`](sequence.html#G)`>): Kind<`[`G`](sequence.html#G)`, OptionT<`[`F`](sequence.html#F)`, `[`A`](sequence.html#A)`>>`