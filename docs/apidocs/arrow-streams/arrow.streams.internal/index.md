---
title: arrow.streams.internal - arrow-streams
---

[arrow-streams](../index.html) / [arrow.streams.internal](./index.html)

## Package arrow.streams.internal

### Types

| [ForFreeC](-for-free-c.html) | `class ForFreeC` |
| [FreeC](-free-c/index.html) | `sealed class FreeC<F, out R> : `[`FreeCOf`](-free-c-of.html)`<`[`F`](-free-c/index.html#F)`, `[`R`](-free-c/index.html#R)`>`<br>Free Monad with Catch (and Interruption). |
| [FreeCApplicative](-free-c-applicative/index.html) | `interface FreeCApplicative<F> : Applicative<`[`FreeCPartialOf`](-free-c-partial-of.html)`<`[`F`](-free-c-applicative/index.html#F)`>>` |
| [FreeCApplicativeError](-free-c-applicative-error/index.html) | `interface FreeCApplicativeError<F> : ApplicativeError<`[`FreeCPartialOf`](-free-c-partial-of.html)`<`[`F`](-free-c-applicative-error/index.html#F)`>, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>` |
| [FreeCBracket](-free-c-bracket/index.html) | `interface FreeCBracket<F> : Bracket<`[`FreeCPartialOf`](-free-c-partial-of.html)`<`[`F`](-free-c-bracket/index.html#F)`>, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>, `[`FreeCMonadError`](-free-c-monad-error/index.html)`<`[`F`](-free-c-bracket/index.html#F)`>` |
| [FreeCEq](-free-c-eq/index.html) | `interface FreeCEq<F, G, A> : Eq<Kind<`[`FreeCPartialOf`](-free-c-partial-of.html)`<`[`F`](-free-c-eq/index.html#F)`>, `[`A`](-free-c-eq/index.html#A)`>>` |
| [FreeCFunctor](-free-c-functor/index.html) | `interface FreeCFunctor<F> : Functor<`[`FreeCPartialOf`](-free-c-partial-of.html)`<`[`F`](-free-c-functor/index.html#F)`>>` |
| [FreeCMonad](-free-c-monad/index.html) | `interface FreeCMonad<F> : Monad<`[`FreeCPartialOf`](-free-c-partial-of.html)`<`[`F`](-free-c-monad/index.html#F)`>>` |
| [FreeCMonadDefer](-free-c-monad-defer/index.html) | `interface FreeCMonadDefer<F> : MonadDefer<`[`FreeCPartialOf`](-free-c-partial-of.html)`<`[`F`](-free-c-monad-defer/index.html#F)`>>, `[`FreeCBracket`](-free-c-bracket/index.html)`<`[`F`](-free-c-monad-defer/index.html#F)`>` |
| [FreeCMonadError](-free-c-monad-error/index.html) | `interface FreeCMonadError<F> : MonadError<`[`FreeCPartialOf`](-free-c-partial-of.html)`<`[`F`](-free-c-monad-error/index.html#F)`>, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>` |
| [Token](-token/index.html) | `class Token`<br>Represents a unique identifier (using object equality). |
| [ViewL](-view-l/index.html) | `interface ViewL<F, out R>`<br>Emulated sealed trait. **Never extend this interface!** Working with `ViewL` must be done using [ViewL.fold](fold.html) |

### Type Aliases

| [FreeCOf](-free-c-of.html) | `typealias FreeCOf<F, R> = Kind2<`[`ForFreeC`](-for-free-c.html)`, `[`F`](-free-c-of.html#F)`, `[`R`](-free-c-of.html#R)`>` |
| [FreeCPartialOf](-free-c-partial-of.html) | `typealias FreeCPartialOf<F> = Kind<`[`ForFreeC`](-for-free-c.html)`, `[`F`](-free-c-partial-of.html#F)`>` |

### Extensions for External Classes

| [arrow.Kind](arrow.-kind/index.html) |  |

### Functions

| [fold](fold.html) | `fun <F, R, A> `[`FreeC`](-free-c/index.html)`<`[`F`](fold.html#F)`, `[`R`](fold.html#R)`>.fold(pure: (`[`R`](fold.html#R)`) -> `[`A`](fold.html#A)`, fail: (`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`) -> `[`A`](fold.html#A)`, interrupted: (`[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?, Option<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>) -> `[`A`](fold.html#A)`, eval: (Kind<`[`F`](fold.html#F)`, `[`R`](fold.html#R)`>) -> `[`A`](fold.html#A)`, bind: (`[`FreeC`](-free-c/index.html)`<`[`F`](fold.html#F)`, `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?>, (`[`Result`](-free-c/-result/index.html)`<`[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?>) -> `[`FreeCOf`](-free-c-of.html)`<`[`F`](fold.html#F)`, `[`R`](fold.html#R)`>) -> `[`A`](fold.html#A)`): `[`A`](fold.html#A)<br>`fun <R, A> `[`Result`](-free-c/-result/index.html)`<`[`R`](fold.html#R)`>.fold(pure: (`[`R`](fold.html#R)`) -> `[`A`](fold.html#A)`, fail: (`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`) -> `[`A`](fold.html#A)`, interrupted: (`[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?, Option<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>) -> `[`A`](fold.html#A)`): `[`A`](fold.html#A)<br>`fun <F, R, A> `[`ViewL`](-view-l/index.html)`<`[`F`](fold.html#F)`, `[`R`](fold.html#R)`>.fold(pure: (`[`R`](fold.html#R)`) -> `[`A`](fold.html#A)`, fail: (`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`) -> `[`A`](fold.html#A)`, interrupted: (`[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?, Option<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>) -> `[`A`](fold.html#A)`, view: (Kind<`[`F`](fold.html#F)`, `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?>, (`[`Result`](-free-c/-result/index.html)`<`[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?>) -> `[`FreeC`](-free-c/index.html)`<`[`F`](fold.html#F)`, `[`R`](fold.html#R)`>) -> `[`A`](fold.html#A)`): `[`A`](fold.html#A) |
| [freeC](free-c.html) | `fun <F, A> `[`A`](free-c.html#A)`.freeC(): `[`FreeC`](-free-c/index.html)`<`[`F`](free-c.html#F)`, `[`A`](free-c.html#A)`>` |
| [recoverWith](recover-with.html) | `fun <R> `[`Result`](-free-c/-result/index.html)`<`[`R`](recover-with.html#R)`>.recoverWith(f: (`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`) -> `[`Result`](-free-c/-result/index.html)`<`[`R`](recover-with.html#R)`>): `[`Result`](-free-c/-result/index.html)`<`[`R`](recover-with.html#R)`>`<br>Applies the given function [f](recover-with.html#arrow.streams.internal$recoverWith(arrow.streams.internal.FreeC.Result((arrow.streams.internal.recoverWith.R)), kotlin.Function1((kotlin.Throwable, arrow.streams.internal.FreeC.Result((arrow.streams.internal.recoverWith.R)))))/f) if this is a [FreeC.Fail](#), otherwise returns itself. This is like [flatMap](#) for the error-side. |
| [step](step.html) | `tailrec fun <S, A> `[`FreeC`](-free-c/index.html)`<`[`S`](step.html#S)`, `[`A`](step.html#A)`>.step(): `[`FreeC`](-free-c/index.html)`<`[`S`](step.html#S)`, `[`A`](step.html#A)`>`<br>Takes one evaluation step in the Free monad, re-associating left-nested binds in the process. |

