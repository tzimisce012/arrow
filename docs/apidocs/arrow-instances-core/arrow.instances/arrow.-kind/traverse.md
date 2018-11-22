---
title: traverse - arrow-instances-core
---

[arrow-instances-core](../../index.html) / [arrow.instances](../index.html) / [arrow.Kind](index.html) / [traverse](./traverse.html)

# traverse

`fun <G, A, B, C> EitherOf<`[`A`](traverse.html#A)`, `[`B`](traverse.html#B)`>.traverse(GA: Applicative<`[`G`](traverse.html#G)`>, f: (`[`B`](traverse.html#B)`) -> Kind<`[`G`](traverse.html#G)`, `[`C`](traverse.html#C)`>): Kind<`[`G`](traverse.html#G)`, Either<`[`A`](traverse.html#A)`, `[`C`](traverse.html#C)`>>`
`fun <A, G, B> IdOf<`[`A`](traverse.html#A)`>.traverse(GA: Applicative<`[`G`](traverse.html#G)`>, f: (`[`A`](traverse.html#A)`) -> Kind<`[`G`](traverse.html#G)`, `[`B`](traverse.html#B)`>): Kind<`[`G`](traverse.html#G)`, Id<`[`B`](traverse.html#B)`>>`
`fun <A, G, B> OptionOf<`[`A`](traverse.html#A)`>.traverse(GA: Applicative<`[`G`](traverse.html#G)`>, f: (`[`A`](traverse.html#A)`) -> Kind<`[`G`](traverse.html#G)`, `[`B`](traverse.html#B)`>): Kind<`[`G`](traverse.html#G)`, Option<`[`B`](traverse.html#B)`>>`
`fun <A, B, G> TryOf<`[`A`](traverse.html#A)`>.traverse(GA: Applicative<`[`G`](traverse.html#G)`>, f: (`[`A`](traverse.html#A)`) -> Kind<`[`G`](traverse.html#G)`, `[`B`](traverse.html#B)`>): Kind<`[`G`](traverse.html#G)`, Try<`[`B`](traverse.html#B)`>>`
`fun <F, G, A, B> Tuple2Of<`[`F`](traverse.html#F)`, `[`A`](traverse.html#A)`>.traverse(GA: Applicative<`[`G`](traverse.html#G)`>, f: (`[`A`](traverse.html#A)`) -> Kind<`[`G`](traverse.html#G)`, `[`B`](traverse.html#B)`>): Kind<`[`G`](traverse.html#G)`, Tuple2<`[`F`](traverse.html#F)`, `[`B`](traverse.html#B)`>>`