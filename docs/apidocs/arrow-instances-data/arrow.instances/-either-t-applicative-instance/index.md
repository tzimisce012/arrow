---
title: EitherTApplicativeInstance - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [EitherTApplicativeInstance](./index.html)

# EitherTApplicativeInstance

`interface EitherTApplicativeInstance<F, L> : Applicative<EitherTPartialOf<`[`F`](index.html#F)`, `[`L`](index.html#L)`>>, `[`EitherTFunctorInstance`](../-either-t-functor-instance/index.html)`<`[`F`](index.html#F)`, `[`L`](index.html#L)`>`

### Functions

| [MF](-m-f.html) | `abstract fun MF(): Monad<`[`F`](index.html#F)`>` |
| [ap](ap.html) | `open fun <A, B> Kind<EitherTPartialOf<`[`F`](index.html#F)`, `[`L`](index.html#L)`>, `[`A`](ap.html#A)`>.ap(ff: Kind<EitherTPartialOf<`[`F`](index.html#F)`, `[`L`](index.html#L)`>, (`[`A`](ap.html#A)`) -> `[`B`](ap.html#B)`>): EitherT<`[`F`](index.html#F)`, `[`L`](index.html#L)`, `[`B`](ap.html#B)`>` |
| [just](just.html) | `open fun <A> just(a: `[`A`](just.html#A)`): EitherT<`[`F`](index.html#F)`, `[`L`](index.html#L)`, `[`A`](just.html#A)`>` |
| [map](map.html) | `open fun <A, B> Kind<EitherTPartialOf<`[`F`](index.html#F)`, `[`L`](index.html#L)`>, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): EitherT<`[`F`](index.html#F)`, `[`L`](index.html#L)`, `[`B`](map.html#B)`>` |

### Inherited Functions

| [FF](../-either-t-functor-instance/-f-f.html) | `abstract fun FF(): Functor<`[`F`](../-either-t-functor-instance/index.html#F)`>` |

### Inheritors

| [EitherTApplicativeErrorInstance](../-either-t-applicative-error-instance/index.html) | `interface EitherTApplicativeErrorInstance<F, L> : ApplicativeError<EitherTPartialOf<`[`F`](../-either-t-applicative-error-instance/index.html#F)`, `[`L`](../-either-t-applicative-error-instance/index.html#L)`>, `[`L`](../-either-t-applicative-error-instance/index.html#L)`>, `[`EitherTApplicativeInstance`](./index.html)`<`[`F`](../-either-t-applicative-error-instance/index.html#F)`, `[`L`](../-either-t-applicative-error-instance/index.html#L)`>` |
| [EitherTMonadInstance](../-either-t-monad-instance/index.html) | `interface EitherTMonadInstance<F, L> : Monad<EitherTPartialOf<`[`F`](../-either-t-monad-instance/index.html#F)`, `[`L`](../-either-t-monad-instance/index.html#L)`>>, `[`EitherTApplicativeInstance`](./index.html)`<`[`F`](../-either-t-monad-instance/index.html#F)`, `[`L`](../-either-t-monad-instance/index.html#L)`>` |

