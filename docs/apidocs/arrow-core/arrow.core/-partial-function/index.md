---
title: PartialFunction - arrow-core
---

[arrow-core](../../index.html) / [arrow.core](../index.html) / [PartialFunction](./index.html)

# PartialFunction

`abstract class PartialFunction<in A, out B> : (`[`A`](index.html#A)`) -> `[`B`](index.html#B)

### Constructors

| [&lt;init&gt;](-init-.html) | `PartialFunction()` |

### Functions

| [isDefinedAt](is-defined-at.html) | `abstract fun isDefinedAt(a: `[`A`](index.html#A)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |

### Extension Functions

| [andThen](../and-then.html) | `fun <A, B, C> `[`PartialFunction`](./index.html)`<`[`A`](../and-then.html#A)`, `[`B`](../and-then.html#B)`>.andThen(f: (`[`B`](../and-then.html#B)`) -> `[`C`](../and-then.html#C)`): `[`PartialFunction`](./index.html)`<`[`A`](../and-then.html#A)`, `[`C`](../and-then.html#C)`>` |
| [andThen](../kotlin.-function1/and-then.html) | `infix fun <A, B, C> ((`[`A`](../kotlin.-function1/and-then.html#A)`) -> `[`B`](../kotlin.-function1/and-then.html#B)`).andThen(g: (`[`B`](../kotlin.-function1/and-then.html#B)`) -> `[`C`](../kotlin.-function1/and-then.html#C)`): (`[`A`](../kotlin.-function1/and-then.html#A)`) -> `[`C`](../kotlin.-function1/and-then.html#C) |
| [compose](../kotlin.-function1/compose.html) | `infix fun <A, B, C> ((`[`B`](../kotlin.-function1/compose.html#B)`) -> `[`C`](../kotlin.-function1/compose.html#C)`).compose(f: (`[`A`](../kotlin.-function1/compose.html#A)`) -> `[`B`](../kotlin.-function1/compose.html#B)`): (`[`A`](../kotlin.-function1/compose.html#A)`) -> `[`C`](../kotlin.-function1/compose.html#C) |
| [invokeOrElse](../invoke-or-else.html) | `fun <A, B : `[`B1`](../invoke-or-else.html#B1)`, A1 : `[`A`](../invoke-or-else.html#A)`, B1> `[`PartialFunction`](./index.html)`<`[`A`](../invoke-or-else.html#A)`, `[`B`](../invoke-or-else.html#B)`>.invokeOrElse(x: `[`A1`](../invoke-or-else.html#A1)`, default: (`[`A1`](../invoke-or-else.html#A1)`) -> `[`B1`](../invoke-or-else.html#B1)`): `[`B1`](../invoke-or-else.html#B1)<br>Applies this partial function to the given argument when it is contained in the function domain. Applies fallback function where this partial function is not defined.`fun <P1, R> `[`PartialFunction`](./index.html)`<`[`P1`](../invoke-or-else.html#P1)`, `[`R`](../invoke-or-else.html#R)`>.invokeOrElse(p1: `[`P1`](../invoke-or-else.html#P1)`, default: `[`R`](../invoke-or-else.html#R)`): `[`R`](../invoke-or-else.html#R) |
| [k](../kotlin.-function1/k.html) | `fun <I, O> ((`[`I`](../kotlin.-function1/k.html#I)`) -> `[`O`](../kotlin.-function1/k.html#O)`).k(): (`[`I`](../kotlin.-function1/k.html#I)`) -> `[`O`](../kotlin.-function1/k.html#O) |
| [lift](../lift.html) | `fun <A, B> `[`PartialFunction`](./index.html)`<`[`A`](../lift.html#A)`, `[`B`](../lift.html#B)`>.lift(): (`[`A`](../lift.html#A)`) -> `[`Option`](../-option/index.html)`<`[`B`](../lift.html#B)`>`<br>Turns this partial function into a plain function returning an Option result. |
| [mapNullable](../kotlin.-function1/map-nullable.html) | `fun <T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> `[`Predicate`](../-predicate.html)`<`[`T`](../kotlin.-function1/map-nullable.html#T)`>.mapNullable(): (`[`T`](../kotlin.-function1/map-nullable.html#T)`?) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [orElse](../or-else.html) | `infix fun <A, B> `[`PartialFunction`](./index.html)`<`[`A`](../or-else.html#A)`, `[`B`](../or-else.html#B)`>.orElse(f: `[`PartialFunction`](./index.html)`<`[`A`](../or-else.html#A)`, `[`B`](../or-else.html#B)`>): `[`PartialFunction`](./index.html)`<`[`A`](../or-else.html#A)`, `[`B`](../or-else.html#B)`>` |
| [then](../kotlin.-function1/then.html) | `infix fun <A, B> ((`[`A`](../kotlin.-function1/then.html#A)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`).then(f: (`[`A`](../kotlin.-function1/then.html#A)`) -> `[`B`](../kotlin.-function1/then.html#B)`): `[`Tuple2`](../-tuple2/index.html)`<(`[`A`](../kotlin.-function1/then.html#A)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`, (`[`A`](../kotlin.-function1/then.html#A)`) -> `[`B`](../kotlin.-function1/then.html#B)`>` |
| [toPartialFunction](../kotlin.-function1/to-partial-function.html) | `fun <A, B> ((`[`A`](../kotlin.-function1/to-partial-function.html#A)`) -> `[`B`](../kotlin.-function1/to-partial-function.html#B)`).toPartialFunction(definedAt: (`[`A`](../kotlin.-function1/to-partial-function.html#A)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`PartialFunction`](./index.html)`<`[`A`](../kotlin.-function1/to-partial-function.html#A)`, `[`B`](../kotlin.-function1/to-partial-function.html#B)`>` |

