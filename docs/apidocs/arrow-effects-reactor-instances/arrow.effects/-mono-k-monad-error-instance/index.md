---
title: MonoKMonadErrorInstance - arrow-effects-reactor-instances
---

[arrow-effects-reactor-instances](../../index.html) / [arrow.effects](../index.html) / [MonoKMonadErrorInstance](./index.html)

# MonoKMonadErrorInstance

`@extension interface MonoKMonadErrorInstance : MonadError<ForMonoK, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>, `[`MonoKMonadInstance`](../-mono-k-monad-instance/index.html)

### Functions

| [handleErrorWith](handle-error-with.html) | `open fun <A> MonoKOf<`[`A`](handle-error-with.html#A)`>.handleErrorWith(f: (`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`) -> MonoKOf<`[`A`](handle-error-with.html#A)`>): MonoK<`[`A`](handle-error-with.html#A)`>` |
| [raiseError](raise-error.html) | `open fun <A> raiseError(e: `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`): MonoK<`[`A`](raise-error.html#A)`>` |

### Extension Functions

| [catch](../../arrow.effects.monok.applicative-error/arrow.typeclasses.-applicative-error/catch.html) | `fun <A> ApplicativeError<ForMonoK, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>.catch(arg1: () -> `[`A`](../../arrow.effects.monok.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`): MonoK<`[`A`](../../arrow.effects.monok.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`>` |

### Inheritors

| [MonoKMonadThrowInstance](../-mono-k-monad-throw-instance.html) | `interface MonoKMonadThrowInstance : MonadThrow<ForMonoK>, `[`MonoKMonadErrorInstance`](./index.html) |

