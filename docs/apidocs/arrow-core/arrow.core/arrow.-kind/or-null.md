---
title: orNull - arrow-core
---

[arrow-core](../../index.html) / [arrow.core](../index.html) / [arrow.Kind](index.html) / [orNull](./or-null.html)

# orNull

`fun <B> `[`EitherOf`](../-either-of.html)`<*, `[`B`](or-null.html#B)`>.orNull(): `[`B`](or-null.html#B)`?`

Returns the value from this [Either.Right](../-either/-right/index.html) or null if this is a [Either.Left](../-either/-left/index.html).

Example:

```
Right(12).orNull() // Result: 12
Left(12).orNull()  // Result: null
```

`fun <B> `[`TryOf`](../-try-of.html)`<`[`B`](or-null.html#B)`>.orNull(): `[`B`](or-null.html#B)`?`

Returns the value from this `Success` or null if this is a `Failure`.

