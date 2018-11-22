---
title: flatTraverse - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances.coproduct.traverse](../index.html) / [arrow.Kind](index.html) / [flatTraverse](./flat-traverse.html)

# flatTraverse

`@JvmName("flatTraverse") fun <F, G, A, B> Kind<Kind<Kind<ForCoproduct, `[`F`](flat-traverse.html#F)`>, `[`G`](flat-traverse.html#G)`>, `[`A`](flat-traverse.html#A)`>.flatTraverse(arg1: Monad<Kind<Kind<ForCoproduct, `[`F`](flat-traverse.html#F)`>, `[`G`](flat-traverse.html#G)`>>, arg2: Applicative<`[`G`](flat-traverse.html#G)`>, arg3: (`[`A`](flat-traverse.html#A)`) -> Kind<`[`G`](flat-traverse.html#G)`, Kind<Kind<Kind<ForCoproduct, `[`F`](flat-traverse.html#F)`>, `[`G`](flat-traverse.html#G)`>, `[`B`](flat-traverse.html#B)`>>, TF: Traverse<`[`F`](flat-traverse.html#F)`>, TG: Traverse<`[`G`](flat-traverse.html#G)`>): Kind<`[`G`](flat-traverse.html#G)`, Kind<Kind<Kind<ForCoproduct, `[`F`](flat-traverse.html#F)`>, `[`G`](flat-traverse.html#G)`>, `[`B`](flat-traverse.html#B)`>>`