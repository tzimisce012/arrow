---
title: EitherContext - arrow-instances-core
---

[arrow-instances-core](../../index.html) / [arrow.instances](../index.html) / [EitherContext](./index.html)

# EitherContext

`class EitherContext<L> : `[`EitherMonadErrorInstance`](../-either-monad-error-instance.html)`<`[`L`](index.html#L)`>, `[`EitherTraverseInstance`](../-either-traverse-instance/index.html)`<`[`L`](index.html#L)`>, `[`EitherSemigroupKInstance`](../-either-semigroup-k-instance/index.html)`<`[`L`](index.html#L)`>`

### Constructors

| [&lt;init&gt;](-init-.html) | `EitherContext()` |

### Functions

| [map](map.html) | `fun <A, B> Kind<EitherPartialOf<`[`L`](index.html#L)`>, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): Either<`[`L`](index.html#L)`, `[`B`](map.html#B)`>` |

### Inherited Functions

| [combineK](../-either-semigroup-k-instance/combine-k.html) | `open fun <A> Kind<EitherPartialOf<`[`L`](../-either-semigroup-k-instance/index.html#L)`>, `[`A`](../-either-semigroup-k-instance/combine-k.html#A)`>.combineK(y: Kind<EitherPartialOf<`[`L`](../-either-semigroup-k-instance/index.html#L)`>, `[`A`](../-either-semigroup-k-instance/combine-k.html#A)`>): Either<`[`L`](../-either-semigroup-k-instance/index.html#L)`, `[`A`](../-either-semigroup-k-instance/combine-k.html#A)`>` |
| [traverse](../-either-traverse-instance/traverse.html) | `open fun <G, A, B> Kind<EitherPartialOf<`[`L`](../-either-traverse-instance/index.html#L)`>, `[`A`](../-either-traverse-instance/traverse.html#A)`>.traverse(AP: Applicative<`[`G`](../-either-traverse-instance/traverse.html#G)`>, f: (`[`A`](../-either-traverse-instance/traverse.html#A)`) -> Kind<`[`G`](../-either-traverse-instance/traverse.html#G)`, `[`B`](../-either-traverse-instance/traverse.html#B)`>): Kind<`[`G`](../-either-traverse-instance/traverse.html#G)`, Kind<EitherPartialOf<`[`L`](../-either-traverse-instance/index.html#L)`>, `[`B`](../-either-traverse-instance/traverse.html#B)`>>` |

