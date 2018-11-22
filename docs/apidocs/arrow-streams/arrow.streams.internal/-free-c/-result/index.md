---
title: FreeC.Result - arrow-streams
---

[arrow-streams](../../../index.html) / [arrow.streams.internal](../../index.html) / [FreeC](../index.html) / [Result](./index.html)

# Result

`interface Result<out R>`

Emulated sealed trait. **Never extend this interface!**
**Working with [FreeC.Result](./index.html) must be done using [Result.fold](../../fold.html) **

### Functions

| [asExitCase](as-exit-case.html) | `open fun asExitCase(): ExitCase<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>` |
| [asFreeC](as-free-c.html) | `open fun <F> asFreeC(): `[`FreeC`](../index.html)`<`[`F`](as-free-c.html#F)`, `[`R`](index.html#R)`>` |

### Companion Object Properties

| [unit](unit.html) | `val unit: `[`Result`](./index.html)`<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>` |

### Companion Object Functions

| [fromEither](from-either.html) | `fun <A> fromEither(either: Either<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, `[`A`](from-either.html#A)`>): `[`Result`](./index.html)`<`[`A`](from-either.html#A)`>` |
| [interrupted](interrupted.html) | `fun <A> interrupted(scopeId: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?, failure: Option<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>): `[`Result`](./index.html)`<`[`A`](interrupted.html#A)`>`<br>`fun <A> interrupted(scopeId: `[`Token`](../../-token/index.html)`, failure: Option<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>): `[`Result`](./index.html)`<`[`A`](interrupted.html#A)`>` |
| [just](just.html) | `fun <A> just(a: `[`A`](just.html#A)`): `[`Result`](./index.html)`<`[`A`](just.html#A)`>` |
| [raiseError](raise-error.html) | `fun <A> raiseError(error: `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`): `[`Result`](./index.html)`<`[`A`](raise-error.html#A)`>` |

### Extension Functions

| [fold](../../fold.html) | `fun <R, A> `[`Result`](./index.html)`<`[`R`](../../fold.html#R)`>.fold(pure: (`[`R`](../../fold.html#R)`) -> `[`A`](../../fold.html#A)`, fail: (`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`) -> `[`A`](../../fold.html#A)`, interrupted: (`[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?, Option<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>) -> `[`A`](../../fold.html#A)`): `[`A`](../../fold.html#A) |
| [recoverWith](../../recover-with.html) | `fun <R> `[`Result`](./index.html)`<`[`R`](../../recover-with.html#R)`>.recoverWith(f: (`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`) -> `[`Result`](./index.html)`<`[`R`](../../recover-with.html#R)`>): `[`Result`](./index.html)`<`[`R`](../../recover-with.html#R)`>`<br>Applies the given function [f](../../recover-with.html#arrow.streams.internal$recoverWith(arrow.streams.internal.FreeC.Result((arrow.streams.internal.recoverWith.R)), kotlin.Function1((kotlin.Throwable, arrow.streams.internal.FreeC.Result((arrow.streams.internal.recoverWith.R)))))/f) if this is a [FreeC.Fail](#), otherwise returns itself. This is like [flatMap](#) for the error-side. |

