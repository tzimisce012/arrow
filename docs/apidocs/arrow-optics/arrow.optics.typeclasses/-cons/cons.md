---
title: Cons.cons - arrow-optics
---

[arrow-optics](../../index.html) / [arrow.optics.typeclasses](../index.html) / [Cons](index.html) / [cons](./cons.html)

# cons

`abstract fun cons(): `[`Prism`](../../arrow.optics/-prism.html)`<`[`S`](index.html#S)`, Tuple2<`[`A`](index.html#A)`, `[`S`](index.html#S)`>>`

Provides a [Prism](../../arrow.optics/-prism.html) between [S](index.html#S) and its first element [A](index.html#A) and tail [S](index.html#S).

`open infix fun `[`A`](index.html#A)`.cons(tail: `[`S`](index.html#S)`): `[`S`](index.html#S)

Prepend an element [A](index.html#A) to the first element of [S](index.html#S).

**Receiver**
[A](index.html#A) element to prepend or attach on left side of [tail](cons.html#arrow.optics.typeclasses.Cons$cons(arrow.optics.typeclasses.Cons.A, arrow.optics.typeclasses.Cons.S)/tail).

