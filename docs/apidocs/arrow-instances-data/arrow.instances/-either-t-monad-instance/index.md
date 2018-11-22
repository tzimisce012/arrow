---
title: EitherTMonadInstance - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [EitherTMonadInstance](./index.html)

# EitherTMonadInstance

`interface EitherTMonadInstance<F, L> : Monad<EitherTPartialOf<`[`F`](index.html#F)`, `[`L`](index.html#L)`>>, `[`EitherTApplicativeInstance`](../-either-t-applicative-instance/index.html)`<`[`F`](index.html#F)`, `[`L`](index.html#L)`>`

### Functions

| [ap](ap.html) | `open fun <A, B> Kind<EitherTPartialOf<`[`F`](index.html#F)`, `[`L`](index.html#L)`>, `[`A`](ap.html#A)`>.ap(ff: Kind<EitherTPartialOf<`[`F`](index.html#F)`, `[`L`](index.html#L)`>, (`[`A`](ap.html#A)`) -> `[`B`](ap.html#B)`>): EitherT<`[`F`](index.html#F)`, `[`L`](index.html#L)`, `[`B`](ap.html#B)`>` |
| [flatMap](flat-map.html) | `open fun <A, B> Kind<EitherTPartialOf<`[`F`](index.html#F)`, `[`L`](index.html#L)`>, `[`A`](flat-map.html#A)`>.flatMap(f: (`[`A`](flat-map.html#A)`) -> Kind<EitherTPartialOf<`[`F`](index.html#F)`, `[`L`](index.html#L)`>, `[`B`](flat-map.html#B)`>): EitherT<`[`F`](index.html#F)`, `[`L`](index.html#L)`, `[`B`](flat-map.html#B)`>` |
| [map](map.html) | `open fun <A, B> Kind<EitherTPartialOf<`[`F`](index.html#F)`, `[`L`](index.html#L)`>, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): EitherT<`[`F`](index.html#F)`, `[`L`](index.html#L)`, `[`B`](map.html#B)`>` |
| [tailRecM](tail-rec-m.html) | `open fun <A, B> tailRecM(a: `[`A`](tail-rec-m.html#A)`, f: (`[`A`](tail-rec-m.html#A)`) -> EitherTOf<`[`F`](index.html#F)`, `[`L`](index.html#L)`, Either<`[`A`](tail-rec-m.html#A)`, `[`B`](tail-rec-m.html#B)`>>): EitherT<`[`F`](index.html#F)`, `[`L`](index.html#L)`, `[`B`](tail-rec-m.html#B)`>` |

### Inherited Functions

| [MF](../-either-t-applicative-instance/-m-f.html) | `abstract fun MF(): Monad<`[`F`](../-either-t-applicative-instance/index.html#F)`>` |

### Inheritors

| [EitherTMonadErrorInstance](../-either-t-monad-error-instance.html) | `interface EitherTMonadErrorInstance<F, L> : MonadError<EitherTPartialOf<`[`F`](../-either-t-monad-error-instance.html#F)`, `[`L`](../-either-t-monad-error-instance.html#L)`>, `[`L`](../-either-t-monad-error-instance.html#L)`>, `[`EitherTApplicativeErrorInstance`](../-either-t-applicative-error-instance/index.html)`<`[`F`](../-either-t-monad-error-instance.html#F)`, `[`L`](../-either-t-monad-error-instance.html#L)`>, `[`EitherTMonadInstance`](./index.html)`<`[`F`](../-either-t-monad-error-instance.html#F)`, `[`L`](../-either-t-monad-error-instance.html#L)`>` |

