---
title: FreeCApplicative - arrow-streams
---

[arrow-streams](../../index.html) / [arrow.streams.internal](../index.html) / [FreeCApplicative](./index.html)

# FreeCApplicative

`@extension interface FreeCApplicative<F> : Applicative<`[`FreeCPartialOf`](../-free-c-partial-of.html)`<`[`F`](index.html#F)`>>`

### Functions

| [ap](ap.html) | `open fun <A, B> Kind<`[`FreeCPartialOf`](../-free-c-partial-of.html)`<`[`F`](index.html#F)`>, `[`A`](ap.html#A)`>.ap(ff: Kind<`[`FreeCPartialOf`](../-free-c-partial-of.html)`<`[`F`](index.html#F)`>, (`[`A`](ap.html#A)`) -> `[`B`](ap.html#B)`>): Kind<`[`FreeCPartialOf`](../-free-c-partial-of.html)`<`[`F`](index.html#F)`>, `[`B`](ap.html#B)`>` |
| [just](just.html) | `open fun <A> just(a: `[`A`](just.html#A)`): Kind<`[`FreeCPartialOf`](../-free-c-partial-of.html)`<`[`F`](index.html#F)`>, `[`A`](just.html#A)`>` |

