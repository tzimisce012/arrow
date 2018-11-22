---
title: OptionTMonadInstance - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [OptionTMonadInstance](./index.html)

# OptionTMonadInstance

`@extension interface OptionTMonadInstance<F> : Monad<OptionTPartialOf<`[`F`](index.html#F)`>>, `[`OptionTApplicativeInstance`](../-option-t-applicative-instance/index.html)`<`[`F`](index.html#F)`>`

### Functions

| [MF](-m-f.html) | `abstract fun MF(): Monad<`[`F`](index.html#F)`>` |
| [ap](ap.html) | `open fun <A, B> Kind<OptionTPartialOf<`[`F`](index.html#F)`>, `[`A`](ap.html#A)`>.ap(ff: Kind<OptionTPartialOf<`[`F`](index.html#F)`>, (`[`A`](ap.html#A)`) -> `[`B`](ap.html#B)`>): OptionT<`[`F`](index.html#F)`, `[`B`](ap.html#B)`>` |
| [flatMap](flat-map.html) | `open fun <A, B> Kind<OptionTPartialOf<`[`F`](index.html#F)`>, `[`A`](flat-map.html#A)`>.flatMap(f: (`[`A`](flat-map.html#A)`) -> Kind<OptionTPartialOf<`[`F`](index.html#F)`>, `[`B`](flat-map.html#B)`>): OptionT<`[`F`](index.html#F)`, `[`B`](flat-map.html#B)`>` |
| [map](map.html) | `open fun <A, B> Kind<OptionTPartialOf<`[`F`](index.html#F)`>, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): OptionT<`[`F`](index.html#F)`, `[`B`](map.html#B)`>` |
| [tailRecM](tail-rec-m.html) | `open fun <A, B> tailRecM(a: `[`A`](tail-rec-m.html#A)`, f: (`[`A`](tail-rec-m.html#A)`) -> OptionTOf<`[`F`](index.html#F)`, Either<`[`A`](tail-rec-m.html#A)`, `[`B`](tail-rec-m.html#B)`>>): OptionT<`[`F`](index.html#F)`, `[`B`](tail-rec-m.html#B)`>` |

### Inherited Functions

| [FF](../-option-t-applicative-instance/-f-f.html) | `open fun FF(): Functor<`[`F`](../-option-t-applicative-instance/index.html#F)`>` |

### Inheritors

| [OptionTContext](../-option-t-context/index.html) | `class OptionTContext<F> : `[`OptionTMonadInstance`](./index.html)`<`[`F`](../-option-t-context/index.html#F)`>, `[`OptionTMonoidKInstance`](../-option-t-monoid-k-instance/index.html)`<`[`F`](../-option-t-context/index.html#F)`>` |

