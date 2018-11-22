---
title: StateTApplicativeInstance - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [StateTApplicativeInstance](./index.html)

# StateTApplicativeInstance

`@extension interface StateTApplicativeInstance<F, S> : Applicative<StateTPartialOf<`[`F`](index.html#F)`, `[`S`](index.html#S)`>>, `[`StateTFunctorInstance`](../-state-t-functor-instance/index.html)`<`[`F`](index.html#F)`, `[`S`](index.html#S)`>`

### Functions

| [FF](-f-f.html) | `open fun FF(): Functor<`[`F`](index.html#F)`>` |
| [MF](-m-f.html) | `abstract fun MF(): Monad<`[`F`](index.html#F)`>` |
| [ap](ap.html) | `open fun <A, B> Kind<StateTPartialOf<`[`F`](index.html#F)`, `[`S`](index.html#S)`>, `[`A`](ap.html#A)`>.ap(ff: Kind<StateTPartialOf<`[`F`](index.html#F)`, `[`S`](index.html#S)`>, (`[`A`](ap.html#A)`) -> `[`B`](ap.html#B)`>): StateT<`[`F`](index.html#F)`, `[`S`](index.html#S)`, `[`B`](ap.html#B)`>` |
| [just](just.html) | `open fun <A> just(a: `[`A`](just.html#A)`): StateT<`[`F`](index.html#F)`, `[`S`](index.html#S)`, `[`A`](just.html#A)`>` |
| [map](map.html) | `open fun <A, B> Kind<StateTPartialOf<`[`F`](index.html#F)`, `[`S`](index.html#S)`>, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): StateT<`[`F`](index.html#F)`, `[`S`](index.html#S)`, `[`B`](map.html#B)`>` |
| [product](product.html) | `open fun <A, B> Kind<StateTPartialOf<`[`F`](index.html#F)`, `[`S`](index.html#S)`>, `[`A`](product.html#A)`>.product(fb: Kind<StateTPartialOf<`[`F`](index.html#F)`, `[`S`](index.html#S)`>, `[`B`](product.html#B)`>): StateT<`[`F`](index.html#F)`, `[`S`](index.html#S)`, Tuple2<`[`A`](product.html#A)`, `[`B`](product.html#B)`>>` |

### Inheritors

| [StateTApplicativeErrorInstance](../-state-t-applicative-error-instance/index.html) | `interface StateTApplicativeErrorInstance<F, S, E> : ApplicativeError<StateTPartialOf<`[`F`](../-state-t-applicative-error-instance/index.html#F)`, `[`S`](../-state-t-applicative-error-instance/index.html#S)`>, `[`E`](../-state-t-applicative-error-instance/index.html#E)`>, `[`StateTApplicativeInstance`](./index.html)`<`[`F`](../-state-t-applicative-error-instance/index.html#F)`, `[`S`](../-state-t-applicative-error-instance/index.html#S)`>` |
| [StateTMonadInstance](../-state-t-monad-instance/index.html) | `interface StateTMonadInstance<F, S> : Monad<StateTPartialOf<`[`F`](../-state-t-monad-instance/index.html#F)`, `[`S`](../-state-t-monad-instance/index.html#S)`>>, `[`StateTApplicativeInstance`](./index.html)`<`[`F`](../-state-t-monad-instance/index.html#F)`, `[`S`](../-state-t-monad-instance/index.html#S)`>` |

