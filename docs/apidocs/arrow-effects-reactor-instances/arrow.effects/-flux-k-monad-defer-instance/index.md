---
title: FluxKMonadDeferInstance - arrow-effects-reactor-instances
---

[arrow-effects-reactor-instances](../../index.html) / [arrow.effects](../index.html) / [FluxKMonadDeferInstance](./index.html)

# FluxKMonadDeferInstance

`@extension interface FluxKMonadDeferInstance : MonadDefer<ForFluxK>, `[`FluxKBracketInstance`](../-flux-k-bracket-instance/index.html)

### Functions

| [defer](defer.html) | `open fun <A> defer(fa: () -> FluxKOf<`[`A`](defer.html#A)`>): FluxK<`[`A`](defer.html#A)`>` |

### Extension Functions

| [catch](../../arrow.effects.fluxk.applicative-error/arrow.typeclasses.-applicative-error/catch.html) | `fun <A> ApplicativeError<ForFluxK, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>.catch(arg1: () -> `[`A`](../../arrow.effects.fluxk.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`): FluxK<`[`A`](../../arrow.effects.fluxk.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`>` |

### Inheritors

| [FluxKAsyncInstance](../-flux-k-async-instance/index.html) | `interface FluxKAsyncInstance : Async<ForFluxK>, `[`FluxKMonadDeferInstance`](./index.html) |

