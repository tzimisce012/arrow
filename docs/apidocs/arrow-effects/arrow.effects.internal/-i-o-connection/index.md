---
title: IOConnection - arrow-effects
---

[arrow-effects](../../index.html) / [arrow.effects.internal](../index.html) / [IOConnection](./index.html)

# IOConnection

`sealed class IOConnection`

Represents a composite of functions (meant for cancellation) that are stacked. cancel() is idempotent,
and all methods are thread-safe &amp; atomic.

### Functions

| [cancel](cancel.html) | `abstract fun cancel(): CancelToken<`[`ForIO`](../../arrow.effects/-for-i-o.html)`>`<br>Cancels the unit of work represented by this reference. |
| [isCanceled](is-canceled.html) | `abstract fun isCanceled(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [pop](pop.html) | `abstract fun pop(): CancelToken<`[`ForIO`](../../arrow.effects/-for-i-o.html)`>`<br>Removes a cancelable reference from the stack in FIFO order. |
| [push](push.html) | `abstract fun push(token: CancelToken<`[`ForIO`](../../arrow.effects/-for-i-o.html)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Pushes a cancelable reference on the stack, to be popped or canceled later in FIFO order. |
| [pushPair](push-pair.html) | `abstract fun pushPair(lh: `[`IOConnection`](./index.html)`, rh: `[`IOConnection`](./index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>Pushes a pair of IOConnection on the stack, which on cancellation will get trampolined. This is useful in IO.race for example, because combining a whole collection of IO tasks, two by two, can lead to building a cancelable that's stack unsafe. |
| [tryReactivate](try-reactivate.html) | `abstract fun tryReactivate(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Tries to reset an IOConnection, from a cancelled state, back to a pristine state, but only if possible. |

### Companion Object Properties

| [uncancelable](uncancelable.html) | `val uncancelable: `[`IOConnection`](./index.html) |

### Companion Object Functions

| [invoke](invoke.html) | `operator fun invoke(): `[`IOConnection`](./index.html) |

### Extension Functions

| [toDisposable](../to-disposable.html) | `fun `[`IOConnection`](./index.html)`.toDisposable(): `[`Disposable`](../../arrow.effects.typeclasses/-disposable.html) |

