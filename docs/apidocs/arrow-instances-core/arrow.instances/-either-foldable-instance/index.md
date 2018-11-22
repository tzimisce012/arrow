---
title: EitherFoldableInstance - arrow-instances-core
---

[arrow-instances-core](../../index.html) / [arrow.instances](../index.html) / [EitherFoldableInstance](./index.html)

# EitherFoldableInstance

`@extension interface EitherFoldableInstance<L> : Foldable<EitherPartialOf<`[`L`](index.html#L)`>>`

### Functions

| [foldLeft](fold-left.html) | `open fun <A, B> Kind<EitherPartialOf<`[`L`](index.html#L)`>, `[`A`](fold-left.html#A)`>.foldLeft(b: `[`B`](fold-left.html#B)`, f: (`[`B`](fold-left.html#B)`, `[`A`](fold-left.html#A)`) -> `[`B`](fold-left.html#B)`): `[`B`](fold-left.html#B) |
| [foldRight](fold-right.html) | `open fun <A, B> Kind<EitherPartialOf<`[`L`](index.html#L)`>, `[`A`](fold-right.html#A)`>.foldRight(lb: Eval<`[`B`](fold-right.html#B)`>, f: (`[`A`](fold-right.html#A)`, Eval<`[`B`](fold-right.html#B)`>) -> Eval<`[`B`](fold-right.html#B)`>): Eval<`[`B`](fold-right.html#B)`>` |

### Inheritors

| [EitherTraverseInstance](../-either-traverse-instance/index.html) | `interface EitherTraverseInstance<L> : Traverse<EitherPartialOf<`[`L`](../-either-traverse-instance/index.html#L)`>>, `[`EitherFoldableInstance`](./index.html)`<`[`L`](../-either-traverse-instance/index.html#L)`>` |

