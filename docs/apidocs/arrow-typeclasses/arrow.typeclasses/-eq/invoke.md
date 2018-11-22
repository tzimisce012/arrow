---
title: Eq.invoke - arrow-typeclasses
---

[arrow-typeclasses](../../index.html) / [arrow.typeclasses](../index.html) / [Eq](index.html) / [invoke](./invoke.html)

# invoke

`inline operator fun <F> invoke(crossinline feqv: (`[`F`](invoke.html#F)`, `[`F`](invoke.html#F)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`Eq`](index.html)`<`[`F`](invoke.html#F)`>`

Construct an [Eq](index.html) from a function `(F, F) -> Boolean`.

### Parameters

`feqv` - function that defines if two instances of type [F](invoke.html#F) are equal.

**Returns**
an [Eq](index.html) instance that is defined by the [feqv](invoke.html#arrow.typeclasses.Eq.Companion$invoke(kotlin.Function2((arrow.typeclasses.Eq.Companion.invoke.F, , kotlin.Boolean)))/feqv) function.

