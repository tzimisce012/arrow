---
title: arrow.core.kotlin.Function1 - arrow-core
---

[arrow-core](../../index.html) / [arrow.core](../index.html) / [kotlin.Function1](./index.html)

### Extensions for kotlin.Function1

| [andThen](and-then.html) | `infix fun <A, B, C> ((`[`A`](and-then.html#A)`) -> `[`B`](and-then.html#B)`).andThen(g: (`[`B`](and-then.html#B)`) -> `[`C`](and-then.html#C)`): (`[`A`](and-then.html#A)`) -> `[`C`](and-then.html#C) |
| [compose](compose.html) | `infix fun <A, B, C> ((`[`B`](compose.html#B)`) -> `[`C`](compose.html#C)`).compose(f: (`[`A`](compose.html#A)`) -> `[`B`](compose.html#B)`): (`[`A`](compose.html#A)`) -> `[`C`](compose.html#C) |
| [k](k.html) | `fun <I, O> ((`[`I`](k.html#I)`) -> `[`O`](k.html#O)`).k(): (`[`I`](k.html#I)`) -> `[`O`](k.html#O) |
| [mapNullable](map-nullable.html) | `fun <T : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> `[`Predicate`](../-predicate.html)`<`[`T`](map-nullable.html#T)`>.mapNullable(): (`[`T`](map-nullable.html#T)`?) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [then](then.html) | `infix fun <A, B> ((`[`A`](then.html#A)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`).then(f: (`[`A`](then.html#A)`) -> `[`B`](then.html#B)`): `[`Tuple2`](../-tuple2/index.html)`<(`[`A`](then.html#A)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`, (`[`A`](then.html#A)`) -> `[`B`](then.html#B)`>` |
| [toPartialFunction](to-partial-function.html) | `fun <A, B> ((`[`A`](to-partial-function.html#A)`) -> `[`B`](to-partial-function.html#B)`).toPartialFunction(definedAt: (`[`A`](to-partial-function.html#A)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`PartialFunction`](../-partial-function/index.html)`<`[`A`](to-partial-function.html#A)`, `[`B`](to-partial-function.html#B)`>` |

