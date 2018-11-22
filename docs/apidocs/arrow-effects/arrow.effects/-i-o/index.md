---
title: IO - arrow-effects
---

[arrow-effects](../../index.html) / [arrow.effects](../index.html) / [IO](./index.html)

# IO

`@higherkind sealed class IO<out A> : `[`IOOf`](../-i-o-of.html)`<`[`A`](index.html#A)`>`

### Functions

| [attempt](attempt.html) | `fun attempt(): `[`IO`](./index.html)`<Either<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, `[`A`](index.html#A)`>>` |
| [bracket](bracket.html) | `fun <B> bracket(release: (`[`A`](index.html#A)`) -> `[`IO`](./index.html)`<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>, use: (`[`A`](index.html#A)`) -> `[`IO`](./index.html)`<`[`B`](bracket.html#B)`>): `[`IO`](./index.html)`<`[`B`](bracket.html#B)`>` |
| [bracketCase](bracket-case.html) | `fun <B> bracketCase(release: (`[`A`](index.html#A)`, `[`ExitCase`](../../arrow.effects.typeclasses/-exit-case/index.html)`<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>) -> `[`IO`](./index.html)`<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>, use: (`[`A`](index.html#A)`) -> `[`IO`](./index.html)`<`[`B`](bracket-case.html#B)`>): `[`IO`](./index.html)`<`[`B`](bracket-case.html#B)`>` |
| [continueOn](continue-on.html) | `open fun continueOn(ctx: `[`CoroutineContext`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.coroutines/-coroutine-context/index.html)`): `[`IO`](./index.html)`<`[`A`](index.html#A)`>` |
| [flatMap](flat-map.html) | `open fun <B> flatMap(f: (`[`A`](index.html#A)`) -> `[`IOOf`](../-i-o-of.html)`<`[`B`](flat-map.html#B)`>): `[`IO`](./index.html)`<`[`B`](flat-map.html#B)`>` |
| [guarantee](guarantee.html) | `fun guarantee(finalizer: `[`IO`](./index.html)`<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>): `[`IO`](./index.html)`<`[`A`](index.html#A)`>` |
| [guaranteeCase](guarantee-case.html) | `fun guaranteeCase(finalizer: (`[`ExitCase`](../../arrow.effects.typeclasses/-exit-case/index.html)`<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>) -> `[`IO`](./index.html)`<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>): `[`IO`](./index.html)`<`[`A`](index.html#A)`>` |
| [map](map.html) | `open fun <B> map(f: (`[`A`](index.html#A)`) -> `[`B`](map.html#B)`): `[`IO`](./index.html)`<`[`B`](map.html#B)`>` |
| [runAsync](run-async.html) | `fun runAsync(cb: (Either<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, `[`A`](index.html#A)`>) -> `[`IOOf`](../-i-o-of.html)`<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>): `[`IO`](./index.html)`<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>` |
| [runAsyncCancellable](run-async-cancellable.html) | `fun runAsyncCancellable(onCancel: `[`OnCancel`](../-on-cancel/index.html)` = Silent, cb: (Either<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, `[`A`](index.html#A)`>) -> `[`IOOf`](../-i-o-of.html)`<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>): `[`IO`](./index.html)`<`[`Disposable`](../../arrow.effects.typeclasses/-disposable.html)`>` |
| [uncancelable](uncancelable.html) | `fun uncancelable(): `[`IO`](./index.html)`<`[`A`](index.html#A)`>`<br>Makes the source `IO` uninterruptible such that a [Fiber.cancel](#) signal has no effect. |
| [unsafeRunAsync](unsafe-run-async.html) | `fun unsafeRunAsync(cb: (Either<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, `[`A`](index.html#A)`>) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [unsafeRunAsyncCancellable](unsafe-run-async-cancellable.html) | `fun unsafeRunAsyncCancellable(onCancel: `[`OnCancel`](../-on-cancel/index.html)` = Silent, cb: (Either<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, `[`A`](index.html#A)`>) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Disposable`](../../arrow.effects.typeclasses/-disposable.html) |
| [unsafeRunSync](unsafe-run-sync.html) | `fun unsafeRunSync(): `[`A`](index.html#A) |
| [unsafeRunTimed](unsafe-run-timed.html) | `fun unsafeRunTimed(limit: `[`Duration`](../../arrow.effects.typeclasses/-duration/index.html)`): Option<`[`A`](index.html#A)`>` |

### Companion Object Properties

| [lazy](lazy.html) | `val lazy: `[`IO`](./index.html)`<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>` |
| [never](never.html) | `val never: `[`IO`](./index.html)`<`[`Nothing`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-nothing/index.html)`>` |
| [unit](unit.html) | `val unit: `[`IO`](./index.html)`<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>` |

### Companion Object Functions

| [async](async.html) | `fun <A> async(k: `[`IOProc`](../-i-o-proc.html)`<`[`A`](async.html#A)`>): `[`IO`](./index.html)`<`[`A`](async.html#A)`>` |
| [defer](defer.html) | `fun <A> defer(f: () -> `[`IOOf`](../-i-o-of.html)`<`[`A`](defer.html#A)`>): `[`IO`](./index.html)`<`[`A`](defer.html#A)`>` |
| [eval](eval.html) | `fun <A> eval(eval: Eval<`[`A`](eval.html#A)`>): `[`IO`](./index.html)`<`[`A`](eval.html#A)`>` |
| [invoke](invoke.html) | `operator fun <A> invoke(f: () -> `[`A`](invoke.html#A)`): `[`IO`](./index.html)`<`[`A`](invoke.html#A)`>`<br>`operator fun <A> invoke(ctx: `[`CoroutineContext`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.coroutines/-coroutine-context/index.html)`, f: () -> `[`A`](invoke.html#A)`): `[`IO`](./index.html)`<`[`A`](invoke.html#A)`>` |
| [just](just.html) | `fun <A> just(a: `[`A`](just.html#A)`): `[`IO`](./index.html)`<`[`A`](just.html#A)`>` |
| [raiseError](raise-error.html) | `fun <A> raiseError(e: `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`): `[`IO`](./index.html)`<`[`A`](raise-error.html#A)`>` |
| [tailRecM](tail-rec-m.html) | `fun <A, B> tailRecM(a: `[`A`](tail-rec-m.html#A)`, f: (`[`A`](tail-rec-m.html#A)`) -> `[`IOOf`](../-i-o-of.html)`<Either<`[`A`](tail-rec-m.html#A)`, `[`B`](tail-rec-m.html#B)`>>): `[`IO`](./index.html)`<`[`B`](tail-rec-m.html#B)`>` |

### Extension Functions

| [ap](../arrow.-kind/ap.html) | `fun <A, B> `[`IOOf`](../-i-o-of.html)`<`[`A`](../arrow.-kind/ap.html#A)`>.ap(ff: `[`IOOf`](../-i-o-of.html)`<(`[`A`](../arrow.-kind/ap.html#A)`) -> `[`B`](../arrow.-kind/ap.html#B)`>): `[`IO`](./index.html)`<`[`B`](../arrow.-kind/ap.html#B)`>` |
| [fix](../arrow.-kind/fix.html) | `fun <A> `[`IOOf`](../-i-o-of.html)`<`[`A`](../arrow.-kind/fix.html#A)`>.fix(): `[`IO`](./index.html)`<`[`A`](../arrow.-kind/fix.html#A)`>` |
| [handleErrorWith](../arrow.-kind/handle-error-with.html) | `fun <A> `[`IOOf`](../-i-o-of.html)`<`[`A`](../arrow.-kind/handle-error-with.html#A)`>.handleErrorWith(f: (`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`) -> `[`IOOf`](../-i-o-of.html)`<`[`A`](../arrow.-kind/handle-error-with.html#A)`>): `[`IO`](./index.html)`<`[`A`](../arrow.-kind/handle-error-with.html#A)`>` |

