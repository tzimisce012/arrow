---
title: Each.fromIso - arrow-optics
---

[arrow-optics](../../index.html) / [arrow.optics.typeclasses](../index.html) / [Each](index.html) / [fromIso](./from-iso.html)

# fromIso

`fun <S, A, B> fromIso(EA: `[`Each`](index.html)`<`[`A`](from-iso.html#A)`, `[`B`](from-iso.html#B)`>, iso: `[`Iso`](../../arrow.optics/-iso.html)`<`[`S`](from-iso.html#S)`, `[`A`](from-iso.html#A)`>): `[`Each`](index.html)`<`[`S`](from-iso.html#S)`, `[`B`](from-iso.html#B)`>`

Lift an instance of [Each](index.html) using an [Iso](../../arrow.optics/-iso.html)

### Parameters

`EA` - [Each](index.html) that can provide [Traversal](../../arrow.optics/-traversal.html) for a structure [A](from-iso.html#A) with a focus in [B](from-iso.html#B)

`iso` - [Iso](../../arrow.optics/-iso.html) that defines an isomorphism between [S](from-iso.html#S) and [A](from-iso.html#A)

**Return**
[Each](index.html) to provide [Traversal](../../arrow.optics/-traversal.html) for structure [S](from-iso.html#S) with focus in [B](from-iso.html#B)

