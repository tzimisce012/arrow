---
title: every - arrow-optics
---

[arrow-optics](../index.html) / [arrow.optics.dsl](index.html) / [every](./every.html)

# every

`fun <T, S, A> `[`Lens`](../arrow.optics/-lens.html)`<`[`T`](every.html#T)`, `[`S`](every.html#S)`>.every(EA: `[`Each`](../arrow.optics.typeclasses/-each/index.html)`<`[`S`](every.html#S)`, `[`A`](every.html#A)`>): `[`Traversal`](../arrow.optics/-traversal.html)`<`[`T`](every.html#T)`, `[`A`](every.html#A)`>`

DSL to compose [Each](../arrow.optics.typeclasses/-each/index.html) with a [Lens](../arrow.optics/-lens.html) for a structure [S](every.html#S) to see all its foci [A](every.html#A)

### Parameters

`EA` - [Each](../arrow.optics.typeclasses/-each/index.html) to provide [Traversal](../arrow.optics/-traversal.html) that can focus into a structure [S](every.html#S) to see all its foci [A](every.html#A)

**Receiver**
[Lens](../arrow.optics/-lens.html) with a focus in [S](every.html#S)

**Return**
[Traversal](../arrow.optics/-traversal.html) with a focus in [A](every.html#A)

`fun <T, S, A> `[`Iso`](../arrow.optics/-iso.html)`<`[`T`](every.html#T)`, `[`S`](every.html#S)`>.every(EA: `[`Each`](../arrow.optics.typeclasses/-each/index.html)`<`[`S`](every.html#S)`, `[`A`](every.html#A)`>): `[`Traversal`](../arrow.optics/-traversal.html)`<`[`T`](every.html#T)`, `[`A`](every.html#A)`>`

DSL to compose [Each](../arrow.optics.typeclasses/-each/index.html) with an [Iso](../arrow.optics/-iso.html) for a structure [S](every.html#S) to see all its foci [A](every.html#A)

### Parameters

`EA` - [Each](../arrow.optics.typeclasses/-each/index.html) to provide [Traversal](../arrow.optics/-traversal.html) that can focus into a structure [S](every.html#S) to see all its foci [A](every.html#A)

**Receiver**
[Iso](../arrow.optics/-iso.html) with a focus in [S](every.html#S)

**Return**
[Traversal](../arrow.optics/-traversal.html) with a focus in [A](every.html#A)

`fun <T, S, A> `[`Prism`](../arrow.optics/-prism.html)`<`[`T`](every.html#T)`, `[`S`](every.html#S)`>.every(EA: `[`Each`](../arrow.optics.typeclasses/-each/index.html)`<`[`S`](every.html#S)`, `[`A`](every.html#A)`>): `[`Traversal`](../arrow.optics/-traversal.html)`<`[`T`](every.html#T)`, `[`A`](every.html#A)`>`

DSL to compose [Each](../arrow.optics.typeclasses/-each/index.html) with a [Prism](../arrow.optics/-prism.html) for a structure [S](every.html#S) to see all its foci [A](every.html#A)

### Parameters

`EA` - [Each](../arrow.optics.typeclasses/-each/index.html) to provide [Traversal](../arrow.optics/-traversal.html) that can focus into a structure [S](every.html#S) to see all its foci [A](every.html#A)

**Receiver**
[Prism](../arrow.optics/-prism.html) with a focus in [S](every.html#S)

**Return**
[Traversal](../arrow.optics/-traversal.html) with a focus in [A](every.html#A)

`fun <T, S, A> `[`Optional`](../arrow.optics/-optional.html)`<`[`T`](every.html#T)`, `[`S`](every.html#S)`>.every(EA: `[`Each`](../arrow.optics.typeclasses/-each/index.html)`<`[`S`](every.html#S)`, `[`A`](every.html#A)`>): `[`Traversal`](../arrow.optics/-traversal.html)`<`[`T`](every.html#T)`, `[`A`](every.html#A)`>`

DSL to compose [Each](../arrow.optics.typeclasses/-each/index.html) with an [Optional](../arrow.optics/-optional.html) for a structure [S](every.html#S) to see all its foci [A](every.html#A)

### Parameters

`EA` - [Each](../arrow.optics.typeclasses/-each/index.html) to provide [Traversal](../arrow.optics/-traversal.html) that can focus into a structure [S](every.html#S) to see all its foci [A](every.html#A)

**Receiver**
[Optional](../arrow.optics/-optional.html) with a focus in [S](every.html#S)

**Return**
[Traversal](../arrow.optics/-traversal.html) with a focus in [A](every.html#A)

`fun <T, S, A> `[`Setter`](../arrow.optics/-setter.html)`<`[`T`](every.html#T)`, `[`S`](every.html#S)`>.every(EA: `[`Each`](../arrow.optics.typeclasses/-each/index.html)`<`[`S`](every.html#S)`, `[`A`](every.html#A)`>): `[`Setter`](../arrow.optics/-setter.html)`<`[`T`](every.html#T)`, `[`A`](every.html#A)`>`

DSL to compose [Each](../arrow.optics.typeclasses/-each/index.html) with a [Setter](../arrow.optics/-setter.html) for a structure [S](every.html#S) to see all its foci [A](every.html#A)

### Parameters

`EA` - [Each](../arrow.optics.typeclasses/-each/index.html) to provide [Traversal](../arrow.optics/-traversal.html) that can focus into a structure [S](every.html#S) to see all its foci [A](every.html#A)

**Receiver**
[Setter](../arrow.optics/-setter.html) with a focus in [S](every.html#S)

**Return**
[Setter](../arrow.optics/-setter.html) with a focus in [A](every.html#A)

`fun <T, S, A> `[`Traversal`](../arrow.optics/-traversal.html)`<`[`T`](every.html#T)`, `[`S`](every.html#S)`>.every(EA: `[`Each`](../arrow.optics.typeclasses/-each/index.html)`<`[`S`](every.html#S)`, `[`A`](every.html#A)`>): `[`Traversal`](../arrow.optics/-traversal.html)`<`[`T`](every.html#T)`, `[`A`](every.html#A)`>`

DSL to compose [Each](../arrow.optics.typeclasses/-each/index.html) with a [Traversal](../arrow.optics/-traversal.html) for a structure [S](every.html#S) to see all its foci [A](every.html#A)

### Parameters

`EA` - [Each](../arrow.optics.typeclasses/-each/index.html) to provide [Traversal](../arrow.optics/-traversal.html) that can focus into a structure [S](every.html#S) to see all its foci [A](every.html#A)

**Receiver**
[Traversal](../arrow.optics/-traversal.html) with a focus in [S](every.html#S)

**Return**
[Traversal](../arrow.optics/-traversal.html) with a focus in [A](every.html#A)

`fun <T, S, A> `[`Fold`](../arrow.optics/-fold/index.html)`<`[`T`](every.html#T)`, `[`S`](every.html#S)`>.every(EA: `[`Each`](../arrow.optics.typeclasses/-each/index.html)`<`[`S`](every.html#S)`, `[`A`](every.html#A)`>): `[`Fold`](../arrow.optics/-fold/index.html)`<`[`T`](every.html#T)`, `[`A`](every.html#A)`>`

DSL to compose [Each](../arrow.optics.typeclasses/-each/index.html) with a [Fold](../arrow.optics/-fold/index.html) for a structure [S](every.html#S) to see all its foci [A](every.html#A)

### Parameters

`EA` - [Each](../arrow.optics.typeclasses/-each/index.html) to provide [Traversal](../arrow.optics/-traversal.html) that can focus into a structure [S](every.html#S) to see all its foci [A](every.html#A)

**Receiver**
[Fold](../arrow.optics/-fold/index.html) with a focus in [S](every.html#S)

**Return**
[Fold](../arrow.optics/-fold/index.html) with a focus in [A](every.html#A)

