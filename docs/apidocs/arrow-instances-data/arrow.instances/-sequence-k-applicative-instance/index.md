---
title: SequenceKApplicativeInstance - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [SequenceKApplicativeInstance](./index.html)

# SequenceKApplicativeInstance

`@extension interface SequenceKApplicativeInstance : Applicative<ForSequenceK>`

### Functions

| [ap](ap.html) | `open fun <A, B> Kind<ForSequenceK, `[`A`](ap.html#A)`>.ap(ff: Kind<ForSequenceK, (`[`A`](ap.html#A)`) -> `[`B`](ap.html#B)`>): SequenceK<`[`B`](ap.html#B)`>` |
| [just](just.html) | `open fun <A> just(a: `[`A`](just.html#A)`): SequenceK<`[`A`](just.html#A)`>` |
| [map](map.html) | `open fun <A, B> Kind<ForSequenceK, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): SequenceK<`[`B`](map.html#B)`>` |
| [map2](map2.html) | `open fun <A, B, Z> Kind<ForSequenceK, `[`A`](map2.html#A)`>.map2(fb: Kind<ForSequenceK, `[`B`](map2.html#B)`>, f: (Tuple2<`[`A`](map2.html#A)`, `[`B`](map2.html#B)`>) -> `[`Z`](map2.html#Z)`): SequenceK<`[`Z`](map2.html#Z)`>` |

