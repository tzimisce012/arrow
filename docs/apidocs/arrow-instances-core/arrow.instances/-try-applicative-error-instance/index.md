---
title: TryApplicativeErrorInstance - arrow-instances-core
---

[arrow-instances-core](../../index.html) / [arrow.instances](../index.html) / [TryApplicativeErrorInstance](./index.html)

# TryApplicativeErrorInstance

`@extension interface TryApplicativeErrorInstance : ApplicativeError<ForTry, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>, `[`TryApplicativeInstance`](../-try-applicative-instance/index.html)

### Functions

| [handleErrorWith](handle-error-with.html) | `open fun <A> Kind<ForTry, `[`A`](handle-error-with.html#A)`>.handleErrorWith(f: (`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`) -> Kind<ForTry, `[`A`](handle-error-with.html#A)`>): Try<`[`A`](handle-error-with.html#A)`>` |
| [raiseError](raise-error.html) | `open fun <A> raiseError(e: `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`): Try<`[`A`](raise-error.html#A)`>` |

### Extension Functions

| [catch](../../arrow.instances.try.applicative-error/arrow.typeclasses.-applicative-error/catch.html) | `fun <A> ApplicativeError<ForTry, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>.catch(arg1: () -> `[`A`](../../arrow.instances.try.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`): Try<`[`A`](../../arrow.instances.try.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`>` |

