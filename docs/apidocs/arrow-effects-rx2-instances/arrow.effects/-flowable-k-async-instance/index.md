---
title: FlowableKAsyncInstance - arrow-effects-rx2-instances
---

[arrow-effects-rx2-instances](../../index.html) / [arrow.effects](../index.html) / [FlowableKAsyncInstance](./index.html)

# FlowableKAsyncInstance

`@extension interface FlowableKAsyncInstance : Async<ForFlowableK>, `[`FlowableKMonadDeferInstance`](../-flowable-k-monad-defer-instance/index.html)

### Functions

| [async](async.html) | `open fun <A> async(fa: Proc<`[`A`](async.html#A)`>): FlowableK<`[`A`](async.html#A)`>` |
| [continueOn](continue-on.html) | `open fun <A> FlowableKOf<`[`A`](continue-on.html#A)`>.continueOn(ctx: `[`CoroutineContext`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.coroutines/-coroutine-context/index.html)`): FlowableK<`[`A`](continue-on.html#A)`>` |

### Inherited Functions

| [BS](../-flowable-k-monad-defer-instance/-b-s.html) | `open fun BS(): BackpressureStrategy` |

### Extension Functions

| [catch](../../arrow.effects.flowablek.applicative-error/arrow.typeclasses.-applicative-error/catch.html) | `fun <A> ApplicativeError<ForFlowableK, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>.catch(arg1: () -> `[`A`](../../arrow.effects.flowablek.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`): FlowableK<`[`A`](../../arrow.effects.flowablek.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`>` |

### Inheritors

| [FlowableKEffectInstance](../-flowable-k-effect-instance/index.html) | `interface FlowableKEffectInstance : Effect<ForFlowableK>, `[`FlowableKAsyncInstance`](./index.html) |

