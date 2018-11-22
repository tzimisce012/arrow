---
title: Either.exists - arrow-core
---

[arrow-core](../../index.html) / [arrow.core](../index.html) / [Either](index.html) / [exists](./exists.html)

# exists

`fun exists(predicate: (`[`B`](index.html#B)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)

Returns `false` if [Left](-left/index.html) or returns the result of the application of
the given predicate to the [Right](-right/index.html) value.

Example:

```
Right(12).exists { it > 10 } // Result: true
Right(7).exists { it > 10 }  // Result: false

val left: Either<Int, Int> = Left(12)
left.exists { it > 10 }      // Result: false
```

