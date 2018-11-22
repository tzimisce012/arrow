---
title: SequenceKMonadInstance - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [SequenceKMonadInstance](./index.html)

# SequenceKMonadInstance

`@extension interface SequenceKMonadInstance : Monad<ForSequenceK>`

### Functions

| [ap](ap.html) | `open fun <A, B> Kind<ForSequenceK, `[`A`](ap.html#A)`>.ap(ff: Kind<ForSequenceK, (`[`A`](ap.html#A)`) -> `[`B`](ap.html#B)`>): SequenceK<`[`B`](ap.html#B)`>` |
| [flatMap](flat-map.html) | `open fun <A, B> Kind<ForSequenceK, `[`A`](flat-map.html#A)`>.flatMap(f: (`[`A`](flat-map.html#A)`) -> Kind<ForSequenceK, `[`B`](flat-map.html#B)`>): SequenceK<`[`B`](flat-map.html#B)`>` |
| [just](just.html) | `open fun <A> just(a: `[`A`](just.html#A)`): SequenceK<`[`A`](just.html#A)`>` |
| [map](map.html) | `open fun <A, B> Kind<ForSequenceK, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): SequenceK<`[`B`](map.html#B)`>` |
| [map2](map2.html) | `open fun <A, B, Z> Kind<ForSequenceK, `[`A`](map2.html#A)`>.map2(fb: Kind<ForSequenceK, `[`B`](map2.html#B)`>, f: (Tuple2<`[`A`](map2.html#A)`, `[`B`](map2.html#B)`>) -> `[`Z`](map2.html#Z)`): SequenceK<`[`Z`](map2.html#Z)`>` |
| [tailRecM](tail-rec-m.html) | `open fun <A, B> tailRecM(a: `[`A`](tail-rec-m.html#A)`, f: (`[`A`](tail-rec-m.html#A)`) -> SequenceKOf<Either<`[`A`](tail-rec-m.html#A)`, `[`B`](tail-rec-m.html#B)`>>): SequenceK<`[`B`](tail-rec-m.html#B)`>` |

### Inheritors

| [SequenceKContext](../-sequence-k-context/index.html) | `object SequenceKContext : `[`SequenceKMonadInstance`](./index.html)`, `[`SequenceKTraverseInstance`](../-sequence-k-traverse-instance/index.html)`, `[`SequenceKMonoidKInstance`](../-sequence-k-monoid-k-instance/index.html) |

