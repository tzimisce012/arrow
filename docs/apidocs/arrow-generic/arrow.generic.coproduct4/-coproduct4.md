---
title: Coproduct4 - arrow-generic
---

[arrow-generic](../index.html) / [arrow.generic.coproduct4](index.html) / [Coproduct4](./-coproduct4.html)

# Coproduct4

`sealed class Coproduct4<A, B, C, D>`

### Extension Functions

| [fold](fold.html) | `fun <A, B, C, D, RESULT> `[`Coproduct4`](./-coproduct4.html)`<`[`A`](fold.html#A)`, `[`B`](fold.html#B)`, `[`C`](fold.html#C)`, `[`D`](fold.html#D)`>.fold(a: (`[`A`](fold.html#A)`) -> `[`RESULT`](fold.html#RESULT)`, b: (`[`B`](fold.html#B)`) -> `[`RESULT`](fold.html#RESULT)`, c: (`[`C`](fold.html#C)`) -> `[`RESULT`](fold.html#RESULT)`, d: (`[`D`](fold.html#D)`) -> `[`RESULT`](fold.html#RESULT)`): `[`RESULT`](fold.html#RESULT) |
| [select](select.html) | `fun <A> `[`Coproduct4`](./-coproduct4.html)`<`[`A`](select.html#A)`, *, *, *>.select(): Option<`[`A`](select.html#A)`>`<br>`fun <B> `[`Coproduct4`](./-coproduct4.html)`<*, `[`B`](select.html#B)`, *, *>.select(dummy0: `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)` = Unit): Option<`[`B`](select.html#B)`>`<br>`fun <C> `[`Coproduct4`](./-coproduct4.html)`<*, *, `[`C`](select.html#C)`, *>.select(dummy0: `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)` = Unit, dummy1: `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)` = Unit): Option<`[`C`](select.html#C)`>`<br>`fun <D> `[`Coproduct4`](./-coproduct4.html)`<*, *, *, `[`D`](select.html#D)`>.select(dummy0: `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)` = Unit, dummy1: `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)` = Unit, dummy2: `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)` = Unit): Option<`[`D`](select.html#D)`>` |

