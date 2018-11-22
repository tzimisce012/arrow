---
title: OptionTFunctorInstance - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [OptionTFunctorInstance](./index.html)

# OptionTFunctorInstance

`@extension interface OptionTFunctorInstance<F> : Functor<OptionTPartialOf<`[`F`](index.html#F)`>>`

### Functions

| [FF](-f-f.html) | `abstract fun FF(): Functor<`[`F`](index.html#F)`>` |
| [map](map.html) | `open fun <A, B> Kind<OptionTPartialOf<`[`F`](index.html#F)`>, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): OptionT<`[`F`](index.html#F)`, `[`B`](map.html#B)`>` |

### Inheritors

| [OptionTApplicativeInstance](../-option-t-applicative-instance/index.html) | `interface OptionTApplicativeInstance<F> : Applicative<OptionTPartialOf<`[`F`](../-option-t-applicative-instance/index.html#F)`>>, `[`OptionTFunctorInstance`](./index.html)`<`[`F`](../-option-t-applicative-instance/index.html#F)`>` |

