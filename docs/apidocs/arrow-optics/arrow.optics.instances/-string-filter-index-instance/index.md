---
title: StringFilterIndexInstance - arrow-optics
---

[arrow-optics](../../index.html) / [arrow.optics.instances](../index.html) / [StringFilterIndexInstance](./index.html)

# StringFilterIndexInstance

`interface StringFilterIndexInstance : `[`FilterIndex`](../../arrow.optics.typeclasses/-filter-index/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, `[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)`>`

[FilterIndex](../../arrow.optics.typeclasses/-filter-index/index.html) instance for [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html).
It allows filtering of every [Char](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html) in a [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) by its index's position.

### Functions

| [filter](filter.html) | `open fun filter(p: (`[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`Traversal`](../../arrow.optics/-traversal.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)`>`<br>Filter the foci [A](../../arrow.optics.typeclasses/-filter-index/index.html#A) of a [Traversal](../../arrow.optics/-traversal.html) with the predicate [p](../../arrow.optics.typeclasses/-filter-index/filter.html#arrow.optics.typeclasses.FilterIndex$filter(kotlin.Function1((arrow.optics.typeclasses.FilterIndex.I, kotlin.Boolean)))/p). |

### Companion Object Functions

| [invoke](invoke.html) | `operator fun invoke(): `[`FilterIndex`](../../arrow.optics.typeclasses/-filter-index/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, `[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)`>`<br>Operator overload to instantiate typeclass instance. |

