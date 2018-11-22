---
title: MonoKContext - arrow-effects-reactor-instances
---

[arrow-effects-reactor-instances](../index.html) / [arrow.effects](index.html) / [MonoKContext](./-mono-k-context.html)

# MonoKContext

`object MonoKContext : `[`MonoKConcurrentEffectInstance`](-mono-k-concurrent-effect-instance/index.html)

### Inherited Functions

| [runAsyncCancellable](-mono-k-concurrent-effect-instance/run-async-cancellable.html) | `open fun <A> Kind<ForMonoK, `[`A`](-mono-k-concurrent-effect-instance/run-async-cancellable.html#A)`>.runAsyncCancellable(cb: (Either<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, `[`A`](-mono-k-concurrent-effect-instance/run-async-cancellable.html#A)`>) -> MonoKOf<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>): MonoK<Disposable>` |

### Extension Functions

| [catch](../arrow.effects.monok.applicative-error/arrow.typeclasses.-applicative-error/catch.html) | `fun <A> ApplicativeError<ForMonoK, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>.catch(arg1: () -> `[`A`](../arrow.effects.monok.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`): MonoK<`[`A`](../arrow.effects.monok.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`>` |

