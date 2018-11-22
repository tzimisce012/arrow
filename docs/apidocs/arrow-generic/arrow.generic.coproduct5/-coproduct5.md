---
title: Coproduct5 - arrow-generic
---

[arrow-generic](../index.html) / [arrow.generic.coproduct5](index.html) / [Coproduct5](./-coproduct5.html)

# Coproduct5

`sealed class Coproduct5<A, B, C, D, E>`

### Extension Functions

| [fold](fold.html) | `fun <A, B, C, D, E, RESULT> `[`Coproduct5`](./-coproduct5.html)`<`[`A`](fold.html#A)`, `[`B`](fold.html#B)`, `[`C`](fold.html#C)`, `[`D`](fold.html#D)`, `[`E`](fold.html#E)`>.fold(a: (`[`A`](fold.html#A)`) -> `[`RESULT`](fold.html#RESULT)`, b: (`[`B`](fold.html#B)`) -> `[`RESULT`](fold.html#RESULT)`, c: (`[`C`](fold.html#C)`) -> `[`RESULT`](fold.html#RESULT)`, d: (`[`D`](fold.html#D)`) -> `[`RESULT`](fold.html#RESULT)`, e: (`[`E`](fold.html#E)`) -> `[`RESULT`](fold.html#RESULT)`): `[`RESULT`](fold.html#RESULT) |
| [select](select.html) | `fun <A> `[`Coproduct5`](./-coproduct5.html)`<`[`A`](select.html#A)`, *, *, *, *>.select(): Option<`[`A`](select.html#A)`>`<br>`fun <B> `[`Coproduct5`](./-coproduct5.html)`<*, `[`B`](select.html#B)`, *, *, *>.select(dummy0: `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)` = Unit): Option<`[`B`](select.html#B)`>`<br>`fun <C> `[`Coproduct5`](./-coproduct5.html)`<*, *, `[`C`](select.html#C)`, *, *>.select(dummy0: `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)` = Unit, dummy1: `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)` = Unit): Option<`[`C`](select.html#C)`>`<br>`fun <D> `[`Coproduct5`](./-coproduct5.html)`<*, *, *, `[`D`](select.html#D)`, *>.select(dummy0: `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)` = Unit, dummy1: `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)` = Unit, dummy2: `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)` = Unit): Option<`[`D`](select.html#D)`>`<br>`fun <E> `[`Coproduct5`](./-coproduct5.html)`<*, *, *, *, `[`E`](select.html#E)`>.select(dummy0: `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)` = Unit, dummy1: `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)` = Unit, dummy2: `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)` = Unit, dummy3: `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)` = Unit): Option<`[`E`](select.html#E)`>` |

