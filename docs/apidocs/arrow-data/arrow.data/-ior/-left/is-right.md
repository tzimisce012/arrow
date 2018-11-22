---
title: Ior.Left.isRight - arrow-data
---

[arrow-data](../../../index.html) / [arrow.data](../../index.html) / [Ior](../index.html) / [Left](index.html) / [isRight](./is-right.html)

# isRight

`val isRight: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)

Overrides [Ior.isRight](../is-right.html)

Returns `true` if this is a [Right](../-right/index.html), `false` otherwise.

Example:

```
Left("tulip").isRight           // Result: false
Right("venus fly-trap").isRight // Result: true
Both("venus", "fly-trap").isRight // Result: false
```

