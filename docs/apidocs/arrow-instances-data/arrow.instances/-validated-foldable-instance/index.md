---
title: ValidatedFoldableInstance - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [ValidatedFoldableInstance](./index.html)

# ValidatedFoldableInstance

`@extension interface ValidatedFoldableInstance<E> : Foldable<ValidatedPartialOf<`[`E`](index.html#E)`>>`

### Functions

| [foldLeft](fold-left.html) | `open fun <A, B> Kind<ValidatedPartialOf<`[`E`](index.html#E)`>, `[`A`](fold-left.html#A)`>.foldLeft(b: `[`B`](fold-left.html#B)`, f: (`[`B`](fold-left.html#B)`, `[`A`](fold-left.html#A)`) -> `[`B`](fold-left.html#B)`): `[`B`](fold-left.html#B) |
| [foldRight](fold-right.html) | `open fun <A, B> Kind<ValidatedPartialOf<`[`E`](index.html#E)`>, `[`A`](fold-right.html#A)`>.foldRight(lb: Eval<`[`B`](fold-right.html#B)`>, f: (`[`A`](fold-right.html#A)`, Eval<`[`B`](fold-right.html#B)`>) -> Eval<`[`B`](fold-right.html#B)`>): Eval<`[`B`](fold-right.html#B)`>` |

### Inheritors

| [ValidatedTraverseInstance](../-validated-traverse-instance/index.html) | `interface ValidatedTraverseInstance<E> : Traverse<ValidatedPartialOf<`[`E`](../-validated-traverse-instance/index.html#E)`>>, `[`ValidatedFoldableInstance`](./index.html)`<`[`E`](../-validated-traverse-instance/index.html#E)`>` |

