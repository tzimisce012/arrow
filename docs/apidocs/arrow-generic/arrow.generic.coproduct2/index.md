---
title: arrow.generic.coproduct2 - arrow-generic
---

[arrow-generic](../index.html) / [arrow.generic.coproduct2](./index.html)

## Package arrow.generic.coproduct2

### Types

| [Coproduct2](-coproduct2.html) | `sealed class Coproduct2<A, B>` |

### Functions

| [cop](cop.html) | `fun <A, B> `[`A`](cop.html#A)`.cop(): `[`Coproduct2`](-coproduct2.html)`<`[`A`](cop.html#A)`, `[`B`](cop.html#B)`>`<br>`fun <A, B> `[`B`](cop.html#B)`.cop(dummy0: `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)` = Unit): `[`Coproduct2`](-coproduct2.html)`<`[`A`](cop.html#A)`, `[`B`](cop.html#B)`>` |
| [coproductOf](coproduct-of.html) | `fun <A, B> coproductOf(a: `[`A`](coproduct-of.html#A)`): `[`Coproduct2`](-coproduct2.html)`<`[`A`](coproduct-of.html#A)`, `[`B`](coproduct-of.html#B)`>`<br>`fun <A, B> coproductOf(b: `[`B`](coproduct-of.html#B)`, dummy0: `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)` = Unit): `[`Coproduct2`](-coproduct2.html)`<`[`A`](coproduct-of.html#A)`, `[`B`](coproduct-of.html#B)`>` |
| [fold](fold.html) | `fun <A, B, RESULT> `[`Coproduct2`](-coproduct2.html)`<`[`A`](fold.html#A)`, `[`B`](fold.html#B)`>.fold(a: (`[`A`](fold.html#A)`) -> `[`RESULT`](fold.html#RESULT)`, b: (`[`B`](fold.html#B)`) -> `[`RESULT`](fold.html#RESULT)`): `[`RESULT`](fold.html#RESULT) |
| [select](select.html) | `fun <A> `[`Coproduct2`](-coproduct2.html)`<`[`A`](select.html#A)`, *>.select(): Option<`[`A`](select.html#A)`>`<br>`fun <B> `[`Coproduct2`](-coproduct2.html)`<*, `[`B`](select.html#B)`>.select(dummy0: `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)` = Unit): Option<`[`B`](select.html#B)`>` |

