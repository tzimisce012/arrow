---
title: FluxKAsyncInstance - arrow-effects-reactor-instances
---

[arrow-effects-reactor-instances](../../index.html) / [arrow.effects](../index.html) / [FluxKAsyncInstance](./index.html)

# FluxKAsyncInstance

`@extension interface FluxKAsyncInstance : Async<ForFluxK>, `[`FluxKMonadDeferInstance`](../-flux-k-monad-defer-instance/index.html)

### Functions

| [async](async.html) | `open fun <A> async(fa: Proc<`[`A`](async.html#A)`>): FluxK<`[`A`](async.html#A)`>` |
| [continueOn](continue-on.html) | `open fun <A> FluxKOf<`[`A`](continue-on.html#A)`>.continueOn(ctx: `[`CoroutineContext`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.coroutines/-coroutine-context/index.html)`): FluxK<`[`A`](continue-on.html#A)`>` |

### Extension Functions

| [catch](../../arrow.effects.fluxk.applicative-error/arrow.typeclasses.-applicative-error/catch.html) | `fun <A> ApplicativeError<ForFluxK, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>.catch(arg1: () -> `[`A`](../../arrow.effects.fluxk.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`): FluxK<`[`A`](../../arrow.effects.fluxk.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`>` |

### Inheritors

| [FluxKEffectInstance](../-flux-k-effect-instance/index.html) | `interface FluxKEffectInstance : Effect<ForFluxK>, `[`FluxKAsyncInstance`](./index.html) |

