---
title: ValidatedApplicativeErrorInstance - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [ValidatedApplicativeErrorInstance](./index.html)

# ValidatedApplicativeErrorInstance

`@extension interface ValidatedApplicativeErrorInstance<E> : ApplicativeError<ValidatedPartialOf<`[`E`](index.html#E)`>, `[`E`](index.html#E)`>, `[`ValidatedApplicativeInstance`](../-validated-applicative-instance/index.html)`<`[`E`](index.html#E)`>`

### Functions

| [SE](-s-e.html) | `abstract fun SE(): Semigroup<`[`E`](index.html#E)`>` |
| [handleErrorWith](handle-error-with.html) | `open fun <A> Kind<ValidatedPartialOf<`[`E`](index.html#E)`>, `[`A`](handle-error-with.html#A)`>.handleErrorWith(f: (`[`E`](index.html#E)`) -> Kind<ValidatedPartialOf<`[`E`](index.html#E)`>, `[`A`](handle-error-with.html#A)`>): Validated<`[`E`](index.html#E)`, `[`A`](handle-error-with.html#A)`>` |
| [raiseError](raise-error.html) | `open fun <A> raiseError(e: `[`E`](index.html#E)`): Validated<`[`E`](index.html#E)`, `[`A`](raise-error.html#A)`>` |

### Inheritors

| [ValidatedContext](../-validated-context/index.html) | `class ValidatedContext<L> : `[`ValidatedApplicativeErrorInstance`](./index.html)`<`[`L`](../-validated-context/index.html#L)`>, `[`ValidatedTraverseInstance`](../-validated-traverse-instance/index.html)`<`[`L`](../-validated-context/index.html#L)`>, `[`ValidatedSemigroupKInstance`](../-validated-semigroup-k-instance/index.html)`<`[`L`](../-validated-context/index.html#L)`>` |

