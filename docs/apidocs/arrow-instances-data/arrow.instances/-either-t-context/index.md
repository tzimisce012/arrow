---
title: EitherTContext - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [EitherTContext](./index.html)

# EitherTContext

`class EitherTContext<F, E> : `[`EitherTMonadErrorInstance`](../-either-t-monad-error-instance.html)`<`[`F`](index.html#F)`, `[`E`](index.html#E)`>, `[`EitherTSemigroupKInstance`](../-either-t-semigroup-k-instance/index.html)`<`[`F`](index.html#F)`, `[`E`](index.html#E)`>`

### Constructors

| [&lt;init&gt;](-init-.html) | `EitherTContext(MF: Monad<`[`F`](index.html#F)`>)` |

### Properties

| [MF](-m-f.html) | `val MF: Monad<`[`F`](index.html#F)`>` |

### Functions

| [FF](-f-f.html) | `fun FF(): Functor<`[`F`](index.html#F)`>` |
| [MF](-m-f.html) | `fun MF(): Monad<`[`F`](index.html#F)`>` |

### Inherited Functions

| [combineK](../-either-t-semigroup-k-instance/combine-k.html) | `open fun <A> Kind<EitherTPartialOf<`[`F`](../-either-t-semigroup-k-instance/index.html#F)`, `[`L`](../-either-t-semigroup-k-instance/index.html#L)`>, `[`A`](../-either-t-semigroup-k-instance/combine-k.html#A)`>.combineK(y: Kind<EitherTPartialOf<`[`F`](../-either-t-semigroup-k-instance/index.html#F)`, `[`L`](../-either-t-semigroup-k-instance/index.html#L)`>, `[`A`](../-either-t-semigroup-k-instance/combine-k.html#A)`>): EitherT<`[`F`](../-either-t-semigroup-k-instance/index.html#F)`, `[`L`](../-either-t-semigroup-k-instance/index.html#L)`, `[`A`](../-either-t-semigroup-k-instance/combine-k.html#A)`>` |

