---
title: SingleKApplicativeErrorInstance - arrow-effects-rx2-instances
---

[arrow-effects-rx2-instances](../../index.html) / [arrow.effects](../index.html) / [SingleKApplicativeErrorInstance](./index.html)

# SingleKApplicativeErrorInstance

`@extension interface SingleKApplicativeErrorInstance : ApplicativeError<ForSingleK, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>, `[`SingleKApplicativeInstance`](../-single-k-applicative-instance/index.html)

### Functions

| [handleErrorWith](handle-error-with.html) | `open fun <A> SingleKOf<`[`A`](handle-error-with.html#A)`>.handleErrorWith(f: (`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`) -> SingleKOf<`[`A`](handle-error-with.html#A)`>): SingleK<`[`A`](handle-error-with.html#A)`>` |
| [raiseError](raise-error.html) | `open fun <A> raiseError(e: `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`): SingleK<`[`A`](raise-error.html#A)`>` |

### Extension Functions

| [catch](../../arrow.effects.singlek.applicative-error/arrow.typeclasses.-applicative-error/catch.html) | `fun <A> ApplicativeError<ForSingleK, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>.catch(arg1: () -> `[`A`](../../arrow.effects.singlek.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`): SingleK<`[`A`](../../arrow.effects.singlek.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`>` |

