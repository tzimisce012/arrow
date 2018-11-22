---
title: MonoK - arrow-effects-reactor
---

[arrow-effects-reactor](../../index.html) / [arrow.effects](../index.html) / [MonoK](./index.html)

# MonoK

`@higherkind data class MonoK<A> : `[`MonoKOf`](../-mono-k-of.html)`<`[`A`](index.html#A)`>, `[`MonoKKindedJ`](../-mono-k-kinded-j.html)`<`[`A`](index.html#A)`>`

### Constructors

| [&lt;init&gt;](-init-.html) | `MonoK(mono: Mono<`[`A`](index.html#A)`>)` |

### Properties

| [mono](mono.html) | `val mono: Mono<`[`A`](index.html#A)`>` |

### Functions

| [ap](ap.html) | `fun <B> ap(fa: `[`MonoKOf`](../-mono-k-of.html)`<(`[`A`](index.html#A)`) -> `[`B`](ap.html#B)`>): `[`MonoK`](./index.html)`<`[`B`](ap.html#B)`>` |
| [bracketCase](bracket-case.html) | `fun <B> bracketCase(use: (`[`A`](index.html#A)`) -> `[`MonoKOf`](../-mono-k-of.html)`<`[`B`](bracket-case.html#B)`>, release: (`[`A`](index.html#A)`, ExitCase<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>) -> `[`MonoKOf`](../-mono-k-of.html)`<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>): `[`MonoK`](./index.html)`<`[`B`](bracket-case.html#B)`>` |
| [continueOn](continue-on.html) | `fun continueOn(ctx: `[`CoroutineContext`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.coroutines/-coroutine-context/index.html)`): `[`MonoK`](./index.html)`<`[`A`](index.html#A)`>` |
| [equals](equals.html) | `fun equals(other: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [flatMap](flat-map.html) | `fun <B> flatMap(f: (`[`A`](index.html#A)`) -> `[`MonoKOf`](../-mono-k-of.html)`<`[`B`](flat-map.html#B)`>): `[`MonoK`](./index.html)`<`[`B`](flat-map.html#B)`>` |
| [handleErrorWith](handle-error-with.html) | `fun handleErrorWith(function: (`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`) -> `[`MonoK`](./index.html)`<`[`A`](index.html#A)`>): `[`MonoK`](./index.html)`<`[`A`](index.html#A)`>` |
| [hashCode](hash-code.html) | `fun hashCode(): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [map](map.html) | `fun <B> map(f: (`[`A`](index.html#A)`) -> `[`B`](map.html#B)`): `[`MonoK`](./index.html)`<`[`B`](map.html#B)`>` |
| [runAsync](run-async.html) | `fun runAsync(cb: (Either<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, `[`A`](index.html#A)`>) -> `[`MonoKOf`](../-mono-k-of.html)`<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>): `[`MonoK`](./index.html)`<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>` |
| [runAsyncCancellable](run-async-cancellable.html) | `fun runAsyncCancellable(cb: (Either<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, `[`A`](index.html#A)`>) -> `[`MonoKOf`](../-mono-k-of.html)`<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>): `[`MonoK`](./index.html)`<Disposable>` |

### Companion Object Functions

| [async](async.html) | `fun <A> async(fa: Proc<`[`A`](async.html#A)`>): `[`MonoK`](./index.html)`<`[`A`](async.html#A)`>` |
| [defer](defer.html) | `fun <A> defer(fa: () -> `[`MonoKOf`](../-mono-k-of.html)`<`[`A`](defer.html#A)`>): `[`MonoK`](./index.html)`<`[`A`](defer.html#A)`>` |
| [invoke](invoke.html) | `operator fun <A> invoke(fa: () -> `[`A`](invoke.html#A)`): `[`MonoK`](./index.html)`<`[`A`](invoke.html#A)`>` |
| [just](just.html) | `fun <A> just(a: `[`A`](just.html#A)`): `[`MonoK`](./index.html)`<`[`A`](just.html#A)`>` |
| [raiseError](raise-error.html) | `fun <A> raiseError(t: `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`): `[`MonoK`](./index.html)`<`[`A`](raise-error.html#A)`>` |
| [tailRecM](tail-rec-m.html) | `tailrec fun <A, B> tailRecM(a: `[`A`](tail-rec-m.html#A)`, f: (`[`A`](tail-rec-m.html#A)`) -> `[`MonoKOf`](../-mono-k-of.html)`<Either<`[`A`](tail-rec-m.html#A)`, `[`B`](tail-rec-m.html#B)`>>): `[`MonoK`](./index.html)`<`[`B`](tail-rec-m.html#B)`>` |

