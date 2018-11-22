---
title: arrow.effects.singlek.monadDefer - arrow-effects-rx2-instances
---

[arrow-effects-rx2-instances](../index.html) / [arrow.effects.singlek.monadDefer](./index.html)

## Package arrow.effects.singlek.monadDefer

### Functions

| [bindingCancellable](binding-cancellable.html) | `fun <B> bindingCancellable(arg0: suspend MonadDeferCancellableContinuation<ForSingleK, *>.() -> `[`B`](binding-cancellable.html#B)`): Tuple2<Kind<ForSingleK, `[`B`](binding-cancellable.html#B)`>, () -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>` |
| [defer](defer.html) | `fun <A> defer(arg0: () -> Kind<ForSingleK, `[`A`](defer.html#A)`>): SingleK<`[`A`](defer.html#A)`>` |
| [deferUnsafe](defer-unsafe.html) | `fun <A> deferUnsafe(arg0: () -> Either<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, `[`A`](defer-unsafe.html#A)`>): SingleK<`[`A`](defer-unsafe.html#A)`>` |
| [delay](delay.html) | `fun <A> delay(arg0: () -> `[`A`](delay.html#A)`): SingleK<`[`A`](delay.html#A)`>` |
| [invoke](invoke.html) | `fun <A> invoke(arg0: () -> `[`A`](invoke.html#A)`): SingleK<`[`A`](invoke.html#A)`>` |
| [lazy](lazy.html) | `fun lazy(): SingleK<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>` |

### Companion Object Functions

| [monadDefer](monad-defer.html) | `fun SingleK.Companion.monadDefer(): `[`SingleKMonadDeferInstance`](../arrow.effects/-single-k-monad-defer-instance/index.html) |

