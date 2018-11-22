---
title: NonEmptyReducible.foldLeft - arrow-typeclasses
---

[arrow-typeclasses](../../index.html) / [arrow.typeclasses](../index.html) / [NonEmptyReducible](index.html) / [foldLeft](./fold-left.html)

# foldLeft

`open fun <A, B> Kind<`[`F`](index.html#F)`, `[`A`](fold-left.html#A)`>.foldLeft(b: `[`B`](fold-left.html#B)`, f: (`[`B`](fold-left.html#B)`, `[`A`](fold-left.html#A)`) -> `[`B`](fold-left.html#B)`): `[`B`](fold-left.html#B)

Overrides [Foldable.foldLeft](../-foldable/fold-left.html)

Left associative fold on F using the provided function.

