---
title: rightIfNotNull - arrow-core
---

[arrow-core](../index.html) / [arrow.core](index.html) / [rightIfNotNull](./right-if-not-null.html)

# rightIfNotNull

`fun <A, B> `[`B`](right-if-not-null.html#B)`?.rightIfNotNull(default: () -> `[`A`](right-if-not-null.html#A)`): `[`Either`](-either/index.html)`<`[`A`](right-if-not-null.html#A)`, `[`B`](right-if-not-null.html#B)`>`

Returns [Either.Right](-either/-right/index.html) if the value of type B is not null, otherwise the specified A value wrapped into an
[Either.Left](-either/-left/index.html).

Example:

```
"value".rightIfNotNull { "left" } // Right(b="value")
null.rightIfNotNull { "left" }    // Left(a="left")
```

