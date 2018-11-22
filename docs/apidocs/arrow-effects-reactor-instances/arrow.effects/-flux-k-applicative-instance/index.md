---
title: FluxKApplicativeInstance - arrow-effects-reactor-instances
---

[arrow-effects-reactor-instances](../../index.html) / [arrow.effects](../index.html) / [FluxKApplicativeInstance](./index.html)

# FluxKApplicativeInstance

`@extension interface FluxKApplicativeInstance : Applicative<ForFluxK>`

### Functions

| [ap](ap.html) | `open fun <A, B> FluxKOf<`[`A`](ap.html#A)`>.ap(ff: FluxKOf<(`[`A`](ap.html#A)`) -> `[`B`](ap.html#B)`>): FluxK<`[`B`](ap.html#B)`>` |
| [just](just.html) | `open fun <A> just(a: `[`A`](just.html#A)`): FluxK<`[`A`](just.html#A)`>` |
| [map](map.html) | `open fun <A, B> Kind<ForFluxK, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): FluxK<`[`B`](map.html#B)`>` |

### Inheritors

| [FluxKApplicativeErrorInstance](../-flux-k-applicative-error-instance/index.html) | `interface FluxKApplicativeErrorInstance : ApplicativeError<ForFluxK, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>, `[`FluxKApplicativeInstance`](./index.html) |

