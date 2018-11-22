---
title: ConcurrentEffect.runAsyncCancellable - arrow-effects
---

[arrow-effects](../../index.html) / [arrow.effects.typeclasses](../index.html) / [ConcurrentEffect](index.html) / [runAsyncCancellable](./run-async-cancellable.html)

# runAsyncCancellable

`abstract fun <A> Kind<`[`F`](index.html#F)`, `[`A`](run-async-cancellable.html#A)`>.runAsyncCancellable(cb: (Either<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, `[`A`](run-async-cancellable.html#A)`>) -> Kind<`[`F`](index.html#F)`, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>): Kind<`[`F`](index.html#F)`, `[`Disposable`](../-disposable.html)`>`