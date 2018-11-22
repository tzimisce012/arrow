---
title: traverse - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [arrow.Kind](index.html) / [traverse](./traverse.html)

# traverse

`fun <F, A, B, G, C> EitherTOf<`[`F`](traverse.html#F)`, `[`A`](traverse.html#A)`, `[`B`](traverse.html#B)`>.traverse(FF: Traverse<`[`F`](traverse.html#F)`>, GA: Applicative<`[`G`](traverse.html#G)`>, f: (`[`B`](traverse.html#B)`) -> Kind<`[`G`](traverse.html#G)`, `[`C`](traverse.html#C)`>): Kind<`[`G`](traverse.html#G)`, EitherT<`[`F`](traverse.html#F)`, `[`A`](traverse.html#A)`, `[`C`](traverse.html#C)`>>`
`fun <F, G, A, B> OptionTOf<`[`F`](traverse.html#F)`, `[`A`](traverse.html#A)`>.traverse(FF: Traverse<`[`F`](traverse.html#F)`>, GA: Applicative<`[`G`](traverse.html#G)`>, f: (`[`A`](traverse.html#A)`) -> Kind<`[`G`](traverse.html#G)`, `[`B`](traverse.html#B)`>): Kind<`[`G`](traverse.html#G)`, OptionT<`[`F`](traverse.html#F)`, `[`B`](traverse.html#B)`>>`