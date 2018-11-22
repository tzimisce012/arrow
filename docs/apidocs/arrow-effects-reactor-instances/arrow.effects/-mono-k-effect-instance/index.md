---
title: MonoKEffectInstance - arrow-effects-reactor-instances
---

[arrow-effects-reactor-instances](../../index.html) / [arrow.effects](../index.html) / [MonoKEffectInstance](./index.html)

# MonoKEffectInstance

`@extension interface MonoKEffectInstance : Effect<ForMonoK>, `[`MonoKAsyncInstance`](../-mono-k-async-instance/index.html)

### Functions

| [runAsync](run-async.html) | `open fun <A> MonoKOf<`[`A`](run-async.html#A)`>.runAsync(cb: (Either<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, `[`A`](run-async.html#A)`>) -> MonoKOf<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>): MonoK<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>` |

### Extension Functions

| [catch](../../arrow.effects.monok.applicative-error/arrow.typeclasses.-applicative-error/catch.html) | `fun <A> ApplicativeError<ForMonoK, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>.catch(arg1: () -> `[`A`](../../arrow.effects.monok.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`): MonoK<`[`A`](../../arrow.effects.monok.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`>` |

### Inheritors

| [MonoKConcurrentEffectInstance](../-mono-k-concurrent-effect-instance/index.html) | `interface MonoKConcurrentEffectInstance : ConcurrentEffect<ForMonoK>, `[`MonoKEffectInstance`](./index.html) |

