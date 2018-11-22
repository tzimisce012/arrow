---
title: Traverse.traverse - arrow-typeclasses
---

[arrow-typeclasses](../../index.html) / [arrow.typeclasses](../index.html) / [Traverse](index.html) / [traverse](./traverse.html)

# traverse

`abstract fun <G, A, B> Kind<`[`F`](index.html#F)`, `[`A`](traverse.html#A)`>.traverse(AP: `[`Applicative`](../-applicative/index.html)`<`[`G`](traverse.html#G)`>, f: (`[`A`](traverse.html#A)`) -> Kind<`[`G`](traverse.html#G)`, `[`B`](traverse.html#B)`>): Kind<`[`G`](traverse.html#G)`, Kind<`[`F`](index.html#F)`, `[`B`](traverse.html#B)`>>`

Given a function which returns a G effect, thread this effect through the running of this function on all the
values in F, returning an F in a G context.

