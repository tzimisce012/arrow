---
title: FlowableKMonadDeferInstance - arrow-effects-rx2-instances
---

[arrow-effects-rx2-instances](../../index.html) / [arrow.effects](../index.html) / [FlowableKMonadDeferInstance](./index.html)

# FlowableKMonadDeferInstance

`@extension interface FlowableKMonadDeferInstance : MonadDefer<ForFlowableK>, `[`FlowableKBracketInstance`](../-flowable-k-bracket-instance/index.html)

### Functions

| [BS](-b-s.html) | `open fun BS(): BackpressureStrategy` |
| [defer](defer.html) | `open fun <A> defer(fa: () -> FlowableKOf<`[`A`](defer.html#A)`>): FlowableK<`[`A`](defer.html#A)`>` |

### Extension Functions

| [catch](../../arrow.effects.flowablek.applicative-error/arrow.typeclasses.-applicative-error/catch.html) | `fun <A> ApplicativeError<ForFlowableK, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>.catch(arg1: () -> `[`A`](../../arrow.effects.flowablek.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`): FlowableK<`[`A`](../../arrow.effects.flowablek.applicative-error/arrow.typeclasses.-applicative-error/catch.html#A)`>` |

### Inheritors

| [FlowableKAsyncInstance](../-flowable-k-async-instance/index.html) | `interface FlowableKAsyncInstance : Async<ForFlowableK>, `[`FlowableKMonadDeferInstance`](./index.html) |

