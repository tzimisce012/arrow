---
title: arrow.effects.observablek.monadDefer - arrow-effects-rx2-instances
---

[arrow-effects-rx2-instances](../index.html) / [arrow.effects.observablek.monadDefer](./index.html)

## Package arrow.effects.observablek.monadDefer

### Functions

| [bindingCancellable](binding-cancellable.html) | `fun <B> bindingCancellable(arg0: suspend MonadDeferCancellableContinuation<ForObservableK, *>.() -> `[`B`](binding-cancellable.html#B)`): Tuple2<Kind<ForObservableK, `[`B`](binding-cancellable.html#B)`>, () -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>` |
| [defer](defer.html) | `fun <A> defer(arg0: () -> Kind<ForObservableK, `[`A`](defer.html#A)`>): ObservableK<`[`A`](defer.html#A)`>` |
| [deferUnsafe](defer-unsafe.html) | `fun <A> deferUnsafe(arg0: () -> Either<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, `[`A`](defer-unsafe.html#A)`>): ObservableK<`[`A`](defer-unsafe.html#A)`>` |
| [delay](delay.html) | `fun <A> delay(arg0: () -> `[`A`](delay.html#A)`): ObservableK<`[`A`](delay.html#A)`>` |
| [invoke](invoke.html) | `fun <A> invoke(arg0: () -> `[`A`](invoke.html#A)`): ObservableK<`[`A`](invoke.html#A)`>` |
| [lazy](lazy.html) | `fun lazy(): ObservableK<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>` |

### Companion Object Functions

| [monadDefer](monad-defer.html) | `fun ObservableK.Companion.monadDefer(): `[`ObservableKMonadDeferInstance`](../arrow.effects/-observable-k-monad-defer-instance/index.html) |

