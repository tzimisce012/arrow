---
title: Try.failed - arrow-core
---

[arrow-core](../../index.html) / [arrow.core](../index.html) / [Try](index.html) / [failed](./failed.html)

# failed

`fun failed(): `[`Try`](index.html)`<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>`

Inverts this `Try`. If this is a `Failure`, returns its exception wrapped in a `Success`.
If this is a `Success`, returns a `Failure` containing an `UnsupportedOperationException`.

