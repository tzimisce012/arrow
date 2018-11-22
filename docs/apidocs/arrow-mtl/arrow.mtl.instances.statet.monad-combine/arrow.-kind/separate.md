---
title: separate - arrow-mtl
---

[arrow-mtl](../../index.html) / [arrow.mtl.instances.statet.monadCombine](../index.html) / [arrow.Kind](index.html) / [separate](./separate.html)

# separate

`@JvmName("separate") fun <F, S, G, A, B> Kind<Kind<Kind<ForStateT, `[`F`](separate.html#F)`>, `[`S`](separate.html#S)`>, Kind<Kind<`[`G`](separate.html#G)`, `[`A`](separate.html#A)`>, `[`B`](separate.html#B)`>>.separate(BFG: Bifoldable<`[`G`](separate.html#G)`>, MC: `[`MonadCombine`](../../arrow.mtl.typeclasses/-monad-combine/index.html)`<`[`F`](separate.html#F)`>): Tuple2<Kind<Kind<Kind<ForStateT, `[`F`](separate.html#F)`>, `[`S`](separate.html#S)`>, `[`A`](separate.html#A)`>, Kind<Kind<Kind<ForStateT, `[`F`](separate.html#F)`>, `[`S`](separate.html#S)`>, `[`B`](separate.html#B)`>>`