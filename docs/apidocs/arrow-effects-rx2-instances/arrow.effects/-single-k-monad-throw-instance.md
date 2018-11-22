---
title: SingleKMonadThrowInstance - arrow-effects-rx2-instances
---

[arrow-effects-rx2-instances](../index.html) / [arrow.effects](index.html) / [SingleKMonadThrowInstance](./-single-k-monad-throw-instance.html)

# SingleKMonadThrowInstance

`@extension interface SingleKMonadThrowInstance : MonadThrow<ForSingleK>, `[`SingleKMonadErrorInstance`](-single-k-monad-error-instance/index.html)

### Extension Functions

| [catch](../arrow.effects.singlek.applicative-error/arrow.typeclasses.-applicative-error/catch.html) | `fun <A> ApplicativeError<ForSingleK, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>.catch(arg1: () -> `[`A`](../arrow.effects.singlek.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`): SingleK<`[`A`](../arrow.effects.singlek.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`>` |

### Inheritors

| [SingleKBracketInstance](-single-k-bracket-instance/index.html) | `interface SingleKBracketInstance : Bracket<ForSingleK, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>, `[`SingleKMonadThrowInstance`](./-single-k-monad-throw-instance.html) |

