---
title: Nu - arrow-recursion
---

[arrow-recursion](../../index.html) / [arrow.recursion.data](../index.html) / [Nu](./index.html)

# Nu

`@higherkind class Nu<out F> : `[`NuOf`](../-nu-of.html)`<`[`F`](index.html#F)`>`

Type level combinator for obtaining the greatest fixed point of a type.
This type is the type level encoding of ana.

### Constructors

| [&lt;init&gt;](-init-.html) | `Nu(a: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?, unNu: `[`Coalgebra`](../../arrow.recursion/-coalgebra.html)`<`[`F`](index.html#F)`, `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?>)`<br>Type level combinator for obtaining the greatest fixed point of a type. This type is the type level encoding of ana. |

### Properties

| [a](a.html) | `val a: `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?` |
| [unNu](un-nu.html) | `val unNu: `[`Coalgebra`](../../arrow.recursion/-coalgebra.html)`<`[`F`](index.html#F)`, `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`?>` |

### Companion Object Functions

| [invoke](invoke.html) | `operator fun <F, A> invoke(a: `[`A`](invoke.html#A)`, unNu: `[`Coalgebra`](../../arrow.recursion/-coalgebra.html)`<`[`F`](invoke.html#F)`, `[`A`](invoke.html#A)`>): `[`Nu`](./index.html)`<`[`F`](invoke.html#F)`>` |

