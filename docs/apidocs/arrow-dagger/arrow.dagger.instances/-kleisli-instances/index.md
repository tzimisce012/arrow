---
title: KleisliInstances - arrow-dagger
---

[arrow-dagger](../../index.html) / [arrow.dagger.instances](../index.html) / [KleisliInstances](./index.html)

# KleisliInstances

`abstract class KleisliInstances<F, D>`

### Constructors

| [&lt;init&gt;](-init-.html) | `KleisliInstances()` |

### Functions

| [kleisliApplicative](kleisli-applicative.html) | `fun kleisliApplicative(ev: `[`DaggerKleisliApplicativeInstance`](../-dagger-kleisli-applicative-instance/index.html)`<`[`F`](index.html#F)`, `[`D`](index.html#D)`>): Applicative<KleisliPartialOf<`[`F`](index.html#F)`, `[`D`](index.html#D)`>>` |
| [kleisliApplicativeError](kleisli-applicative-error.html) | `fun kleisliApplicativeError(ev: `[`DaggerKleisliMonadErrorInstance`](../-dagger-kleisli-monad-error-instance/index.html)`<`[`F`](index.html#F)`, `[`D`](index.html#D)`>): ApplicativeError<KleisliPartialOf<`[`F`](index.html#F)`, `[`D`](index.html#D)`>, `[`D`](index.html#D)`>` |
| [kleisliFunctor](kleisli-functor.html) | `fun kleisliFunctor(ev: `[`DaggerKleisliFunctorInstance`](../-dagger-kleisli-functor-instance/index.html)`<`[`F`](index.html#F)`, `[`D`](index.html#D)`>): Functor<KleisliPartialOf<`[`F`](index.html#F)`, `[`D`](index.html#D)`>>` |
| [kleisliMonad](kleisli-monad.html) | `fun kleisliMonad(ev: `[`DaggerKleisliMonadInstance`](../-dagger-kleisli-monad-instance/index.html)`<`[`F`](index.html#F)`, `[`D`](index.html#D)`>): Monad<KleisliPartialOf<`[`F`](index.html#F)`, `[`D`](index.html#D)`>>` |
| [kleisliMonadError](kleisli-monad-error.html) | `fun kleisliMonadError(ev: `[`DaggerKleisliMonadErrorInstance`](../-dagger-kleisli-monad-error-instance/index.html)`<`[`F`](index.html#F)`, `[`D`](index.html#D)`>): MonadError<KleisliPartialOf<`[`F`](index.html#F)`, `[`D`](index.html#D)`>, `[`D`](index.html#D)`>` |

