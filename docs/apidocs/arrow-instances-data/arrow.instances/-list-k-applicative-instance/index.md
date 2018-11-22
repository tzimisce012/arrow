---
title: ListKApplicativeInstance - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [ListKApplicativeInstance](./index.html)

# ListKApplicativeInstance

`@extension interface ListKApplicativeInstance : Applicative<ForListK>`

### Functions

| [ap](ap.html) | `open fun <A, B> Kind<ForListK, `[`A`](ap.html#A)`>.ap(ff: Kind<ForListK, (`[`A`](ap.html#A)`) -> `[`B`](ap.html#B)`>): ListK<`[`B`](ap.html#B)`>` |
| [just](just.html) | `open fun <A> just(a: `[`A`](just.html#A)`): ListK<`[`A`](just.html#A)`>` |
| [map](map.html) | `open fun <A, B> Kind<ForListK, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): ListK<`[`B`](map.html#B)`>` |
| [map2](map2.html) | `open fun <A, B, Z> Kind<ForListK, `[`A`](map2.html#A)`>.map2(fb: Kind<ForListK, `[`B`](map2.html#B)`>, f: (Tuple2<`[`A`](map2.html#A)`, `[`B`](map2.html#B)`>) -> `[`Z`](map2.html#Z)`): ListK<`[`Z`](map2.html#Z)`>` |

