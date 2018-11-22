---
title: ObservableKApplicativeErrorInstance - arrow-effects-rx2-instances
---

[arrow-effects-rx2-instances](../../index.html) / [arrow.effects](../index.html) / [ObservableKApplicativeErrorInstance](./index.html)

# ObservableKApplicativeErrorInstance

`@extension interface ObservableKApplicativeErrorInstance : ApplicativeError<ForObservableK, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>, `[`ObservableKApplicativeInstance`](../-observable-k-applicative-instance/index.html)

### Functions

| [handleErrorWith](handle-error-with.html) | `open fun <A> ObservableKOf<`[`A`](handle-error-with.html#A)`>.handleErrorWith(f: (`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`) -> ObservableKOf<`[`A`](handle-error-with.html#A)`>): ObservableK<`[`A`](handle-error-with.html#A)`>` |
| [raiseError](raise-error.html) | `open fun <A> raiseError(e: `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`): ObservableK<`[`A`](raise-error.html#A)`>` |

### Extension Functions

| [catch](../../arrow.effects.observablek.applicative-error/arrow.typeclasses.-applicative-error/catch.html) | `fun <A> ApplicativeError<ForObservableK, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>.catch(arg1: () -> `[`A`](../../arrow.effects.observablek.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`): ObservableK<`[`A`](../../arrow.effects.observablek.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`>` |

