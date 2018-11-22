---
title: EitherApplicativeInstance - arrow-instances-core
---

[arrow-instances-core](../../index.html) / [arrow.instances](../index.html) / [EitherApplicativeInstance](./index.html)

# EitherApplicativeInstance

`@extension interface EitherApplicativeInstance<L> : Applicative<EitherPartialOf<`[`L`](index.html#L)`>>, `[`EitherFunctorInstance`](../-either-functor-instance/index.html)`<`[`L`](index.html#L)`>`

### Functions

| [ap](ap.html) | `open fun <A, B> Kind<EitherPartialOf<`[`L`](index.html#L)`>, `[`A`](ap.html#A)`>.ap(ff: Kind<EitherPartialOf<`[`L`](index.html#L)`>, (`[`A`](ap.html#A)`) -> `[`B`](ap.html#B)`>): Either<`[`L`](index.html#L)`, `[`B`](ap.html#B)`>` |
| [just](just.html) | `open fun <A> just(a: `[`A`](just.html#A)`): Either<`[`L`](index.html#L)`, `[`A`](just.html#A)`>` |
| [map](map.html) | `open fun <A, B> Kind<EitherPartialOf<`[`L`](index.html#L)`>, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): Either<`[`L`](index.html#L)`, `[`B`](map.html#B)`>` |

### Inheritors

| [EitherApplicativeErrorInstance](../-either-applicative-error-instance/index.html) | `interface EitherApplicativeErrorInstance<L> : ApplicativeError<EitherPartialOf<`[`L`](../-either-applicative-error-instance/index.html#L)`>, `[`L`](../-either-applicative-error-instance/index.html#L)`>, `[`EitherApplicativeInstance`](./index.html)`<`[`L`](../-either-applicative-error-instance/index.html#L)`>` |
| [EitherMonadInstance](../-either-monad-instance/index.html) | `interface EitherMonadInstance<L> : Monad<EitherPartialOf<`[`L`](../-either-monad-instance/index.html#L)`>>, `[`EitherApplicativeInstance`](./index.html)`<`[`L`](../-either-monad-instance/index.html#L)`>` |

