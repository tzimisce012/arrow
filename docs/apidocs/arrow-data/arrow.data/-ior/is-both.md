---
title: Ior.isBoth - arrow-data
---

[arrow-data](../../index.html) / [arrow.data](../index.html) / [Ior](index.html) / [isBoth](./is-both.html)

# isBoth

`abstract val isBoth: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)

Returns `true` if this is a [Left](-left/index.html), `false` otherwise.

Example:

```
Left("tulip").isLeft           // Result: false
Right("venus fly-trap").isLeft // Result: false
Both("venus", "fly-trap").isRight // Result: true
```

