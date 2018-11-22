---
title: EitherTSemigroupKInstance - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [EitherTSemigroupKInstance](./index.html)

# EitherTSemigroupKInstance

`interface EitherTSemigroupKInstance<F, L> : SemigroupK<EitherTPartialOf<`[`F`](index.html#F)`, `[`L`](index.html#L)`>>`

### Functions

| [MF](-m-f.html) | `abstract fun MF(): Monad<`[`F`](index.html#F)`>` |
| [combineK](combine-k.html) | `open fun <A> Kind<EitherTPartialOf<`[`F`](index.html#F)`, `[`L`](index.html#L)`>, `[`A`](combine-k.html#A)`>.combineK(y: Kind<EitherTPartialOf<`[`F`](index.html#F)`, `[`L`](index.html#L)`>, `[`A`](combine-k.html#A)`>): EitherT<`[`F`](index.html#F)`, `[`L`](index.html#L)`, `[`A`](combine-k.html#A)`>` |

### Inheritors

| [EitherTContext](../-either-t-context/index.html) | `class EitherTContext<F, E> : `[`EitherTMonadErrorInstance`](../-either-t-monad-error-instance.html)`<`[`F`](../-either-t-context/index.html#F)`, `[`E`](../-either-t-context/index.html#E)`>, `[`EitherTSemigroupKInstance`](./index.html)`<`[`F`](../-either-t-context/index.html#F)`, `[`E`](../-either-t-context/index.html#E)`>` |

