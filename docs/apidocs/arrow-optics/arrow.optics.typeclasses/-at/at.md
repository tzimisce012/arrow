---
title: At.at - arrow-optics
---

[arrow-optics](../../index.html) / [arrow.optics.typeclasses](../index.html) / [At](index.html) / [at](./at.html)

# at

`abstract fun at(i: `[`I`](index.html#I)`): `[`Lens`](../../arrow.optics/-lens.html)`<`[`S`](index.html#S)`, `[`A`](index.html#A)`>`

Get a [Lens](../../arrow.optics/-lens.html) for a structure [S](index.html#S) with focus in [A](index.html#A) at index [i](at.html#arrow.optics.typeclasses.At$at(arrow.optics.typeclasses.At.I)/i).

### Parameters

`i` - index [I](index.html#I) to zoom into [S](index.html#S) and find focus [A](index.html#A)

**Return**
[Lens](../../arrow.optics/-lens.html) with a focus in [A](index.html#A) at given index [I](index.html#I).

`open fun <T> `[`Lens`](../../arrow.optics/-lens.html)`<`[`T`](at.html#T)`, `[`S`](index.html#S)`>.at(i: `[`I`](index.html#I)`): `[`Lens`](../../arrow.optics/-lens.html)`<`[`T`](at.html#T)`, `[`A`](index.html#A)`>`

DSL to compose [At](index.html) with a [Lens](../../arrow.optics/-lens.html) for a structure [S](index.html#S) to focus in on [A](index.html#A) at given index [I](index.html#I).

### Parameters

`i` - index [I](index.html#I) to zoom into [S](index.html#S) and find focus [A](index.html#A)

**Receiver**
[Lens](../../arrow.optics/-lens.html) with a focus in [S](index.html#S)

**Return**
[Lens](../../arrow.optics/-lens.html) with a focus in [A](index.html#A) at given index [I](index.html#I).

`open fun <T> `[`Iso`](../../arrow.optics/-iso.html)`<`[`T`](at.html#T)`, `[`S`](index.html#S)`>.at(i: `[`I`](index.html#I)`): `[`Lens`](../../arrow.optics/-lens.html)`<`[`T`](at.html#T)`, `[`A`](index.html#A)`>`

DSL to compose [At](index.html) with an [Iso](../../arrow.optics/-iso.html) for a structure [S](index.html#S) to focus in on [A](index.html#A) at given index [I](index.html#I).

### Parameters

`i` - index [I](index.html#I) to zoom into [S](index.html#S) and find focus [A](index.html#A)

**Receiver**
[Iso](../../arrow.optics/-iso.html) with a focus in [S](index.html#S)

**Return**
[Lens](../../arrow.optics/-lens.html) with a focus in [A](index.html#A) at given index [I](index.html#I).

`open fun <T> `[`Prism`](../../arrow.optics/-prism.html)`<`[`T`](at.html#T)`, `[`S`](index.html#S)`>.at(i: `[`I`](index.html#I)`): `[`Optional`](../../arrow.optics/-optional.html)`<`[`T`](at.html#T)`, `[`A`](index.html#A)`>`

DSL to compose [At](index.html) with a [Prism](../../arrow.optics/-prism.html) for a structure [S](index.html#S) to focus in on [A](index.html#A) at given index [I](index.html#I).

### Parameters

`i` - index [I](index.html#I) to zoom into [S](index.html#S) and find focus [A](index.html#A)

**Receiver**
[Prism](../../arrow.optics/-prism.html) with a focus in [S](index.html#S)

**Return**
[Optional](../../arrow.optics/-optional.html) with a focus in [A](index.html#A) at given index [I](index.html#I).

`open fun <T> `[`Optional`](../../arrow.optics/-optional.html)`<`[`T`](at.html#T)`, `[`S`](index.html#S)`>.at(i: `[`I`](index.html#I)`): `[`Optional`](../../arrow.optics/-optional.html)`<`[`T`](at.html#T)`, `[`A`](index.html#A)`>`

DSL to compose [At](index.html) with an [Optional](../../arrow.optics/-optional.html) for a structure [S](index.html#S) to focus in on [A](index.html#A) at given index [I](index.html#I).

### Parameters

`i` - index [I](index.html#I) to zoom into [S](index.html#S) and find focus [A](index.html#A)

**Receiver**
[Optional](../../arrow.optics/-optional.html) with a focus in [S](index.html#S)

**Return**
[Optional](../../arrow.optics/-optional.html) with a focus in [A](index.html#A) at given index [I](index.html#I).

`open fun <T> `[`Getter`](../../arrow.optics/-getter/index.html)`<`[`T`](at.html#T)`, `[`S`](index.html#S)`>.at(i: `[`I`](index.html#I)`): `[`Getter`](../../arrow.optics/-getter/index.html)`<`[`T`](at.html#T)`, `[`A`](index.html#A)`>`

DSL to compose [At](index.html) with a [Getter](../../arrow.optics/-getter/index.html) for a structure [S](index.html#S) to focus in on [A](index.html#A) at given index [I](index.html#I).

### Parameters

`i` - index [I](index.html#I) to zoom into [S](index.html#S) and find focus [A](index.html#A)

**Receiver**
[Getter](../../arrow.optics/-getter/index.html) with a focus in [S](index.html#S)

**Return**
[Getter](../../arrow.optics/-getter/index.html) with a focus in [A](index.html#A) at given index [I](index.html#I).

`open fun <T> `[`Setter`](../../arrow.optics/-setter.html)`<`[`T`](at.html#T)`, `[`S`](index.html#S)`>.at(i: `[`I`](index.html#I)`): `[`Setter`](../../arrow.optics/-setter.html)`<`[`T`](at.html#T)`, `[`A`](index.html#A)`>`

DSL to compose [At](index.html) with a [Setter](../../arrow.optics/-setter.html) for a structure [S](index.html#S) to focus in on [A](index.html#A) at given index [I](index.html#I).

### Parameters

`i` - index [I](index.html#I) to zoom into [S](index.html#S) and find focus [A](index.html#A)

**Receiver**
[Setter](../../arrow.optics/-setter.html) with a focus in [S](index.html#S)

**Return**
[Setter](../../arrow.optics/-setter.html) with a focus in [A](index.html#A) at given index [I](index.html#I).

`open fun <T> `[`Traversal`](../../arrow.optics/-traversal.html)`<`[`T`](at.html#T)`, `[`S`](index.html#S)`>.at(i: `[`I`](index.html#I)`): `[`Traversal`](../../arrow.optics/-traversal.html)`<`[`T`](at.html#T)`, `[`A`](index.html#A)`>`

DSL to compose [At](index.html) with a [Traversal](../../arrow.optics/-traversal.html) for a structure [S](index.html#S) to focus in on [A](index.html#A) at given index [I](index.html#I).

### Parameters

`i` - index [I](index.html#I) to zoom into [S](index.html#S) and find focus [A](index.html#A)

**Receiver**
[Traversal](../../arrow.optics/-traversal.html) with a focus in [S](index.html#S)

**Return**
[Traversal](../../arrow.optics/-traversal.html) with a focus in [A](index.html#A) at given index [I](index.html#I).

`open fun <T> `[`Fold`](../../arrow.optics/-fold/index.html)`<`[`T`](at.html#T)`, `[`S`](index.html#S)`>.at(i: `[`I`](index.html#I)`): `[`Fold`](../../arrow.optics/-fold/index.html)`<`[`T`](at.html#T)`, `[`A`](index.html#A)`>`

DSL to compose [At](index.html) with a [Fold](../../arrow.optics/-fold/index.html) for a structure [S](index.html#S) to focus in on [A](index.html#A) at given index [I](index.html#I).

### Parameters

`i` - index [I](index.html#I) to zoom into [S](index.html#S) and find focus [A](index.html#A)

**Receiver**
[Fold](../../arrow.optics/-fold/index.html) with a focus in [S](index.html#S)

**Return**
[Fold](../../arrow.optics/-fold/index.html) with a focus in [A](index.html#A) at given index [I](index.html#I).

