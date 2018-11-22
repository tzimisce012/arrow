---
title: arrow.effects.instances.io.monadDefer - arrow-effects-instances
---

[arrow-effects-instances](../index.html) / [arrow.effects.instances.io.monadDefer](./index.html)

## Package arrow.effects.instances.io.monadDefer

### Functions

| [bindingCancellable](binding-cancellable.html) | `fun <B> bindingCancellable(arg0: suspend MonadDeferCancellableContinuation<ForIO, *>.() -> `[`B`](binding-cancellable.html#B)`): Tuple2<Kind<ForIO, `[`B`](binding-cancellable.html#B)`>, () -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>` |
| [defer](defer.html) | `fun <A> defer(arg0: () -> Kind<ForIO, `[`A`](defer.html#A)`>): IO<`[`A`](defer.html#A)`>` |
| [deferUnsafe](defer-unsafe.html) | `fun <A> deferUnsafe(arg0: () -> Either<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, `[`A`](defer-unsafe.html#A)`>): IO<`[`A`](defer-unsafe.html#A)`>` |
| [delay](delay.html) | `fun <A> delay(arg0: () -> `[`A`](delay.html#A)`): IO<`[`A`](delay.html#A)`>` |
| [invoke](invoke.html) | `fun <A> invoke(arg0: () -> `[`A`](invoke.html#A)`): IO<`[`A`](invoke.html#A)`>` |

### Companion Object Functions

| [monadDefer](monad-defer.html) | `fun IO.Companion.monadDefer(): `[`IOMonadDeferInstance`](../arrow.effects.instances/-i-o-monad-defer-instance/index.html) |

