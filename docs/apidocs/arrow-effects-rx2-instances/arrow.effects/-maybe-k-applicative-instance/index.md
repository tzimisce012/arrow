---
title: MaybeKApplicativeInstance - arrow-effects-rx2-instances
---

[arrow-effects-rx2-instances](../../index.html) / [arrow.effects](../index.html) / [MaybeKApplicativeInstance](./index.html)

# MaybeKApplicativeInstance

`@extension interface MaybeKApplicativeInstance : Applicative<ForMaybeK>`

### Functions

| [ap](ap.html) | `open fun <A, B> MaybeKOf<`[`A`](ap.html#A)`>.ap(ff: MaybeKOf<(`[`A`](ap.html#A)`) -> `[`B`](ap.html#B)`>): MaybeK<`[`B`](ap.html#B)`>` |
| [just](just.html) | `open fun <A> just(a: `[`A`](just.html#A)`): MaybeK<`[`A`](just.html#A)`>` |
| [map](map.html) | `open fun <A, B> Kind<ForMaybeK, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): MaybeK<`[`B`](map.html#B)`>` |

### Inheritors

| [MaybeKApplicativeErrorInstance](../-maybe-k-applicative-error-instance/index.html) | `interface MaybeKApplicativeErrorInstance : ApplicativeError<ForMaybeK, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>, `[`MaybeKApplicativeInstance`](./index.html) |

