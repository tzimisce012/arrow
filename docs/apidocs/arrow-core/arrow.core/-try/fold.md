---
title: Try.fold - arrow-core
---

[arrow-core](../../index.html) / [arrow.core](../index.html) / [Try](index.html) / [fold](./fold.html)

# fold

`inline fun <B> fold(ifFailure: (`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`) -> `[`B`](fold.html#B)`, ifSuccess: (`[`A`](index.html#A)`) -> `[`B`](fold.html#B)`): `[`B`](fold.html#B)

Applies `ifFailure` if this is a `Failure` or `ifSuccess` if this is a `Success`.

