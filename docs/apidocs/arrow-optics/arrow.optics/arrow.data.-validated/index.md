---
title: arrow.optics.arrow.data.Validated - arrow-optics
---

[arrow-optics](../../index.html) / [arrow.optics](../index.html) / [arrow.data.Validated](./index.html)

### Extensions for arrow.data.Validated

| [toEither](to-either.html) | `fun <A, B> Validated.Companion.toEither(): `[`Iso`](../-iso.html)`<Validated<`[`A`](to-either.html#A)`, `[`B`](to-either.html#B)`>, Either<`[`A`](to-either.html#A)`, `[`B`](to-either.html#B)`>>`<br>[Iso](../-iso.html) that defines equality between [Validated](#) and [Either](#) |
| [toPEither](to-p-either.html) | `fun <A1, A2, B1, B2> Validated.Companion.toPEither(): `[`PIso`](../-p-iso/index.html)`<Validated<`[`A1`](to-p-either.html#A1)`, `[`B1`](to-p-either.html#B1)`>, Validated<`[`A2`](to-p-either.html#A2)`, `[`B2`](to-p-either.html#B2)`>, Either<`[`A1`](to-p-either.html#A1)`, `[`B1`](to-p-either.html#B1)`>, Either<`[`A2`](to-p-either.html#A2)`, `[`B2`](to-p-either.html#B2)`>>`<br>[PIso](../-p-iso/index.html) that defines equality between [Validated](#) and [Either](#) |
| [toPTry](to-p-try.html) | `fun <A, B> Validated.Companion.toPTry(): `[`PIso`](../-p-iso/index.html)`<Validated<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, `[`A`](to-p-try.html#A)`>, Validated<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, `[`B`](to-p-try.html#B)`>, Try<`[`A`](to-p-try.html#A)`>, Try<`[`B`](to-p-try.html#B)`>>`<br>[PIso](../-p-iso/index.html) that defines equality between [Validated](#) and [Try](#) |
| [toTry](to-try.html) | `fun <A> Validated.Companion.toTry(): `[`Iso`](../-iso.html)`<Validated<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, `[`A`](to-try.html#A)`>, Try<`[`A`](to-try.html#A)`>>`<br>[Iso](../-iso.html) that defines equality between [Validated](#) and [Try](#) |

