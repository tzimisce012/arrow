---
title: FreeCApplicativeError - arrow-streams
---

[arrow-streams](../../index.html) / [arrow.streams.internal](../index.html) / [FreeCApplicativeError](./index.html)

# FreeCApplicativeError

`@extension interface FreeCApplicativeError<F> : ApplicativeError<`[`FreeCPartialOf`](../-free-c-partial-of.html)`<`[`F`](index.html#F)`>, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>`

### Functions

| [ap](ap.html) | `open fun <A, B> Kind<`[`FreeCPartialOf`](../-free-c-partial-of.html)`<`[`F`](index.html#F)`>, `[`A`](ap.html#A)`>.ap(ff: Kind<`[`FreeCPartialOf`](../-free-c-partial-of.html)`<`[`F`](index.html#F)`>, (`[`A`](ap.html#A)`) -> `[`B`](ap.html#B)`>): Kind<`[`FreeCPartialOf`](../-free-c-partial-of.html)`<`[`F`](index.html#F)`>, `[`B`](ap.html#B)`>` |
| [handleErrorWith](handle-error-with.html) | `open fun <A> Kind<`[`FreeCPartialOf`](../-free-c-partial-of.html)`<`[`F`](index.html#F)`>, `[`A`](handle-error-with.html#A)`>.handleErrorWith(f: (`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`) -> Kind<`[`FreeCPartialOf`](../-free-c-partial-of.html)`<`[`F`](index.html#F)`>, `[`A`](handle-error-with.html#A)`>): Kind<`[`FreeCPartialOf`](../-free-c-partial-of.html)`<`[`F`](index.html#F)`>, `[`A`](handle-error-with.html#A)`>` |
| [just](just.html) | `open fun <A> just(a: `[`A`](just.html#A)`): Kind<`[`FreeCPartialOf`](../-free-c-partial-of.html)`<`[`F`](index.html#F)`>, `[`A`](just.html#A)`>` |
| [raiseError](raise-error.html) | `open fun <A> raiseError(e: `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`): Kind<`[`FreeCPartialOf`](../-free-c-partial-of.html)`<`[`F`](index.html#F)`>, `[`A`](raise-error.html#A)`>` |

