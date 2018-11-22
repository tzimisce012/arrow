---
title: KleisliApplicativeInstance - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [KleisliApplicativeInstance](./index.html)

# KleisliApplicativeInstance

`@extension interface KleisliApplicativeInstance<F, D> : Applicative<KleisliPartialOf<`[`F`](index.html#F)`, `[`D`](index.html#D)`>>, `[`KleisliFunctorInstance`](../-kleisli-functor-instance/index.html)`<`[`F`](index.html#F)`, `[`D`](index.html#D)`>`

### Functions

| [AF](-a-f.html) | `abstract fun AF(): Applicative<`[`F`](index.html#F)`>` |
| [FF](-f-f.html) | `open fun FF(): Functor<`[`F`](index.html#F)`>` |
| [ap](ap.html) | `open fun <A, B> Kind<KleisliPartialOf<`[`F`](index.html#F)`, `[`D`](index.html#D)`>, `[`A`](ap.html#A)`>.ap(ff: Kind<KleisliPartialOf<`[`F`](index.html#F)`, `[`D`](index.html#D)`>, (`[`A`](ap.html#A)`) -> `[`B`](ap.html#B)`>): Kleisli<`[`F`](index.html#F)`, `[`D`](index.html#D)`, `[`B`](ap.html#B)`>` |
| [just](just.html) | `open fun <A> just(a: `[`A`](just.html#A)`): Kleisli<`[`F`](index.html#F)`, `[`D`](index.html#D)`, `[`A`](just.html#A)`>` |
| [map](map.html) | `open fun <A, B> Kind<KleisliPartialOf<`[`F`](index.html#F)`, `[`D`](index.html#D)`>, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): Kleisli<`[`F`](index.html#F)`, `[`D`](index.html#D)`, `[`B`](map.html#B)`>` |
| [product](product.html) | `open fun <A, B> Kind<KleisliPartialOf<`[`F`](index.html#F)`, `[`D`](index.html#D)`>, `[`A`](product.html#A)`>.product(fb: Kind<KleisliPartialOf<`[`F`](index.html#F)`, `[`D`](index.html#D)`>, `[`B`](product.html#B)`>): Kleisli<`[`F`](index.html#F)`, `[`D`](index.html#D)`, Tuple2<`[`A`](product.html#A)`, `[`B`](product.html#B)`>>` |

### Inheritors

| [KleisliApplicativeErrorInstance](../-kleisli-applicative-error-instance/index.html) | `interface KleisliApplicativeErrorInstance<F, D, E> : ApplicativeError<KleisliPartialOf<`[`F`](../-kleisli-applicative-error-instance/index.html#F)`, `[`D`](../-kleisli-applicative-error-instance/index.html#D)`>, `[`E`](../-kleisli-applicative-error-instance/index.html#E)`>, `[`KleisliApplicativeInstance`](./index.html)`<`[`F`](../-kleisli-applicative-error-instance/index.html#F)`, `[`D`](../-kleisli-applicative-error-instance/index.html#D)`>` |
| [KleisliMonadInstance](../-kleisli-monad-instance/index.html) | `interface KleisliMonadInstance<F, D> : Monad<KleisliPartialOf<`[`F`](../-kleisli-monad-instance/index.html#F)`, `[`D`](../-kleisli-monad-instance/index.html#D)`>>, `[`KleisliApplicativeInstance`](./index.html)`<`[`F`](../-kleisli-monad-instance/index.html#F)`, `[`D`](../-kleisli-monad-instance/index.html#D)`>` |

