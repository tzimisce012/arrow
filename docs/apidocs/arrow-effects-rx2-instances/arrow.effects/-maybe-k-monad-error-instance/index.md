---
title: MaybeKMonadErrorInstance - arrow-effects-rx2-instances
---

[arrow-effects-rx2-instances](../../index.html) / [arrow.effects](../index.html) / [MaybeKMonadErrorInstance](./index.html)

# MaybeKMonadErrorInstance

`@extension interface MaybeKMonadErrorInstance : MonadError<ForMaybeK, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>, `[`MaybeKMonadInstance`](../-maybe-k-monad-instance/index.html)

### Functions

| [handleErrorWith](handle-error-with.html) | `open fun <A> MaybeKOf<`[`A`](handle-error-with.html#A)`>.handleErrorWith(f: (`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`) -> MaybeKOf<`[`A`](handle-error-with.html#A)`>): MaybeK<`[`A`](handle-error-with.html#A)`>` |
| [raiseError](raise-error.html) | `open fun <A> raiseError(e: `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`): MaybeK<`[`A`](raise-error.html#A)`>` |

### Extension Functions

| [catch](../../arrow.effects.maybek.applicative-error/arrow.typeclasses.-applicative-error/catch.html) | `fun <A> ApplicativeError<ForMaybeK, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>.catch(arg1: () -> `[`A`](../../arrow.effects.maybek.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`): MaybeK<`[`A`](../../arrow.effects.maybek.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`>` |

### Inheritors

| [MaybeKMonadThrowInstance](../-maybe-k-monad-throw-instance.html) | `interface MaybeKMonadThrowInstance : MonadThrow<ForMaybeK>, `[`MaybeKMonadErrorInstance`](./index.html) |

