---
title: DeferredKApplicativeInstance - arrow-effects-kotlinx-coroutines-instances
---

[arrow-effects-kotlinx-coroutines-instances](../../index.html) / [arrow.effects](../index.html) / [DeferredKApplicativeInstance](./index.html)

# DeferredKApplicativeInstance

`@extension interface DeferredKApplicativeInstance : Applicative<ForDeferredK>`

### Functions

| [ap](ap.html) | `open fun <A, B> DeferredKOf<`[`A`](ap.html#A)`>.ap(ff: DeferredKOf<(`[`A`](ap.html#A)`) -> `[`B`](ap.html#B)`>): DeferredK<`[`B`](ap.html#B)`>` |
| [just](just.html) | `open fun <A> just(a: `[`A`](just.html#A)`): DeferredK<`[`A`](just.html#A)`>` |
| [map](map.html) | `open fun <A, B> Kind<ForDeferredK, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): DeferredK<`[`B`](map.html#B)`>` |

### Inheritors

| [DeferredKApplicativeErrorInstance](../-deferred-k-applicative-error-instance/index.html) | `interface DeferredKApplicativeErrorInstance : ApplicativeError<ForDeferredK, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>, `[`DeferredKApplicativeInstance`](./index.html) |

