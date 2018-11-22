---
title: MapAtInstance.at - arrow-optics
---

[arrow-optics](../../index.html) / [arrow.optics.instances](../index.html) / [MapAtInstance](index.html) / [at](./at.html)

# at

`open fun at(i: `[`K`](index.html#K)`): `[`Lens`](../../arrow.optics/-lens.html)`<`[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`K`](index.html#K)`, `[`V`](index.html#V)`>, Option<`[`V`](index.html#V)`>>`

Overrides [At.at](../../arrow.optics.typeclasses/-at/at.html)

Get a [Lens](../../arrow.optics/-lens.html) for a structure [S](../../arrow.optics.typeclasses/-at/index.html#S) with focus in [A](../../arrow.optics.typeclasses/-at/index.html#A) at index [i](../../arrow.optics.typeclasses/-at/at.html#arrow.optics.typeclasses.At$at(arrow.optics.typeclasses.At.I)/i).

### Parameters

`i` - index [I](../../arrow.optics.typeclasses/-at/index.html#I) to zoom into [S](../../arrow.optics.typeclasses/-at/index.html#S) and find focus [A](../../arrow.optics.typeclasses/-at/index.html#A)

**Return**
[Lens](../../arrow.optics/-lens.html) with a focus in [A](../../arrow.optics.typeclasses/-at/index.html#A) at given index [I](../../arrow.optics.typeclasses/-at/index.html#I).

