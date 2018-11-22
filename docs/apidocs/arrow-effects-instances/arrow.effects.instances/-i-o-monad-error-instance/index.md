---
title: IOMonadErrorInstance - arrow-effects-instances
---

[arrow-effects-instances](../../index.html) / [arrow.effects.instances](../index.html) / [IOMonadErrorInstance](./index.html)

# IOMonadErrorInstance

`@extension interface IOMonadErrorInstance : MonadError<ForIO, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>, `[`IOMonadInstance`](../-i-o-monad-instance/index.html)

### Functions

| [attempt](attempt.html) | `open fun <A> Kind<ForIO, `[`A`](attempt.html#A)`>.attempt(): IO<Either<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, `[`A`](attempt.html#A)`>>` |
| [handleErrorWith](handle-error-with.html) | `open fun <A> Kind<ForIO, `[`A`](handle-error-with.html#A)`>.handleErrorWith(f: (`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`) -> Kind<ForIO, `[`A`](handle-error-with.html#A)`>): IO<`[`A`](handle-error-with.html#A)`>` |
| [raiseError](raise-error.html) | `open fun <A> raiseError(e: `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`): IO<`[`A`](raise-error.html#A)`>` |

### Extension Functions

| [catch](../../arrow.effects.instances.io.applicative-error/arrow.typeclasses.-applicative-error/catch.html) | `fun <A> ApplicativeError<ForIO, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>.catch(arg1: () -> `[`A`](../../arrow.effects.instances.io.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`): IO<`[`A`](../../arrow.effects.instances.io.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`>` |

### Inheritors

| [IOMonadThrowInstance](../-i-o-monad-throw-instance.html) | `interface IOMonadThrowInstance : MonadThrow<ForIO>, `[`IOMonadErrorInstance`](./index.html) |

