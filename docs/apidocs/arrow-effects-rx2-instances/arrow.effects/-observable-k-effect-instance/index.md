---
title: ObservableKEffectInstance - arrow-effects-rx2-instances
---

[arrow-effects-rx2-instances](../../index.html) / [arrow.effects](../index.html) / [ObservableKEffectInstance](./index.html)

# ObservableKEffectInstance

`@extension interface ObservableKEffectInstance : Effect<ForObservableK>, `[`ObservableKAsyncInstance`](../-observable-k-async-instance/index.html)

### Functions

| [runAsync](run-async.html) | `open fun <A> ObservableKOf<`[`A`](run-async.html#A)`>.runAsync(cb: (Either<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, `[`A`](run-async.html#A)`>) -> ObservableKOf<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>): ObservableK<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>` |

### Extension Functions

| [catch](../../arrow.effects.observablek.applicative-error/arrow.typeclasses.-applicative-error/catch.html) | `fun <A> ApplicativeError<ForObservableK, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>.catch(arg1: () -> `[`A`](../../arrow.effects.observablek.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`): ObservableK<`[`A`](../../arrow.effects.observablek.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`>` |

### Inheritors

| [ObservableKConcurrentEffectInstance](../-observable-k-concurrent-effect-instance/index.html) | `interface ObservableKConcurrentEffectInstance : ConcurrentEffect<ForObservableK>, `[`ObservableKEffectInstance`](./index.html) |

