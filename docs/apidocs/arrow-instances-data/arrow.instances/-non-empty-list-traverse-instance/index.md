---
title: NonEmptyListTraverseInstance - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [NonEmptyListTraverseInstance](./index.html)

# NonEmptyListTraverseInstance

`@extension interface NonEmptyListTraverseInstance : Traverse<ForNonEmptyList>`

### Functions

| [foldLeft](fold-left.html) | `open fun <A, B> Kind<ForNonEmptyList, `[`A`](fold-left.html#A)`>.foldLeft(b: `[`B`](fold-left.html#B)`, f: (`[`B`](fold-left.html#B)`, `[`A`](fold-left.html#A)`) -> `[`B`](fold-left.html#B)`): `[`B`](fold-left.html#B) |
| [foldRight](fold-right.html) | `open fun <A, B> Kind<ForNonEmptyList, `[`A`](fold-right.html#A)`>.foldRight(lb: Eval<`[`B`](fold-right.html#B)`>, f: (`[`A`](fold-right.html#A)`, Eval<`[`B`](fold-right.html#B)`>) -> Eval<`[`B`](fold-right.html#B)`>): Eval<`[`B`](fold-right.html#B)`>` |
| [isEmpty](is-empty.html) | `open fun <A> Kind<ForNonEmptyList, `[`A`](is-empty.html#A)`>.isEmpty(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [map](map.html) | `open fun <A, B> Kind<ForNonEmptyList, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): NonEmptyList<`[`B`](map.html#B)`>` |
| [traverse](traverse.html) | `open fun <G, A, B> Kind<ForNonEmptyList, `[`A`](traverse.html#A)`>.traverse(AP: Applicative<`[`G`](traverse.html#G)`>, f: (`[`A`](traverse.html#A)`) -> Kind<`[`G`](traverse.html#G)`, `[`B`](traverse.html#B)`>): Kind<`[`G`](traverse.html#G)`, NonEmptyList<`[`B`](traverse.html#B)`>>` |

### Inheritors

| [NonEmptyListContext](../-non-empty-list-context/index.html) | `object NonEmptyListContext : `[`NonEmptyListBimonadInstance`](../-non-empty-list-bimonad-instance/index.html)`, `[`NonEmptyListTraverseInstance`](./index.html)`, `[`NonEmptyListSemigroupKInstance`](../-non-empty-list-semigroup-k-instance/index.html) |

