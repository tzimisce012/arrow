---
title: ListKMonadInstance - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [ListKMonadInstance](./index.html)

# ListKMonadInstance

`@extension interface ListKMonadInstance : Monad<ForListK>`

### Functions

| [ap](ap.html) | `open fun <A, B> Kind<ForListK, `[`A`](ap.html#A)`>.ap(ff: Kind<ForListK, (`[`A`](ap.html#A)`) -> `[`B`](ap.html#B)`>): ListK<`[`B`](ap.html#B)`>` |
| [flatMap](flat-map.html) | `open fun <A, B> Kind<ForListK, `[`A`](flat-map.html#A)`>.flatMap(f: (`[`A`](flat-map.html#A)`) -> Kind<ForListK, `[`B`](flat-map.html#B)`>): ListK<`[`B`](flat-map.html#B)`>` |
| [just](just.html) | `open fun <A> just(a: `[`A`](just.html#A)`): ListK<`[`A`](just.html#A)`>` |
| [map](map.html) | `open fun <A, B> Kind<ForListK, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): ListK<`[`B`](map.html#B)`>` |
| [map2](map2.html) | `open fun <A, B, Z> Kind<ForListK, `[`A`](map2.html#A)`>.map2(fb: Kind<ForListK, `[`B`](map2.html#B)`>, f: (Tuple2<`[`A`](map2.html#A)`, `[`B`](map2.html#B)`>) -> `[`Z`](map2.html#Z)`): ListK<`[`Z`](map2.html#Z)`>` |
| [tailRecM](tail-rec-m.html) | `open fun <A, B> tailRecM(a: `[`A`](tail-rec-m.html#A)`, f: (`[`A`](tail-rec-m.html#A)`) -> ListKOf<Either<`[`A`](tail-rec-m.html#A)`, `[`B`](tail-rec-m.html#B)`>>): ListK<`[`B`](tail-rec-m.html#B)`>` |

### Inheritors

| [ListKContext](../-list-k-context/index.html) | `object ListKContext : `[`ListKMonadInstance`](./index.html)`, `[`ListKTraverseInstance`](../-list-k-traverse-instance/index.html)`, `[`ListKMonoidKInstance`](../-list-k-monoid-k-instance/index.html) |

