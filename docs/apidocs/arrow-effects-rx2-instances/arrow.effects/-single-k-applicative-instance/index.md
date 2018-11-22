---
title: SingleKApplicativeInstance - arrow-effects-rx2-instances
---

[arrow-effects-rx2-instances](../../index.html) / [arrow.effects](../index.html) / [SingleKApplicativeInstance](./index.html)

# SingleKApplicativeInstance

`@extension interface SingleKApplicativeInstance : Applicative<ForSingleK>`

### Functions

| [ap](ap.html) | `open fun <A, B> SingleKOf<`[`A`](ap.html#A)`>.ap(ff: SingleKOf<(`[`A`](ap.html#A)`) -> `[`B`](ap.html#B)`>): SingleK<`[`B`](ap.html#B)`>` |
| [just](just.html) | `open fun <A> just(a: `[`A`](just.html#A)`): SingleK<`[`A`](just.html#A)`>` |
| [map](map.html) | `open fun <A, B> Kind<ForSingleK, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): SingleK<`[`B`](map.html#B)`>` |

### Inheritors

| [SingleKApplicativeErrorInstance](../-single-k-applicative-error-instance/index.html) | `interface SingleKApplicativeErrorInstance : ApplicativeError<ForSingleK, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>, `[`SingleKApplicativeInstance`](./index.html) |

