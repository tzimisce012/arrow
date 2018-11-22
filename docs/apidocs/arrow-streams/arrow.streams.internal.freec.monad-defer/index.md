---
title: arrow.streams.internal.freec.monadDefer - arrow-streams
---

[arrow-streams](../index.html) / [arrow.streams.internal.freec.monadDefer](./index.html)

## Package arrow.streams.internal.freec.monadDefer

### Functions

| [bindingCancellable](binding-cancellable.html) | `fun <F, B> bindingCancellable(arg0: suspend MonadDeferCancellableContinuation<Kind<`[`ForFreeC`](../arrow.streams.internal/-for-free-c.html)`, `[`F`](binding-cancellable.html#F)`>, *>.() -> `[`B`](binding-cancellable.html#B)`): Tuple2<Kind<Kind<`[`ForFreeC`](../arrow.streams.internal/-for-free-c.html)`, `[`F`](binding-cancellable.html#F)`>, `[`B`](binding-cancellable.html#B)`>, () -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>` |
| [defer](defer.html) | `fun <F, A> defer(arg0: () -> Kind<Kind<`[`ForFreeC`](../arrow.streams.internal/-for-free-c.html)`, `[`F`](defer.html#F)`>, `[`A`](defer.html#A)`>): `[`FreeC`](../arrow.streams.internal/-free-c/index.html)`<`[`F`](defer.html#F)`, `[`A`](defer.html#A)`>` |
| [deferUnsafe](defer-unsafe.html) | `fun <F, A> deferUnsafe(arg0: () -> Either<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, `[`A`](defer-unsafe.html#A)`>): `[`FreeC`](../arrow.streams.internal/-free-c/index.html)`<`[`F`](defer-unsafe.html#F)`, `[`A`](defer-unsafe.html#A)`>` |
| [delay](delay.html) | `fun <F, A> delay(arg0: () -> `[`A`](delay.html#A)`): `[`FreeC`](../arrow.streams.internal/-free-c/index.html)`<`[`F`](delay.html#F)`, `[`A`](delay.html#A)`>` |
| [invoke](invoke.html) | `fun <F, A> invoke(arg0: () -> `[`A`](invoke.html#A)`): `[`FreeC`](../arrow.streams.internal/-free-c/index.html)`<`[`F`](invoke.html#F)`, `[`A`](invoke.html#A)`>` |
| [lazy](lazy.html) | `fun <F> lazy(): `[`FreeC`](../arrow.streams.internal/-free-c/index.html)`<`[`F`](lazy.html#F)`, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>` |

### Companion Object Functions

| [monadDefer](monad-defer.html) | `fun <F> FreeC.Companion.monadDefer(): `[`FreeCMonadDefer`](../arrow.streams.internal/-free-c-monad-defer/index.html)`<`[`F`](monad-defer.html#F)`>` |

