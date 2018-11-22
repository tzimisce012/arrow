---
title: KleisliMonadInstance - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [KleisliMonadInstance](./index.html)

# KleisliMonadInstance

`@extension interface KleisliMonadInstance<F, D> : Monad<KleisliPartialOf<`[`F`](index.html#F)`, `[`D`](index.html#D)`>>, `[`KleisliApplicativeInstance`](../-kleisli-applicative-instance/index.html)`<`[`F`](index.html#F)`, `[`D`](index.html#D)`>`

### Functions

| [AF](-a-f.html) | `open fun AF(): Applicative<`[`F`](index.html#F)`>` |
| [MF](-m-f.html) | `abstract fun MF(): Monad<`[`F`](index.html#F)`>` |
| [ap](ap.html) | `open fun <A, B> Kind<KleisliPartialOf<`[`F`](index.html#F)`, `[`D`](index.html#D)`>, `[`A`](ap.html#A)`>.ap(ff: Kind<KleisliPartialOf<`[`F`](index.html#F)`, `[`D`](index.html#D)`>, (`[`A`](ap.html#A)`) -> `[`B`](ap.html#B)`>): Kleisli<`[`F`](index.html#F)`, `[`D`](index.html#D)`, `[`B`](ap.html#B)`>` |
| [flatMap](flat-map.html) | `open fun <A, B> Kind<KleisliPartialOf<`[`F`](index.html#F)`, `[`D`](index.html#D)`>, `[`A`](flat-map.html#A)`>.flatMap(f: (`[`A`](flat-map.html#A)`) -> Kind<KleisliPartialOf<`[`F`](index.html#F)`, `[`D`](index.html#D)`>, `[`B`](flat-map.html#B)`>): Kleisli<`[`F`](index.html#F)`, `[`D`](index.html#D)`, `[`B`](flat-map.html#B)`>` |
| [map](map.html) | `open fun <A, B> Kind<KleisliPartialOf<`[`F`](index.html#F)`, `[`D`](index.html#D)`>, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): Kleisli<`[`F`](index.html#F)`, `[`D`](index.html#D)`, `[`B`](map.html#B)`>` |
| [tailRecM](tail-rec-m.html) | `open fun <A, B> tailRecM(a: `[`A`](tail-rec-m.html#A)`, f: (`[`A`](tail-rec-m.html#A)`) -> KleisliOf<`[`F`](index.html#F)`, `[`D`](index.html#D)`, Either<`[`A`](tail-rec-m.html#A)`, `[`B`](tail-rec-m.html#B)`>>): Kleisli<`[`F`](index.html#F)`, `[`D`](index.html#D)`, `[`B`](tail-rec-m.html#B)`>` |

### Inherited Functions

| [FF](../-kleisli-applicative-instance/-f-f.html) | `open fun FF(): Functor<`[`F`](../-kleisli-applicative-instance/index.html#F)`>` |

### Inheritors

| [KleisliMonadErrorInstance](../-kleisli-monad-error-instance/index.html) | `interface KleisliMonadErrorInstance<F, D, E> : MonadError<KleisliPartialOf<`[`F`](../-kleisli-monad-error-instance/index.html#F)`, `[`D`](../-kleisli-monad-error-instance/index.html#D)`>, `[`E`](../-kleisli-monad-error-instance/index.html#E)`>, `[`KleisliApplicativeErrorInstance`](../-kleisli-applicative-error-instance/index.html)`<`[`F`](../-kleisli-monad-error-instance/index.html#F)`, `[`D`](../-kleisli-monad-error-instance/index.html#D)`, `[`E`](../-kleisli-monad-error-instance/index.html#E)`>, `[`KleisliMonadInstance`](./index.html)`<`[`F`](../-kleisli-monad-error-instance/index.html#F)`, `[`D`](../-kleisli-monad-error-instance/index.html#D)`>` |
| [ReaderContext](../-reader-context/index.html) | `class ReaderContext<D> : `[`KleisliMonadInstance`](./index.html)`<ForId, `[`D`](../-reader-context/index.html#D)`>` |

