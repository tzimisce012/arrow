---
title: StateApi - arrow-data
---

[arrow-data](../../index.html) / [arrow.data](../index.html) / [StateApi](./index.html)

# StateApi

`object StateApi`

### Functions

| [get](get.html) | `fun <S> get(): `[`State`](../-state.html)`<`[`S`](get.html#S)`, `[`S`](get.html#S)`>`<br>Return input without modifying it. |
| [inspect](inspect.html) | `fun <S, T> inspect(f: (`[`S`](inspect.html#S)`) -> `[`T`](inspect.html#T)`): `[`State`](../-state.html)`<`[`S`](inspect.html#S)`, `[`T`](inspect.html#T)`>`<br>Inspect a value of the state [S](inspect.html#S) with [f](inspect.html#arrow.data.StateApi$inspect(kotlin.Function1((arrow.data.StateApi.inspect.S, arrow.data.StateApi.inspect.T)))/f) `(S) -> T` without modifying the state. |
| [just](just.html) | `fun <S, T> just(t: `[`T`](just.html#T)`): `[`State`](../-state.html)`<`[`S`](just.html#S)`, `[`T`](just.html#T)`>` |
| [modify](modify.html) | `fun <S> modify(f: (`[`S`](modify.html#S)`) -> `[`S`](modify.html#S)`): `[`State`](../-state.html)`<`[`S`](modify.html#S)`, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>`<br>Modify the state with [f](modify.html#arrow.data.StateApi$modify(kotlin.Function1((arrow.data.StateApi.modify.S, )))/f) `(S) -> S` and return [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html). |
| [set](set.html) | `fun <S> set(s: `[`S`](set.html#S)`): `[`State`](../-state.html)`<`[`S`](set.html#S)`, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>`<br>Set the state to [s](set.html#arrow.data.StateApi$set(arrow.data.StateApi.set.S)/s) and return [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html). |

