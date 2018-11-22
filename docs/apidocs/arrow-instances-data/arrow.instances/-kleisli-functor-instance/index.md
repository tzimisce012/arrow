---
title: KleisliFunctorInstance - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [KleisliFunctorInstance](./index.html)

# KleisliFunctorInstance

`@extension interface KleisliFunctorInstance<F, D> : Functor<KleisliPartialOf<`[`F`](index.html#F)`, `[`D`](index.html#D)`>>`

### Functions

| [FF](-f-f.html) | `abstract fun FF(): Functor<`[`F`](index.html#F)`>` |
| [map](map.html) | `open fun <A, B> Kind<KleisliPartialOf<`[`F`](index.html#F)`, `[`D`](index.html#D)`>, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): Kleisli<`[`F`](index.html#F)`, `[`D`](index.html#D)`, `[`B`](map.html#B)`>` |

### Inheritors

| [KleisliApplicativeInstance](../-kleisli-applicative-instance/index.html) | `interface KleisliApplicativeInstance<F, D> : Applicative<KleisliPartialOf<`[`F`](../-kleisli-applicative-instance/index.html#F)`, `[`D`](../-kleisli-applicative-instance/index.html#D)`>>, `[`KleisliFunctorInstance`](./index.html)`<`[`F`](../-kleisli-applicative-instance/index.html#F)`, `[`D`](../-kleisli-applicative-instance/index.html#D)`>` |

