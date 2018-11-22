---
title: arrow.effects.flowablek.monadDefer - arrow-effects-rx2-instances
---

[arrow-effects-rx2-instances](../index.html) / [arrow.effects.flowablek.monadDefer](./index.html)

## Package arrow.effects.flowablek.monadDefer

### Functions

| [bindingCancellable](binding-cancellable.html) | `fun <B> bindingCancellable(arg0: suspend MonadDeferCancellableContinuation<ForFlowableK, *>.() -> `[`B`](binding-cancellable.html#B)`): Tuple2<Kind<ForFlowableK, `[`B`](binding-cancellable.html#B)`>, () -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>` |
| [defer](defer.html) | `fun <A> defer(arg0: () -> Kind<ForFlowableK, `[`A`](defer.html#A)`>): FlowableK<`[`A`](defer.html#A)`>` |
| [deferUnsafe](defer-unsafe.html) | `fun <A> deferUnsafe(arg0: () -> Either<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, `[`A`](defer-unsafe.html#A)`>): FlowableK<`[`A`](defer-unsafe.html#A)`>` |
| [delay](delay.html) | `fun <A> delay(arg0: () -> `[`A`](delay.html#A)`): FlowableK<`[`A`](delay.html#A)`>` |
| [invoke](invoke.html) | `fun <A> invoke(arg0: () -> `[`A`](invoke.html#A)`): FlowableK<`[`A`](invoke.html#A)`>` |
| [lazy](lazy.html) | `fun lazy(): FlowableK<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>` |

### Companion Object Functions

| [monadDefer](monad-defer.html) | `fun FlowableK.Companion.monadDefer(): `[`FlowableKMonadDeferInstance`](../arrow.effects/-flowable-k-monad-defer-instance/index.html) |

