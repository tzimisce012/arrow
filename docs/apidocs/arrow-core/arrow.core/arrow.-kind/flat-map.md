---
title: flatMap - arrow-core
---

[arrow-core](../../index.html) / [arrow.core](../index.html) / [arrow.Kind](index.html) / [flatMap](./flat-map.html)

# flatMap

`inline fun <A, B, C> `[`EitherOf`](../-either-of.html)`<`[`A`](flat-map.html#A)`, `[`B`](flat-map.html#B)`>.flatMap(f: (`[`B`](flat-map.html#B)`) -> `[`Either`](../-either/index.html)`<`[`A`](flat-map.html#A)`, `[`C`](flat-map.html#C)`>): `[`Either`](../-either/index.html)`<`[`A`](flat-map.html#A)`, `[`C`](flat-map.html#C)`>`

Binds the given function across [Either.Right](../-either/-right/index.html).

### Parameters

`f` - The function to bind across [Either.Right](../-either/-right/index.html).