---
title: FlowableKEffectInstance - arrow-effects-rx2-instances
---

[arrow-effects-rx2-instances](../../index.html) / [arrow.effects](../index.html) / [FlowableKEffectInstance](./index.html)

# FlowableKEffectInstance

`@extension interface FlowableKEffectInstance : Effect<ForFlowableK>, `[`FlowableKAsyncInstance`](../-flowable-k-async-instance/index.html)

### Functions

| [runAsync](run-async.html) | `open fun <A> FlowableKOf<`[`A`](run-async.html#A)`>.runAsync(cb: (Either<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, `[`A`](run-async.html#A)`>) -> FlowableKOf<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>): FlowableK<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>` |

### Extension Functions

| [catch](../../arrow.effects.flowablek.applicative-error/arrow.typeclasses.-applicative-error/catch.html) | `fun <A> ApplicativeError<ForFlowableK, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>.catch(arg1: () -> `[`A`](../../arrow.effects.flowablek.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`): FlowableK<`[`A`](../../arrow.effects.flowablek.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`>` |

### Inheritors

| [FlowableKConcurrentEffectInstance](../-flowable-k-concurrent-effect-instance/index.html) | `interface FlowableKConcurrentEffectInstance : ConcurrentEffect<ForFlowableK>, `[`FlowableKEffectInstance`](./index.html) |

