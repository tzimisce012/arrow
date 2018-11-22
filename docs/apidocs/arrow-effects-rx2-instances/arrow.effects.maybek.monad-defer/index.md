---
title: arrow.effects.maybek.monadDefer - arrow-effects-rx2-instances
---

[arrow-effects-rx2-instances](../index.html) / [arrow.effects.maybek.monadDefer](./index.html)

## Package arrow.effects.maybek.monadDefer

### Functions

| [bindingCancellable](binding-cancellable.html) | `fun <B> bindingCancellable(arg0: suspend MonadDeferCancellableContinuation<ForMaybeK, *>.() -> `[`B`](binding-cancellable.html#B)`): Tuple2<Kind<ForMaybeK, `[`B`](binding-cancellable.html#B)`>, () -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>` |
| [defer](defer.html) | `fun <A> defer(arg0: () -> Kind<ForMaybeK, `[`A`](defer.html#A)`>): MaybeK<`[`A`](defer.html#A)`>` |
| [deferUnsafe](defer-unsafe.html) | `fun <A> deferUnsafe(arg0: () -> Either<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, `[`A`](defer-unsafe.html#A)`>): MaybeK<`[`A`](defer-unsafe.html#A)`>` |
| [delay](delay.html) | `fun <A> delay(arg0: () -> `[`A`](delay.html#A)`): MaybeK<`[`A`](delay.html#A)`>` |
| [invoke](invoke.html) | `fun <A> invoke(arg0: () -> `[`A`](invoke.html#A)`): MaybeK<`[`A`](invoke.html#A)`>` |
| [lazy](lazy.html) | `fun lazy(): MaybeK<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>` |

### Companion Object Functions

| [monadDefer](monad-defer.html) | `fun MaybeK.Companion.monadDefer(): `[`MaybeKMonadDeferInstance`](../arrow.effects/-maybe-k-monad-defer-instance/index.html) |

