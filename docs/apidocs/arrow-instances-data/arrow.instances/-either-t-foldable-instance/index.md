---
title: EitherTFoldableInstance - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [EitherTFoldableInstance](./index.html)

# EitherTFoldableInstance

`interface EitherTFoldableInstance<F, L> : Foldable<EitherTPartialOf<`[`F`](index.html#F)`, `[`L`](index.html#L)`>>`

### Functions

| [FFF](-f-f-f.html) | `abstract fun FFF(): Foldable<`[`F`](index.html#F)`>` |
| [foldLeft](fold-left.html) | `open fun <B, C> Kind<EitherTPartialOf<`[`F`](index.html#F)`, `[`L`](index.html#L)`>, `[`B`](fold-left.html#B)`>.foldLeft(b: `[`C`](fold-left.html#C)`, f: (`[`C`](fold-left.html#C)`, `[`B`](fold-left.html#B)`) -> `[`C`](fold-left.html#C)`): `[`C`](fold-left.html#C) |
| [foldRight](fold-right.html) | `open fun <B, C> Kind<EitherTPartialOf<`[`F`](index.html#F)`, `[`L`](index.html#L)`>, `[`B`](fold-right.html#B)`>.foldRight(lb: Eval<`[`C`](fold-right.html#C)`>, f: (`[`B`](fold-right.html#B)`, Eval<`[`C`](fold-right.html#C)`>) -> Eval<`[`C`](fold-right.html#C)`>): Eval<`[`C`](fold-right.html#C)`>` |

### Inheritors

| [EitherTTraverseInstance](../-either-t-traverse-instance/index.html) | `interface EitherTTraverseInstance<F, L> : Traverse<EitherTPartialOf<`[`F`](../-either-t-traverse-instance/index.html#F)`, `[`L`](../-either-t-traverse-instance/index.html#L)`>>, `[`EitherTFunctorInstance`](../-either-t-functor-instance/index.html)`<`[`F`](../-either-t-traverse-instance/index.html#F)`, `[`L`](../-either-t-traverse-instance/index.html#L)`>, `[`EitherTFoldableInstance`](./index.html)`<`[`F`](../-either-t-traverse-instance/index.html#F)`, `[`L`](../-either-t-traverse-instance/index.html#L)`>` |

