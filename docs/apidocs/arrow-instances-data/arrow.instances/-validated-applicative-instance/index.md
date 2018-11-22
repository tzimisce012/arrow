---
title: ValidatedApplicativeInstance - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [ValidatedApplicativeInstance](./index.html)

# ValidatedApplicativeInstance

`@extension interface ValidatedApplicativeInstance<E> : Applicative<ValidatedPartialOf<`[`E`](index.html#E)`>>, `[`ValidatedFunctorInstance`](../-validated-functor-instance/index.html)`<`[`E`](index.html#E)`>`

### Functions

| [SE](-s-e.html) | `abstract fun SE(): Semigroup<`[`E`](index.html#E)`>` |
| [ap](ap.html) | `open fun <A, B> Kind<ValidatedPartialOf<`[`E`](index.html#E)`>, `[`A`](ap.html#A)`>.ap(ff: Kind<ValidatedPartialOf<`[`E`](index.html#E)`>, (`[`A`](ap.html#A)`) -> `[`B`](ap.html#B)`>): Validated<`[`E`](index.html#E)`, `[`B`](ap.html#B)`>` |
| [just](just.html) | `open fun <A> just(a: `[`A`](just.html#A)`): Validated<`[`E`](index.html#E)`, `[`A`](just.html#A)`>` |
| [map](map.html) | `open fun <A, B> Kind<ValidatedPartialOf<`[`E`](index.html#E)`>, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): Validated<`[`E`](index.html#E)`, `[`B`](map.html#B)`>` |

### Inheritors

| [ValidatedApplicativeErrorInstance](../-validated-applicative-error-instance/index.html) | `interface ValidatedApplicativeErrorInstance<E> : ApplicativeError<ValidatedPartialOf<`[`E`](../-validated-applicative-error-instance/index.html#E)`>, `[`E`](../-validated-applicative-error-instance/index.html#E)`>, `[`ValidatedApplicativeInstance`](./index.html)`<`[`E`](../-validated-applicative-error-instance/index.html#E)`>` |

