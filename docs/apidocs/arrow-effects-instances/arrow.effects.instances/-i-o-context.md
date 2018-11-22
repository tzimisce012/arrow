---
title: IOContext - arrow-effects-instances
---

[arrow-effects-instances](../index.html) / [arrow.effects.instances](index.html) / [IOContext](./-i-o-context.html)

# IOContext

`object IOContext : `[`IOConcurrentEffectInstance`](-i-o-concurrent-effect-instance/index.html)

### Inherited Functions

| [runAsyncCancellable](-i-o-concurrent-effect-instance/run-async-cancellable.html) | `open fun <A> Kind<ForIO, `[`A`](-i-o-concurrent-effect-instance/run-async-cancellable.html#A)`>.runAsyncCancellable(cb: (Either<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, `[`A`](-i-o-concurrent-effect-instance/run-async-cancellable.html#A)`>) -> Kind<ForIO, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>): IO<Disposable>` |

### Extension Functions

| [catch](../arrow.effects.instances.io.applicative-error/arrow.typeclasses.-applicative-error/catch.html) | `fun <A> ApplicativeError<ForIO, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>.catch(arg1: () -> `[`A`](../arrow.effects.instances.io.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`): IO<`[`A`](../arrow.effects.instances.io.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`>` |

