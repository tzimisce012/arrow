---
title: ValidatedTraverseInstance - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [ValidatedTraverseInstance](./index.html)

# ValidatedTraverseInstance

`@extension interface ValidatedTraverseInstance<E> : Traverse<ValidatedPartialOf<`[`E`](index.html#E)`>>, `[`ValidatedFoldableInstance`](../-validated-foldable-instance/index.html)`<`[`E`](index.html#E)`>`

### Functions

| [traverse](traverse.html) | `open fun <G, A, B> Kind<ValidatedPartialOf<`[`E`](index.html#E)`>, `[`A`](traverse.html#A)`>.traverse(AP: Applicative<`[`G`](traverse.html#G)`>, f: (`[`A`](traverse.html#A)`) -> Kind<`[`G`](traverse.html#G)`, `[`B`](traverse.html#B)`>): Kind<`[`G`](traverse.html#G)`, Validated<`[`E`](index.html#E)`, `[`B`](traverse.html#B)`>>` |

### Inheritors

| [ValidatedContext](../-validated-context/index.html) | `class ValidatedContext<L> : `[`ValidatedApplicativeErrorInstance`](../-validated-applicative-error-instance/index.html)`<`[`L`](../-validated-context/index.html#L)`>, `[`ValidatedTraverseInstance`](./index.html)`<`[`L`](../-validated-context/index.html#L)`>, `[`ValidatedSemigroupKInstance`](../-validated-semigroup-k-instance/index.html)`<`[`L`](../-validated-context/index.html#L)`>` |

