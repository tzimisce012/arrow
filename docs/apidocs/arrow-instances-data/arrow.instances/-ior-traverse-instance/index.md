---
title: IorTraverseInstance - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [IorTraverseInstance](./index.html)

# IorTraverseInstance

`@extension interface IorTraverseInstance<L> : Traverse<IorPartialOf<`[`L`](index.html#L)`>>, `[`IorFoldableInstance`](../-ior-foldable-instance/index.html)`<`[`L`](index.html#L)`>`

### Functions

| [traverse](traverse.html) | `open fun <G, B, C> IorOf<`[`L`](index.html#L)`, `[`B`](traverse.html#B)`>.traverse(AP: Applicative<`[`G`](traverse.html#G)`>, f: (`[`B`](traverse.html#B)`) -> Kind<`[`G`](traverse.html#G)`, `[`C`](traverse.html#C)`>): Kind<`[`G`](traverse.html#G)`, Ior<`[`L`](index.html#L)`, `[`C`](traverse.html#C)`>>` |

### Inheritors

| [IorContext](../-ior-context/index.html) | `class IorContext<L> : `[`IorMonadInstance`](../-ior-monad-instance/index.html)`<`[`L`](../-ior-context/index.html#L)`>, `[`IorTraverseInstance`](./index.html)`<`[`L`](../-ior-context/index.html#L)`>` |

