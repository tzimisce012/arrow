---
title: Ior.bimap - arrow-data
---

[arrow-data](../../index.html) / [arrow.data](../index.html) / [Ior](index.html) / [bimap](./bimap.html)

# bimap

`inline fun <C, D> bimap(fa: (`[`A`](index.html#A)`) -> `[`C`](bimap.html#C)`, fb: (`[`B`](index.html#B)`) -> `[`D`](bimap.html#D)`): `[`Ior`](index.html)`<`[`C`](bimap.html#C)`, `[`D`](bimap.html#D)`>`

Apply `fa` if this is a [Left](-left/index.html) or [Both](-both/index.html) to `A`
and apply `fb` if this is [Right](-right/index.html) or [Both](-both/index.html) to `B`

Example:

```
Ior.Right(12).bimap ({ "flower" }, { 12 }) // Result: Right(12)
Ior.Left(12).bimap({ "flower" }, { 12 })  // Result: Left("flower")
Ior.Both(12, "power").bimap ({ a, b -> "flower $b" },{ a * 2})  // Result: Both("flower power", 24)
```

