---
title: MonoKMonadInstance - arrow-effects-reactor-instances
---

[arrow-effects-reactor-instances](../../index.html) / [arrow.effects](../index.html) / [MonoKMonadInstance](./index.html)

# MonoKMonadInstance

`@extension interface MonoKMonadInstance : Monad<ForMonoK>`

### Functions

| [ap](ap.html) | `open fun <A, B> MonoKOf<`[`A`](ap.html#A)`>.ap(ff: MonoKOf<(`[`A`](ap.html#A)`) -> `[`B`](ap.html#B)`>): MonoK<`[`B`](ap.html#B)`>` |
| [flatMap](flat-map.html) | `open fun <A, B> MonoKOf<`[`A`](flat-map.html#A)`>.flatMap(f: (`[`A`](flat-map.html#A)`) -> Kind<ForMonoK, `[`B`](flat-map.html#B)`>): MonoK<`[`B`](flat-map.html#B)`>` |
| [just](just.html) | `open fun <A> just(a: `[`A`](just.html#A)`): MonoK<`[`A`](just.html#A)`>` |
| [map](map.html) | `open fun <A, B> MonoKOf<`[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): MonoK<`[`B`](map.html#B)`>` |
| [tailRecM](tail-rec-m.html) | `open fun <A, B> tailRecM(a: `[`A`](tail-rec-m.html#A)`, f: (`[`A`](tail-rec-m.html#A)`) -> MonoKOf<Either<`[`A`](tail-rec-m.html#A)`, `[`B`](tail-rec-m.html#B)`>>): MonoK<`[`B`](tail-rec-m.html#B)`>` |

### Inheritors

| [MonoKMonadErrorInstance](../-mono-k-monad-error-instance/index.html) | `interface MonoKMonadErrorInstance : MonadError<ForMonoK, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>, `[`MonoKMonadInstance`](./index.html) |

