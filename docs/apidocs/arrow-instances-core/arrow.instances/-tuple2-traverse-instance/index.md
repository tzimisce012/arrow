---
title: Tuple2TraverseInstance - arrow-instances-core
---

[arrow-instances-core](../../index.html) / [arrow.instances](../index.html) / [Tuple2TraverseInstance](./index.html)

# Tuple2TraverseInstance

`@extension interface Tuple2TraverseInstance<F> : Traverse<Tuple2PartialOf<`[`F`](index.html#F)`>>, `[`Tuple2FoldableInstance`](../-tuple2-foldable-instance/index.html)`<`[`F`](index.html#F)`>`

### Functions

| [traverse](traverse.html) | `open fun <G, A, B> Tuple2Of<`[`F`](index.html#F)`, `[`A`](traverse.html#A)`>.traverse(AP: Applicative<`[`G`](traverse.html#G)`>, f: (`[`A`](traverse.html#A)`) -> Kind<`[`G`](traverse.html#G)`, `[`B`](traverse.html#B)`>): Kind<`[`G`](traverse.html#G)`, Tuple2<`[`F`](index.html#F)`, `[`B`](traverse.html#B)`>>` |

