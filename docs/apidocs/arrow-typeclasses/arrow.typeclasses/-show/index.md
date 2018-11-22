---
title: Show - arrow-typeclasses
---

[arrow-typeclasses](../../index.html) / [arrow.typeclasses](../index.html) / [Show](./index.html)

# Show

`interface Show<in A>`



A type class used to get a textual representation for an instance of type [A](index.html#A) in a type safe way.

### Functions

| [show](show.html) | `abstract fun `[`A`](index.html#A)`.show(): `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Given an object [this@show](#) of type [A](index.html#A) it returns its textual representation. |

### Companion Object Functions

| [any](any.html) | `fun any(): `[`Show`](./index.html)`<`[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?>`<br>Retrieve a [Show](./index.html) that defines the textual representation as toString() for type [A](index.html#A). |
| [fromToString](from-to-string.html) | `fun <A> fromToString(): `[`Show`](./index.html)`<`[`A`](from-to-string.html#A)`>`<br>Construct a [Show](./index.html) instance using object `toString`. |
| [invoke](invoke.html) | `operator fun <A> invoke(fshow: `[`A`](invoke.html#A)`.() -> `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`): `[`Show`](./index.html)`<`[`A`](invoke.html#A)`>`<br>Construct a [Show](./index.html) instance from a function `A.() -> String` |




## Type Class Hierarchy

<canvas id="arrow.typeclasses-hierarchy-diagram"></canvas>
<script>
  drawNomNomlDiagram('arrow.typeclasses-hierarchy-diagram', 'arrow.typeclasses-diagram.nomnol')
</script>

