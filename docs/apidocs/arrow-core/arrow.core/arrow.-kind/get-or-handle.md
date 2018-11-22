---
title: getOrHandle - arrow-core
---

[arrow-core](../../index.html) / [arrow.core](../index.html) / [arrow.Kind](index.html) / [getOrHandle](./get-or-handle.html)

# getOrHandle

`inline fun <A, B> `[`EitherOf`](../-either-of.html)`<`[`A`](get-or-handle.html#A)`, `[`B`](get-or-handle.html#B)`>.getOrHandle(default: (`[`A`](get-or-handle.html#A)`) -> `[`B`](get-or-handle.html#B)`): `[`B`](get-or-handle.html#B)

Returns the value from this [Either.Right](../-either/-right/index.html) or allows clients to transform [Either.Left](../-either/-left/index.html) to [Either.Right](../-either/-right/index.html) while providing access to
the value of [Either.Left](../-either/-left/index.html).

Example:

```
Right(12).getOrHandle { 17 } // Result: 12
Left(12).getOrHandle { it + 5 } // Result: 17
```

