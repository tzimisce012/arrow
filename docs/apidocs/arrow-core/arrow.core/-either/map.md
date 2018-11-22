---
title: Either.map - arrow-core
---

[arrow-core](../../index.html) / [arrow.core](../index.html) / [Either](index.html) / [map](./map.html)

# map

`inline fun <C> map(f: (`[`B`](index.html#B)`) -> `[`C`](map.html#C)`): `[`Either`](index.html)`<`[`A`](index.html#A)`, `[`C`](map.html#C)`>`

The given function is applied if this is a `Right`.

Example:

```
Right(12).map { "flower" } // Result: Right("flower")
Left(12).map { "flower" }  // Result: Left(12)
```

