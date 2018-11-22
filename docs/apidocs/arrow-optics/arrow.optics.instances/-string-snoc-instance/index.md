---
title: StringSnocInstance - arrow-optics
---

[arrow-optics](../../index.html) / [arrow.optics.instances](../index.html) / [StringSnocInstance](./index.html)

# StringSnocInstance

`interface StringSnocInstance : `[`Snoc`](../../arrow.optics.typeclasses/-snoc/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)`>`

### Inherited Properties

| [init](../../arrow.optics.typeclasses/-snoc/init.html) | `open val `[`S`](../../arrow.optics.typeclasses/-snoc/index.html#S)`.init: Option<`[`S`](../../arrow.optics.typeclasses/-snoc/index.html#S)`>`<br>Selects all elements except the last. |

### Functions

| [snoc](snoc.html) | `open fun snoc(): `[`Prism`](../../arrow.optics/-prism.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, Tuple2<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)`>>`<br>Provides a [Prism](../../arrow.optics/-prism.html) between a [S](../../arrow.optics.typeclasses/-snoc/index.html#S) and its [init](../../arrow.optics.typeclasses/-snoc/index.html#S) and last element [A](../../arrow.optics.typeclasses/-snoc/index.html#A). |

### Inherited Functions

| [initOption](../../arrow.optics.typeclasses/-snoc/init-option.html) | `open fun initOption(): `[`Optional`](../../arrow.optics/-optional.html)`<`[`S`](../../arrow.optics.typeclasses/-snoc/index.html#S)`, `[`S`](../../arrow.optics.typeclasses/-snoc/index.html#S)`>`<br>Provides an [Optional](../../arrow.optics/-optional.html) between [S](../../arrow.optics.typeclasses/-snoc/index.html#S) and its init [S](../../arrow.optics.typeclasses/-snoc/index.html#S). |
| [lastOption](../../arrow.optics.typeclasses/-snoc/last-option.html) | `open fun lastOption(): `[`Optional`](../../arrow.optics/-optional.html)`<`[`S`](../../arrow.optics.typeclasses/-snoc/index.html#S)`, `[`A`](../../arrow.optics.typeclasses/-snoc/index.html#A)`>`<br>Provides an [Optional](../../arrow.optics/-optional.html) between [S](../../arrow.optics.typeclasses/-snoc/index.html#S) and its last element [A](../../arrow.optics.typeclasses/-snoc/index.html#A). |
| [snoc](../../arrow.optics.typeclasses/-snoc/snoc.html) | `open infix fun `[`S`](../../arrow.optics.typeclasses/-snoc/index.html#S)`.snoc(last: `[`A`](../../arrow.optics.typeclasses/-snoc/index.html#A)`): `[`S`](../../arrow.optics.typeclasses/-snoc/index.html#S)<br>Append an element [A](../../arrow.optics.typeclasses/-snoc/index.html#A) to [S](../../arrow.optics.typeclasses/-snoc/index.html#S). |
| [unsnoc](../../arrow.optics.typeclasses/-snoc/unsnoc.html) | `open fun `[`S`](../../arrow.optics.typeclasses/-snoc/index.html#S)`.unsnoc(): Option<Tuple2<`[`S`](../../arrow.optics.typeclasses/-snoc/index.html#S)`, `[`A`](../../arrow.optics.typeclasses/-snoc/index.html#A)`>>`<br>Deconstruct an [S](../../arrow.optics.typeclasses/-snoc/index.html#S) between its [init](../../arrow.optics.typeclasses/-snoc/init.html) and last element. |

### Companion Object Functions

| [invoke](invoke.html) | `operator fun invoke(): `[`Snoc`](../../arrow.optics.typeclasses/-snoc/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)`>`<br>Operator overload to instantiate typeclass instance. |

