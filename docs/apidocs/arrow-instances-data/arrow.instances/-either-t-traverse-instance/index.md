---
title: EitherTTraverseInstance - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [EitherTTraverseInstance](./index.html)

# EitherTTraverseInstance

`interface EitherTTraverseInstance<F, L> : Traverse<EitherTPartialOf<`[`F`](index.html#F)`, `[`L`](index.html#L)`>>, `[`EitherTFunctorInstance`](../-either-t-functor-instance/index.html)`<`[`F`](index.html#F)`, `[`L`](index.html#L)`>, `[`EitherTFoldableInstance`](../-either-t-foldable-instance/index.html)`<`[`F`](index.html#F)`, `[`L`](index.html#L)`>`

### Functions

| [TF](-t-f.html) | `abstract fun TF(): Traverse<`[`F`](index.html#F)`>` |
| [map](map.html) | `open fun <A, B> Kind<EitherTPartialOf<`[`F`](index.html#F)`, `[`L`](index.html#L)`>, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): EitherT<`[`F`](index.html#F)`, `[`L`](index.html#L)`, `[`B`](map.html#B)`>` |
| [traverse](traverse.html) | `open fun <G, B, C> Kind<EitherTPartialOf<`[`F`](index.html#F)`, `[`L`](index.html#L)`>, `[`B`](traverse.html#B)`>.traverse(AP: Applicative<`[`G`](traverse.html#G)`>, f: (`[`B`](traverse.html#B)`) -> Kind<`[`G`](traverse.html#G)`, `[`C`](traverse.html#C)`>): Kind<`[`G`](traverse.html#G)`, EitherT<`[`F`](index.html#F)`, `[`L`](index.html#L)`, `[`C`](traverse.html#C)`>>` |

### Inherited Functions

| [FF](../-either-t-functor-instance/-f-f.html) | `abstract fun FF(): Functor<`[`F`](../-either-t-functor-instance/index.html#F)`>` |
| [FFF](../-either-t-foldable-instance/-f-f-f.html) | `abstract fun FFF(): Foldable<`[`F`](../-either-t-foldable-instance/index.html#F)`>` |

