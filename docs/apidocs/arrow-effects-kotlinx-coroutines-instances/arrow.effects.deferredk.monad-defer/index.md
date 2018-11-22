---
title: arrow.effects.deferredk.monadDefer - arrow-effects-kotlinx-coroutines-instances
---

[arrow-effects-kotlinx-coroutines-instances](../index.html) / [arrow.effects.deferredk.monadDefer](./index.html)

## Package arrow.effects.deferredk.monadDefer

### Functions

| [bindingCancellable](binding-cancellable.html) | `fun <B> bindingCancellable(arg0: suspend MonadDeferCancellableContinuation<ForDeferredK, *>.() -> `[`B`](binding-cancellable.html#B)`): Tuple2<Kind<ForDeferredK, `[`B`](binding-cancellable.html#B)`>, () -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>` |
| [defer](defer.html) | `fun <A> defer(arg0: () -> Kind<ForDeferredK, `[`A`](defer.html#A)`>): DeferredK<`[`A`](defer.html#A)`>` |
| [deferUnsafe](defer-unsafe.html) | `fun <A> deferUnsafe(arg0: () -> Either<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, `[`A`](defer-unsafe.html#A)`>): DeferredK<`[`A`](defer-unsafe.html#A)`>` |
| [delay](delay.html) | `fun <A> delay(arg0: () -> `[`A`](delay.html#A)`): DeferredK<`[`A`](delay.html#A)`>` |
| [invoke](invoke.html) | `fun <A> invoke(arg0: () -> `[`A`](invoke.html#A)`): DeferredK<`[`A`](invoke.html#A)`>` |
| [lazy](lazy.html) | `fun lazy(): DeferredK<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>` |

### Companion Object Functions

| [monadDefer](monad-defer.html) | `fun DeferredK.Companion.monadDefer(): `[`DeferredKMonadDeferInstance`](../arrow.effects/-deferred-k-monad-defer-instance/index.html) |

