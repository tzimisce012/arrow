---
title: arrow.generic.coproduct3 - arrow-generic
---

[arrow-generic](../index.html) / [arrow.generic.coproduct3](./index.html)

## Package arrow.generic.coproduct3

### Types

| [Coproduct3](-coproduct3.html) | `sealed class Coproduct3<A, B, C>` |

### Functions

| [cop](cop.html) | `fun <A, B, C> `[`A`](cop.html#A)`.cop(): `[`Coproduct3`](-coproduct3.html)`<`[`A`](cop.html#A)`, `[`B`](cop.html#B)`, `[`C`](cop.html#C)`>`<br>`fun <A, B, C> `[`B`](cop.html#B)`.cop(dummy0: `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)` = Unit): `[`Coproduct3`](-coproduct3.html)`<`[`A`](cop.html#A)`, `[`B`](cop.html#B)`, `[`C`](cop.html#C)`>`<br>`fun <A, B, C> `[`C`](cop.html#C)`.cop(dummy0: `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)` = Unit, dummy1: `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)` = Unit): `[`Coproduct3`](-coproduct3.html)`<`[`A`](cop.html#A)`, `[`B`](cop.html#B)`, `[`C`](cop.html#C)`>` |
| [coproductOf](coproduct-of.html) | `fun <A, B, C> coproductOf(a: `[`A`](coproduct-of.html#A)`): `[`Coproduct3`](-coproduct3.html)`<`[`A`](coproduct-of.html#A)`, `[`B`](coproduct-of.html#B)`, `[`C`](coproduct-of.html#C)`>`<br>`fun <A, B, C> coproductOf(b: `[`B`](coproduct-of.html#B)`, dummy0: `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)` = Unit): `[`Coproduct3`](-coproduct3.html)`<`[`A`](coproduct-of.html#A)`, `[`B`](coproduct-of.html#B)`, `[`C`](coproduct-of.html#C)`>`<br>`fun <A, B, C> coproductOf(c: `[`C`](coproduct-of.html#C)`, dummy0: `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)` = Unit, dummy1: `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)` = Unit): `[`Coproduct3`](-coproduct3.html)`<`[`A`](coproduct-of.html#A)`, `[`B`](coproduct-of.html#B)`, `[`C`](coproduct-of.html#C)`>` |
| [fold](fold.html) | `fun <A, B, C, RESULT> `[`Coproduct3`](-coproduct3.html)`<`[`A`](fold.html#A)`, `[`B`](fold.html#B)`, `[`C`](fold.html#C)`>.fold(a: (`[`A`](fold.html#A)`) -> `[`RESULT`](fold.html#RESULT)`, b: (`[`B`](fold.html#B)`) -> `[`RESULT`](fold.html#RESULT)`, c: (`[`C`](fold.html#C)`) -> `[`RESULT`](fold.html#RESULT)`): `[`RESULT`](fold.html#RESULT) |
| [select](select.html) | `fun <A> `[`Coproduct3`](-coproduct3.html)`<`[`A`](select.html#A)`, *, *>.select(): Option<`[`A`](select.html#A)`>`<br>`fun <B> `[`Coproduct3`](-coproduct3.html)`<*, `[`B`](select.html#B)`, *>.select(dummy0: `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)` = Unit): Option<`[`B`](select.html#B)`>`<br>`fun <C> `[`Coproduct3`](-coproduct3.html)`<*, *, `[`C`](select.html#C)`>.select(dummy0: `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)` = Unit, dummy1: `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)` = Unit): Option<`[`C`](select.html#C)`>` |

