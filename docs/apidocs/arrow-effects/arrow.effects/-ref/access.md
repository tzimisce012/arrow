---
title: Ref.access - arrow-effects
---

[arrow-effects](../../index.html) / [arrow.effects](../index.html) / [Ref](index.html) / [access](./access.html)

# access

`abstract fun access(): Kind<`[`F`](index.html#F)`, Tuple2<`[`A`](index.html#A)`, (`[`A`](index.html#A)`) -> Kind<`[`F`](index.html#F)`, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>>>`

Obtains a snapshot of the current value, and a setter for updating it.

The setter will return `false` if another concurrent call invalidated the snapshot (modified the value).
It will return `true` if setting the value was successful.

Once it has returned false or been used once, a setter never succeeds again.

