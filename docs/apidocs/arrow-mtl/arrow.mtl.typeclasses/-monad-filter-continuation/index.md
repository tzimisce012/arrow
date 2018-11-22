---
title: MonadFilterContinuation - arrow-mtl
---

[arrow-mtl](../../index.html) / [arrow.mtl.typeclasses](../index.html) / [MonadFilterContinuation](./index.html)

# MonadFilterContinuation

`open class MonadFilterContinuation<F, A> : MonadContinuation<`[`F`](index.html#F)`, `[`A`](index.html#A)`>`

### Constructors

| [&lt;init&gt;](-init-.html) | `MonadFilterContinuation(MF: `[`MonadFilter`](../-monad-filter/index.html)`<`[`F`](index.html#F)`>, context: `[`CoroutineContext`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.coroutines/-coroutine-context/index.html)` = EmptyCoroutineContext)` |

### Properties

| [MF](-m-f.html) | `val MF: `[`MonadFilter`](../-monad-filter/index.html)`<`[`F`](index.html#F)`>` |
| [context](context.html) | `open val context: `[`CoroutineContext`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.coroutines/-coroutine-context/index.html) |

### Functions

| [bindWithFilter](bind-with-filter.html) | `suspend fun <B> Kind<`[`F`](index.html#F)`, `[`B`](bind-with-filter.html#B)`>.bindWithFilter(f: (`[`B`](bind-with-filter.html#B)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`B`](bind-with-filter.html#B)<br>Binds only if the given predicate matches the inner value otherwise binds into the Monad `empty()` value on `MonadFilter` instances |
| [continueIf](continue-if.html) | `fun continueIf(predicate: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Short circuits monadic bind if `predicate == false` return the monad `empty` value. |
| [resumeWith](resume-with.html) | `open fun resumeWith(result: <ERROR CLASS><Kind<`[`F`](index.html#F)`, `[`A`](index.html#A)`>>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |

