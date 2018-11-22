---
title: ValidatedSemigroupKInstance - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [ValidatedSemigroupKInstance](./index.html)

# ValidatedSemigroupKInstance

`@extension interface ValidatedSemigroupKInstance<E> : SemigroupK<ValidatedPartialOf<`[`E`](index.html#E)`>>`

### Functions

| [SE](-s-e.html) | `abstract fun SE(): Semigroup<`[`E`](index.html#E)`>` |
| [combineK](combine-k.html) | `open fun <B> Kind<ValidatedPartialOf<`[`E`](index.html#E)`>, `[`B`](combine-k.html#B)`>.combineK(y: Kind<ValidatedPartialOf<`[`E`](index.html#E)`>, `[`B`](combine-k.html#B)`>): Validated<`[`E`](index.html#E)`, `[`B`](combine-k.html#B)`>` |

### Inheritors

| [ValidatedContext](../-validated-context/index.html) | `class ValidatedContext<L> : `[`ValidatedApplicativeErrorInstance`](../-validated-applicative-error-instance/index.html)`<`[`L`](../-validated-context/index.html#L)`>, `[`ValidatedTraverseInstance`](../-validated-traverse-instance/index.html)`<`[`L`](../-validated-context/index.html#L)`>, `[`ValidatedSemigroupKInstance`](./index.html)`<`[`L`](../-validated-context/index.html#L)`>` |

