---
title: DeferredKEffectInstance - arrow-effects-kotlinx-coroutines-instances
---

[arrow-effects-kotlinx-coroutines-instances](../../index.html) / [arrow.effects](../index.html) / [DeferredKEffectInstance](./index.html)

# DeferredKEffectInstance

`@extension interface DeferredKEffectInstance : Effect<ForDeferredK>, `[`DeferredKAsyncInstance`](../-deferred-k-async-instance/index.html)

### Functions

| [runAsync](run-async.html) | `open fun <A> Kind<ForDeferredK, `[`A`](run-async.html#A)`>.runAsync(cb: (Either<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, `[`A`](run-async.html#A)`>) -> DeferredKOf<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>): DeferredK<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>` |

### Extension Functions

| [catch](../../arrow.effects.deferredk.applicative-error/arrow.typeclasses.-applicative-error/catch.html) | `fun <A> ApplicativeError<ForDeferredK, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>.catch(arg1: () -> `[`A`](../../arrow.effects.deferredk.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`): DeferredK<`[`A`](../../arrow.effects.deferredk.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`>` |

### Inheritors

| [DeferredKConcurrentEffectInstance](../-deferred-k-concurrent-effect-instance/index.html) | `interface DeferredKConcurrentEffectInstance : ConcurrentEffect<ForDeferredK>, `[`DeferredKEffectInstance`](./index.html) |

