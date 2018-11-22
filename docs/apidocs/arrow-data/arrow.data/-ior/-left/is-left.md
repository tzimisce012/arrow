---
title: Ior.Left.isLeft - arrow-data
---

[arrow-data](../../../index.html) / [arrow.data](../../index.html) / [Ior](../index.html) / [Left](index.html) / [isLeft](./is-left.html)

# isLeft

`val isLeft: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)

Overrides [Ior.isLeft](../is-left.html)

Returns `true` if this is a [Left](index.html), `false` otherwise.

Example:

```
Left("tulip").isLeft           // Result: true
Right("venus fly-trap").isLeft // Result: false
Both("venus", "fly-trap").isRight // Result: false
```

