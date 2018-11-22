---
title: FluxKConcurrentEffectInstance - arrow-effects-reactor-instances
---

[arrow-effects-reactor-instances](../../index.html) / [arrow.effects](../index.html) / [FluxKConcurrentEffectInstance](./index.html)

# FluxKConcurrentEffectInstance

`@extension interface FluxKConcurrentEffectInstance : ConcurrentEffect<ForFluxK>, `[`FluxKEffectInstance`](../-flux-k-effect-instance/index.html)

### Functions

| [runAsyncCancellable](run-async-cancellable.html) | `open fun <A> Kind<ForFluxK, `[`A`](run-async-cancellable.html#A)`>.runAsyncCancellable(cb: (Either<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, `[`A`](run-async-cancellable.html#A)`>) -> FluxKOf<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>): FluxK<Disposable>` |

### Extension Functions

| [catch](../../arrow.effects.fluxk.applicative-error/arrow.typeclasses.-applicative-error/catch.html) | `fun <A> ApplicativeError<ForFluxK, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>.catch(arg1: () -> `[`A`](../../arrow.effects.fluxk.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`): FluxK<`[`A`](../../arrow.effects.fluxk.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`>` |

### Inheritors

| [FluxKContext](../-flux-k-context/index.html) | `object FluxKContext : `[`FluxKConcurrentEffectInstance`](./index.html)`, `[`FluxKTraverseInstance`](../-flux-k-traverse-instance/index.html) |

