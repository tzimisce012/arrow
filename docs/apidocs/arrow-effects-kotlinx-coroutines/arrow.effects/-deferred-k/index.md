---
title: DeferredK - arrow-effects-kotlinx-coroutines
---

[arrow-effects-kotlinx-coroutines](../../index.html) / [arrow.effects](../index.html) / [DeferredK](./index.html)

# DeferredK

`@higherkind @ExperimentalCoroutinesApi data class DeferredK<out A> : `[`DeferredKOf`](../-deferred-k-of.html)`<`[`A`](index.html#A)`>, Deferred<`[`A`](index.html#A)`>`

### Constructors

| [&lt;init&gt;](-init-.html) | `DeferredK(deferred: Deferred<`[`A`](index.html#A)`>, scope: CoroutineScope = GlobalScope)` |

### Properties

| [scope](scope.html) | `val scope: CoroutineScope` |

### Functions

| [ap](ap.html) | `fun <B> ap(fa: `[`DeferredKOf`](../-deferred-k-of.html)`<(`[`A`](index.html#A)`) -> `[`B`](ap.html#B)`>): `[`DeferredK`](./index.html)`<`[`B`](ap.html#B)`>` |
| [bracketCase](bracket-case.html) | `fun <B> bracketCase(use: (`[`A`](index.html#A)`) -> `[`DeferredK`](./index.html)`<`[`B`](bracket-case.html#B)`>, release: (`[`A`](index.html#A)`, ExitCase<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>) -> `[`DeferredK`](./index.html)`<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>): `[`DeferredK`](./index.html)`<`[`B`](bracket-case.html#B)`>` |
| [continueOn](continue-on.html) | `fun continueOn(ctx: `[`CoroutineContext`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.coroutines/-coroutine-context/index.html)`): `[`DeferredK`](./index.html)`<`[`A`](index.html#A)`>` |
| [equals](equals.html) | `fun equals(other: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [flatMap](flat-map.html) | `fun <B> flatMap(f: (`[`A`](index.html#A)`) -> `[`DeferredKOf`](../-deferred-k-of.html)`<`[`B`](flat-map.html#B)`>): `[`DeferredK`](./index.html)`<`[`B`](flat-map.html#B)`>` |
| [hashCode](hash-code.html) | `fun hashCode(): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [map](map.html) | `fun <B> map(f: (`[`A`](index.html#A)`) -> `[`B`](map.html#B)`): `[`DeferredK`](./index.html)`<`[`B`](map.html#B)`>` |

### Companion Object Functions

| [async](async.html) | `fun <A> async(scope: CoroutineScope = GlobalScope, ctx: `[`CoroutineContext`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.coroutines/-coroutine-context/index.html)` = Dispatchers.Default, start: CoroutineStart = CoroutineStart.DEFAULT, fa: Proc<`[`A`](async.html#A)`>): `[`DeferredK`](./index.html)`<`[`A`](async.html#A)`>`<br>Starts a coroutine that'll run [Proc](#). |
| [defer](defer.html) | `fun <A> defer(scope: CoroutineScope = GlobalScope, ctx: `[`CoroutineContext`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.coroutines/-coroutine-context/index.html)` = Dispatchers.Default, start: CoroutineStart = CoroutineStart.LAZY, f: suspend () -> `[`A`](defer.html#A)`): `[`DeferredK`](./index.html)`<`[`A`](defer.html#A)`>`<br>`fun <A> defer(scope: CoroutineScope = GlobalScope, ctx: `[`CoroutineContext`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.coroutines/-coroutine-context/index.html)` = Dispatchers.Default, start: CoroutineStart = CoroutineStart.LAZY, fa: () -> `[`DeferredKOf`](../-deferred-k-of.html)`<`[`A`](defer.html#A)`>): `[`DeferredK`](./index.html)`<`[`A`](defer.html#A)`>` |
| [failed](failed.html) | `fun <A> failed(t: `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`): `[`DeferredK`](./index.html)`<`[`A`](failed.html#A)`>` |
| [invoke](invoke.html) | `operator fun <A> invoke(scope: CoroutineScope = GlobalScope, ctx: `[`CoroutineContext`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.coroutines/-coroutine-context/index.html)` = Dispatchers.Default, start: CoroutineStart = CoroutineStart.DEFAULT, f: () -> `[`A`](invoke.html#A)`): `[`DeferredK`](./index.html)`<`[`A`](invoke.html#A)`>` |
| [just](just.html) | `fun <A> just(a: `[`A`](just.html#A)`): `[`DeferredK`](./index.html)`<`[`A`](just.html#A)`>` |
| [raiseError](raise-error.html) | `fun <A> raiseError(t: `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`): `[`DeferredK`](./index.html)`<`[`A`](raise-error.html#A)`>` |
| [tailRecM](tail-rec-m.html) | `fun <A, B> tailRecM(a: `[`A`](tail-rec-m.html#A)`, f: (`[`A`](tail-rec-m.html#A)`) -> `[`DeferredKOf`](../-deferred-k-of.html)`<Either<`[`A`](tail-rec-m.html#A)`, `[`B`](tail-rec-m.html#B)`>>): `[`DeferredK`](./index.html)`<`[`B`](tail-rec-m.html#B)`>` |
| [unit](unit.html) | `fun unit(): `[`DeferredK`](./index.html)`<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>` |

### Extension Functions

| [await](../arrow.-kind/await.html) | `suspend fun <A> `[`DeferredKOf`](../-deferred-k-of.html)`<`[`A`](../arrow.-kind/await.html#A)`>.await(): `[`A`](../arrow.-kind/await.html#A) |
| [fix](../arrow.-kind/fix.html) | `fun <A> `[`DeferredKOf`](../-deferred-k-of.html)`<`[`A`](../arrow.-kind/fix.html#A)`>.fix(): `[`DeferredK`](./index.html)`<`[`A`](../arrow.-kind/fix.html#A)`>` |
| [handleErrorWith](../arrow.-kind/handle-error-with.html) | `fun <A> `[`DeferredKOf`](../-deferred-k-of.html)`<`[`A`](../arrow.-kind/handle-error-with.html#A)`>.handleErrorWith(f: (`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`) -> `[`DeferredK`](./index.html)`<`[`A`](../arrow.-kind/handle-error-with.html#A)`>): `[`DeferredK`](./index.html)`<`[`A`](../arrow.-kind/handle-error-with.html#A)`>` |
| [k](../kotlinx.coroutines.-deferred/k.html) | `fun <A> Deferred<`[`A`](../kotlinx.coroutines.-deferred/k.html#A)`>.k(): `[`DeferredK`](./index.html)`<`[`A`](../kotlinx.coroutines.-deferred/k.html#A)`>` |
| [runAsync](../arrow.-kind/run-async.html) | `fun <A> `[`DeferredKOf`](../-deferred-k-of.html)`<`[`A`](../arrow.-kind/run-async.html#A)`>.runAsync(cb: (Either<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, `[`A`](../arrow.-kind/run-async.html#A)`>) -> `[`DeferredKOf`](../-deferred-k-of.html)`<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>): `[`DeferredK`](./index.html)`<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>` |
| [runAsyncCancellable](../arrow.-kind/run-async-cancellable.html) | `fun <A> `[`DeferredKOf`](../-deferred-k-of.html)`<`[`A`](../arrow.-kind/run-async-cancellable.html#A)`>.runAsyncCancellable(onCancel: OnCancel = OnCancel.Silent, cb: (Either<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, `[`A`](../arrow.-kind/run-async-cancellable.html#A)`>) -> `[`DeferredKOf`](../-deferred-k-of.html)`<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>): `[`DeferredK`](./index.html)`<Disposable>` |
| [scope](../arrow.-kind/scope.html) | `fun <A> `[`DeferredKOf`](../-deferred-k-of.html)`<`[`A`](../arrow.-kind/scope.html#A)`>.scope(): CoroutineScope` |
| [unsafeAttemptSync](../arrow.-kind/unsafe-attempt-sync.html) | `fun <A> `[`DeferredKOf`](../-deferred-k-of.html)`<`[`A`](../arrow.-kind/unsafe-attempt-sync.html#A)`>.unsafeAttemptSync(): Try<`[`A`](../arrow.-kind/unsafe-attempt-sync.html#A)`>` |
| [unsafeRunAsync](../arrow.-kind/unsafe-run-async.html) | `fun <A> `[`DeferredKOf`](../-deferred-k-of.html)`<`[`A`](../arrow.-kind/unsafe-run-async.html#A)`>.unsafeRunAsync(cb: (Either<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, `[`A`](../arrow.-kind/unsafe-run-async.html#A)`>) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [unsafeRunSync](../arrow.-kind/unsafe-run-sync.html) | `fun <A> `[`DeferredKOf`](../-deferred-k-of.html)`<`[`A`](../arrow.-kind/unsafe-run-sync.html#A)`>.unsafeRunSync(): `[`A`](../arrow.-kind/unsafe-run-sync.html#A) |
| [value](../arrow.-kind/value.html) | `fun <A> `[`DeferredKOf`](../-deferred-k-of.html)`<`[`A`](../arrow.-kind/value.html#A)`>.value(): Deferred<`[`A`](../arrow.-kind/value.html#A)`>` |

