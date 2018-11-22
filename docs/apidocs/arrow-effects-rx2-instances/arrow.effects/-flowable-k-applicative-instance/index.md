---
title: FlowableKApplicativeInstance - arrow-effects-rx2-instances
---

[arrow-effects-rx2-instances](../../index.html) / [arrow.effects](../index.html) / [FlowableKApplicativeInstance](./index.html)

# FlowableKApplicativeInstance

`@extension interface FlowableKApplicativeInstance : Applicative<ForFlowableK>`

### Functions

| [ap](ap.html) | `open fun <A, B> FlowableKOf<`[`A`](ap.html#A)`>.ap(ff: FlowableKOf<(`[`A`](ap.html#A)`) -> `[`B`](ap.html#B)`>): FlowableK<`[`B`](ap.html#B)`>` |
| [just](just.html) | `open fun <A> just(a: `[`A`](just.html#A)`): FlowableK<`[`A`](just.html#A)`>` |
| [map](map.html) | `open fun <A, B> Kind<ForFlowableK, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): FlowableK<`[`B`](map.html#B)`>` |

### Inheritors

| [FlowableKApplicativeErrorInstance](../-flowable-k-applicative-error-instance/index.html) | `interface FlowableKApplicativeErrorInstance : ApplicativeError<ForFlowableK, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>, `[`FlowableKApplicativeInstance`](./index.html) |

