---
title: arrow.mtl.instances.statet.monadCombine.arrow.Kind - arrow-mtl
---

[arrow-mtl](../../index.html) / [arrow.mtl.instances.statet.monadCombine](../index.html) / [arrow.Kind](./index.html)

### Extensions for arrow.Kind

| [separate](separate.html) | `fun <F, S, G, A, B> Kind<Kind<Kind<ForStateT, `[`F`](separate.html#F)`>, `[`S`](separate.html#S)`>, Kind<Kind<`[`G`](separate.html#G)`, `[`A`](separate.html#A)`>, `[`B`](separate.html#B)`>>.separate(BFG: Bifoldable<`[`G`](separate.html#G)`>, MC: `[`MonadCombine`](../../arrow.mtl.typeclasses/-monad-combine/index.html)`<`[`F`](separate.html#F)`>): Tuple2<Kind<Kind<Kind<ForStateT, `[`F`](separate.html#F)`>, `[`S`](separate.html#S)`>, `[`A`](separate.html#A)`>, Kind<Kind<Kind<ForStateT, `[`F`](separate.html#F)`>, `[`S`](separate.html#S)`>, `[`B`](separate.html#B)`>>` |
| [unite](unite.html) | `fun <F, S, G, A> Kind<Kind<Kind<ForStateT, `[`F`](unite.html#F)`>, `[`S`](unite.html#S)`>, Kind<`[`G`](unite.html#G)`, `[`A`](unite.html#A)`>>.unite(FG: Foldable<`[`G`](unite.html#G)`>, MC: `[`MonadCombine`](../../arrow.mtl.typeclasses/-monad-combine/index.html)`<`[`F`](unite.html#F)`>): Kind<`[`S`](unite.html#S)`, `[`A`](unite.html#A)`>` |

