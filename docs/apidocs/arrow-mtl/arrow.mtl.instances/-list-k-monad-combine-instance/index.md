---
title: ListKMonadCombineInstance - arrow-mtl
---

[arrow-mtl](../../index.html) / [arrow.mtl.instances](../index.html) / [ListKMonadCombineInstance](./index.html)

# ListKMonadCombineInstance

`@extension interface ListKMonadCombineInstance : `[`MonadCombine`](../../arrow.mtl.typeclasses/-monad-combine/index.html)`<ForListK>`

### Functions

| [ap](ap.html) | `open fun <A, B> Kind<ForListK, `[`A`](ap.html#A)`>.ap(ff: Kind<ForListK, (`[`A`](ap.html#A)`) -> `[`B`](ap.html#B)`>): ListK<`[`B`](ap.html#B)`>` |
| [combineK](combine-k.html) | `open fun <A> Kind<ForListK, `[`A`](combine-k.html#A)`>.combineK(y: Kind<ForListK, `[`A`](combine-k.html#A)`>): ListK<`[`A`](combine-k.html#A)`>` |
| [empty](empty.html) | `open fun <A> empty(): ListK<`[`A`](empty.html#A)`>` |
| [flatMap](flat-map.html) | `open fun <A, B> Kind<ForListK, `[`A`](flat-map.html#A)`>.flatMap(f: (`[`A`](flat-map.html#A)`) -> Kind<ForListK, `[`B`](flat-map.html#B)`>): ListK<`[`B`](flat-map.html#B)`>` |
| [just](just.html) | `open fun <A> just(a: `[`A`](just.html#A)`): ListK<`[`A`](just.html#A)`>` |
| [map](map.html) | `open fun <A, B> Kind<ForListK, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): ListK<`[`B`](map.html#B)`>` |
| [map2](map2.html) | `open fun <A, B, Z> Kind<ForListK, `[`A`](map2.html#A)`>.map2(fb: Kind<ForListK, `[`B`](map2.html#B)`>, f: (Tuple2<`[`A`](map2.html#A)`, `[`B`](map2.html#B)`>) -> `[`Z`](map2.html#Z)`): ListK<`[`Z`](map2.html#Z)`>` |
| [mapFilter](map-filter.html) | `open fun <A, B> Kind<ForListK, `[`A`](map-filter.html#A)`>.mapFilter(f: (`[`A`](map-filter.html#A)`) -> Option<`[`B`](map-filter.html#B)`>): ListK<`[`B`](map-filter.html#B)`>`<br>A combined map and filter. Filtering is handled via Option instead of Boolean such that the output type B can be different than the input type A. |
| [tailRecM](tail-rec-m.html) | `open fun <A, B> tailRecM(a: `[`A`](tail-rec-m.html#A)`, f: (`[`A`](tail-rec-m.html#A)`) -> ListKOf<Either<`[`A`](tail-rec-m.html#A)`, `[`B`](tail-rec-m.html#B)`>>): ListK<`[`B`](tail-rec-m.html#B)`>` |

### Inherited Functions

| [separate](../../arrow.mtl.typeclasses/-monad-combine/separate.html) | `open fun <G, A, B> Kind<`[`F`](../../arrow.mtl.typeclasses/-monad-combine/index.html#F)`, Kind2<`[`G`](../../arrow.mtl.typeclasses/-monad-combine/separate.html#G)`, `[`A`](../../arrow.mtl.typeclasses/-monad-combine/separate.html#A)`, `[`B`](../../arrow.mtl.typeclasses/-monad-combine/separate.html#B)`>>.separate(BFG: Bifoldable<`[`G`](../../arrow.mtl.typeclasses/-monad-combine/separate.html#G)`>): Tuple2<Kind<`[`F`](../../arrow.mtl.typeclasses/-monad-combine/index.html#F)`, `[`A`](../../arrow.mtl.typeclasses/-monad-combine/separate.html#A)`>, Kind<`[`F`](../../arrow.mtl.typeclasses/-monad-combine/index.html#F)`, `[`B`](../../arrow.mtl.typeclasses/-monad-combine/separate.html#B)`>>` |
| [unite](../../arrow.mtl.typeclasses/-monad-combine/unite.html) | `open fun <G, A> Kind<`[`F`](../../arrow.mtl.typeclasses/-monad-combine/index.html#F)`, Kind<`[`G`](../../arrow.mtl.typeclasses/-monad-combine/unite.html#G)`, `[`A`](../../arrow.mtl.typeclasses/-monad-combine/unite.html#A)`>>.unite(FG: Foldable<`[`G`](../../arrow.mtl.typeclasses/-monad-combine/unite.html#G)`>): Kind<`[`F`](../../arrow.mtl.typeclasses/-monad-combine/index.html#F)`, `[`A`](../../arrow.mtl.typeclasses/-monad-combine/unite.html#A)`>` |

### Inheritors

| [ListKMtlContext](../-list-k-mtl-context/index.html) | `object ListKMtlContext : `[`ListKMonadCombineInstance`](./index.html)`, ListKTraverseInstance, ListKMonoidKInstance` |

