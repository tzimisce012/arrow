---
title: FreeCMonadError - arrow-streams
---

[arrow-streams](../../index.html) / [arrow.streams.internal](../index.html) / [FreeCMonadError](./index.html)

# FreeCMonadError

`@extension interface FreeCMonadError<F> : MonadError<`[`FreeCPartialOf`](../-free-c-partial-of.html)`<`[`F`](index.html#F)`>, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>`

### Functions

| [flatMap](flat-map.html) | `open fun <A, B> Kind<`[`FreeCPartialOf`](../-free-c-partial-of.html)`<`[`F`](index.html#F)`>, `[`A`](flat-map.html#A)`>.flatMap(f: (`[`A`](flat-map.html#A)`) -> Kind<`[`FreeCPartialOf`](../-free-c-partial-of.html)`<`[`F`](index.html#F)`>, `[`B`](flat-map.html#B)`>): Kind<`[`FreeCPartialOf`](../-free-c-partial-of.html)`<`[`F`](index.html#F)`>, `[`B`](flat-map.html#B)`>` |
| [handleErrorWith](handle-error-with.html) | `open fun <A> Kind<`[`FreeCPartialOf`](../-free-c-partial-of.html)`<`[`F`](index.html#F)`>, `[`A`](handle-error-with.html#A)`>.handleErrorWith(f: (`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`) -> Kind<`[`FreeCPartialOf`](../-free-c-partial-of.html)`<`[`F`](index.html#F)`>, `[`A`](handle-error-with.html#A)`>): Kind<`[`FreeCPartialOf`](../-free-c-partial-of.html)`<`[`F`](index.html#F)`>, `[`A`](handle-error-with.html#A)`>` |
| [just](just.html) | `open fun <A> just(a: `[`A`](just.html#A)`): Kind<`[`FreeCPartialOf`](../-free-c-partial-of.html)`<`[`F`](index.html#F)`>, `[`A`](just.html#A)`>` |
| [raiseError](raise-error.html) | `open fun <A> raiseError(e: `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`): Kind<`[`FreeCPartialOf`](../-free-c-partial-of.html)`<`[`F`](index.html#F)`>, `[`A`](raise-error.html#A)`>` |
| [tailRecM](tail-rec-m.html) | `open fun <A, B> tailRecM(a: `[`A`](tail-rec-m.html#A)`, f: (`[`A`](tail-rec-m.html#A)`) -> Kind<`[`FreeCPartialOf`](../-free-c-partial-of.html)`<`[`F`](index.html#F)`>, Either<`[`A`](tail-rec-m.html#A)`, `[`B`](tail-rec-m.html#B)`>>): Kind<`[`FreeCPartialOf`](../-free-c-partial-of.html)`<`[`F`](index.html#F)`>, `[`B`](tail-rec-m.html#B)`>` |

### Inheritors

| [FreeCBracket](../-free-c-bracket/index.html) | `interface FreeCBracket<F> : Bracket<`[`FreeCPartialOf`](../-free-c-partial-of.html)`<`[`F`](../-free-c-bracket/index.html#F)`>, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>, `[`FreeCMonadError`](./index.html)`<`[`F`](../-free-c-bracket/index.html#F)`>` |

