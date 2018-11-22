---
title: getOrElse - arrow-core
---

[arrow-core](../../index.html) / [arrow.core](../index.html) / [arrow.Kind](index.html) / [getOrElse](./get-or-else.html)

# getOrElse

`inline fun <B> `[`EitherOf`](../-either-of.html)`<*, `[`B`](get-or-else.html#B)`>.getOrElse(default: () -> `[`B`](get-or-else.html#B)`): `[`B`](get-or-else.html#B)

Returns the value from this [Either.Right](../-either/-right/index.html) or the given argument if this is a [Either.Left](../-either/-left/index.html).

Example:

```
Right(12).getOrElse(17) // Result: 12
Left(12).getOrElse(17)  // Result: 17
```

`inline fun <B> `[`TryOf`](../-try-of.html)`<`[`B`](get-or-else.html#B)`>.getOrElse(default: (`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`) -> `[`B`](get-or-else.html#B)`): `[`B`](get-or-else.html#B)

Returns the value from this `Success` or the given `default` argument if this is a `Failure`.

''Note:'': This will throw an exception if it is not a success and default throws an exception.

