---
title: Tuple2FoldableInstance - arrow-instances-core
---

[arrow-instances-core](../../index.html) / [arrow.instances](../index.html) / [Tuple2FoldableInstance](./index.html)

# Tuple2FoldableInstance

`@extension interface Tuple2FoldableInstance<F> : Foldable<Tuple2PartialOf<`[`F`](index.html#F)`>>`

### Functions

| [foldLeft](fold-left.html) | `open fun <A, B> Kind<Tuple2PartialOf<`[`F`](index.html#F)`>, `[`A`](fold-left.html#A)`>.foldLeft(b: `[`B`](fold-left.html#B)`, f: (`[`B`](fold-left.html#B)`, `[`A`](fold-left.html#A)`) -> `[`B`](fold-left.html#B)`): `[`B`](fold-left.html#B) |
| [foldRight](fold-right.html) | `open fun <A, B> Kind<Tuple2PartialOf<`[`F`](index.html#F)`>, `[`A`](fold-right.html#A)`>.foldRight(lb: Eval<`[`B`](fold-right.html#B)`>, f: (`[`A`](fold-right.html#A)`, Eval<`[`B`](fold-right.html#B)`>) -> Eval<`[`B`](fold-right.html#B)`>): Eval<`[`B`](fold-right.html#B)`>` |

### Inheritors

| [Tuple2TraverseInstance](../-tuple2-traverse-instance/index.html) | `interface Tuple2TraverseInstance<F> : Traverse<Tuple2PartialOf<`[`F`](../-tuple2-traverse-instance/index.html#F)`>>, `[`Tuple2FoldableInstance`](./index.html)`<`[`F`](../-tuple2-traverse-instance/index.html#F)`>` |

