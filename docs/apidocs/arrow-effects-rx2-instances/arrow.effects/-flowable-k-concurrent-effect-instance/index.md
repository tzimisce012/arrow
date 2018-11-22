---
title: FlowableKConcurrentEffectInstance - arrow-effects-rx2-instances
---

[arrow-effects-rx2-instances](../../index.html) / [arrow.effects](../index.html) / [FlowableKConcurrentEffectInstance](./index.html)

# FlowableKConcurrentEffectInstance

`@extension interface FlowableKConcurrentEffectInstance : ConcurrentEffect<ForFlowableK>, `[`FlowableKEffectInstance`](../-flowable-k-effect-instance/index.html)

### Functions

| [runAsyncCancellable](run-async-cancellable.html) | `open fun <A> Kind<ForFlowableK, `[`A`](run-async-cancellable.html#A)`>.runAsyncCancellable(cb: (Either<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, `[`A`](run-async-cancellable.html#A)`>) -> FlowableKOf<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>): FlowableK<Disposable>` |

### Extension Functions

| [catch](../../arrow.effects.flowablek.applicative-error/arrow.typeclasses.-applicative-error/catch.html) | `fun <A> ApplicativeError<ForFlowableK, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>.catch(arg1: () -> `[`A`](../../arrow.effects.flowablek.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`): FlowableK<`[`A`](../../arrow.effects.flowablek.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`>` |

### Inheritors

| [FlowableKContext](../-flowable-k-context/index.html) | `object FlowableKContext : `[`FlowableKConcurrentEffectInstance`](./index.html)`, `[`FlowableKTraverseInstance`](../-flowable-k-traverse-instance/index.html) |

