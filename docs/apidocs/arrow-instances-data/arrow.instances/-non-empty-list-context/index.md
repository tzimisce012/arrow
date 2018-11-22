---
title: NonEmptyListContext - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [NonEmptyListContext](./index.html)

# NonEmptyListContext

`object NonEmptyListContext : `[`NonEmptyListBimonadInstance`](../-non-empty-list-bimonad-instance/index.html)`, `[`NonEmptyListTraverseInstance`](../-non-empty-list-traverse-instance/index.html)`, `[`NonEmptyListSemigroupKInstance`](../-non-empty-list-semigroup-k-instance/index.html)

### Functions

| [map](map.html) | `fun <A, B> Kind<ForNonEmptyList, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): NonEmptyList<`[`B`](map.html#B)`>` |

### Inherited Functions

| [ap](../-non-empty-list-bimonad-instance/ap.html) | `open fun <A, B> Kind<ForNonEmptyList, `[`A`](../-non-empty-list-bimonad-instance/ap.html#A)`>.ap(ff: Kind<ForNonEmptyList, (`[`A`](../-non-empty-list-bimonad-instance/ap.html#A)`) -> `[`B`](../-non-empty-list-bimonad-instance/ap.html#B)`>): NonEmptyList<`[`B`](../-non-empty-list-bimonad-instance/ap.html#B)`>` |
| [coflatMap](../-non-empty-list-bimonad-instance/coflat-map.html) | `open fun <A, B> Kind<ForNonEmptyList, `[`A`](../-non-empty-list-bimonad-instance/coflat-map.html#A)`>.coflatMap(f: (Kind<ForNonEmptyList, `[`A`](../-non-empty-list-bimonad-instance/coflat-map.html#A)`>) -> `[`B`](../-non-empty-list-bimonad-instance/coflat-map.html#B)`): NonEmptyList<`[`B`](../-non-empty-list-bimonad-instance/coflat-map.html#B)`>` |
| [combineK](../-non-empty-list-semigroup-k-instance/combine-k.html) | `open fun <A> Kind<ForNonEmptyList, `[`A`](../-non-empty-list-semigroup-k-instance/combine-k.html#A)`>.combineK(y: Kind<ForNonEmptyList, `[`A`](../-non-empty-list-semigroup-k-instance/combine-k.html#A)`>): NonEmptyList<`[`A`](../-non-empty-list-semigroup-k-instance/combine-k.html#A)`>` |
| [extract](../-non-empty-list-bimonad-instance/extract.html) | `open fun <A> Kind<ForNonEmptyList, `[`A`](../-non-empty-list-bimonad-instance/extract.html#A)`>.extract(): `[`A`](../-non-empty-list-bimonad-instance/extract.html#A) |
| [flatMap](../-non-empty-list-bimonad-instance/flat-map.html) | `open fun <A, B> Kind<ForNonEmptyList, `[`A`](../-non-empty-list-bimonad-instance/flat-map.html#A)`>.flatMap(f: (`[`A`](../-non-empty-list-bimonad-instance/flat-map.html#A)`) -> Kind<ForNonEmptyList, `[`B`](../-non-empty-list-bimonad-instance/flat-map.html#B)`>): NonEmptyList<`[`B`](../-non-empty-list-bimonad-instance/flat-map.html#B)`>` |
| [foldLeft](../-non-empty-list-traverse-instance/fold-left.html) | `open fun <A, B> Kind<ForNonEmptyList, `[`A`](../-non-empty-list-traverse-instance/fold-left.html#A)`>.foldLeft(b: `[`B`](../-non-empty-list-traverse-instance/fold-left.html#B)`, f: (`[`B`](../-non-empty-list-traverse-instance/fold-left.html#B)`, `[`A`](../-non-empty-list-traverse-instance/fold-left.html#A)`) -> `[`B`](../-non-empty-list-traverse-instance/fold-left.html#B)`): `[`B`](../-non-empty-list-traverse-instance/fold-left.html#B) |
| [foldRight](../-non-empty-list-traverse-instance/fold-right.html) | `open fun <A, B> Kind<ForNonEmptyList, `[`A`](../-non-empty-list-traverse-instance/fold-right.html#A)`>.foldRight(lb: Eval<`[`B`](../-non-empty-list-traverse-instance/fold-right.html#B)`>, f: (`[`A`](../-non-empty-list-traverse-instance/fold-right.html#A)`, Eval<`[`B`](../-non-empty-list-traverse-instance/fold-right.html#B)`>) -> Eval<`[`B`](../-non-empty-list-traverse-instance/fold-right.html#B)`>): Eval<`[`B`](../-non-empty-list-traverse-instance/fold-right.html#B)`>` |
| [isEmpty](../-non-empty-list-traverse-instance/is-empty.html) | `open fun <A> Kind<ForNonEmptyList, `[`A`](../-non-empty-list-traverse-instance/is-empty.html#A)`>.isEmpty(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [just](../-non-empty-list-bimonad-instance/just.html) | `open fun <A> just(a: `[`A`](../-non-empty-list-bimonad-instance/just.html#A)`): NonEmptyList<`[`A`](../-non-empty-list-bimonad-instance/just.html#A)`>` |
| [tailRecM](../-non-empty-list-bimonad-instance/tail-rec-m.html) | `open fun <A, B> tailRecM(a: `[`A`](../-non-empty-list-bimonad-instance/tail-rec-m.html#A)`, f: (`[`A`](../-non-empty-list-bimonad-instance/tail-rec-m.html#A)`) -> NonEmptyListOf<Either<`[`A`](../-non-empty-list-bimonad-instance/tail-rec-m.html#A)`, `[`B`](../-non-empty-list-bimonad-instance/tail-rec-m.html#B)`>>): NonEmptyList<`[`B`](../-non-empty-list-bimonad-instance/tail-rec-m.html#B)`>` |
| [traverse](../-non-empty-list-traverse-instance/traverse.html) | `open fun <G, A, B> Kind<ForNonEmptyList, `[`A`](../-non-empty-list-traverse-instance/traverse.html#A)`>.traverse(AP: Applicative<`[`G`](../-non-empty-list-traverse-instance/traverse.html#G)`>, f: (`[`A`](../-non-empty-list-traverse-instance/traverse.html#A)`) -> Kind<`[`G`](../-non-empty-list-traverse-instance/traverse.html#G)`, `[`B`](../-non-empty-list-traverse-instance/traverse.html#B)`>): Kind<`[`G`](../-non-empty-list-traverse-instance/traverse.html#G)`, NonEmptyList<`[`B`](../-non-empty-list-traverse-instance/traverse.html#B)`>>` |

