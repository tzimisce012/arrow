---
title: Order.invoke - arrow-typeclasses
---

[arrow-typeclasses](../../index.html) / [arrow.typeclasses](../index.html) / [Order](index.html) / [invoke](./invoke.html)

# invoke

`inline operator fun <F> invoke(crossinline compare: (`[`F`](invoke.html#F)`, `[`F`](invoke.html#F)`) -> `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Order`](index.html)`<`[`F`](invoke.html#F)`>`

Construct an [Order](index.html) from a function `(F, F) -> Int`.

### Parameters

`compare` - a function that defines the order for 2 objects of type [F](invoke.html#F).

**Returns**
an [Order](index.html) instance that is defined by the [compare](invoke.html#arrow.typeclasses.Order.Companion$invoke(kotlin.Function2((arrow.typeclasses.Order.Companion.invoke.F, , kotlin.Int)))/compare) function.

