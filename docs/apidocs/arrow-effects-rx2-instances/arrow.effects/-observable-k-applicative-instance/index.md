---
title: ObservableKApplicativeInstance - arrow-effects-rx2-instances
---

[arrow-effects-rx2-instances](../../index.html) / [arrow.effects](../index.html) / [ObservableKApplicativeInstance](./index.html)

# ObservableKApplicativeInstance

`@extension interface ObservableKApplicativeInstance : Applicative<ForObservableK>`

### Functions

| [ap](ap.html) | `open fun <A, B> ObservableKOf<`[`A`](ap.html#A)`>.ap(ff: ObservableKOf<(`[`A`](ap.html#A)`) -> `[`B`](ap.html#B)`>): ObservableK<`[`B`](ap.html#B)`>` |
| [just](just.html) | `open fun <A> just(a: `[`A`](just.html#A)`): ObservableK<`[`A`](just.html#A)`>` |
| [map](map.html) | `open fun <A, B> Kind<ForObservableK, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): ObservableK<`[`B`](map.html#B)`>` |

### Inheritors

| [ObservableKApplicativeErrorInstance](../-observable-k-applicative-error-instance/index.html) | `interface ObservableKApplicativeErrorInstance : ApplicativeError<ForObservableK, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>, `[`ObservableKApplicativeInstance`](./index.html) |

