---
title: IdBimonadInstance - arrow-instances-core
---

[arrow-instances-core](../../index.html) / [arrow.instances](../index.html) / [IdBimonadInstance](./index.html)

# IdBimonadInstance

`@extension interface IdBimonadInstance : Bimonad<ForId>`

### Functions

| [ap](ap.html) | `open fun <A, B> Kind<ForId, `[`A`](ap.html#A)`>.ap(ff: Kind<ForId, (`[`A`](ap.html#A)`) -> `[`B`](ap.html#B)`>): Id<`[`B`](ap.html#B)`>` |
| [coflatMap](coflat-map.html) | `open fun <A, B> Kind<ForId, `[`A`](coflat-map.html#A)`>.coflatMap(f: (Kind<ForId, `[`A`](coflat-map.html#A)`>) -> `[`B`](coflat-map.html#B)`): Id<`[`B`](coflat-map.html#B)`>` |
| [extract](extract.html) | `open fun <A> Kind<ForId, `[`A`](extract.html#A)`>.extract(): `[`A`](extract.html#A) |
| [flatMap](flat-map.html) | `open fun <A, B> Kind<ForId, `[`A`](flat-map.html#A)`>.flatMap(f: (`[`A`](flat-map.html#A)`) -> Kind<ForId, `[`B`](flat-map.html#B)`>): Id<`[`B`](flat-map.html#B)`>` |
| [just](just.html) | `open fun <A> just(a: `[`A`](just.html#A)`): Id<`[`A`](just.html#A)`>` |
| [map](map.html) | `open fun <A, B> Kind<ForId, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): Id<`[`B`](map.html#B)`>` |
| [tailRecM](tail-rec-m.html) | `open fun <A, B> tailRecM(a: `[`A`](tail-rec-m.html#A)`, f: (`[`A`](tail-rec-m.html#A)`) -> IdOf<Either<`[`A`](tail-rec-m.html#A)`, `[`B`](tail-rec-m.html#B)`>>): Id<`[`B`](tail-rec-m.html#B)`>` |

### Inheritors

| [IdContext](../-id-context/index.html) | `object IdContext : `[`IdBimonadInstance`](./index.html)`, `[`IdTraverseInstance`](../-id-traverse-instance/index.html) |

