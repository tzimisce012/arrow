---
title: leftIfNull - arrow-core
---

[arrow-core](../../index.html) / [arrow.core](../index.html) / [arrow.Kind](index.html) / [leftIfNull](./left-if-null.html)

# leftIfNull

`inline fun <A, B> `[`EitherOf`](../-either-of.html)`<`[`A`](left-if-null.html#A)`, `[`B`](left-if-null.html#B)`?>.leftIfNull(crossinline default: () -> `[`A`](left-if-null.html#A)`): `[`Either`](../-either/index.html)`<`[`A`](left-if-null.html#A)`, `[`B`](left-if-null.html#B)`>`
* Returns [Either.Right](../-either/-right/index.html) with the existing value of [Either.Right](../-either/-right/index.html) if this is an [Either.Right](../-either/-right/index.html) with a non-null value.
The returned Either.Right type is not nullable.
* Returns `Left(default())` if this is an [Either.Right](../-either/-right/index.html) and the existing value is null
* Returns [Either.Left](../-either/-left/index.html) with the existing value of [Either.Left](../-either/-left/index.html) if this is an [Either.Left](../-either/-left/index.html).

Example:

```
Right(12).leftIfNull({ -1 })   // Result: Right(12)
Right(null).leftIfNull({ -1 }) // Result: Left(-1)

Left(12).leftIfNull({ -1 })    // Result: Left(12)
```

