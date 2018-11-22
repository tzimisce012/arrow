---
title: Promise - arrow-effects
---

[arrow-effects](../../index.html) / [arrow.effects](../index.html) / [Promise](./index.html)

# Promise

`interface Promise<F, A>`

When made, a [Promise](./index.html) is empty. Until it is fulfilled, which can only happen once.

A [Promise](./index.html) guarantees (promises) [A](index.html#A) at some point in the future within the context of [F](index.html#F).
Note that since [F](index.html#F) is constrained to [Async](../../arrow.effects.typeclasses/-async/index.html) an error can also occur.

### Types

| [AlreadyFulfilled](-already-fulfilled.html) | `object AlreadyFulfilled : `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html) |

### Properties

| [get](get.html) | `abstract val get: Kind<`[`F`](index.html#F)`, `[`A`](index.html#A)`>`<br>Get the promised value. Suspending the fiber running the action until the result is available. |

### Functions

| [complete](complete.html) | `abstract fun complete(a: `[`A`](index.html#A)`): Kind<`[`F`](index.html#F)`, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>`<br>Completes the promise with the specified value [A](index.html#A). |
| [error](error.html) | `abstract fun error(throwable: `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`): Kind<`[`F`](index.html#F)`, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>`<br>Errors the promise with the specified [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html). |

### Companion Object Functions

| [uncancelable](uncancelable.html) | `fun <F, A> uncancelable(AS: `[`Async`](../../arrow.effects.typeclasses/-async/index.html)`<`[`F`](uncancelable.html#F)`>): Kind<`[`F`](uncancelable.html#F)`, `[`Promise`](./index.html)`<`[`F`](uncancelable.html#F)`, `[`A`](uncancelable.html#A)`>>`<br>Creates an empty `Promise` from on [Async](../../arrow.effects.typeclasses/-async/index.html) instance for [F](uncancelable.html#F). Does not support cancellation of [get](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/get.html) operation. |
| [unsafeCancellable](unsafe-cancellable.html) | `fun <F, A> unsafeCancellable(AS: `[`Async`](../../arrow.effects.typeclasses/-async/index.html)`<`[`F`](unsafe-cancellable.html#F)`>): `[`Promise`](./index.html)`<`[`F`](unsafe-cancellable.html#F)`, `[`A`](unsafe-cancellable.html#A)`>`<br>Creates an empty `Promise` from on [Async](../../arrow.effects.typeclasses/-async/index.html) instance for [F](unsafe-cancellable.html#F). Does not support cancellation of [get](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/get.html) operation. This method is considered unsafe because it is not referentially transparent -- it allocates mutable state. |

