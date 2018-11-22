---
title: DeferredKMonadInstance - arrow-effects-kotlinx-coroutines-instances
---

[arrow-effects-kotlinx-coroutines-instances](../../index.html) / [arrow.effects](../index.html) / [DeferredKMonadInstance](./index.html)

# DeferredKMonadInstance

`@extension interface DeferredKMonadInstance : Monad<ForDeferredK>`

### Functions

| [ap](ap.html) | `open fun <A, B> DeferredKOf<`[`A`](ap.html#A)`>.ap(ff: DeferredKOf<(`[`A`](ap.html#A)`) -> `[`B`](ap.html#B)`>): DeferredK<`[`B`](ap.html#B)`>` |
| [flatMap](flat-map.html) | `open fun <A, B> Kind<ForDeferredK, `[`A`](flat-map.html#A)`>.flatMap(f: (`[`A`](flat-map.html#A)`) -> Kind<ForDeferredK, `[`B`](flat-map.html#B)`>): DeferredK<`[`B`](flat-map.html#B)`>` |
| [just](just.html) | `open fun <A> just(a: `[`A`](just.html#A)`): DeferredK<`[`A`](just.html#A)`>` |
| [map](map.html) | `open fun <A, B> Kind<ForDeferredK, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): DeferredK<`[`B`](map.html#B)`>` |
| [tailRecM](tail-rec-m.html) | `open fun <A, B> tailRecM(a: `[`A`](tail-rec-m.html#A)`, f: (`[`A`](tail-rec-m.html#A)`) -> DeferredKOf<Either<`[`A`](tail-rec-m.html#A)`, `[`B`](tail-rec-m.html#B)`>>): DeferredK<`[`B`](tail-rec-m.html#B)`>` |

### Inheritors

| [DeferredKMonadErrorInstance](../-deferred-k-monad-error-instance/index.html) | `interface DeferredKMonadErrorInstance : MonadError<ForDeferredK, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>, `[`DeferredKMonadInstance`](./index.html) |

