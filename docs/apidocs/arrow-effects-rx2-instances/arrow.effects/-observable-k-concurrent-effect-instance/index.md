---
title: ObservableKConcurrentEffectInstance - arrow-effects-rx2-instances
---

[arrow-effects-rx2-instances](../../index.html) / [arrow.effects](../index.html) / [ObservableKConcurrentEffectInstance](./index.html)

# ObservableKConcurrentEffectInstance

`@extension interface ObservableKConcurrentEffectInstance : ConcurrentEffect<ForObservableK>, `[`ObservableKEffectInstance`](../-observable-k-effect-instance/index.html)

### Functions

| [runAsyncCancellable](run-async-cancellable.html) | `open fun <A> Kind<ForObservableK, `[`A`](run-async-cancellable.html#A)`>.runAsyncCancellable(cb: (Either<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, `[`A`](run-async-cancellable.html#A)`>) -> ObservableKOf<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>): ObservableK<Disposable>` |

### Extension Functions

| [catch](../../arrow.effects.observablek.applicative-error/arrow.typeclasses.-applicative-error/catch.html) | `fun <A> ApplicativeError<ForObservableK, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>.catch(arg1: () -> `[`A`](../../arrow.effects.observablek.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`): ObservableK<`[`A`](../../arrow.effects.observablek.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`>` |

### Inheritors

| [ObservableKContext](../-observable-k-context/index.html) | `object ObservableKContext : `[`ObservableKConcurrentEffectInstance`](./index.html)`, `[`ObservableKTraverseInstance`](../-observable-k-traverse-instance/index.html) |

