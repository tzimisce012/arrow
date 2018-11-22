---
title: flatMap - arrow-data
---

[arrow-data](../index.html) / [arrow.data](index.html) / [flatMap](./flat-map.html)

# flatMap

`fun <A, B, D> `[`Ior`](-ior/index.html)`<`[`A`](flat-map.html#A)`, `[`B`](flat-map.html#B)`>.flatMap(SG: Semigroup<`[`A`](flat-map.html#A)`>, f: (`[`B`](flat-map.html#B)`) -> `[`Ior`](-ior/index.html)`<`[`A`](flat-map.html#A)`, `[`D`](flat-map.html#D)`>): `[`Ior`](-ior/index.html)`<`[`A`](flat-map.html#A)`, `[`D`](flat-map.html#D)`>`

Binds the given function across [Ior.Right](-ior/-right/index.html).

### Parameters

`f` - The function to bind across [Ior.Right](-ior/-right/index.html).`fun <D, A, B> `[`Reader`](-reader.html)`<`[`D`](flat-map.html#D)`, `[`A`](flat-map.html#A)`>.flatMap(f: (`[`A`](flat-map.html#A)`) -> `[`Reader`](-reader.html)`<`[`D`](flat-map.html#D)`, `[`B`](flat-map.html#B)`>): `[`Reader`](-reader.html)`<`[`D`](flat-map.html#D)`, `[`B`](flat-map.html#B)`>`

FlatMap the result of the computation [A](flat-map.html#A) to another [Reader](-reader.html) for the same dependency [D](flat-map.html#D) and flatten the structure.

### Parameters

`f` - the function to apply.