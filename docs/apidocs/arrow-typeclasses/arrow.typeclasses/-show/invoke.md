---
title: Show.invoke - arrow-typeclasses
---

[arrow-typeclasses](../../index.html) / [arrow.typeclasses](../index.html) / [Show](index.html) / [invoke](./invoke.html)

# invoke

`inline operator fun <A> invoke(crossinline fshow: `[`A`](invoke.html#A)`.() -> `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Show`](index.html)`<`[`A`](invoke.html#A)`>`

Construct a [Show](index.html) instance from a function `A.() -> String`

### Parameters

`fshow` - function that defines a textual representation for type [A](invoke.html#A).

**Returns**
a [Show](index.html) instance that is defined by the [fshow](invoke.html#arrow.typeclasses.Show.Companion$invoke(kotlin.Function1((arrow.typeclasses.Show.Companion.invoke.A, kotlin.String)))/fshow) function.

