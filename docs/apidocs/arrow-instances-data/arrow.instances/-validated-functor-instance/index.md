---
title: ValidatedFunctorInstance - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [ValidatedFunctorInstance](./index.html)

# ValidatedFunctorInstance

`@extension interface ValidatedFunctorInstance<E> : Functor<ValidatedPartialOf<`[`E`](index.html#E)`>>`

### Functions

| [map](map.html) | `open fun <A, B> Kind<ValidatedPartialOf<`[`E`](index.html#E)`>, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): Validated<`[`E`](index.html#E)`, `[`B`](map.html#B)`>` |

### Inheritors

| [ValidatedApplicativeInstance](../-validated-applicative-instance/index.html) | `interface ValidatedApplicativeInstance<E> : Applicative<ValidatedPartialOf<`[`E`](../-validated-applicative-instance/index.html#E)`>>, `[`ValidatedFunctorInstance`](./index.html)`<`[`E`](../-validated-applicative-instance/index.html#E)`>` |

