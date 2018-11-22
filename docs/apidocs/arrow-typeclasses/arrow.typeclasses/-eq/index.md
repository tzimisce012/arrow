---
title: Eq - arrow-typeclasses
---

[arrow-typeclasses](../../index.html) / [arrow.typeclasses](../index.html) / [Eq](./index.html)

# Eq

`interface Eq<in F>`



A type class used to determine equality between 2 instances of the same type [F](index.html#F) in a type safe way.

### Functions

| [eqv](eqv.html) | `abstract fun `[`F`](index.html#F)`.eqv(b: `[`F`](index.html#F)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Compares two instances of [F](index.html#F) and returns true if they're considered equal for this instance. |
| [neqv](neqv.html) | `open fun `[`F`](index.html#F)`.neqv(b: `[`F`](index.html#F)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Compares two instances of [F](index.html#F) and returns true if they're considered not equal for this instance. |

### Companion Object Functions

| [any](any.html) | `fun any(): `[`Eq`](./index.html)`<`[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?>`<br>Retrieve an [Eq](./index.html) that defines all instances as equal for type [F](index.html#F). |
| [invoke](invoke.html) | `operator fun <F> invoke(feqv: (`[`F`](invoke.html#F)`, `[`F`](invoke.html#F)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`Eq`](./index.html)`<`[`F`](invoke.html#F)`>`<br>Construct an [Eq](./index.html) from a function `(F, F) -> Boolean`. |

### Inheritors

| [Hash](../-hash/index.html) | `interface Hash<in F> : `[`Eq`](./index.html)`<`[`F`](../-hash/index.html#F)`>`<br>A type class used to represent hashing for objects of type [F](../-hash/index.html#F) |
| [Order](../-order/index.html) | `interface Order<F> : `[`Eq`](./index.html)`<`[`F`](../-order/index.html#F)`>`<br> |




## Type Class Hierarchy

<canvas id="arrow.typeclasses-hierarchy-diagram"></canvas>
<script>
  drawNomNomlDiagram('arrow.typeclasses-hierarchy-diagram', 'arrow.typeclasses-diagram.nomnol')
</script>

