---
title: Each.fromTraverse - arrow-optics
---

[arrow-optics](../../index.html) / [arrow.optics.typeclasses](../index.html) / [Each](index.html) / [fromTraverse](./from-traverse.html)

# fromTraverse

`fun <S, A> fromTraverse(T: Traverse<`[`S`](from-traverse.html#S)`>): `[`Each`](index.html)`<Kind<`[`S`](from-traverse.html#S)`, `[`A`](from-traverse.html#A)`>, `[`A`](from-traverse.html#A)`>`

Create an instance of [Each](index.html) from a [Traverse](#)

### Parameters

`T` - [Traverse](#) to create [Each](index.html) instance from

**Return**
[Each](index.html) that provides [Traversal](../../arrow.optics/-traversal.html) created from [Traverse](#)

