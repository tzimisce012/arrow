---
title: arrow.effects.internal - arrow-effects
---

[arrow-effects](../index.html) / [arrow.effects.internal](./index.html)

## Package arrow.effects.internal

### Types

| [ForwardCancelable](-forward-cancelable/index.html) | `class ForwardCancelable`<br>A placeholder for a [CancelToken](#) that will be set at a later time, the equivalent of a `Deferred[IO, CancelToken]`. Used in the implementation of `bracket`, see [IOBracket](#). |
| [IOCancel](-i-o-cancel/index.html) | `object IOCancel` |
| [IOConnection](-i-o-connection/index.html) | `sealed class IOConnection`<br>Represents a composite of functions (meant for cancellation) that are stacked. cancel() is idempotent, and all methods are thread-safe &amp; atomic. |
| [Platform](-platform/index.html) | `object Platform` |

### Type Aliases

| [JavaCancellationException](-java-cancellation-exception.html) | `typealias JavaCancellationException = `[`CancellationException`](http://docs.oracle.com/javase/6/docs/api/java/util/concurrent/CancellationException.html) |

### Functions

| [parMapCancellable2](par-map-cancellable2.html) | `fun <F, A, B, C> `[`ConcurrentEffect`](../arrow.effects.typeclasses/-concurrent-effect/index.html)`<`[`F`](par-map-cancellable2.html#F)`>.parMapCancellable2(ctx: <ERROR CLASS>, ioA: Kind<`[`F`](par-map-cancellable2.html#F)`, `[`A`](par-map-cancellable2.html#A)`>, ioB: Kind<`[`F`](par-map-cancellable2.html#F)`, `[`B`](par-map-cancellable2.html#B)`>, f: (`[`A`](par-map-cancellable2.html#A)`, `[`B`](par-map-cancellable2.html#B)`) -> `[`C`](par-map-cancellable2.html#C)`, start: (Kind<`[`F`](par-map-cancellable2.html#F)`, `[`Disposable`](../arrow.effects.typeclasses/-disposable.html)`>) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Proc`](../arrow.effects.typeclasses/-proc.html)`<`[`C`](par-map-cancellable2.html#C)`>` |
| [parMapCancellable3](par-map-cancellable3.html) | `fun <F, A, B, C, D> `[`ConcurrentEffect`](../arrow.effects.typeclasses/-concurrent-effect/index.html)`<`[`F`](par-map-cancellable3.html#F)`>.parMapCancellable3(ctx: <ERROR CLASS>, ioA: Kind<`[`F`](par-map-cancellable3.html#F)`, `[`A`](par-map-cancellable3.html#A)`>, ioB: Kind<`[`F`](par-map-cancellable3.html#F)`, `[`B`](par-map-cancellable3.html#B)`>, ioC: Kind<`[`F`](par-map-cancellable3.html#F)`, `[`C`](par-map-cancellable3.html#C)`>, f: (`[`A`](par-map-cancellable3.html#A)`, `[`B`](par-map-cancellable3.html#B)`, `[`C`](par-map-cancellable3.html#C)`) -> `[`D`](par-map-cancellable3.html#D)`, start: (Kind<`[`F`](par-map-cancellable3.html#F)`, `[`Disposable`](../arrow.effects.typeclasses/-disposable.html)`>) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): `[`Proc`](../arrow.effects.typeclasses/-proc.html)`<`[`D`](par-map-cancellable3.html#D)`>` |
| [toDisposable](to-disposable.html) | `fun `[`IOConnection`](-i-o-connection/index.html)`.toDisposable(): `[`Disposable`](../arrow.effects.typeclasses/-disposable.html) |

