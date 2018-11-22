---
title: ObservableKMonadInstance - arrow-effects-rx2-instances
---

[arrow-effects-rx2-instances](../../index.html) / [arrow.effects](../index.html) / [ObservableKMonadInstance](./index.html)

# ObservableKMonadInstance

`@extension interface ObservableKMonadInstance : Monad<ForObservableK>`

### Functions

| [ap](ap.html) | `open fun <A, B> ObservableKOf<`[`A`](ap.html#A)`>.ap(ff: ObservableKOf<(`[`A`](ap.html#A)`) -> `[`B`](ap.html#B)`>): ObservableK<`[`B`](ap.html#B)`>` |
| [flatMap](flat-map.html) | `open fun <A, B> Kind<ForObservableK, `[`A`](flat-map.html#A)`>.flatMap(f: (`[`A`](flat-map.html#A)`) -> Kind<ForObservableK, `[`B`](flat-map.html#B)`>): ObservableK<`[`B`](flat-map.html#B)`>` |
| [just](just.html) | `open fun <A> just(a: `[`A`](just.html#A)`): ObservableK<`[`A`](just.html#A)`>` |
| [map](map.html) | `open fun <A, B> Kind<ForObservableK, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): ObservableK<`[`B`](map.html#B)`>` |
| [tailRecM](tail-rec-m.html) | `open fun <A, B> tailRecM(a: `[`A`](tail-rec-m.html#A)`, f: (`[`A`](tail-rec-m.html#A)`) -> ObservableKOf<Either<`[`A`](tail-rec-m.html#A)`, `[`B`](tail-rec-m.html#B)`>>): ObservableK<`[`B`](tail-rec-m.html#B)`>` |

### Inheritors

| [ObservableKMonadErrorInstance](../-observable-k-monad-error-instance/index.html) | `interface ObservableKMonadErrorInstance : MonadError<ForObservableK, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>, `[`ObservableKMonadInstance`](./index.html) |

