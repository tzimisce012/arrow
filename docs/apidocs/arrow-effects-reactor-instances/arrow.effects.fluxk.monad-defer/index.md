---
title: arrow.effects.fluxk.monadDefer - arrow-effects-reactor-instances
---

[arrow-effects-reactor-instances](../index.html) / [arrow.effects.fluxk.monadDefer](./index.html)

## Package arrow.effects.fluxk.monadDefer

### Functions

| [bindingCancellable](binding-cancellable.html) | `fun <B> bindingCancellable(arg0: suspend MonadDeferCancellableContinuation<ForFluxK, *>.() -> `[`B`](binding-cancellable.html#B)`): Tuple2<Kind<ForFluxK, `[`B`](binding-cancellable.html#B)`>, () -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>` |
| [defer](defer.html) | `fun <A> defer(arg0: () -> Kind<ForFluxK, `[`A`](defer.html#A)`>): FluxK<`[`A`](defer.html#A)`>` |
| [deferUnsafe](defer-unsafe.html) | `fun <A> deferUnsafe(arg0: () -> Either<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, `[`A`](defer-unsafe.html#A)`>): FluxK<`[`A`](defer-unsafe.html#A)`>` |
| [delay](delay.html) | `fun <A> delay(arg0: () -> `[`A`](delay.html#A)`): FluxK<`[`A`](delay.html#A)`>` |
| [invoke](invoke.html) | `fun <A> invoke(arg0: () -> `[`A`](invoke.html#A)`): FluxK<`[`A`](invoke.html#A)`>` |
| [lazy](lazy.html) | `fun lazy(): FluxK<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>` |

### Companion Object Functions

| [monadDefer](monad-defer.html) | `fun FluxK.Companion.monadDefer(): `[`FluxKMonadDeferInstance`](../arrow.effects/-flux-k-monad-defer-instance/index.html) |

