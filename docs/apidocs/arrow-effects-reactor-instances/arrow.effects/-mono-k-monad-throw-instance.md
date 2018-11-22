---
title: MonoKMonadThrowInstance - arrow-effects-reactor-instances
---

[arrow-effects-reactor-instances](../index.html) / [arrow.effects](index.html) / [MonoKMonadThrowInstance](./-mono-k-monad-throw-instance.html)

# MonoKMonadThrowInstance

`@extension interface MonoKMonadThrowInstance : MonadThrow<ForMonoK>, `[`MonoKMonadErrorInstance`](-mono-k-monad-error-instance/index.html)

### Extension Functions

| [catch](../arrow.effects.monok.applicative-error/arrow.typeclasses.-applicative-error/catch.html) | `fun <A> ApplicativeError<ForMonoK, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>.catch(arg1: () -> `[`A`](../arrow.effects.monok.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`): MonoK<`[`A`](../arrow.effects.monok.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`>` |

### Inheritors

| [MonoKBracketInstance](-mono-k-bracket-instance/index.html) | `interface MonoKBracketInstance : Bracket<ForMonoK, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>, `[`MonoKMonadThrowInstance`](./-mono-k-monad-throw-instance.html) |

