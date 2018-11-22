---
title: FluxKBracketInstance - arrow-effects-reactor-instances
---

[arrow-effects-reactor-instances](../../index.html) / [arrow.effects](../index.html) / [FluxKBracketInstance](./index.html)

# FluxKBracketInstance

`@extension interface FluxKBracketInstance : Bracket<ForFluxK, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>, `[`FluxKMonadThrowInstance`](../-flux-k-monad-throw-instance.html)

### Functions

| [bracketCase](bracket-case.html) | `open fun <A, B> Kind<ForFluxK, `[`A`](bracket-case.html#A)`>.bracketCase(release: (`[`A`](bracket-case.html#A)`, ExitCase<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>) -> Kind<ForFluxK, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>, use: (`[`A`](bracket-case.html#A)`) -> Kind<ForFluxK, `[`B`](bracket-case.html#B)`>): FluxK<`[`B`](bracket-case.html#B)`>` |

### Extension Functions

| [catch](../../arrow.effects.fluxk.applicative-error/arrow.typeclasses.-applicative-error/catch.html) | `fun <A> ApplicativeError<ForFluxK, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>.catch(arg1: () -> `[`A`](../../arrow.effects.fluxk.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`): FluxK<`[`A`](../../arrow.effects.fluxk.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`>` |

### Inheritors

| [FluxKMonadDeferInstance](../-flux-k-monad-defer-instance/index.html) | `interface FluxKMonadDeferInstance : MonadDefer<ForFluxK>, `[`FluxKBracketInstance`](./index.html) |

