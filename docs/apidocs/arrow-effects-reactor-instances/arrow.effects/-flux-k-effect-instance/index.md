---
title: FluxKEffectInstance - arrow-effects-reactor-instances
---

[arrow-effects-reactor-instances](../../index.html) / [arrow.effects](../index.html) / [FluxKEffectInstance](./index.html)

# FluxKEffectInstance

`@extension interface FluxKEffectInstance : Effect<ForFluxK>, `[`FluxKAsyncInstance`](../-flux-k-async-instance/index.html)

### Functions

| [runAsync](run-async.html) | `open fun <A> FluxKOf<`[`A`](run-async.html#A)`>.runAsync(cb: (Either<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, `[`A`](run-async.html#A)`>) -> FluxKOf<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>): FluxK<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>` |

### Extension Functions

| [catch](../../arrow.effects.fluxk.applicative-error/arrow.typeclasses.-applicative-error/catch.html) | `fun <A> ApplicativeError<ForFluxK, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>.catch(arg1: () -> `[`A`](../../arrow.effects.fluxk.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`): FluxK<`[`A`](../../arrow.effects.fluxk.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`>` |

### Inheritors

| [FluxKConcurrentEffectInstance](../-flux-k-concurrent-effect-instance/index.html) | `interface FluxKConcurrentEffectInstance : ConcurrentEffect<ForFluxK>, `[`FluxKEffectInstance`](./index.html) |

