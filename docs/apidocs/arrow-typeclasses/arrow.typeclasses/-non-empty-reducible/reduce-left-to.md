---
title: NonEmptyReducible.reduceLeftTo - arrow-typeclasses
---

[arrow-typeclasses](../../index.html) / [arrow.typeclasses](../index.html) / [NonEmptyReducible](index.html) / [reduceLeftTo](./reduce-left-to.html)

# reduceLeftTo

`open fun <A, B> Kind<`[`F`](index.html#F)`, `[`A`](reduce-left-to.html#A)`>.reduceLeftTo(f: (`[`A`](reduce-left-to.html#A)`) -> `[`B`](reduce-left-to.html#B)`, g: (`[`B`](reduce-left-to.html#B)`, `[`A`](reduce-left-to.html#A)`) -> `[`B`](reduce-left-to.html#B)`): `[`B`](reduce-left-to.html#B)

Overrides [Reducible.reduceLeftTo](../-reducible/reduce-left-to.html)

Apply f to the "initial element" of fa and combine it with every other value using
the given function g.

