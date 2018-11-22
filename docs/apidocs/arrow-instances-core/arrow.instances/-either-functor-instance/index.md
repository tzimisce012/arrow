---
title: EitherFunctorInstance - arrow-instances-core
---

[arrow-instances-core](../../index.html) / [arrow.instances](../index.html) / [EitherFunctorInstance](./index.html)

# EitherFunctorInstance

`@extension interface EitherFunctorInstance<L> : Functor<EitherPartialOf<`[`L`](index.html#L)`>>`

### Functions

| [map](map.html) | `open fun <A, B> Kind<EitherPartialOf<`[`L`](index.html#L)`>, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): Either<`[`L`](index.html#L)`, `[`B`](map.html#B)`>` |

### Inheritors

| [EitherApplicativeInstance](../-either-applicative-instance/index.html) | `interface EitherApplicativeInstance<L> : Applicative<EitherPartialOf<`[`L`](../-either-applicative-instance/index.html#L)`>>, `[`EitherFunctorInstance`](./index.html)`<`[`L`](../-either-applicative-instance/index.html#L)`>` |

