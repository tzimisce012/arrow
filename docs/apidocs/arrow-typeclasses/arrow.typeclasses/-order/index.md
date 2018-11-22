---
title: Order - arrow-typeclasses
---

[arrow-typeclasses](../../index.html) / [arrow.typeclasses](../index.html) / [Order](./index.html)

# Order

`interface Order<F> : `[`Eq`](../-eq/index.html)`<`[`F`](index.html#F)`>`



The [Order](./index.html) type class is used to define a total ordering on some type [F](index.html#F) and is defined by being able to fully determine order between two instances.

[Order](./index.html) is a subtype of [Eq](../-eq/index.html) and defines [eqv](eqv.html) in terms of [compare](compare.html).

**See Also**

[Eq](../-eq/index.html)

### Functions

| [compare](compare.html) | `abstract fun `[`F`](index.html#F)`.compare(b: `[`F`](index.html#F)`): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>Compare [this@compare](#) with [b](compare.html#arrow.typeclasses.Order$compare(arrow.typeclasses.Order.F, arrow.typeclasses.Order.F)/b). Returns an Int whose sign is: |
| [compareTo](compare-to.html) | `open operator fun `[`F`](index.html#F)`.compareTo(b: `[`F`](index.html#F)`): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>Kotlin operator overload |
| [eqv](eqv.html) | `open fun `[`F`](index.html#F)`.eqv(b: `[`F`](index.html#F)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [gt](gt.html) | `open fun `[`F`](index.html#F)`.gt(b: `[`F`](index.html#F)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Check if [this@gt](#) is `greater than` [b](gt.html#arrow.typeclasses.Order$gt(arrow.typeclasses.Order.F, arrow.typeclasses.Order.F)/b) |
| [gte](gte.html) | `open fun `[`F`](index.html#F)`.gte(b: `[`F`](index.html#F)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Check if [this@gte](#) is `greater than or equal to` [b](gte.html#arrow.typeclasses.Order$gte(arrow.typeclasses.Order.F, arrow.typeclasses.Order.F)/b) |
| [lt](lt.html) | `open fun `[`F`](index.html#F)`.lt(b: `[`F`](index.html#F)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Check if [this@lt](#) is `lower than` [b](lt.html#arrow.typeclasses.Order$lt(arrow.typeclasses.Order.F, arrow.typeclasses.Order.F)/b) |
| [lte](lte.html) | `open fun `[`F`](index.html#F)`.lte(b: `[`F`](index.html#F)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Check if [this@lte](#) is `lower than or equal to` [b](lte.html#arrow.typeclasses.Order$lte(arrow.typeclasses.Order.F, arrow.typeclasses.Order.F)/b) |
| [max](max.html) | `open fun `[`F`](index.html#F)`.max(b: `[`F`](index.html#F)`): `[`F`](index.html#F)<br>Determines the maximum of [this@max](#) and [b](max.html#arrow.typeclasses.Order$max(arrow.typeclasses.Order.F, arrow.typeclasses.Order.F)/b) in terms of order. |
| [min](min.html) | `open fun `[`F`](index.html#F)`.min(b: `[`F`](index.html#F)`): `[`F`](index.html#F)<br>Determines the minimum of [this@min](#) and [b](min.html#arrow.typeclasses.Order$min(arrow.typeclasses.Order.F, arrow.typeclasses.Order.F)/b) in terms of order. |
| [sort](sort.html) | `open fun `[`F`](index.html#F)`.sort(b: `[`F`](index.html#F)`): Tuple2<`[`F`](index.html#F)`, `[`F`](index.html#F)`>`<br>Sorts [this@sort](#) and [b](sort.html#arrow.typeclasses.Order$sort(arrow.typeclasses.Order.F, arrow.typeclasses.Order.F)/b) in terms of order. |

### Inherited Functions

| [neqv](../-eq/neqv.html) | `open fun `[`F`](../-eq/index.html#F)`.neqv(b: `[`F`](../-eq/index.html#F)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Compares two instances of [F](../-eq/index.html#F) and returns true if they're considered not equal for this instance. |

### Companion Object Functions

| [allEqual](all-equal.html) | `fun <F> allEqual(): `[`Order`](./index.html)`<`[`F`](all-equal.html#F)`>`<br>Construct an [Order](./index.html) that defines all instances as equal for type [F](all-equal.html#F). |
| [invoke](invoke.html) | `operator fun <F> invoke(compare: (`[`F`](invoke.html#F)`, `[`F`](invoke.html#F)`) -> `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): `[`Order`](./index.html)`<`[`F`](invoke.html#F)`>`<br>Construct an [Order](./index.html) from a function `(F, F) -> Int`. |




## Type Class Hierarchy

<canvas id="arrow.typeclasses-hierarchy-diagram"></canvas>
<script>
  drawNomNomlDiagram('arrow.typeclasses-hierarchy-diagram', 'arrow.typeclasses-diagram.nomnol')
</script>

