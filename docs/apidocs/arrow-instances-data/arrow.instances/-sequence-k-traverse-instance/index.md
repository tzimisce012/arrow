---
title: SequenceKTraverseInstance - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [SequenceKTraverseInstance](./index.html)

# SequenceKTraverseInstance

`@extension interface SequenceKTraverseInstance : Traverse<ForSequenceK>`

### Functions

| [foldLeft](fold-left.html) | `open fun <A, B> Kind<ForSequenceK, `[`A`](fold-left.html#A)`>.foldLeft(b: `[`B`](fold-left.html#B)`, f: (`[`B`](fold-left.html#B)`, `[`A`](fold-left.html#A)`) -> `[`B`](fold-left.html#B)`): `[`B`](fold-left.html#B) |
| [foldRight](fold-right.html) | `open fun <A, B> Kind<ForSequenceK, `[`A`](fold-right.html#A)`>.foldRight(lb: Eval<`[`B`](fold-right.html#B)`>, f: (`[`A`](fold-right.html#A)`, Eval<`[`B`](fold-right.html#B)`>) -> Eval<`[`B`](fold-right.html#B)`>): Eval<`[`B`](fold-right.html#B)`>` |
| [map](map.html) | `open fun <A, B> Kind<ForSequenceK, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): SequenceK<`[`B`](map.html#B)`>` |
| [traverse](traverse.html) | `open fun <G, A, B> Kind<ForSequenceK, `[`A`](traverse.html#A)`>.traverse(AP: Applicative<`[`G`](traverse.html#G)`>, f: (`[`A`](traverse.html#A)`) -> Kind<`[`G`](traverse.html#G)`, `[`B`](traverse.html#B)`>): Kind<`[`G`](traverse.html#G)`, SequenceK<`[`B`](traverse.html#B)`>>` |

### Inheritors

| [SequenceKContext](../-sequence-k-context/index.html) | `object SequenceKContext : `[`SequenceKMonadInstance`](../-sequence-k-monad-instance/index.html)`, `[`SequenceKTraverseInstance`](./index.html)`, `[`SequenceKMonoidKInstance`](../-sequence-k-monoid-k-instance/index.html) |

