---
title: KleisliMonadErrorInstance - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [KleisliMonadErrorInstance](./index.html)

# KleisliMonadErrorInstance

`@extension interface KleisliMonadErrorInstance<F, D, E> : MonadError<KleisliPartialOf<`[`F`](index.html#F)`, `[`D`](index.html#D)`>, `[`E`](index.html#E)`>, `[`KleisliApplicativeErrorInstance`](../-kleisli-applicative-error-instance/index.html)`<`[`F`](index.html#F)`, `[`D`](index.html#D)`, `[`E`](index.html#E)`>, `[`KleisliMonadInstance`](../-kleisli-monad-instance/index.html)`<`[`F`](index.html#F)`, `[`D`](index.html#D)`>`

### Functions

| [AE](-a-e.html) | `open fun AE(): ApplicativeError<`[`F`](index.html#F)`, `[`E`](index.html#E)`>` |
| [AF](-a-f.html) | `open fun AF(): Applicative<`[`F`](index.html#F)`>` |
| [ME](-m-e.html) | `abstract fun ME(): MonadError<`[`F`](index.html#F)`, `[`E`](index.html#E)`>` |
| [MF](-m-f.html) | `open fun MF(): Monad<`[`F`](index.html#F)`>` |

### Inheritors

| [KleisliContext](../-kleisli-context/index.html) | `class KleisliContext<F, D, E> : `[`KleisliMonadErrorInstance`](./index.html)`<`[`F`](../-kleisli-context/index.html#F)`, `[`D`](../-kleisli-context/index.html#D)`, `[`E`](../-kleisli-context/index.html#E)`>` |

