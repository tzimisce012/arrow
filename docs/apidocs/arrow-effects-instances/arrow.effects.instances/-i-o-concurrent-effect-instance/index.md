---
title: IOConcurrentEffectInstance - arrow-effects-instances
---

[arrow-effects-instances](../../index.html) / [arrow.effects.instances](../index.html) / [IOConcurrentEffectInstance](./index.html)

# IOConcurrentEffectInstance

`@extension interface IOConcurrentEffectInstance : ConcurrentEffect<ForIO>, `[`IOEffectInstance`](../-i-o-effect-instance/index.html)

### Functions

| [runAsyncCancellable](run-async-cancellable.html) | `open fun <A> Kind<ForIO, `[`A`](run-async-cancellable.html#A)`>.runAsyncCancellable(cb: (Either<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, `[`A`](run-async-cancellable.html#A)`>) -> Kind<ForIO, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>): IO<Disposable>` |

### Extension Functions

| [catch](../../arrow.effects.instances.io.applicative-error/arrow.typeclasses.-applicative-error/catch.html) | `fun <A> ApplicativeError<ForIO, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>.catch(arg1: () -> `[`A`](../../arrow.effects.instances.io.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`): IO<`[`A`](../../arrow.effects.instances.io.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`>` |

### Inheritors

| [IOContext](../-i-o-context.html) | `object IOContext : `[`IOConcurrentEffectInstance`](./index.html) |

