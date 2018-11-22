---
title: recover - arrow-core
---

[arrow-core](../../index.html) / [arrow.core](../index.html) / [arrow.Kind](index.html) / [recover](./recover.html)

# recover

`fun <B> `[`TryOf`](../-try-of.html)`<`[`B`](recover.html#B)`>.recover(f: (`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`) -> `[`B`](recover.html#B)`): `[`Try`](../-try/index.html)`<`[`B`](recover.html#B)`>`

Applies the given function `f` if this is a `Failure`, otherwise returns this if this is a `Success`.
This is like map for the exception.

