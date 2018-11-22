---
title: KleisliApplicativeErrorInstance - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [KleisliApplicativeErrorInstance](./index.html)

# KleisliApplicativeErrorInstance

`@extension interface KleisliApplicativeErrorInstance<F, D, E> : ApplicativeError<KleisliPartialOf<`[`F`](index.html#F)`, `[`D`](index.html#D)`>, `[`E`](index.html#E)`>, `[`KleisliApplicativeInstance`](../-kleisli-applicative-instance/index.html)`<`[`F`](index.html#F)`, `[`D`](index.html#D)`>`

### Functions

| [AE](-a-e.html) | `abstract fun AE(): ApplicativeError<`[`F`](index.html#F)`, `[`E`](index.html#E)`>` |
| [AF](-a-f.html) | `open fun AF(): Applicative<`[`F`](index.html#F)`>` |
| [handleErrorWith](handle-error-with.html) | `open fun <A> Kind<KleisliPartialOf<`[`F`](index.html#F)`, `[`D`](index.html#D)`>, `[`A`](handle-error-with.html#A)`>.handleErrorWith(f: (`[`E`](index.html#E)`) -> Kind<KleisliPartialOf<`[`F`](index.html#F)`, `[`D`](index.html#D)`>, `[`A`](handle-error-with.html#A)`>): Kleisli<`[`F`](index.html#F)`, `[`D`](index.html#D)`, `[`A`](handle-error-with.html#A)`>` |
| [raiseError](raise-error.html) | `open fun <A> raiseError(e: `[`E`](index.html#E)`): Kleisli<`[`F`](index.html#F)`, `[`D`](index.html#D)`, `[`A`](raise-error.html#A)`>` |

### Inherited Functions

| [FF](../-kleisli-applicative-instance/-f-f.html) | `open fun FF(): Functor<`[`F`](../-kleisli-applicative-instance/index.html#F)`>` |

### Inheritors

| [KleisliMonadErrorInstance](../-kleisli-monad-error-instance/index.html) | `interface KleisliMonadErrorInstance<F, D, E> : MonadError<KleisliPartialOf<`[`F`](../-kleisli-monad-error-instance/index.html#F)`, `[`D`](../-kleisli-monad-error-instance/index.html#D)`>, `[`E`](../-kleisli-monad-error-instance/index.html#E)`>, `[`KleisliApplicativeErrorInstance`](./index.html)`<`[`F`](../-kleisli-monad-error-instance/index.html#F)`, `[`D`](../-kleisli-monad-error-instance/index.html#D)`, `[`E`](../-kleisli-monad-error-instance/index.html#E)`>, `[`KleisliMonadInstance`](../-kleisli-monad-instance/index.html)`<`[`F`](../-kleisli-monad-error-instance/index.html#F)`, `[`D`](../-kleisli-monad-error-instance/index.html#D)`>` |

