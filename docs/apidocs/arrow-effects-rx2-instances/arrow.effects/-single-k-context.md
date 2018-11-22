---
title: SingleKContext - arrow-effects-rx2-instances
---

[arrow-effects-rx2-instances](../index.html) / [arrow.effects](index.html) / [SingleKContext](./-single-k-context.html)

# SingleKContext

`object SingleKContext : `[`SingleKConcurrentEffectInstance`](-single-k-concurrent-effect-instance/index.html)

### Inherited Functions

| [runAsyncCancellable](-single-k-concurrent-effect-instance/run-async-cancellable.html) | `open fun <A> Kind<ForSingleK, `[`A`](-single-k-concurrent-effect-instance/run-async-cancellable.html#A)`>.runAsyncCancellable(cb: (Either<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, `[`A`](-single-k-concurrent-effect-instance/run-async-cancellable.html#A)`>) -> SingleKOf<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>): SingleK<Disposable>` |

### Extension Functions

| [catch](../arrow.effects.singlek.applicative-error/arrow.typeclasses.-applicative-error/catch.html) | `fun <A> ApplicativeError<ForSingleK, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>.catch(arg1: () -> `[`A`](../arrow.effects.singlek.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`): SingleK<`[`A`](../arrow.effects.singlek.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`>` |

