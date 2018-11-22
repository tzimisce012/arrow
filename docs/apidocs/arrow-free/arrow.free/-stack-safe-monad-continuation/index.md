---
title: StackSafeMonadContinuation - arrow-free
---

[arrow-free](../../index.html) / [arrow.free](../index.html) / [StackSafeMonadContinuation](./index.html)

# StackSafeMonadContinuation

`open class StackSafeMonadContinuation<F, A> : Continuation<`[`Free`](../-free/index.html)`<`[`F`](index.html#F)`, `[`A`](index.html#A)`>>, Monad<`[`F`](index.html#F)`>`

### Constructors

| [&lt;init&gt;](-init-.html) | `StackSafeMonadContinuation(M: Monad<`[`F`](index.html#F)`>, context: <ERROR CLASS> = EmptyCoroutineContext)` |

### Properties

| [context](context.html) | `open val context: <ERROR CLASS>` |
| [returnedMonad](returned-monad.html) | `lateinit var returnedMonad: `[`Free`](../-free/index.html)`<`[`F`](index.html#F)`, `[`A`](index.html#A)`>` |

### Functions

| [bind](bind.html) | `suspend fun <B> Kind<`[`F`](index.html#F)`, `[`B`](bind.html#B)`>.bind(): `[`B`](bind.html#B)<br>`suspend fun <B> `[`Free`](../-free/index.html)`<`[`F`](index.html#F)`, `[`B`](bind.html#B)`>.bind(): `[`B`](bind.html#B)<br>`suspend fun <B> bind(m: () -> `[`Free`](../-free/index.html)`<`[`F`](index.html#F)`, `[`B`](bind.html#B)`>): `[`B`](bind.html#B) |
| [resume](resume.html) | `open fun resume(value: `[`Free`](../-free/index.html)`<`[`F`](index.html#F)`, `[`A`](index.html#A)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [resumeWithException](resume-with-exception.html) | `open fun resumeWithException(exception: `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |

### Extension Functions

| [bindingStackSafe](../arrow.typeclasses.-monad/binding-stack-safe.html) | `fun <F, B> Monad<`[`F`](../arrow.typeclasses.-monad/binding-stack-safe.html#F)`>.bindingStackSafe(c: suspend `[`StackSafeMonadContinuation`](./index.html)`<`[`F`](../arrow.typeclasses.-monad/binding-stack-safe.html#F)`, *>.() -> `[`B`](../arrow.typeclasses.-monad/binding-stack-safe.html#B)`): `[`Free`](../-free/index.html)`<`[`F`](../arrow.typeclasses.-monad/binding-stack-safe.html#F)`, `[`B`](../arrow.typeclasses.-monad/binding-stack-safe.html#B)`>`<br>Entry point for monad bindings which enables for comprehension. The underlying impl is based on coroutines. A coroutine is initiated and inside [StackSafeMonadContinuation](./index.html) suspended yielding to [flatMap](../arrow.-kind/flat-map.html). Once all the flatMap binds are completed the underlying monad is returned from the act of executing the coroutine. |

