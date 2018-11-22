---
title: MonadDeferCancellableContinuation - arrow-effects
---

[arrow-effects](../../index.html) / [arrow.effects.typeclasses](../index.html) / [MonadDeferCancellableContinuation](./index.html)

# MonadDeferCancellableContinuation

`open class MonadDeferCancellableContinuation<F, A> : MonadErrorContinuation<`[`F`](index.html#F)`, `[`A`](index.html#A)`>, `[`MonadDefer`](../-monad-defer/index.html)`<`[`F`](index.html#F)`>`

### Constructors

| [&lt;init&gt;](-init-.html) | `MonadDeferCancellableContinuation(SC: `[`MonadDefer`](../-monad-defer/index.html)`<`[`F`](index.html#F)`>, context: `[`CoroutineContext`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.coroutines/-coroutine-context/index.html)` = EmptyCoroutineContext)` |

### Properties

| [cancelled](cancelled.html) | `val cancelled: `[`AtomicBoolean`](http://docs.oracle.com/javase/6/docs/api/java/util/concurrent/atomic/AtomicBoolean.html) |
| [context](context.html) | `open val context: `[`CoroutineContext`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.coroutines/-coroutine-context/index.html) |

### Functions

| [bind](bind.html) | `open suspend fun <B> bind(m: () -> Kind<`[`F`](index.html#F)`, `[`B`](bind.html#B)`>): `[`B`](bind.html#B) |
| [bindDefer](bind-defer.html) | `suspend fun <B> bindDefer(f: () -> `[`B`](bind-defer.html#B)`): `[`B`](bind-defer.html#B) |
| [bindDeferIn](bind-defer-in.html) | `suspend fun <B> bindDeferIn(context: `[`CoroutineContext`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.coroutines/-coroutine-context/index.html)`, f: () -> `[`B`](bind-defer-in.html#B)`): `[`B`](bind-defer-in.html#B) |
| [bindDeferUnsafe](bind-defer-unsafe.html) | `suspend fun <B> bindDeferUnsafe(f: () -> Either<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, `[`B`](bind-defer-unsafe.html#B)`>): `[`B`](bind-defer-unsafe.html#B) |
| [bindIn](bind-in.html) | `open suspend fun <B> bindIn(context: `[`CoroutineContext`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.coroutines/-coroutine-context/index.html)`, m: () -> `[`B`](bind-in.html#B)`): `[`B`](bind-in.html#B) |
| [disposable](disposable.html) | `fun disposable(): `[`Disposable`](../-disposable.html) |
| [returnedMonad](returned-monad.html) | `open fun returnedMonad(): Kind<`[`F`](index.html#F)`, `[`A`](index.html#A)`>` |

