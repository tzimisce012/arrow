---
title: Either.swap - arrow-core
---

[arrow-core](../../index.html) / [arrow.core](../index.html) / [Either](index.html) / [swap](./swap.html)

# swap

`fun swap(): `[`Either`](index.html)`<`[`B`](index.html#B)`, `[`A`](index.html#A)`>`

If this is a `Left`, then return the left value in `Right` or vice versa.

Example:

```
Left("left").swap()   // Result: Right("left")
Right("right").swap() // Result: Left("right")
```

