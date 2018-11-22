---
title: MonoKApplicativeInstance - arrow-effects-reactor-instances
---

[arrow-effects-reactor-instances](../../index.html) / [arrow.effects](../index.html) / [MonoKApplicativeInstance](./index.html)

# MonoKApplicativeInstance

`@extension interface MonoKApplicativeInstance : Applicative<ForMonoK>`

### Functions

| [ap](ap.html) | `open fun <A, B> MonoKOf<`[`A`](ap.html#A)`>.ap(ff: MonoKOf<(`[`A`](ap.html#A)`) -> `[`B`](ap.html#B)`>): MonoK<`[`B`](ap.html#B)`>` |
| [just](just.html) | `open fun <A> just(a: `[`A`](just.html#A)`): MonoK<`[`A`](just.html#A)`>` |
| [map](map.html) | `open fun <A, B> Kind<ForMonoK, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): MonoK<`[`B`](map.html#B)`>` |

### Inheritors

| [MonoKApplicativeErrorInstance](../-mono-k-applicative-error-instance/index.html) | `interface MonoKApplicativeErrorInstance : ApplicativeError<ForMonoK, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>, `[`MonoKApplicativeInstance`](./index.html) |

