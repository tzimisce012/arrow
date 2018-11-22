---
title: at - arrow-optics
---

[arrow-optics](../index.html) / [arrow.optics.dsl](index.html) / [at](./at.html)

# at

`fun <T, S, I, A> `[`Lens`](../arrow.optics/-lens.html)`<`[`T`](at.html#T)`, `[`S`](at.html#S)`>.at(AT: `[`At`](../arrow.optics.typeclasses/-at/index.html)`<`[`S`](at.html#S)`, `[`I`](at.html#I)`, `[`A`](at.html#A)`>, i: `[`I`](at.html#I)`): `[`Lens`](../arrow.optics/-lens.html)`<`[`T`](at.html#T)`, `[`A`](at.html#A)`>`

DSL to compose [At](../arrow.optics.typeclasses/-at/index.html) with a [Lens](../arrow.optics/-lens.html) for a structure [S](at.html#S) to focus in on [A](at.html#A) at given index [I](at.html#I).

### Parameters

`AT` - [At](../arrow.optics.typeclasses/-at/index.html) instance to provide a [Lens](../arrow.optics/-lens.html) to zoom into [S](at.html#S) at [I](at.html#I)

`i` - index [I](at.html#I) to zoom into [S](at.html#S) and find focus [A](at.html#A)

**Receiver**
[Lens](../arrow.optics/-lens.html) with a focus in [S](at.html#S)

**Return**
[Lens](../arrow.optics/-lens.html) with a focus in [A](at.html#A) at given index [I](at.html#I).

`fun <T, S, I, A> `[`Iso`](../arrow.optics/-iso.html)`<`[`T`](at.html#T)`, `[`S`](at.html#S)`>.at(AT: `[`At`](../arrow.optics.typeclasses/-at/index.html)`<`[`S`](at.html#S)`, `[`I`](at.html#I)`, `[`A`](at.html#A)`>, i: `[`I`](at.html#I)`): `[`Lens`](../arrow.optics/-lens.html)`<`[`T`](at.html#T)`, `[`A`](at.html#A)`>`

DSL to compose [At](../arrow.optics.typeclasses/-at/index.html) with an [Iso](../arrow.optics/-iso.html) for a structure [S](at.html#S) to focus in on [A](at.html#A) at given index [I](at.html#I).

### Parameters

`AT` - [At](../arrow.optics.typeclasses/-at/index.html) instance to provide a [Lens](../arrow.optics/-lens.html) to zoom into [S](at.html#S) at [I](at.html#I)

`i` - index [I](at.html#I) to zoom into [S](at.html#S) and find focus [A](at.html#A)

**Receiver**
[Iso](../arrow.optics/-iso.html) with a focus in [S](at.html#S)

**Return**
[Lens](../arrow.optics/-lens.html) with a focus in [A](at.html#A) at given index [I](at.html#I).

`fun <T, S, I, A> `[`Prism`](../arrow.optics/-prism.html)`<`[`T`](at.html#T)`, `[`S`](at.html#S)`>.at(AT: `[`At`](../arrow.optics.typeclasses/-at/index.html)`<`[`S`](at.html#S)`, `[`I`](at.html#I)`, `[`A`](at.html#A)`>, i: `[`I`](at.html#I)`): `[`Optional`](../arrow.optics/-optional.html)`<`[`T`](at.html#T)`, `[`A`](at.html#A)`>`

DSL to compose [At](../arrow.optics.typeclasses/-at/index.html) with a [Prism](../arrow.optics/-prism.html) for a structure [S](at.html#S) to focus in on [A](at.html#A) at given index [I](at.html#I).

### Parameters

`AT` - [At](../arrow.optics.typeclasses/-at/index.html) instance to provide a [Lens](../arrow.optics/-lens.html) to zoom into [S](at.html#S) at [I](at.html#I)

`i` - index [I](at.html#I) to zoom into [S](at.html#S) and find focus [A](at.html#A)

**Receiver**
[Prism](../arrow.optics/-prism.html) with a focus in [S](at.html#S)

**Return**
[Optional](../arrow.optics/-optional.html) with a focus in [A](at.html#A) at given index [I](at.html#I).

`fun <T, S, I, A> `[`Optional`](../arrow.optics/-optional.html)`<`[`T`](at.html#T)`, `[`S`](at.html#S)`>.at(AT: `[`At`](../arrow.optics.typeclasses/-at/index.html)`<`[`S`](at.html#S)`, `[`I`](at.html#I)`, `[`A`](at.html#A)`>, i: `[`I`](at.html#I)`): `[`Optional`](../arrow.optics/-optional.html)`<`[`T`](at.html#T)`, `[`A`](at.html#A)`>`

DSL to compose [At](../arrow.optics.typeclasses/-at/index.html) with an [Optional](../arrow.optics/-optional.html) for a structure [S](at.html#S) to focus in on [A](at.html#A) at given index [I](at.html#I).

### Parameters

`AT` - [At](../arrow.optics.typeclasses/-at/index.html) instance to provide a [Lens](../arrow.optics/-lens.html) to zoom into [S](at.html#S) at [I](at.html#I)

`i` - index [I](at.html#I) to zoom into [S](at.html#S) and find focus [A](at.html#A)

**Receiver**
[Optional](../arrow.optics/-optional.html) with a focus in [S](at.html#S)

**Return**
[Optional](../arrow.optics/-optional.html) with a focus in [A](at.html#A) at given index [I](at.html#I).

`fun <T, S, I, A> `[`Getter`](../arrow.optics/-getter/index.html)`<`[`T`](at.html#T)`, `[`S`](at.html#S)`>.at(AT: `[`At`](../arrow.optics.typeclasses/-at/index.html)`<`[`S`](at.html#S)`, `[`I`](at.html#I)`, `[`A`](at.html#A)`>, i: `[`I`](at.html#I)`): `[`Getter`](../arrow.optics/-getter/index.html)`<`[`T`](at.html#T)`, `[`A`](at.html#A)`>`

DSL to compose [At](../arrow.optics.typeclasses/-at/index.html) with a [Getter](../arrow.optics/-getter/index.html) for a structure [S](at.html#S) to focus in on [A](at.html#A) at given index [I](at.html#I).

### Parameters

`AT` - [At](../arrow.optics.typeclasses/-at/index.html) instance to provide a [Lens](../arrow.optics/-lens.html) to zoom into [S](at.html#S) at [I](at.html#I)

`i` - index [I](at.html#I) to zoom into [S](at.html#S) and find focus [A](at.html#A)

**Receiver**
[Getter](../arrow.optics/-getter/index.html) with a focus in [S](at.html#S)

**Return**
[Getter](../arrow.optics/-getter/index.html) with a focus in [A](at.html#A) at given index [I](at.html#I).

`fun <T, S, I, A> `[`Setter`](../arrow.optics/-setter.html)`<`[`T`](at.html#T)`, `[`S`](at.html#S)`>.at(AT: `[`At`](../arrow.optics.typeclasses/-at/index.html)`<`[`S`](at.html#S)`, `[`I`](at.html#I)`, `[`A`](at.html#A)`>, i: `[`I`](at.html#I)`): `[`Setter`](../arrow.optics/-setter.html)`<`[`T`](at.html#T)`, `[`A`](at.html#A)`>`

DSL to compose [At](../arrow.optics.typeclasses/-at/index.html) with a [Setter](../arrow.optics/-setter.html) for a structure [S](at.html#S) to focus in on [A](at.html#A) at given index [I](at.html#I).

### Parameters

`AT` - [At](../arrow.optics.typeclasses/-at/index.html) instance to provide a [Lens](../arrow.optics/-lens.html) to zoom into [S](at.html#S) at [I](at.html#I)

`i` - index [I](at.html#I) to zoom into [S](at.html#S) and find focus [A](at.html#A)

**Receiver**
[Setter](../arrow.optics/-setter.html) with a focus in [S](at.html#S)

**Return**
[Setter](../arrow.optics/-setter.html) with a focus in [A](at.html#A) at given index [I](at.html#I).

`fun <T, S, I, A> `[`Traversal`](../arrow.optics/-traversal.html)`<`[`T`](at.html#T)`, `[`S`](at.html#S)`>.at(AT: `[`At`](../arrow.optics.typeclasses/-at/index.html)`<`[`S`](at.html#S)`, `[`I`](at.html#I)`, `[`A`](at.html#A)`>, i: `[`I`](at.html#I)`): `[`Traversal`](../arrow.optics/-traversal.html)`<`[`T`](at.html#T)`, `[`A`](at.html#A)`>`

DSL to compose [At](../arrow.optics.typeclasses/-at/index.html) with a [Traversal](../arrow.optics/-traversal.html) for a structure [S](at.html#S) to focus in on [A](at.html#A) at given index [I](at.html#I).

### Parameters

`AT` - [At](../arrow.optics.typeclasses/-at/index.html) instance to provide a [Lens](../arrow.optics/-lens.html) to zoom into [S](at.html#S) at [I](at.html#I)

`i` - index [I](at.html#I) to zoom into [S](at.html#S) and find focus [A](at.html#A)

**Receiver**
[Traversal](../arrow.optics/-traversal.html) with a focus in [S](at.html#S)

**Return**
[Traversal](../arrow.optics/-traversal.html) with a focus in [A](at.html#A) at given index [I](at.html#I).

`fun <T, S, I, A> `[`Fold`](../arrow.optics/-fold/index.html)`<`[`T`](at.html#T)`, `[`S`](at.html#S)`>.at(AT: `[`At`](../arrow.optics.typeclasses/-at/index.html)`<`[`S`](at.html#S)`, `[`I`](at.html#I)`, `[`A`](at.html#A)`>, i: `[`I`](at.html#I)`): `[`Fold`](../arrow.optics/-fold/index.html)`<`[`T`](at.html#T)`, `[`A`](at.html#A)`>`

DSL to compose [At](../arrow.optics.typeclasses/-at/index.html) with a [Fold](../arrow.optics/-fold/index.html) for a structure [S](at.html#S) to focus in on [A](at.html#A) at given index [I](at.html#I).

### Parameters

`AT` - [At](../arrow.optics.typeclasses/-at/index.html) instance to provide a [Lens](../arrow.optics/-lens.html) to zoom into [S](at.html#S) at [I](at.html#I)

`i` - index [I](at.html#I) to zoom into [S](at.html#S) and find focus [A](at.html#A)

**Receiver**
[Fold](../arrow.optics/-fold/index.html) with a focus in [S](at.html#S)

**Return**
[Fold](../arrow.optics/-fold/index.html) with a focus in [A](at.html#A) at given index [I](at.html#I).

