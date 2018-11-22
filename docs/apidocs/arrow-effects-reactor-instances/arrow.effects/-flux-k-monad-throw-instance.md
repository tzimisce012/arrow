---
title: FluxKMonadThrowInstance - arrow-effects-reactor-instances
---

[arrow-effects-reactor-instances](../index.html) / [arrow.effects](index.html) / [FluxKMonadThrowInstance](./-flux-k-monad-throw-instance.html)

# FluxKMonadThrowInstance

`@extension interface FluxKMonadThrowInstance : MonadThrow<ForFluxK>, `[`FluxKMonadErrorInstance`](-flux-k-monad-error-instance/index.html)

### Extension Functions

| [catch](../arrow.effects.fluxk.applicative-error/arrow.typeclasses.-applicative-error/catch.html) | `fun <A> ApplicativeError<ForFluxK, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>.catch(arg1: () -> `[`A`](../arrow.effects.fluxk.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`): FluxK<`[`A`](../arrow.effects.fluxk.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`>` |

### Inheritors

| [FluxKBracketInstance](-flux-k-bracket-instance/index.html) | `interface FluxKBracketInstance : Bracket<ForFluxK, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>, `[`FluxKMonadThrowInstance`](./-flux-k-monad-throw-instance.html) |

