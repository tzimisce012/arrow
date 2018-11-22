---
title: StateTMonadCombineInstance - arrow-mtl
---

[arrow-mtl](../../index.html) / [arrow.mtl.instances](../index.html) / [StateTMonadCombineInstance](./index.html)

# StateTMonadCombineInstance

`@extension interface StateTMonadCombineInstance<F, S> : `[`MonadCombine`](../../arrow.mtl.typeclasses/-monad-combine/index.html)`<StateTPartialOf<`[`F`](index.html#F)`, `[`S`](index.html#S)`>>, StateTMonadInstance<`[`F`](index.html#F)`, `[`S`](index.html#S)`>, StateTSemigroupKInstance<`[`F`](index.html#F)`, `[`S`](index.html#S)`>`

### Functions

| [FF](-f-f.html) | `open fun FF(): Monad<`[`F`](index.html#F)`>` |
| [MC](-m-c.html) | `abstract fun MC(): `[`MonadCombine`](../../arrow.mtl.typeclasses/-monad-combine/index.html)`<`[`F`](index.html#F)`>` |
| [MF](-m-f.html) | `open fun MF(): Monad<`[`F`](index.html#F)`>` |
| [SS](-s-s.html) | `open fun SS(): SemigroupK<`[`F`](index.html#F)`>` |
| [empty](empty.html) | `open fun <A> empty(): Kind<StateTPartialOf<`[`F`](index.html#F)`, `[`S`](index.html#S)`>, `[`A`](empty.html#A)`>` |
| [liftT](lift-t.html) | `open fun <A> liftT(ma: Kind<`[`F`](index.html#F)`, `[`A`](lift-t.html#A)`>): StateT<`[`F`](index.html#F)`, `[`S`](index.html#S)`, `[`A`](lift-t.html#A)`>` |

### Inherited Functions

| [separate](../../arrow.mtl.typeclasses/-monad-combine/separate.html) | `open fun <G, A, B> Kind<`[`F`](../../arrow.mtl.typeclasses/-monad-combine/index.html#F)`, Kind2<`[`G`](../../arrow.mtl.typeclasses/-monad-combine/separate.html#G)`, `[`A`](../../arrow.mtl.typeclasses/-monad-combine/separate.html#A)`, `[`B`](../../arrow.mtl.typeclasses/-monad-combine/separate.html#B)`>>.separate(BFG: Bifoldable<`[`G`](../../arrow.mtl.typeclasses/-monad-combine/separate.html#G)`>): Tuple2<Kind<`[`F`](../../arrow.mtl.typeclasses/-monad-combine/index.html#F)`, `[`A`](../../arrow.mtl.typeclasses/-monad-combine/separate.html#A)`>, Kind<`[`F`](../../arrow.mtl.typeclasses/-monad-combine/index.html#F)`, `[`B`](../../arrow.mtl.typeclasses/-monad-combine/separate.html#B)`>>` |
| [unite](../../arrow.mtl.typeclasses/-monad-combine/unite.html) | `open fun <G, A> Kind<`[`F`](../../arrow.mtl.typeclasses/-monad-combine/index.html#F)`, Kind<`[`G`](../../arrow.mtl.typeclasses/-monad-combine/unite.html#G)`, `[`A`](../../arrow.mtl.typeclasses/-monad-combine/unite.html#A)`>>.unite(FG: Foldable<`[`G`](../../arrow.mtl.typeclasses/-monad-combine/unite.html#G)`>): Kind<`[`F`](../../arrow.mtl.typeclasses/-monad-combine/index.html#F)`, `[`A`](../../arrow.mtl.typeclasses/-monad-combine/unite.html#A)`>` |

