---
title: Either.fold - arrow-core
---

[arrow-core](../../index.html) / [arrow.core](../index.html) / [Either](index.html) / [fold](./fold.html)

# fold

`inline fun <C> fold(ifLeft: (`[`A`](index.html#A)`) -> `[`C`](fold.html#C)`, ifRight: (`[`B`](index.html#B)`) -> `[`C`](fold.html#C)`): `[`C`](fold.html#C)

Applies `ifLeft` if this is a [Left](-left/index.html) or `ifRight` if this is a [Right](-right/index.html).

Example:

```
val result: Either<Exception, Value> = possiblyFailingOperation()
result.fold(
     { log("operation failed with $it") },
     { log("operation succeeded with $it") }
)
```

### Parameters

`ifLeft` - the function to apply if this is a [Left](-left/index.html)

`ifRight` - the function to apply if this is a [Right](-right/index.html)

**Return**
the results of applying the function

