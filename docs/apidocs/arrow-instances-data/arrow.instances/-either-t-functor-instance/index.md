---
title: EitherTFunctorInstance - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [EitherTFunctorInstance](./index.html)

# EitherTFunctorInstance

`interface EitherTFunctorInstance<F, L> : Functor<EitherTPartialOf<`[`F`](index.html#F)`, `[`L`](index.html#L)`>>`

### Functions

| [FF](-f-f.html) | `abstract fun FF(): Functor<`[`F`](index.html#F)`>` |
| [map](map.html) | `open fun <A, B> Kind<EitherTPartialOf<`[`F`](index.html#F)`, `[`L`](index.html#L)`>, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): EitherT<`[`F`](index.html#F)`, `[`L`](index.html#L)`, `[`B`](map.html#B)`>` |

### Inheritors

| [EitherTApplicativeInstance](../-either-t-applicative-instance/index.html) | `interface EitherTApplicativeInstance<F, L> : Applicative<EitherTPartialOf<`[`F`](../-either-t-applicative-instance/index.html#F)`, `[`L`](../-either-t-applicative-instance/index.html#L)`>>, `[`EitherTFunctorInstance`](./index.html)`<`[`F`](../-either-t-applicative-instance/index.html#F)`, `[`L`](../-either-t-applicative-instance/index.html#L)`>` |
| [EitherTTraverseInstance](../-either-t-traverse-instance/index.html) | `interface EitherTTraverseInstance<F, L> : Traverse<EitherTPartialOf<`[`F`](../-either-t-traverse-instance/index.html#F)`, `[`L`](../-either-t-traverse-instance/index.html#L)`>>, `[`EitherTFunctorInstance`](./index.html)`<`[`F`](../-either-t-traverse-instance/index.html#F)`, `[`L`](../-either-t-traverse-instance/index.html#L)`>, `[`EitherTFoldableInstance`](../-either-t-foldable-instance/index.html)`<`[`F`](../-either-t-traverse-instance/index.html#F)`, `[`L`](../-either-t-traverse-instance/index.html#L)`>` |

