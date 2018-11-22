---
title: IdTraverseInstance - arrow-instances-core
---

[arrow-instances-core](../../index.html) / [arrow.instances](../index.html) / [IdTraverseInstance](./index.html)

# IdTraverseInstance

`@extension interface IdTraverseInstance : Traverse<ForId>`

### Functions

| [foldLeft](fold-left.html) | `open fun <A, B> Kind<ForId, `[`A`](fold-left.html#A)`>.foldLeft(b: `[`B`](fold-left.html#B)`, f: (`[`B`](fold-left.html#B)`, `[`A`](fold-left.html#A)`) -> `[`B`](fold-left.html#B)`): `[`B`](fold-left.html#B) |
| [foldRight](fold-right.html) | `open fun <A, B> Kind<ForId, `[`A`](fold-right.html#A)`>.foldRight(lb: Eval<`[`B`](fold-right.html#B)`>, f: (`[`A`](fold-right.html#A)`, Eval<`[`B`](fold-right.html#B)`>) -> Eval<`[`B`](fold-right.html#B)`>): Eval<`[`B`](fold-right.html#B)`>` |
| [map](map.html) | `open fun <A, B> Kind<ForId, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): Id<`[`B`](map.html#B)`>` |
| [traverse](traverse.html) | `open fun <G, A, B> Kind<ForId, `[`A`](traverse.html#A)`>.traverse(AP: Applicative<`[`G`](traverse.html#G)`>, f: (`[`A`](traverse.html#A)`) -> Kind<`[`G`](traverse.html#G)`, `[`B`](traverse.html#B)`>): Kind<`[`G`](traverse.html#G)`, Id<`[`B`](traverse.html#B)`>>` |

### Inheritors

| [IdContext](../-id-context/index.html) | `object IdContext : `[`IdBimonadInstance`](../-id-bimonad-instance/index.html)`, `[`IdTraverseInstance`](./index.html) |

