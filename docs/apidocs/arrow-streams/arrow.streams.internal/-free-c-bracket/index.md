---
title: FreeCBracket - arrow-streams
---

[arrow-streams](../../index.html) / [arrow.streams.internal](../index.html) / [FreeCBracket](./index.html)

# FreeCBracket

`@extension interface FreeCBracket<F> : Bracket<`[`FreeCPartialOf`](../-free-c-partial-of.html)`<`[`F`](index.html#F)`>, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>, `[`FreeCMonadError`](../-free-c-monad-error/index.html)`<`[`F`](index.html#F)`>`

### Functions

| [bracketCase](bracket-case.html) | `open fun <A, B> Kind<`[`FreeCPartialOf`](../-free-c-partial-of.html)`<`[`F`](index.html#F)`>, `[`A`](bracket-case.html#A)`>.bracketCase(release: (`[`A`](bracket-case.html#A)`, ExitCase<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>) -> Kind<`[`FreeCPartialOf`](../-free-c-partial-of.html)`<`[`F`](index.html#F)`>, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>, use: (`[`A`](bracket-case.html#A)`) -> Kind<`[`FreeCPartialOf`](../-free-c-partial-of.html)`<`[`F`](index.html#F)`>, `[`B`](bracket-case.html#B)`>): Kind<`[`FreeCPartialOf`](../-free-c-partial-of.html)`<`[`F`](index.html#F)`>, `[`B`](bracket-case.html#B)`>` |

### Inheritors

| [FreeCMonadDefer](../-free-c-monad-defer/index.html) | `interface FreeCMonadDefer<F> : MonadDefer<`[`FreeCPartialOf`](../-free-c-partial-of.html)`<`[`F`](../-free-c-monad-defer/index.html#F)`>>, `[`FreeCBracket`](./index.html)`<`[`F`](../-free-c-monad-defer/index.html#F)`>` |

