---
title: Order.compare - arrow-typeclasses
---

[arrow-typeclasses](../../index.html) / [arrow.typeclasses](../index.html) / [Order](index.html) / [compare](./compare.html)

# compare

`abstract fun `[`F`](index.html#F)`.compare(b: `[`F`](index.html#F)`): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)

Compare [this@compare](#) with [b](compare.html#arrow.typeclasses.Order$compare(arrow.typeclasses.Order.F, arrow.typeclasses.Order.F)/b). Returns an Int whose sign is:

* negative if `x < y`
* zero     if `x = y`
* positive if `x > y`

### Parameters

`b` - object to compare with [this@compare](#)

**Receiver**
object to compare with [b](compare.html#arrow.typeclasses.Order$compare(arrow.typeclasses.Order.F, arrow.typeclasses.Order.F)/b)

**Returns**
zero objects are equal, a negative number if [this@compare](#) is less than [b](compare.html#arrow.typeclasses.Order$compare(arrow.typeclasses.Order.F, arrow.typeclasses.Order.F)/b), or a positive number if [this@compare](#) greater than [b](compare.html#arrow.typeclasses.Order$compare(arrow.typeclasses.Order.F, arrow.typeclasses.Order.F)/b).

