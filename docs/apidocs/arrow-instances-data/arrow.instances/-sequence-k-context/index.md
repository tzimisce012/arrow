---
title: SequenceKContext - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [SequenceKContext](./index.html)

# SequenceKContext

`object SequenceKContext : `[`SequenceKMonadInstance`](../-sequence-k-monad-instance/index.html)`, `[`SequenceKTraverseInstance`](../-sequence-k-traverse-instance/index.html)`, `[`SequenceKMonoidKInstance`](../-sequence-k-monoid-k-instance/index.html)

### Functions

| [map](map.html) | `fun <A, B> Kind<ForSequenceK, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): SequenceK<`[`B`](map.html#B)`>` |

### Inherited Functions

| [ap](../-sequence-k-monad-instance/ap.html) | `open fun <A, B> Kind<ForSequenceK, `[`A`](../-sequence-k-monad-instance/ap.html#A)`>.ap(ff: Kind<ForSequenceK, (`[`A`](../-sequence-k-monad-instance/ap.html#A)`) -> `[`B`](../-sequence-k-monad-instance/ap.html#B)`>): SequenceK<`[`B`](../-sequence-k-monad-instance/ap.html#B)`>` |
| [combineK](../-sequence-k-monoid-k-instance/combine-k.html) | `open fun <A> Kind<ForSequenceK, `[`A`](../-sequence-k-monoid-k-instance/combine-k.html#A)`>.combineK(y: Kind<ForSequenceK, `[`A`](../-sequence-k-monoid-k-instance/combine-k.html#A)`>): SequenceK<`[`A`](../-sequence-k-monoid-k-instance/combine-k.html#A)`>` |
| [empty](../-sequence-k-monoid-k-instance/empty.html) | `open fun <A> empty(): SequenceK<`[`A`](../-sequence-k-monoid-k-instance/empty.html#A)`>` |
| [flatMap](../-sequence-k-monad-instance/flat-map.html) | `open fun <A, B> Kind<ForSequenceK, `[`A`](../-sequence-k-monad-instance/flat-map.html#A)`>.flatMap(f: (`[`A`](../-sequence-k-monad-instance/flat-map.html#A)`) -> Kind<ForSequenceK, `[`B`](../-sequence-k-monad-instance/flat-map.html#B)`>): SequenceK<`[`B`](../-sequence-k-monad-instance/flat-map.html#B)`>` |
| [foldLeft](../-sequence-k-traverse-instance/fold-left.html) | `open fun <A, B> Kind<ForSequenceK, `[`A`](../-sequence-k-traverse-instance/fold-left.html#A)`>.foldLeft(b: `[`B`](../-sequence-k-traverse-instance/fold-left.html#B)`, f: (`[`B`](../-sequence-k-traverse-instance/fold-left.html#B)`, `[`A`](../-sequence-k-traverse-instance/fold-left.html#A)`) -> `[`B`](../-sequence-k-traverse-instance/fold-left.html#B)`): `[`B`](../-sequence-k-traverse-instance/fold-left.html#B) |
| [foldRight](../-sequence-k-traverse-instance/fold-right.html) | `open fun <A, B> Kind<ForSequenceK, `[`A`](../-sequence-k-traverse-instance/fold-right.html#A)`>.foldRight(lb: Eval<`[`B`](../-sequence-k-traverse-instance/fold-right.html#B)`>, f: (`[`A`](../-sequence-k-traverse-instance/fold-right.html#A)`, Eval<`[`B`](../-sequence-k-traverse-instance/fold-right.html#B)`>) -> Eval<`[`B`](../-sequence-k-traverse-instance/fold-right.html#B)`>): Eval<`[`B`](../-sequence-k-traverse-instance/fold-right.html#B)`>` |
| [just](../-sequence-k-monad-instance/just.html) | `open fun <A> just(a: `[`A`](../-sequence-k-monad-instance/just.html#A)`): SequenceK<`[`A`](../-sequence-k-monad-instance/just.html#A)`>` |
| [map2](../-sequence-k-monad-instance/map2.html) | `open fun <A, B, Z> Kind<ForSequenceK, `[`A`](../-sequence-k-monad-instance/map2.html#A)`>.map2(fb: Kind<ForSequenceK, `[`B`](../-sequence-k-monad-instance/map2.html#B)`>, f: (Tuple2<`[`A`](../-sequence-k-monad-instance/map2.html#A)`, `[`B`](../-sequence-k-monad-instance/map2.html#B)`>) -> `[`Z`](../-sequence-k-monad-instance/map2.html#Z)`): SequenceK<`[`Z`](../-sequence-k-monad-instance/map2.html#Z)`>` |
| [tailRecM](../-sequence-k-monad-instance/tail-rec-m.html) | `open fun <A, B> tailRecM(a: `[`A`](../-sequence-k-monad-instance/tail-rec-m.html#A)`, f: (`[`A`](../-sequence-k-monad-instance/tail-rec-m.html#A)`) -> SequenceKOf<Either<`[`A`](../-sequence-k-monad-instance/tail-rec-m.html#A)`, `[`B`](../-sequence-k-monad-instance/tail-rec-m.html#B)`>>): SequenceK<`[`B`](../-sequence-k-monad-instance/tail-rec-m.html#B)`>` |
| [traverse](../-sequence-k-traverse-instance/traverse.html) | `open fun <G, A, B> Kind<ForSequenceK, `[`A`](../-sequence-k-traverse-instance/traverse.html#A)`>.traverse(AP: Applicative<`[`G`](../-sequence-k-traverse-instance/traverse.html#G)`>, f: (`[`A`](../-sequence-k-traverse-instance/traverse.html#A)`) -> Kind<`[`G`](../-sequence-k-traverse-instance/traverse.html#G)`, `[`B`](../-sequence-k-traverse-instance/traverse.html#B)`>): Kind<`[`G`](../-sequence-k-traverse-instance/traverse.html#G)`, SequenceK<`[`B`](../-sequence-k-traverse-instance/traverse.html#B)`>>` |

