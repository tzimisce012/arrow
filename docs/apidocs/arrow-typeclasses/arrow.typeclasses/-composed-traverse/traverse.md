---
title: ComposedTraverse.traverse - arrow-typeclasses
---

[arrow-typeclasses](../../index.html) / [arrow.typeclasses](../index.html) / [ComposedTraverse](index.html) / [traverse](./traverse.html)

# traverse

`open fun <H, A, B> `[`NestedType`](../-nested-type.html)`<`[`F`](index.html#F)`, `[`G`](index.html#G)`, `[`A`](traverse.html#A)`>.traverse(AP: `[`Applicative`](../-applicative/index.html)`<`[`H`](traverse.html#H)`>, f: (`[`A`](traverse.html#A)`) -> Kind<`[`H`](traverse.html#H)`, `[`B`](traverse.html#B)`>): Kind<`[`H`](traverse.html#H)`, Kind<`[`Nested`](../-nested.html)`<`[`F`](index.html#F)`, `[`G`](index.html#G)`>, `[`B`](traverse.html#B)`>>`

Overrides [Traverse.traverse](../-traverse/traverse.html)

Given a function which returns a G effect, thread this effect through the running of this function on all the
values in F, returning an F in a G context.

