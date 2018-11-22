---
title: StateApi.modify - arrow-data
---

[arrow-data](../../index.html) / [arrow.data](../index.html) / [StateApi](index.html) / [modify](./modify.html)

# modify

`fun <S> modify(f: (`[`S`](modify.html#S)`) -> `[`S`](modify.html#S)`): `[`State`](../-state.html)`<`[`S`](modify.html#S)`, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>`

Modify the state with [f](modify.html#arrow.data.StateApi$modify(kotlin.Function1((arrow.data.StateApi.modify.S, )))/f) `(S) -> S` and return [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html).

### Parameters

`f` - the modify function to apply.