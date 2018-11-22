---
title: Snoc.snoc - arrow-optics
---

[arrow-optics](../../index.html) / [arrow.optics.typeclasses](../index.html) / [Snoc](index.html) / [snoc](./snoc.html)

# snoc

`abstract fun snoc(): `[`Prism`](../../arrow.optics/-prism.html)`<`[`S`](index.html#S)`, Tuple2<`[`S`](index.html#S)`, `[`A`](index.html#A)`>>`

Provides a [Prism](../../arrow.optics/-prism.html) between a [S](index.html#S) and its [init](index.html#S) and last element [A](index.html#A).

`open infix fun `[`S`](index.html#S)`.snoc(last: `[`A`](index.html#A)`): `[`S`](index.html#S)

Append an element [A](index.html#A) to [S](index.html#S).

