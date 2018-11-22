---
title: OptionTApplicativeInstance - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [OptionTApplicativeInstance](./index.html)

# OptionTApplicativeInstance

`@extension interface OptionTApplicativeInstance<F> : Applicative<OptionTPartialOf<`[`F`](index.html#F)`>>, `[`OptionTFunctorInstance`](../-option-t-functor-instance/index.html)`<`[`F`](index.html#F)`>`

### Functions

| [FF](-f-f.html) | `open fun FF(): Functor<`[`F`](index.html#F)`>` |
| [MF](-m-f.html) | `abstract fun MF(): Monad<`[`F`](index.html#F)`>` |
| [ap](ap.html) | `open fun <A, B> Kind<OptionTPartialOf<`[`F`](index.html#F)`>, `[`A`](ap.html#A)`>.ap(ff: Kind<OptionTPartialOf<`[`F`](index.html#F)`>, (`[`A`](ap.html#A)`) -> `[`B`](ap.html#B)`>): OptionT<`[`F`](index.html#F)`, `[`B`](ap.html#B)`>` |
| [just](just.html) | `open fun <A> just(a: `[`A`](just.html#A)`): OptionT<`[`F`](index.html#F)`, `[`A`](just.html#A)`>` |
| [map](map.html) | `open fun <A, B> Kind<OptionTPartialOf<`[`F`](index.html#F)`>, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): OptionT<`[`F`](index.html#F)`, `[`B`](map.html#B)`>` |

### Inheritors

| [OptionTMonadInstance](../-option-t-monad-instance/index.html) | `interface OptionTMonadInstance<F> : Monad<OptionTPartialOf<`[`F`](../-option-t-monad-instance/index.html#F)`>>, `[`OptionTApplicativeInstance`](./index.html)`<`[`F`](../-option-t-monad-instance/index.html#F)`>` |

