---
title: FluxKMonadErrorInstance - arrow-effects-reactor-instances
---

[arrow-effects-reactor-instances](../../index.html) / [arrow.effects](../index.html) / [FluxKMonadErrorInstance](./index.html)

# FluxKMonadErrorInstance

`@extension interface FluxKMonadErrorInstance : MonadError<ForFluxK, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>, `[`FluxKMonadInstance`](../-flux-k-monad-instance/index.html)

### Functions

| [handleErrorWith](handle-error-with.html) | `open fun <A> FluxKOf<`[`A`](handle-error-with.html#A)`>.handleErrorWith(f: (`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`) -> FluxKOf<`[`A`](handle-error-with.html#A)`>): FluxK<`[`A`](handle-error-with.html#A)`>` |
| [raiseError](raise-error.html) | `open fun <A> raiseError(e: `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`): FluxK<`[`A`](raise-error.html#A)`>` |

### Extension Functions

| [catch](../../arrow.effects.fluxk.applicative-error/arrow.typeclasses.-applicative-error/catch.html) | `fun <A> ApplicativeError<ForFluxK, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>.catch(arg1: () -> `[`A`](../../arrow.effects.fluxk.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`): FluxK<`[`A`](../../arrow.effects.fluxk.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`>` |

### Inheritors

| [FluxKMonadThrowInstance](../-flux-k-monad-throw-instance.html) | `interface FluxKMonadThrowInstance : MonadThrow<ForFluxK>, `[`FluxKMonadErrorInstance`](./index.html) |

