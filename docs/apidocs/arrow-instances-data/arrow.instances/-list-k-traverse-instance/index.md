---
title: ListKTraverseInstance - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [ListKTraverseInstance](./index.html)

# ListKTraverseInstance

`@extension interface ListKTraverseInstance : Traverse<ForListK>`

### Functions

| [foldLeft](fold-left.html) | `open fun <A, B> Kind<ForListK, `[`A`](fold-left.html#A)`>.foldLeft(b: `[`B`](fold-left.html#B)`, f: (`[`B`](fold-left.html#B)`, `[`A`](fold-left.html#A)`) -> `[`B`](fold-left.html#B)`): `[`B`](fold-left.html#B) |
| [foldRight](fold-right.html) | `open fun <A, B> Kind<ForListK, `[`A`](fold-right.html#A)`>.foldRight(lb: Eval<`[`B`](fold-right.html#B)`>, f: (`[`A`](fold-right.html#A)`, Eval<`[`B`](fold-right.html#B)`>) -> Eval<`[`B`](fold-right.html#B)`>): Eval<`[`B`](fold-right.html#B)`>` |
| [isEmpty](is-empty.html) | `open fun <A> Kind<ForListK, `[`A`](is-empty.html#A)`>.isEmpty(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [map](map.html) | `open fun <A, B> Kind<ForListK, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): ListK<`[`B`](map.html#B)`>` |
| [traverse](traverse.html) | `open fun <G, A, B> Kind<ForListK, `[`A`](traverse.html#A)`>.traverse(AP: Applicative<`[`G`](traverse.html#G)`>, f: (`[`A`](traverse.html#A)`) -> Kind<`[`G`](traverse.html#G)`, `[`B`](traverse.html#B)`>): Kind<`[`G`](traverse.html#G)`, ListK<`[`B`](traverse.html#B)`>>` |

### Inheritors

| [ListKContext](../-list-k-context/index.html) | `object ListKContext : `[`ListKMonadInstance`](../-list-k-monad-instance/index.html)`, `[`ListKTraverseInstance`](./index.html)`, `[`ListKMonoidKInstance`](../-list-k-monoid-k-instance/index.html) |

