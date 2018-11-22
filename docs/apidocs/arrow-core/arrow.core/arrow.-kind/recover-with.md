---
title: recoverWith - arrow-core
---

[arrow-core](../../index.html) / [arrow.core](../index.html) / [arrow.Kind](index.html) / [recoverWith](./recover-with.html)

# recoverWith

`fun <B> `[`TryOf`](../-try-of.html)`<`[`B`](recover-with.html#B)`>.recoverWith(f: (`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`) -> `[`TryOf`](../-try-of.html)`<`[`B`](recover-with.html#B)`>): `[`Try`](../-try/index.html)`<`[`B`](recover-with.html#B)`>`

Applies the given function `f` if this is a `Failure`, otherwise returns this if this is a `Success`.
This is like `flatMap` for the exception.

