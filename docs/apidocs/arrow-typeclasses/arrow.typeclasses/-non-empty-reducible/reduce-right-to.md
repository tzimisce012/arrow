---
title: NonEmptyReducible.reduceRightTo - arrow-typeclasses
---

[arrow-typeclasses](../../index.html) / [arrow.typeclasses](../index.html) / [NonEmptyReducible](index.html) / [reduceRightTo](./reduce-right-to.html)

# reduceRightTo

`open fun <A, B> Kind<`[`F`](index.html#F)`, `[`A`](reduce-right-to.html#A)`>.reduceRightTo(f: (`[`A`](reduce-right-to.html#A)`) -> `[`B`](reduce-right-to.html#B)`, g: (`[`A`](reduce-right-to.html#A)`, Eval<`[`B`](reduce-right-to.html#B)`>) -> Eval<`[`B`](reduce-right-to.html#B)`>): Eval<`[`B`](reduce-right-to.html#B)`>`

Overrides [Reducible.reduceRightTo](../-reducible/reduce-right-to.html)

Apply f to the "initial element" of fa and lazily combine it with every other value using the
given function g.

