---
title: IdContext - arrow-instances-core
---

[arrow-instances-core](../../index.html) / [arrow.instances](../index.html) / [IdContext](./index.html)

# IdContext

`object IdContext : `[`IdBimonadInstance`](../-id-bimonad-instance/index.html)`, `[`IdTraverseInstance`](../-id-traverse-instance/index.html)

### Functions

| [map](map.html) | `fun <A, B> Kind<ForId, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): Id<`[`B`](map.html#B)`>` |

### Inherited Functions

| [ap](../-id-bimonad-instance/ap.html) | `open fun <A, B> Kind<ForId, `[`A`](../-id-bimonad-instance/ap.html#A)`>.ap(ff: Kind<ForId, (`[`A`](../-id-bimonad-instance/ap.html#A)`) -> `[`B`](../-id-bimonad-instance/ap.html#B)`>): Id<`[`B`](../-id-bimonad-instance/ap.html#B)`>` |
| [coflatMap](../-id-bimonad-instance/coflat-map.html) | `open fun <A, B> Kind<ForId, `[`A`](../-id-bimonad-instance/coflat-map.html#A)`>.coflatMap(f: (Kind<ForId, `[`A`](../-id-bimonad-instance/coflat-map.html#A)`>) -> `[`B`](../-id-bimonad-instance/coflat-map.html#B)`): Id<`[`B`](../-id-bimonad-instance/coflat-map.html#B)`>` |
| [extract](../-id-bimonad-instance/extract.html) | `open fun <A> Kind<ForId, `[`A`](../-id-bimonad-instance/extract.html#A)`>.extract(): `[`A`](../-id-bimonad-instance/extract.html#A) |
| [flatMap](../-id-bimonad-instance/flat-map.html) | `open fun <A, B> Kind<ForId, `[`A`](../-id-bimonad-instance/flat-map.html#A)`>.flatMap(f: (`[`A`](../-id-bimonad-instance/flat-map.html#A)`) -> Kind<ForId, `[`B`](../-id-bimonad-instance/flat-map.html#B)`>): Id<`[`B`](../-id-bimonad-instance/flat-map.html#B)`>` |
| [foldLeft](../-id-traverse-instance/fold-left.html) | `open fun <A, B> Kind<ForId, `[`A`](../-id-traverse-instance/fold-left.html#A)`>.foldLeft(b: `[`B`](../-id-traverse-instance/fold-left.html#B)`, f: (`[`B`](../-id-traverse-instance/fold-left.html#B)`, `[`A`](../-id-traverse-instance/fold-left.html#A)`) -> `[`B`](../-id-traverse-instance/fold-left.html#B)`): `[`B`](../-id-traverse-instance/fold-left.html#B) |
| [foldRight](../-id-traverse-instance/fold-right.html) | `open fun <A, B> Kind<ForId, `[`A`](../-id-traverse-instance/fold-right.html#A)`>.foldRight(lb: Eval<`[`B`](../-id-traverse-instance/fold-right.html#B)`>, f: (`[`A`](../-id-traverse-instance/fold-right.html#A)`, Eval<`[`B`](../-id-traverse-instance/fold-right.html#B)`>) -> Eval<`[`B`](../-id-traverse-instance/fold-right.html#B)`>): Eval<`[`B`](../-id-traverse-instance/fold-right.html#B)`>` |
| [just](../-id-bimonad-instance/just.html) | `open fun <A> just(a: `[`A`](../-id-bimonad-instance/just.html#A)`): Id<`[`A`](../-id-bimonad-instance/just.html#A)`>` |
| [tailRecM](../-id-bimonad-instance/tail-rec-m.html) | `open fun <A, B> tailRecM(a: `[`A`](../-id-bimonad-instance/tail-rec-m.html#A)`, f: (`[`A`](../-id-bimonad-instance/tail-rec-m.html#A)`) -> IdOf<Either<`[`A`](../-id-bimonad-instance/tail-rec-m.html#A)`, `[`B`](../-id-bimonad-instance/tail-rec-m.html#B)`>>): Id<`[`B`](../-id-bimonad-instance/tail-rec-m.html#B)`>` |
| [traverse](../-id-traverse-instance/traverse.html) | `open fun <G, A, B> Kind<ForId, `[`A`](../-id-traverse-instance/traverse.html#A)`>.traverse(AP: Applicative<`[`G`](../-id-traverse-instance/traverse.html#G)`>, f: (`[`A`](../-id-traverse-instance/traverse.html#A)`) -> Kind<`[`G`](../-id-traverse-instance/traverse.html#G)`, `[`B`](../-id-traverse-instance/traverse.html#B)`>): Kind<`[`G`](../-id-traverse-instance/traverse.html#G)`, Id<`[`B`](../-id-traverse-instance/traverse.html#B)`>>` |

