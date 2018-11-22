---
title: ComposedTraverse.traverseC - arrow-typeclasses
---

[arrow-typeclasses](../../index.html) / [arrow.typeclasses](../index.html) / [ComposedTraverse](index.html) / [traverseC](./traverse-c.html)

# traverseC

`open fun <H, A, B> `[`UnnestedType`](../-unnested-type.html)`<`[`F`](index.html#F)`, `[`G`](index.html#G)`, `[`A`](traverse-c.html#A)`>.traverseC(f: (`[`A`](traverse-c.html#A)`) -> Kind<`[`H`](traverse-c.html#H)`, `[`B`](traverse-c.html#B)`>, HA: `[`Applicative`](../-applicative/index.html)`<`[`H`](traverse-c.html#H)`>): Kind<`[`H`](traverse-c.html#H)`, Kind<`[`Nested`](../-nested.html)`<`[`F`](index.html#F)`, `[`G`](index.html#G)`>, `[`B`](traverse-c.html#B)`>>`