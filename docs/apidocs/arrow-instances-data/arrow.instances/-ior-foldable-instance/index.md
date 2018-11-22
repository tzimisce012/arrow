---
title: IorFoldableInstance - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [IorFoldableInstance](./index.html)

# IorFoldableInstance

`@extension interface IorFoldableInstance<L> : Foldable<IorPartialOf<`[`L`](index.html#L)`>>`

### Functions

| [foldLeft](fold-left.html) | `open fun <B, C> Kind<IorPartialOf<`[`L`](index.html#L)`>, `[`B`](fold-left.html#B)`>.foldLeft(b: `[`C`](fold-left.html#C)`, f: (`[`C`](fold-left.html#C)`, `[`B`](fold-left.html#B)`) -> `[`C`](fold-left.html#C)`): `[`C`](fold-left.html#C) |
| [foldRight](fold-right.html) | `open fun <B, C> Kind<IorPartialOf<`[`L`](index.html#L)`>, `[`B`](fold-right.html#B)`>.foldRight(lb: Eval<`[`C`](fold-right.html#C)`>, f: (`[`B`](fold-right.html#B)`, Eval<`[`C`](fold-right.html#C)`>) -> Eval<`[`C`](fold-right.html#C)`>): Eval<`[`C`](fold-right.html#C)`>` |

### Inheritors

| [IorTraverseInstance](../-ior-traverse-instance/index.html) | `interface IorTraverseInstance<L> : Traverse<IorPartialOf<`[`L`](../-ior-traverse-instance/index.html#L)`>>, `[`IorFoldableInstance`](./index.html)`<`[`L`](../-ior-traverse-instance/index.html#L)`>` |

