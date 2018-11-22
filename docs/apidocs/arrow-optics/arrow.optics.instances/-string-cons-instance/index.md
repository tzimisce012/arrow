---
title: StringConsInstance - arrow-optics
---

[arrow-optics](../../index.html) / [arrow.optics.instances](../index.html) / [StringConsInstance](./index.html)

# StringConsInstance

`interface StringConsInstance : `[`Cons`](../../arrow.optics.typeclasses/-cons/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)`>`

### Functions

| [cons](cons.html) | `open fun cons(): `[`Prism`](../../arrow.optics/-prism.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, Tuple2<`[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)`, `[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`>>`<br>Provides a [Prism](../../arrow.optics/-prism.html) between [S](../../arrow.optics.typeclasses/-cons/index.html#S) and its first element [A](../../arrow.optics.typeclasses/-cons/index.html#A) and tail [S](../../arrow.optics.typeclasses/-cons/index.html#S). |

### Inherited Functions

| [cons](../../arrow.optics.typeclasses/-cons/cons.html) | `open infix fun `[`A`](../../arrow.optics.typeclasses/-cons/index.html#A)`.cons(tail: `[`S`](../../arrow.optics.typeclasses/-cons/index.html#S)`): `[`S`](../../arrow.optics.typeclasses/-cons/index.html#S)<br>Prepend an element [A](../../arrow.optics.typeclasses/-cons/index.html#A) to the first element of [S](../../arrow.optics.typeclasses/-cons/index.html#S). |
| [firstOption](../../arrow.optics.typeclasses/-cons/first-option.html) | `open fun firstOption(): `[`Optional`](../../arrow.optics/-optional.html)`<`[`S`](../../arrow.optics.typeclasses/-cons/index.html#S)`, `[`A`](../../arrow.optics.typeclasses/-cons/index.html#A)`>`<br>Provides an [Optional](../../arrow.optics/-optional.html) between [S](../../arrow.optics.typeclasses/-cons/index.html#S) and its first element [A](../../arrow.optics.typeclasses/-cons/index.html#A). |
| [tailOption](../../arrow.optics.typeclasses/-cons/tail-option.html) | `open fun tailOption(): `[`Optional`](../../arrow.optics/-optional.html)`<`[`S`](../../arrow.optics.typeclasses/-cons/index.html#S)`, `[`S`](../../arrow.optics.typeclasses/-cons/index.html#S)`>`<br>Provides an [Optional](../../arrow.optics/-optional.html) between [S](../../arrow.optics.typeclasses/-cons/index.html#S) and its tail [S](../../arrow.optics.typeclasses/-cons/index.html#S). |
| [uncons](../../arrow.optics.typeclasses/-cons/uncons.html) | `open fun `[`S`](../../arrow.optics.typeclasses/-cons/index.html#S)`.uncons(): Option<Tuple2<`[`A`](../../arrow.optics.typeclasses/-cons/index.html#A)`, `[`S`](../../arrow.optics.typeclasses/-cons/index.html#S)`>>`<br>Deconstruct an [S](../../arrow.optics.typeclasses/-cons/index.html#S) to its optional first element [A](../../arrow.optics.typeclasses/-cons/index.html#A) and tail [S](../../arrow.optics.typeclasses/-cons/index.html#S). |

### Companion Object Functions

| [invoke](invoke.html) | `operator fun invoke(): `[`Cons`](../../arrow.optics.typeclasses/-cons/index.html)`<`[`String`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)`, `[`Char`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-char/index.html)`>`<br>Operator overload to instantiate typeclass instance. |

