---
title: Ior.pad - arrow-data
---

[arrow-data](../../index.html) / [arrow.data](../index.html) / [Ior](index.html) / [pad](./pad.html)

# pad

`fun pad(): `[`Pair`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/index.html)`<Option<`[`A`](index.html#A)`>, Option<`[`B`](index.html#B)`>>`

Return this [Ior](index.html) as [Pair](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/index.html) of [Option](#)

Example:

```
Right(12).pad() // Result: Pair(None, Some(12))
Left(12).pad()  // Result: Pair(Some(12), None)
Both("power", 12).pad()  // Result: Pair(Some("power"), Some(12))
```

