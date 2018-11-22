---
title: traverse - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances.coproduct.traverse](../index.html) / [arrow.Kind](index.html) / [traverse](./traverse.html)

# traverse

`@JvmName("traverse") fun <F, G, A, B> Kind<Kind<Kind<ForCoproduct, `[`F`](traverse.html#F)`>, `[`G`](traverse.html#G)`>, `[`A`](traverse.html#A)`>.traverse(arg1: Applicative<`[`G`](traverse.html#G)`>, arg2: (`[`A`](traverse.html#A)`) -> Kind<`[`G`](traverse.html#G)`, `[`B`](traverse.html#B)`>, TF: Traverse<`[`F`](traverse.html#F)`>, TG: Traverse<`[`G`](traverse.html#G)`>): Kind<`[`G`](traverse.html#G)`, Kind<Kind<Kind<ForCoproduct, `[`F`](traverse.html#F)`>, `[`G`](traverse.html#G)`>, `[`B`](traverse.html#B)`>>`