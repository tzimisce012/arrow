---
title: Coproduct3 - arrow-generic
---

[arrow-generic](../index.html) / [arrow.generic.coproduct3](index.html) / [Coproduct3](./-coproduct3.html)

# Coproduct3

`sealed class Coproduct3<A, B, C>`

### Extension Functions

| [fold](fold.html) | `fun <A, B, C, RESULT> `[`Coproduct3`](./-coproduct3.html)`<`[`A`](fold.html#A)`, `[`B`](fold.html#B)`, `[`C`](fold.html#C)`>.fold(a: (`[`A`](fold.html#A)`) -> `[`RESULT`](fold.html#RESULT)`, b: (`[`B`](fold.html#B)`) -> `[`RESULT`](fold.html#RESULT)`, c: (`[`C`](fold.html#C)`) -> `[`RESULT`](fold.html#RESULT)`): `[`RESULT`](fold.html#RESULT) |
| [select](select.html) | `fun <A> `[`Coproduct3`](./-coproduct3.html)`<`[`A`](select.html#A)`, *, *>.select(): Option<`[`A`](select.html#A)`>`<br>`fun <B> `[`Coproduct3`](./-coproduct3.html)`<*, `[`B`](select.html#B)`, *>.select(dummy0: `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)` = Unit): Option<`[`B`](select.html#B)`>`<br>`fun <C> `[`Coproduct3`](./-coproduct3.html)`<*, *, `[`C`](select.html#C)`>.select(dummy0: `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)` = Unit, dummy1: `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)` = Unit): Option<`[`C`](select.html#C)`>` |

