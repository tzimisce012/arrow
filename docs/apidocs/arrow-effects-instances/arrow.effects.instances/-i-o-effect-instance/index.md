---
title: IOEffectInstance - arrow-effects-instances
---

[arrow-effects-instances](../../index.html) / [arrow.effects.instances](../index.html) / [IOEffectInstance](./index.html)

# IOEffectInstance

`@extension interface IOEffectInstance : Effect<ForIO>, `[`IOAsyncInstance`](../-i-o-async-instance/index.html)

### Functions

| [runAsync](run-async.html) | `open fun <A> Kind<ForIO, `[`A`](run-async.html#A)`>.runAsync(cb: (Either<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, `[`A`](run-async.html#A)`>) -> Kind<ForIO, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>): IO<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>` |

### Extension Functions

| [catch](../../arrow.effects.instances.io.applicative-error/arrow.typeclasses.-applicative-error/catch.html) | `fun <A> ApplicativeError<ForIO, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>.catch(arg1: () -> `[`A`](../../arrow.effects.instances.io.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`): IO<`[`A`](../../arrow.effects.instances.io.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`>` |

### Inheritors

| [IOConcurrentEffectInstance](../-i-o-concurrent-effect-instance/index.html) | `interface IOConcurrentEffectInstance : ConcurrentEffect<ForIO>, `[`IOEffectInstance`](./index.html) |

