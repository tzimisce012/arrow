---
title: EitherSemigroupKInstance - arrow-instances-core
---

[arrow-instances-core](../../index.html) / [arrow.instances](../index.html) / [EitherSemigroupKInstance](./index.html)

# EitherSemigroupKInstance

`@extension interface EitherSemigroupKInstance<L> : SemigroupK<EitherPartialOf<`[`L`](index.html#L)`>>`

### Functions

| [combineK](combine-k.html) | `open fun <A> Kind<EitherPartialOf<`[`L`](index.html#L)`>, `[`A`](combine-k.html#A)`>.combineK(y: Kind<EitherPartialOf<`[`L`](index.html#L)`>, `[`A`](combine-k.html#A)`>): Either<`[`L`](index.html#L)`, `[`A`](combine-k.html#A)`>` |

### Inheritors

| [EitherContext](../-either-context/index.html) | `class EitherContext<L> : `[`EitherMonadErrorInstance`](../-either-monad-error-instance.html)`<`[`L`](../-either-context/index.html#L)`>, `[`EitherTraverseInstance`](../-either-traverse-instance/index.html)`<`[`L`](../-either-context/index.html#L)`>, `[`EitherSemigroupKInstance`](./index.html)`<`[`L`](../-either-context/index.html#L)`>` |

