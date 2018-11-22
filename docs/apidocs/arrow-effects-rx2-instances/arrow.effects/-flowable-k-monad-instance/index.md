---
title: FlowableKMonadInstance - arrow-effects-rx2-instances
---

[arrow-effects-rx2-instances](../../index.html) / [arrow.effects](../index.html) / [FlowableKMonadInstance](./index.html)

# FlowableKMonadInstance

`@extension interface FlowableKMonadInstance : Monad<ForFlowableK>`

### Functions

| [ap](ap.html) | `open fun <A, B> FlowableKOf<`[`A`](ap.html#A)`>.ap(ff: FlowableKOf<(`[`A`](ap.html#A)`) -> `[`B`](ap.html#B)`>): FlowableK<`[`B`](ap.html#B)`>` |
| [flatMap](flat-map.html) | `open fun <A, B> FlowableKOf<`[`A`](flat-map.html#A)`>.flatMap(f: (`[`A`](flat-map.html#A)`) -> Kind<ForFlowableK, `[`B`](flat-map.html#B)`>): FlowableK<`[`B`](flat-map.html#B)`>` |
| [just](just.html) | `open fun <A> just(a: `[`A`](just.html#A)`): FlowableK<`[`A`](just.html#A)`>` |
| [map](map.html) | `open fun <A, B> FlowableKOf<`[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): FlowableK<`[`B`](map.html#B)`>` |
| [tailRecM](tail-rec-m.html) | `open fun <A, B> tailRecM(a: `[`A`](tail-rec-m.html#A)`, f: (`[`A`](tail-rec-m.html#A)`) -> FlowableKOf<Either<`[`A`](tail-rec-m.html#A)`, `[`B`](tail-rec-m.html#B)`>>): FlowableK<`[`B`](tail-rec-m.html#B)`>` |

### Inheritors

| [FlowableKMonadErrorInstance](../-flowable-k-monad-error-instance/index.html) | `interface FlowableKMonadErrorInstance : MonadError<ForFlowableK, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>, `[`FlowableKMonadInstance`](./index.html) |

