---
title: Ior.map - arrow-data
---

[arrow-data](../../index.html) / [arrow.data](../index.html) / [Ior](index.html) / [map](./map.html)

# map

`inline fun <D> map(f: (`[`B`](index.html#B)`) -> `[`D`](map.html#D)`): `[`Ior`](index.html)`<`[`A`](index.html#A)`, `[`D`](map.html#D)`>`

The given function is applied if this is a [Right](-right/index.html) or [Both](-both/index.html) to `B`.

Example:

```
Ior.Right(12).map { "flower" } // Result: Right("flower")
Ior.Left(12).map { "flower" }  // Result: Left(12)
Ior.Both(12, "power").map { "flower $it" }  // Result: Both(12, "flower power")
```

