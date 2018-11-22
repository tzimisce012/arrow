---
title: Index.get - arrow-optics
---

[arrow-optics](../../index.html) / [arrow.optics.typeclasses](../index.html) / [Index](index.html) / [get](./get.html)

# get

`open operator fun <T> `[`Lens`](../../arrow.optics/-lens.html)`<`[`T`](get.html#T)`, `[`S`](index.html#S)`>.get(i: `[`I`](index.html#I)`): `[`Optional`](../../arrow.optics/-optional.html)`<`[`T`](get.html#T)`, `[`A`](index.html#A)`>`

DSL to compose [Index](index.html) with a [Lens](../../arrow.optics/-lens.html) for a structure [S](index.html#S) to focus in on [A](index.html#A) at given index [I](index.html#I).

### Parameters

`i` - index [I](index.html#I) to focus into [S](index.html#S) and find focus [A](index.html#A)

**Receiver**
[Lens](../../arrow.optics/-lens.html) with a focus in [S](index.html#S)

**Return**
[Optional](../../arrow.optics/-optional.html) with a focus in [A](index.html#A) at given index [I](index.html#I).

`open operator fun <T> `[`Iso`](../../arrow.optics/-iso.html)`<`[`T`](get.html#T)`, `[`S`](index.html#S)`>.get(i: `[`I`](index.html#I)`): `[`Optional`](../../arrow.optics/-optional.html)`<`[`T`](get.html#T)`, `[`A`](index.html#A)`>`

DSL to compose [Index](index.html) with an [Iso](../../arrow.optics/-iso.html) for a structure [S](index.html#S) to focus in on [A](index.html#A) at given index [I](index.html#I).

### Parameters

`i` - index [I](index.html#I) to focus into [S](index.html#S) and find focus [A](index.html#A)

**Receiver**
[Iso](../../arrow.optics/-iso.html) with a focus in [S](index.html#S)

**Return**
[Optional](../../arrow.optics/-optional.html) with a focus in [A](index.html#A) at given index [I](index.html#I).

`open operator fun <T> `[`Prism`](../../arrow.optics/-prism.html)`<`[`T`](get.html#T)`, `[`S`](index.html#S)`>.get(i: `[`I`](index.html#I)`): `[`Optional`](../../arrow.optics/-optional.html)`<`[`T`](get.html#T)`, `[`A`](index.html#A)`>`

DSL to compose [Index](index.html) with a [Prism](../../arrow.optics/-prism.html) for a structure [S](index.html#S) to focus in on [A](index.html#A) at given index [I](index.html#I).

### Parameters

`i` - index [I](index.html#I) to focus into [S](index.html#S) and find focus [A](index.html#A)

**Receiver**
[Prism](../../arrow.optics/-prism.html) with a focus in [S](index.html#S)

**Return**
[Optional](../../arrow.optics/-optional.html) with a focus in [A](index.html#A) at given index [I](index.html#I).

`open operator fun <T> `[`Optional`](../../arrow.optics/-optional.html)`<`[`T`](get.html#T)`, `[`S`](index.html#S)`>.get(i: `[`I`](index.html#I)`): `[`Optional`](../../arrow.optics/-optional.html)`<`[`T`](get.html#T)`, `[`A`](index.html#A)`>`

DSL to compose [Index](index.html) with an [Optional](../../arrow.optics/-optional.html) for a structure [S](index.html#S) to focus in on [A](index.html#A) at given index [I](index.html#I).

### Parameters

`i` - index [I](index.html#I) to focus into [S](index.html#S) and find focus [A](index.html#A)

**Receiver**
[Optional](../../arrow.optics/-optional.html) with a focus in [S](index.html#S)

**Return**
[Optional](../../arrow.optics/-optional.html) with a focus in [A](index.html#A) at given index [I](index.html#I).

`open operator fun <T> `[`Setter`](../../arrow.optics/-setter.html)`<`[`T`](get.html#T)`, `[`S`](index.html#S)`>.get(i: `[`I`](index.html#I)`): `[`Setter`](../../arrow.optics/-setter.html)`<`[`T`](get.html#T)`, `[`A`](index.html#A)`>`

DSL to compose [Index](index.html) with a [Setter](../../arrow.optics/-setter.html) for a structure [S](index.html#S) to focus in on [A](index.html#A) at given index [I](index.html#I).

### Parameters

`i` - index [I](index.html#I) to focus into [S](index.html#S) and find focus [A](index.html#A)

**Receiver**
[Setter](../../arrow.optics/-setter.html) with a focus in [S](index.html#S)

**Return**
[Setter](../../arrow.optics/-setter.html) with a focus in [A](index.html#A) at given index [I](index.html#I).

`open operator fun <T> `[`Traversal`](../../arrow.optics/-traversal.html)`<`[`T`](get.html#T)`, `[`S`](index.html#S)`>.get(i: `[`I`](index.html#I)`): `[`Traversal`](../../arrow.optics/-traversal.html)`<`[`T`](get.html#T)`, `[`A`](index.html#A)`>`

DSL to compose [Index](index.html) with a [Traversal](../../arrow.optics/-traversal.html) for a structure [S](index.html#S) to focus in on [A](index.html#A) at given index [I](index.html#I).

### Parameters

`i` - index [I](index.html#I) to focus into [S](index.html#S) and find focus [A](index.html#A)

**Receiver**
[Traversal](../../arrow.optics/-traversal.html) with a focus in [S](index.html#S)

**Return**
[Traversal](../../arrow.optics/-traversal.html) with a focus in [A](index.html#A) at given index [I](index.html#I).

`open operator fun <T> `[`Fold`](../../arrow.optics/-fold/index.html)`<`[`T`](get.html#T)`, `[`S`](index.html#S)`>.get(i: `[`I`](index.html#I)`): `[`Fold`](../../arrow.optics/-fold/index.html)`<`[`T`](get.html#T)`, `[`A`](index.html#A)`>`

DSL to compose [Index](index.html) with a [Fold](../../arrow.optics/-fold/index.html) for a structure [S](index.html#S) to focus in on [A](index.html#A) at given index [I](index.html#I).

### Parameters

`i` - index [I](index.html#I) to focus into [S](index.html#S) and find focus [A](index.html#A)

**Receiver**
[Fold](../../arrow.optics/-fold/index.html) with a focus in [S](index.html#S)

**Return**
[Fold](../../arrow.optics/-fold/index.html) with a focus in [A](index.html#A) at given index [I](index.html#I).

