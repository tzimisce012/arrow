---
title: Ior.mapLeft - arrow-data
---

[arrow-data](../../index.html) / [arrow.data](../index.html) / [Ior](index.html) / [mapLeft](./map-left.html)

# mapLeft

`inline fun <C> mapLeft(fa: (`[`A`](index.html#A)`) -> `[`C`](map-left.html#C)`): `[`Ior`](index.html)`<`[`C`](map-left.html#C)`, `[`B`](index.html#B)`>`

The given function is applied if this is a [Left](-left/index.html) or [Both](-both/index.html) to `A`.

Example:

```
Ior.Right(12).map { "flower" } // Result: Right(12)
Ior.Left(12).map { "flower" }  // Result: Left("power")
Ior.Both(12, "power").map { "flower $it" }  // Result: Both("flower 12", "power")
```

