---
title: EitherTraverseInstance - arrow-instances-core
---

[arrow-instances-core](../../index.html) / [arrow.instances](../index.html) / [EitherTraverseInstance](./index.html)

# EitherTraverseInstance

`@extension interface EitherTraverseInstance<L> : Traverse<EitherPartialOf<`[`L`](index.html#L)`>>, `[`EitherFoldableInstance`](../-either-foldable-instance/index.html)`<`[`L`](index.html#L)`>`

### Functions

| [traverse](traverse.html) | `open fun <G, A, B> Kind<EitherPartialOf<`[`L`](index.html#L)`>, `[`A`](traverse.html#A)`>.traverse(AP: Applicative<`[`G`](traverse.html#G)`>, f: (`[`A`](traverse.html#A)`) -> Kind<`[`G`](traverse.html#G)`, `[`B`](traverse.html#B)`>): Kind<`[`G`](traverse.html#G)`, Kind<EitherPartialOf<`[`L`](index.html#L)`>, `[`B`](traverse.html#B)`>>` |

### Inheritors

| [EitherContext](../-either-context/index.html) | `class EitherContext<L> : `[`EitherMonadErrorInstance`](../-either-monad-error-instance.html)`<`[`L`](../-either-context/index.html#L)`>, `[`EitherTraverseInstance`](./index.html)`<`[`L`](../-either-context/index.html#L)`>, `[`EitherSemigroupKInstance`](../-either-semigroup-k-instance/index.html)`<`[`L`](../-either-context/index.html#L)`>` |

