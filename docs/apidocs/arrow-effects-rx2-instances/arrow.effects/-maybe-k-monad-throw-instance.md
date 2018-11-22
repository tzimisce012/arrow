---
title: MaybeKMonadThrowInstance - arrow-effects-rx2-instances
---

[arrow-effects-rx2-instances](../index.html) / [arrow.effects](index.html) / [MaybeKMonadThrowInstance](./-maybe-k-monad-throw-instance.html)

# MaybeKMonadThrowInstance

`@extension interface MaybeKMonadThrowInstance : MonadThrow<ForMaybeK>, `[`MaybeKMonadErrorInstance`](-maybe-k-monad-error-instance/index.html)

### Extension Functions

| [catch](../arrow.effects.maybek.applicative-error/arrow.typeclasses.-applicative-error/catch.html) | `fun <A> ApplicativeError<ForMaybeK, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>.catch(arg1: () -> `[`A`](../arrow.effects.maybek.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`): MaybeK<`[`A`](../arrow.effects.maybek.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`>` |

### Inheritors

| [MaybeKBracketInstance](-maybe-k-bracket-instance/index.html) | `interface MaybeKBracketInstance : Bracket<ForMaybeK, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>, `[`MaybeKMonadThrowInstance`](./-maybe-k-monad-throw-instance.html) |

