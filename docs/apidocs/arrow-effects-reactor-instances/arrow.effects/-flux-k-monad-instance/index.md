---
title: FluxKMonadInstance - arrow-effects-reactor-instances
---

[arrow-effects-reactor-instances](../../index.html) / [arrow.effects](../index.html) / [FluxKMonadInstance](./index.html)

# FluxKMonadInstance

`@extension interface FluxKMonadInstance : Monad<ForFluxK>`

### Functions

| [ap](ap.html) | `open fun <A, B> FluxKOf<`[`A`](ap.html#A)`>.ap(ff: FluxKOf<(`[`A`](ap.html#A)`) -> `[`B`](ap.html#B)`>): FluxK<`[`B`](ap.html#B)`>` |
| [flatMap](flat-map.html) | `open fun <A, B> Kind<ForFluxK, `[`A`](flat-map.html#A)`>.flatMap(f: (`[`A`](flat-map.html#A)`) -> Kind<ForFluxK, `[`B`](flat-map.html#B)`>): FluxK<`[`B`](flat-map.html#B)`>` |
| [just](just.html) | `open fun <A> just(a: `[`A`](just.html#A)`): FluxK<`[`A`](just.html#A)`>` |
| [map](map.html) | `open fun <A, B> Kind<ForFluxK, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): FluxK<`[`B`](map.html#B)`>` |
| [tailRecM](tail-rec-m.html) | `open fun <A, B> tailRecM(a: `[`A`](tail-rec-m.html#A)`, f: (`[`A`](tail-rec-m.html#A)`) -> FluxKOf<Either<`[`A`](tail-rec-m.html#A)`, `[`B`](tail-rec-m.html#B)`>>): FluxK<`[`B`](tail-rec-m.html#B)`>` |

### Inheritors

| [FluxKMonadErrorInstance](../-flux-k-monad-error-instance/index.html) | `interface FluxKMonadErrorInstance : MonadError<ForFluxK, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>, `[`FluxKMonadInstance`](./index.html) |

