---
title: At.fromIso - arrow-optics
---

[arrow-optics](../../index.html) / [arrow.optics.typeclasses](../index.html) / [At](index.html) / [fromIso](./from-iso.html)

# fromIso

`fun <S, U, I, A> fromIso(AT: `[`At`](index.html)`<`[`U`](from-iso.html#U)`, `[`I`](from-iso.html#I)`, `[`A`](from-iso.html#A)`>, iso: `[`Iso`](../../arrow.optics/-iso.html)`<`[`S`](from-iso.html#S)`, `[`U`](from-iso.html#U)`>): `[`At`](index.html)`<`[`S`](from-iso.html#S)`, `[`I`](from-iso.html#I)`, `[`A`](from-iso.html#A)`>`

Lift an instance of [At](index.html) using an [Iso](../../arrow.optics/-iso.html).

### Parameters

`AT` - [At](index.html) that can provide [Lens](../../arrow.optics/-lens.html) for a structure [U](from-iso.html#U) with a focus in [A](from-iso.html#A) with given index [I](from-iso.html#I).

`iso` - [Iso](../../arrow.optics/-iso.html) that defines an isomorphism between [S](from-iso.html#S) and [U](from-iso.html#U)

**Return**
[At](index.html) to provide [Lens](../../arrow.optics/-lens.html) for structure [S](from-iso.html#S) with focus in [A](from-iso.html#A) at given index [I](from-iso.html#I)

