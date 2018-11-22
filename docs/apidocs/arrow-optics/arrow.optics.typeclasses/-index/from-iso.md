---
title: Index.fromIso - arrow-optics
---

[arrow-optics](../../index.html) / [arrow.optics.typeclasses](../index.html) / [Index](index.html) / [fromIso](./from-iso.html)

# fromIso

`fun <S, A, I, B> fromIso(ID: `[`Index`](index.html)`<`[`A`](from-iso.html#A)`, `[`I`](from-iso.html#I)`, `[`B`](from-iso.html#B)`>, iso: `[`Iso`](../../arrow.optics/-iso.html)`<`[`S`](from-iso.html#S)`, `[`A`](from-iso.html#A)`>): `[`Index`](index.html)`<`[`S`](from-iso.html#S)`, `[`I`](from-iso.html#I)`, `[`B`](from-iso.html#B)`>`

Lift an instance of [Index](index.html) using an [Iso](../../arrow.optics/-iso.html).

### Parameters

`ID` - [Index](index.html) instance to provide a [Optional](../../arrow.optics/-optional.html) to focus into [S](from-iso.html#S) at [I](from-iso.html#I)

`iso` - [Iso](../../arrow.optics/-iso.html) that defines an isomorphism between a type [S](from-iso.html#S) and [A](from-iso.html#A)

**Return**
[Index](index.html) for a structure [S](from-iso.html#S) to focus in an optional [A](from-iso.html#A) at a given index [I](from-iso.html#I)

