---
title: ListKMtlContext - arrow-mtl
---

[arrow-mtl](../../index.html) / [arrow.mtl.instances](../index.html) / [ListKMtlContext](./index.html)

# ListKMtlContext

`object ListKMtlContext : `[`ListKMonadCombineInstance`](../-list-k-monad-combine-instance/index.html)`, ListKTraverseInstance, ListKMonoidKInstance`

### Functions

| [combineK](combine-k.html) | `fun <A> Kind<ForListK, `[`A`](combine-k.html#A)`>.combineK(y: Kind<ForListK, `[`A`](combine-k.html#A)`>): ListK<`[`A`](combine-k.html#A)`>` |
| [empty](empty.html) | `fun <A> empty(): ListK<`[`A`](empty.html#A)`>` |
| [map](map.html) | `fun <A, B> Kind<ForListK, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): ListK<`[`B`](map.html#B)`>` |

### Inherited Functions

| [ap](../-list-k-monad-combine-instance/ap.html) | `open fun <A, B> Kind<ForListK, `[`A`](../-list-k-monad-combine-instance/ap.html#A)`>.ap(ff: Kind<ForListK, (`[`A`](../-list-k-monad-combine-instance/ap.html#A)`) -> `[`B`](../-list-k-monad-combine-instance/ap.html#B)`>): ListK<`[`B`](../-list-k-monad-combine-instance/ap.html#B)`>` |
| [flatMap](../-list-k-monad-combine-instance/flat-map.html) | `open fun <A, B> Kind<ForListK, `[`A`](../-list-k-monad-combine-instance/flat-map.html#A)`>.flatMap(f: (`[`A`](../-list-k-monad-combine-instance/flat-map.html#A)`) -> Kind<ForListK, `[`B`](../-list-k-monad-combine-instance/flat-map.html#B)`>): ListK<`[`B`](../-list-k-monad-combine-instance/flat-map.html#B)`>` |
| [just](../-list-k-monad-combine-instance/just.html) | `open fun <A> just(a: `[`A`](../-list-k-monad-combine-instance/just.html#A)`): ListK<`[`A`](../-list-k-monad-combine-instance/just.html#A)`>` |
| [map2](../-list-k-monad-combine-instance/map2.html) | `open fun <A, B, Z> Kind<ForListK, `[`A`](../-list-k-monad-combine-instance/map2.html#A)`>.map2(fb: Kind<ForListK, `[`B`](../-list-k-monad-combine-instance/map2.html#B)`>, f: (Tuple2<`[`A`](../-list-k-monad-combine-instance/map2.html#A)`, `[`B`](../-list-k-monad-combine-instance/map2.html#B)`>) -> `[`Z`](../-list-k-monad-combine-instance/map2.html#Z)`): ListK<`[`Z`](../-list-k-monad-combine-instance/map2.html#Z)`>` |
| [mapFilter](../-list-k-monad-combine-instance/map-filter.html) | `open fun <A, B> Kind<ForListK, `[`A`](../-list-k-monad-combine-instance/map-filter.html#A)`>.mapFilter(f: (`[`A`](../-list-k-monad-combine-instance/map-filter.html#A)`) -> Option<`[`B`](../-list-k-monad-combine-instance/map-filter.html#B)`>): ListK<`[`B`](../-list-k-monad-combine-instance/map-filter.html#B)`>`<br>A combined map and filter. Filtering is handled via Option instead of Boolean such that the output type B can be different than the input type A. |
| [tailRecM](../-list-k-monad-combine-instance/tail-rec-m.html) | `open fun <A, B> tailRecM(a: `[`A`](../-list-k-monad-combine-instance/tail-rec-m.html#A)`, f: (`[`A`](../-list-k-monad-combine-instance/tail-rec-m.html#A)`) -> ListKOf<Either<`[`A`](../-list-k-monad-combine-instance/tail-rec-m.html#A)`, `[`B`](../-list-k-monad-combine-instance/tail-rec-m.html#B)`>>): ListK<`[`B`](../-list-k-monad-combine-instance/tail-rec-m.html#B)`>` |

