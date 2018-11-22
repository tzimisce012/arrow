---
title: getOrDefault - arrow-core
---

[arrow-core](../../index.html) / [arrow.core](../index.html) / [arrow.Kind](index.html) / [getOrDefault](./get-or-default.html)

# getOrDefault

`inline fun <B> `[`TryOf`](../-try-of.html)`<`[`B`](get-or-default.html#B)`>.getOrDefault(default: () -> `[`B`](get-or-default.html#B)`): `[`B`](get-or-default.html#B)

Returns the value from this `Success` or the given `default` argument if this is a `Failure`.

''Note:'': This will throw an exception if it is not a success and default throws an exception.

