---
title: MaybeKMonadInstance - arrow-effects-rx2-instances
---

[arrow-effects-rx2-instances](../../index.html) / [arrow.effects](../index.html) / [MaybeKMonadInstance](./index.html)

# MaybeKMonadInstance

`@extension interface MaybeKMonadInstance : Monad<ForMaybeK>`

### Functions

| [ap](ap.html) | `open fun <A, B> MaybeKOf<`[`A`](ap.html#A)`>.ap(ff: MaybeKOf<(`[`A`](ap.html#A)`) -> `[`B`](ap.html#B)`>): MaybeK<`[`B`](ap.html#B)`>` |
| [flatMap](flat-map.html) | `open fun <A, B> MaybeKOf<`[`A`](flat-map.html#A)`>.flatMap(f: (`[`A`](flat-map.html#A)`) -> Kind<ForMaybeK, `[`B`](flat-map.html#B)`>): MaybeK<`[`B`](flat-map.html#B)`>` |
| [just](just.html) | `open fun <A> just(a: `[`A`](just.html#A)`): MaybeK<`[`A`](just.html#A)`>` |
| [map](map.html) | `open fun <A, B> MaybeKOf<`[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): MaybeK<`[`B`](map.html#B)`>` |
| [tailRecM](tail-rec-m.html) | `open fun <A, B> tailRecM(a: `[`A`](tail-rec-m.html#A)`, f: (`[`A`](tail-rec-m.html#A)`) -> MaybeKOf<Either<`[`A`](tail-rec-m.html#A)`, `[`B`](tail-rec-m.html#B)`>>): MaybeK<`[`B`](tail-rec-m.html#B)`>` |

### Inheritors

| [MaybeKMonadErrorInstance](../-maybe-k-monad-error-instance/index.html) | `interface MaybeKMonadErrorInstance : MonadError<ForMaybeK, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>, `[`MaybeKMonadInstance`](./index.html) |

