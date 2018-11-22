---
title: IOMonadThrowInstance - arrow-effects-instances
---

[arrow-effects-instances](../index.html) / [arrow.effects.instances](index.html) / [IOMonadThrowInstance](./-i-o-monad-throw-instance.html)

# IOMonadThrowInstance

`@extension interface IOMonadThrowInstance : MonadThrow<ForIO>, `[`IOMonadErrorInstance`](-i-o-monad-error-instance/index.html)

### Extension Functions

| [catch](../arrow.effects.instances.io.applicative-error/arrow.typeclasses.-applicative-error/catch.html) | `fun <A> ApplicativeError<ForIO, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>.catch(arg1: () -> `[`A`](../arrow.effects.instances.io.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`): IO<`[`A`](../arrow.effects.instances.io.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`>` |

### Inheritors

| [IOBracketInstance](-i-o-bracket-instance/index.html) | `interface IOBracketInstance : Bracket<ForIO, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>, `[`IOMonadThrowInstance`](./-i-o-monad-throw-instance.html) |

