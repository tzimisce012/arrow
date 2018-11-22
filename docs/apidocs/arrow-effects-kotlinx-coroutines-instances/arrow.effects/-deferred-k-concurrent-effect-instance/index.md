---
title: DeferredKConcurrentEffectInstance - arrow-effects-kotlinx-coroutines-instances
---

[arrow-effects-kotlinx-coroutines-instances](../../index.html) / [arrow.effects](../index.html) / [DeferredKConcurrentEffectInstance](./index.html)

# DeferredKConcurrentEffectInstance

`@extension interface DeferredKConcurrentEffectInstance : ConcurrentEffect<ForDeferredK>, `[`DeferredKEffectInstance`](../-deferred-k-effect-instance/index.html)

### Functions

| [runAsyncCancellable](run-async-cancellable.html) | `open fun <A> Kind<ForDeferredK, `[`A`](run-async-cancellable.html#A)`>.runAsyncCancellable(cb: (Either<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, `[`A`](run-async-cancellable.html#A)`>) -> Kind<ForDeferredK, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>): Kind<ForDeferredK, Disposable>` |

### Extension Functions

| [catch](../../arrow.effects.deferredk.applicative-error/arrow.typeclasses.-applicative-error/catch.html) | `fun <A> ApplicativeError<ForDeferredK, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>.catch(arg1: () -> `[`A`](../../arrow.effects.deferredk.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`): DeferredK<`[`A`](../../arrow.effects.deferredk.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`>` |

### Inheritors

| [DeferredKContext](../-deferred-k-context.html) | `object DeferredKContext : `[`DeferredKConcurrentEffectInstance`](./index.html) |

