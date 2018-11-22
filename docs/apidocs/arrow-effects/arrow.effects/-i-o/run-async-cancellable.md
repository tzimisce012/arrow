---
title: IO.runAsyncCancellable - arrow-effects
---

[arrow-effects](../../index.html) / [arrow.effects](../index.html) / [IO](index.html) / [runAsyncCancellable](./run-async-cancellable.html)

# runAsyncCancellable

`fun runAsyncCancellable(onCancel: `[`OnCancel`](../-on-cancel/index.html)` = Silent, cb: (Either<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, `[`A`](index.html#A)`>) -> `[`IOOf`](../-i-o-of.html)`<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>): `[`IO`](index.html)`<`[`Disposable`](../../arrow.effects.typeclasses/-disposable.html)`>`