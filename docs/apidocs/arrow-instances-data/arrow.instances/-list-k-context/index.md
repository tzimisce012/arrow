---
title: ListKContext - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [ListKContext](./index.html)

# ListKContext

`object ListKContext : `[`ListKMonadInstance`](../-list-k-monad-instance/index.html)`, `[`ListKTraverseInstance`](../-list-k-traverse-instance/index.html)`, `[`ListKMonoidKInstance`](../-list-k-monoid-k-instance/index.html)

### Functions

| [map](map.html) | `fun <A, B> Kind<ForListK, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): ListK<`[`B`](map.html#B)`>` |

### Inherited Functions

| [ap](../-list-k-monad-instance/ap.html) | `open fun <A, B> Kind<ForListK, `[`A`](../-list-k-monad-instance/ap.html#A)`>.ap(ff: Kind<ForListK, (`[`A`](../-list-k-monad-instance/ap.html#A)`) -> `[`B`](../-list-k-monad-instance/ap.html#B)`>): ListK<`[`B`](../-list-k-monad-instance/ap.html#B)`>` |
| [combineK](../-list-k-monoid-k-instance/combine-k.html) | `open fun <A> Kind<ForListK, `[`A`](../-list-k-monoid-k-instance/combine-k.html#A)`>.combineK(y: Kind<ForListK, `[`A`](../-list-k-monoid-k-instance/combine-k.html#A)`>): ListK<`[`A`](../-list-k-monoid-k-instance/combine-k.html#A)`>` |
| [empty](../-list-k-monoid-k-instance/empty.html) | `open fun <A> empty(): ListK<`[`A`](../-list-k-monoid-k-instance/empty.html#A)`>` |
| [flatMap](../-list-k-monad-instance/flat-map.html) | `open fun <A, B> Kind<ForListK, `[`A`](../-list-k-monad-instance/flat-map.html#A)`>.flatMap(f: (`[`A`](../-list-k-monad-instance/flat-map.html#A)`) -> Kind<ForListK, `[`B`](../-list-k-monad-instance/flat-map.html#B)`>): ListK<`[`B`](../-list-k-monad-instance/flat-map.html#B)`>` |
| [foldLeft](../-list-k-traverse-instance/fold-left.html) | `open fun <A, B> Kind<ForListK, `[`A`](../-list-k-traverse-instance/fold-left.html#A)`>.foldLeft(b: `[`B`](../-list-k-traverse-instance/fold-left.html#B)`, f: (`[`B`](../-list-k-traverse-instance/fold-left.html#B)`, `[`A`](../-list-k-traverse-instance/fold-left.html#A)`) -> `[`B`](../-list-k-traverse-instance/fold-left.html#B)`): `[`B`](../-list-k-traverse-instance/fold-left.html#B) |
| [foldRight](../-list-k-traverse-instance/fold-right.html) | `open fun <A, B> Kind<ForListK, `[`A`](../-list-k-traverse-instance/fold-right.html#A)`>.foldRight(lb: Eval<`[`B`](../-list-k-traverse-instance/fold-right.html#B)`>, f: (`[`A`](../-list-k-traverse-instance/fold-right.html#A)`, Eval<`[`B`](../-list-k-traverse-instance/fold-right.html#B)`>) -> Eval<`[`B`](../-list-k-traverse-instance/fold-right.html#B)`>): Eval<`[`B`](../-list-k-traverse-instance/fold-right.html#B)`>` |
| [isEmpty](../-list-k-traverse-instance/is-empty.html) | `open fun <A> Kind<ForListK, `[`A`](../-list-k-traverse-instance/is-empty.html#A)`>.isEmpty(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [just](../-list-k-monad-instance/just.html) | `open fun <A> just(a: `[`A`](../-list-k-monad-instance/just.html#A)`): ListK<`[`A`](../-list-k-monad-instance/just.html#A)`>` |
| [map2](../-list-k-monad-instance/map2.html) | `open fun <A, B, Z> Kind<ForListK, `[`A`](../-list-k-monad-instance/map2.html#A)`>.map2(fb: Kind<ForListK, `[`B`](../-list-k-monad-instance/map2.html#B)`>, f: (Tuple2<`[`A`](../-list-k-monad-instance/map2.html#A)`, `[`B`](../-list-k-monad-instance/map2.html#B)`>) -> `[`Z`](../-list-k-monad-instance/map2.html#Z)`): ListK<`[`Z`](../-list-k-monad-instance/map2.html#Z)`>` |
| [tailRecM](../-list-k-monad-instance/tail-rec-m.html) | `open fun <A, B> tailRecM(a: `[`A`](../-list-k-monad-instance/tail-rec-m.html#A)`, f: (`[`A`](../-list-k-monad-instance/tail-rec-m.html#A)`) -> ListKOf<Either<`[`A`](../-list-k-monad-instance/tail-rec-m.html#A)`, `[`B`](../-list-k-monad-instance/tail-rec-m.html#B)`>>): ListK<`[`B`](../-list-k-monad-instance/tail-rec-m.html#B)`>` |
| [traverse](../-list-k-traverse-instance/traverse.html) | `open fun <G, A, B> Kind<ForListK, `[`A`](../-list-k-traverse-instance/traverse.html#A)`>.traverse(AP: Applicative<`[`G`](../-list-k-traverse-instance/traverse.html#G)`>, f: (`[`A`](../-list-k-traverse-instance/traverse.html#A)`) -> Kind<`[`G`](../-list-k-traverse-instance/traverse.html#G)`, `[`B`](../-list-k-traverse-instance/traverse.html#B)`>): Kind<`[`G`](../-list-k-traverse-instance/traverse.html#G)`, ListK<`[`B`](../-list-k-traverse-instance/traverse.html#B)`>>` |

