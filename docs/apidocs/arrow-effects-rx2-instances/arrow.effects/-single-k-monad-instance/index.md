---
title: SingleKMonadInstance - arrow-effects-rx2-instances
---

[arrow-effects-rx2-instances](../../index.html) / [arrow.effects](../index.html) / [SingleKMonadInstance](./index.html)

# SingleKMonadInstance

`@extension interface SingleKMonadInstance : Monad<ForSingleK>`

### Functions

| [ap](ap.html) | `open fun <A, B> SingleKOf<`[`A`](ap.html#A)`>.ap(ff: SingleKOf<(`[`A`](ap.html#A)`) -> `[`B`](ap.html#B)`>): SingleK<`[`B`](ap.html#B)`>` |
| [flatMap](flat-map.html) | `open fun <A, B> SingleKOf<`[`A`](flat-map.html#A)`>.flatMap(f: (`[`A`](flat-map.html#A)`) -> Kind<ForSingleK, `[`B`](flat-map.html#B)`>): SingleK<`[`B`](flat-map.html#B)`>` |
| [just](just.html) | `open fun <A> just(a: `[`A`](just.html#A)`): SingleK<`[`A`](just.html#A)`>` |
| [map](map.html) | `open fun <A, B> SingleKOf<`[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): SingleK<`[`B`](map.html#B)`>` |
| [tailRecM](tail-rec-m.html) | `open fun <A, B> tailRecM(a: `[`A`](tail-rec-m.html#A)`, f: (`[`A`](tail-rec-m.html#A)`) -> SingleKOf<Either<`[`A`](tail-rec-m.html#A)`, `[`B`](tail-rec-m.html#B)`>>): SingleK<`[`B`](tail-rec-m.html#B)`>` |

### Inheritors

| [SingleKMonadErrorInstance](../-single-k-monad-error-instance/index.html) | `interface SingleKMonadErrorInstance : MonadError<ForSingleK, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>, `[`SingleKMonadInstance`](./index.html) |

