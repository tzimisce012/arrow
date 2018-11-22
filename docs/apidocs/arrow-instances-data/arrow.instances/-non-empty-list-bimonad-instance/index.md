---
title: NonEmptyListBimonadInstance - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [NonEmptyListBimonadInstance](./index.html)

# NonEmptyListBimonadInstance

`@extension interface NonEmptyListBimonadInstance : Bimonad<ForNonEmptyList>`

### Functions

| [ap](ap.html) | `open fun <A, B> Kind<ForNonEmptyList, `[`A`](ap.html#A)`>.ap(ff: Kind<ForNonEmptyList, (`[`A`](ap.html#A)`) -> `[`B`](ap.html#B)`>): NonEmptyList<`[`B`](ap.html#B)`>` |
| [coflatMap](coflat-map.html) | `open fun <A, B> Kind<ForNonEmptyList, `[`A`](coflat-map.html#A)`>.coflatMap(f: (Kind<ForNonEmptyList, `[`A`](coflat-map.html#A)`>) -> `[`B`](coflat-map.html#B)`): NonEmptyList<`[`B`](coflat-map.html#B)`>` |
| [extract](extract.html) | `open fun <A> Kind<ForNonEmptyList, `[`A`](extract.html#A)`>.extract(): `[`A`](extract.html#A) |
| [flatMap](flat-map.html) | `open fun <A, B> Kind<ForNonEmptyList, `[`A`](flat-map.html#A)`>.flatMap(f: (`[`A`](flat-map.html#A)`) -> Kind<ForNonEmptyList, `[`B`](flat-map.html#B)`>): NonEmptyList<`[`B`](flat-map.html#B)`>` |
| [just](just.html) | `open fun <A> just(a: `[`A`](just.html#A)`): NonEmptyList<`[`A`](just.html#A)`>` |
| [map](map.html) | `open fun <A, B> Kind<ForNonEmptyList, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): NonEmptyList<`[`B`](map.html#B)`>` |
| [tailRecM](tail-rec-m.html) | `open fun <A, B> tailRecM(a: `[`A`](tail-rec-m.html#A)`, f: (`[`A`](tail-rec-m.html#A)`) -> NonEmptyListOf<Either<`[`A`](tail-rec-m.html#A)`, `[`B`](tail-rec-m.html#B)`>>): NonEmptyList<`[`B`](tail-rec-m.html#B)`>` |

### Inheritors

| [NonEmptyListContext](../-non-empty-list-context/index.html) | `object NonEmptyListContext : `[`NonEmptyListBimonadInstance`](./index.html)`, `[`NonEmptyListTraverseInstance`](../-non-empty-list-traverse-instance/index.html)`, `[`NonEmptyListSemigroupKInstance`](../-non-empty-list-semigroup-k-instance/index.html) |

