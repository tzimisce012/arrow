---
title: Either.mapLeft - arrow-core
---

[arrow-core](../../index.html) / [arrow.core](../index.html) / [Either](index.html) / [mapLeft](./map-left.html)

# mapLeft

`inline fun <C> mapLeft(f: (`[`A`](index.html#A)`) -> `[`C`](map-left.html#C)`): `[`Either`](index.html)`<`[`C`](map-left.html#C)`, `[`B`](index.html#B)`>`

The given function is applied if this is a `Left`.

Example:

```
Right(12).mapLeft { "flower" } // Result: Right(12)
Left(12).mapLeft { "flower" }  // Result: Left("flower)
```

