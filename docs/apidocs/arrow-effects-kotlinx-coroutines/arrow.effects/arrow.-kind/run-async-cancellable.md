---
title: runAsyncCancellable - arrow-effects-kotlinx-coroutines
---

[arrow-effects-kotlinx-coroutines](../../index.html) / [arrow.effects](../index.html) / [arrow.Kind](index.html) / [runAsyncCancellable](./run-async-cancellable.html)

# runAsyncCancellable

`fun <A> `[`DeferredKOf`](../-deferred-k-of.html)`<`[`A`](run-async-cancellable.html#A)`>.runAsyncCancellable(onCancel: OnCancel = OnCancel.Silent, cb: (Either<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, `[`A`](run-async-cancellable.html#A)`>) -> `[`DeferredKOf`](../-deferred-k-of.html)`<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>): `[`DeferredK`](../-deferred-k/index.html)`<Disposable>`