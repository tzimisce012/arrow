---
title: FreeCMonad - arrow-streams
---

[arrow-streams](../../index.html) / [arrow.streams.internal](../index.html) / [FreeCMonad](./index.html)

# FreeCMonad

`@extension interface FreeCMonad<F> : Monad<`[`FreeCPartialOf`](../-free-c-partial-of.html)`<`[`F`](index.html#F)`>>`

### Functions

| [flatMap](flat-map.html) | `open fun <A, B> Kind<`[`FreeCPartialOf`](../-free-c-partial-of.html)`<`[`F`](index.html#F)`>, `[`A`](flat-map.html#A)`>.flatMap(f: (`[`A`](flat-map.html#A)`) -> Kind<`[`FreeCPartialOf`](../-free-c-partial-of.html)`<`[`F`](index.html#F)`>, `[`B`](flat-map.html#B)`>): Kind<`[`FreeCPartialOf`](../-free-c-partial-of.html)`<`[`F`](index.html#F)`>, `[`B`](flat-map.html#B)`>` |
| [just](just.html) | `open fun <A> just(a: `[`A`](just.html#A)`): Kind<`[`FreeCPartialOf`](../-free-c-partial-of.html)`<`[`F`](index.html#F)`>, `[`A`](just.html#A)`>` |
| [tailRecM](tail-rec-m.html) | `open fun <A, B> tailRecM(a: `[`A`](tail-rec-m.html#A)`, f: (`[`A`](tail-rec-m.html#A)`) -> Kind<`[`FreeCPartialOf`](../-free-c-partial-of.html)`<`[`F`](index.html#F)`>, Either<`[`A`](tail-rec-m.html#A)`, `[`B`](tail-rec-m.html#B)`>>): Kind<`[`FreeCPartialOf`](../-free-c-partial-of.html)`<`[`F`](index.html#F)`>, `[`B`](tail-rec-m.html#B)`>` |

