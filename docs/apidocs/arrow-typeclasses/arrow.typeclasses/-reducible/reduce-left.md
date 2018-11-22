---
title: Reducible.reduceLeft - arrow-typeclasses
---

[arrow-typeclasses](../../index.html) / [arrow.typeclasses](../index.html) / [Reducible](index.html) / [reduceLeft](./reduce-left.html)

# reduceLeft

`open fun <A> Kind<`[`F`](index.html#F)`, `[`A`](reduce-left.html#A)`>.reduceLeft(f: (`[`A`](reduce-left.html#A)`, `[`A`](reduce-left.html#A)`) -> `[`A`](reduce-left.html#A)`): `[`A`](reduce-left.html#A)

Left-associative reduction on F using the function f.

Implementations should override this method when possible.

