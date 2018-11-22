---
title: Ior.swap - arrow-data
---

[arrow-data](../../index.html) / [arrow.data](../index.html) / [Ior](index.html) / [swap](./swap.html)

# swap

`fun swap(): `[`Ior`](index.html)`<`[`B`](index.html#B)`, `[`A`](index.html#A)`>`

If this is a [Left](-left/index.html), then return the left value in [Right](-right/index.html) or vice versa,
when this is [Both](-both/index.html) , left and right values are swap

Example:

```
Left("left").swap()   // Result: Right("left")
Right("right").swap() // Result: Left("right")
Both("left", "right").swap() // Result: Both("right", "left")
```

