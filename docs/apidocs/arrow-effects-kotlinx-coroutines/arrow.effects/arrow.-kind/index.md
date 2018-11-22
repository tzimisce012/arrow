---
title: arrow.effects.arrow.Kind - arrow-effects-kotlinx-coroutines
---

[arrow-effects-kotlinx-coroutines](../../index.html) / [arrow.effects](../index.html) / [arrow.Kind](./index.html)

### Extensions for arrow.Kind

| [await](await.html) | `suspend fun <A> `[`DeferredKOf`](../-deferred-k-of.html)`<`[`A`](await.html#A)`>.await(): `[`A`](await.html#A) |
| [fix](fix.html) | `fun <A> `[`DeferredKOf`](../-deferred-k-of.html)`<`[`A`](fix.html#A)`>.fix(): `[`DeferredK`](../-deferred-k/index.html)`<`[`A`](fix.html#A)`>` |
| [handleErrorWith](handle-error-with.html) | `fun <A> `[`DeferredKOf`](../-deferred-k-of.html)`<`[`A`](handle-error-with.html#A)`>.handleErrorWith(f: (`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`) -> `[`DeferredK`](../-deferred-k/index.html)`<`[`A`](handle-error-with.html#A)`>): `[`DeferredK`](../-deferred-k/index.html)`<`[`A`](handle-error-with.html#A)`>` |
| [runAsync](run-async.html) | `fun <A> `[`DeferredKOf`](../-deferred-k-of.html)`<`[`A`](run-async.html#A)`>.runAsync(cb: (Either<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, `[`A`](run-async.html#A)`>) -> `[`DeferredKOf`](../-deferred-k-of.html)`<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>): `[`DeferredK`](../-deferred-k/index.html)`<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>` |
| [runAsyncCancellable](run-async-cancellable.html) | `fun <A> `[`DeferredKOf`](../-deferred-k-of.html)`<`[`A`](run-async-cancellable.html#A)`>.runAsyncCancellable(onCancel: OnCancel = OnCancel.Silent, cb: (Either<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, `[`A`](run-async-cancellable.html#A)`>) -> `[`DeferredKOf`](../-deferred-k-of.html)`<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>): `[`DeferredK`](../-deferred-k/index.html)`<Disposable>` |
| [scope](scope.html) | `fun <A> `[`DeferredKOf`](../-deferred-k-of.html)`<`[`A`](scope.html#A)`>.scope(): CoroutineScope` |
| [unsafeAttemptSync](unsafe-attempt-sync.html) | `fun <A> `[`DeferredKOf`](../-deferred-k-of.html)`<`[`A`](unsafe-attempt-sync.html#A)`>.unsafeAttemptSync(): Try<`[`A`](unsafe-attempt-sync.html#A)`>` |
| [unsafeRunAsync](unsafe-run-async.html) | `fun <A> `[`DeferredKOf`](../-deferred-k-of.html)`<`[`A`](unsafe-run-async.html#A)`>.unsafeRunAsync(cb: (Either<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, `[`A`](unsafe-run-async.html#A)`>) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [unsafeRunSync](unsafe-run-sync.html) | `fun <A> `[`DeferredKOf`](../-deferred-k-of.html)`<`[`A`](unsafe-run-sync.html#A)`>.unsafeRunSync(): `[`A`](unsafe-run-sync.html#A) |
| [value](value.html) | `fun <A> `[`DeferredKOf`](../-deferred-k-of.html)`<`[`A`](value.html#A)`>.value(): Deferred<`[`A`](value.html#A)`>` |

