---
title: Coproduct2 - arrow-generic
---

[arrow-generic](../index.html) / [arrow.generic.coproduct2](index.html) / [Coproduct2](./-coproduct2.html)

# Coproduct2

`sealed class Coproduct2<A, B>`

### Extension Functions

| [fold](fold.html) | `fun <A, B, RESULT> `[`Coproduct2`](./-coproduct2.html)`<`[`A`](fold.html#A)`, `[`B`](fold.html#B)`>.fold(a: (`[`A`](fold.html#A)`) -> `[`RESULT`](fold.html#RESULT)`, b: (`[`B`](fold.html#B)`) -> `[`RESULT`](fold.html#RESULT)`): `[`RESULT`](fold.html#RESULT) |
| [select](select.html) | `fun <A> `[`Coproduct2`](./-coproduct2.html)`<`[`A`](select.html#A)`, *>.select(): Option<`[`A`](select.html#A)`>`<br>`fun <B> `[`Coproduct2`](./-coproduct2.html)`<*, `[`B`](select.html#B)`>.select(dummy0: `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)` = Unit): Option<`[`B`](select.html#B)`>` |

