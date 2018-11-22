---
title: Try.flatMap - arrow-core
---

[arrow-core](../../index.html) / [arrow.core](../index.html) / [Try](index.html) / [flatMap](./flat-map.html)

# flatMap

`inline fun <B> flatMap(f: (`[`A`](index.html#A)`) -> `[`TryOf`](../-try-of.html)`<`[`B`](flat-map.html#B)`>): `[`Try`](index.html)`<`[`B`](flat-map.html#B)`>`

Returns the given function applied to the value from this `Success` or returns this if this is a `Failure`.

