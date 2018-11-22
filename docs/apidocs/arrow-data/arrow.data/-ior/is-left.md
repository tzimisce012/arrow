---
title: Ior.isLeft - arrow-data
---

[arrow-data](../../index.html) / [arrow.data](../index.html) / [Ior](index.html) / [isLeft](./is-left.html)

# isLeft

`abstract val isLeft: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)

Returns `true` if this is a [Left](-left/index.html), `false` otherwise.

Example:

```
Left("tulip").isLeft           // Result: true
Right("venus fly-trap").isLeft // Result: false
Both("venus", "fly-trap").isRight // Result: false
```

