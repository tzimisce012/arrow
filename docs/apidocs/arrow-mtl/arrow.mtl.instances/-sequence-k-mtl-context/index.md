---
title: SequenceKMtlContext - arrow-mtl
---

[arrow-mtl](../../index.html) / [arrow.mtl.instances](../index.html) / [SequenceKMtlContext](./index.html)

# SequenceKMtlContext

`object SequenceKMtlContext : `[`SequenceKMonadCombineInstance`](../-sequence-k-monad-combine-instance/index.html)`, SequenceKTraverseInstance, SequenceKMonoidKInstance`

### Functions

| [combineK](combine-k.html) | `fun <A> Kind<ForSequenceK, `[`A`](combine-k.html#A)`>.combineK(y: Kind<ForSequenceK, `[`A`](combine-k.html#A)`>): SequenceK<`[`A`](combine-k.html#A)`>` |
| [empty](empty.html) | `fun <A> empty(): SequenceK<`[`A`](empty.html#A)`>` |
| [map](map.html) | `fun <A, B> Kind<ForSequenceK, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): SequenceK<`[`B`](map.html#B)`>` |

### Inherited Functions

| [ap](../-sequence-k-monad-combine-instance/ap.html) | `open fun <A, B> Kind<ForSequenceK, `[`A`](../-sequence-k-monad-combine-instance/ap.html#A)`>.ap(ff: Kind<ForSequenceK, (`[`A`](../-sequence-k-monad-combine-instance/ap.html#A)`) -> `[`B`](../-sequence-k-monad-combine-instance/ap.html#B)`>): SequenceK<`[`B`](../-sequence-k-monad-combine-instance/ap.html#B)`>` |
| [flatMap](../-sequence-k-monad-combine-instance/flat-map.html) | `open fun <A, B> Kind<ForSequenceK, `[`A`](../-sequence-k-monad-combine-instance/flat-map.html#A)`>.flatMap(f: (`[`A`](../-sequence-k-monad-combine-instance/flat-map.html#A)`) -> Kind<ForSequenceK, `[`B`](../-sequence-k-monad-combine-instance/flat-map.html#B)`>): SequenceK<`[`B`](../-sequence-k-monad-combine-instance/flat-map.html#B)`>` |
| [just](../-sequence-k-monad-combine-instance/just.html) | `open fun <A> just(a: `[`A`](../-sequence-k-monad-combine-instance/just.html#A)`): SequenceK<`[`A`](../-sequence-k-monad-combine-instance/just.html#A)`>` |
| [map2](../-sequence-k-monad-combine-instance/map2.html) | `open fun <A, B, Z> Kind<ForSequenceK, `[`A`](../-sequence-k-monad-combine-instance/map2.html#A)`>.map2(fb: Kind<ForSequenceK, `[`B`](../-sequence-k-monad-combine-instance/map2.html#B)`>, f: (Tuple2<`[`A`](../-sequence-k-monad-combine-instance/map2.html#A)`, `[`B`](../-sequence-k-monad-combine-instance/map2.html#B)`>) -> `[`Z`](../-sequence-k-monad-combine-instance/map2.html#Z)`): SequenceK<`[`Z`](../-sequence-k-monad-combine-instance/map2.html#Z)`>` |
| [mapFilter](../-sequence-k-monad-combine-instance/map-filter.html) | `open fun <A, B> Kind<ForSequenceK, `[`A`](../-sequence-k-monad-combine-instance/map-filter.html#A)`>.mapFilter(f: (`[`A`](../-sequence-k-monad-combine-instance/map-filter.html#A)`) -> Option<`[`B`](../-sequence-k-monad-combine-instance/map-filter.html#B)`>): SequenceK<`[`B`](../-sequence-k-monad-combine-instance/map-filter.html#B)`>`<br>A combined map and filter. Filtering is handled via Option instead of Boolean such that the output type B can be different than the input type A. |
| [tailRecM](../-sequence-k-monad-combine-instance/tail-rec-m.html) | `open fun <A, B> tailRecM(a: `[`A`](../-sequence-k-monad-combine-instance/tail-rec-m.html#A)`, f: (`[`A`](../-sequence-k-monad-combine-instance/tail-rec-m.html#A)`) -> SequenceKOf<Either<`[`A`](../-sequence-k-monad-combine-instance/tail-rec-m.html#A)`, `[`B`](../-sequence-k-monad-combine-instance/tail-rec-m.html#B)`>>): SequenceK<`[`B`](../-sequence-k-monad-combine-instance/tail-rec-m.html#B)`>` |

