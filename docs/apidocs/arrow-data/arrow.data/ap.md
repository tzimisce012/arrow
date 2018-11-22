---
title: ap - arrow-data
---

[arrow-data](../index.html) / [arrow.data](index.html) / [ap](./ap.html)

# ap

`fun <A, B, D> `[`Ior`](-ior/index.html)`<`[`A`](ap.html#A)`, `[`B`](ap.html#B)`>.ap(SG: Semigroup<`[`A`](ap.html#A)`>, ff: `[`IorOf`](-ior-of.html)`<`[`A`](ap.html#A)`, (`[`B`](ap.html#B)`) -> `[`D`](ap.html#D)`>): `[`Ior`](-ior/index.html)`<`[`A`](ap.html#A)`, `[`D`](ap.html#D)`>``fun <D, A, B> `[`Reader`](-reader.html)`<`[`D`](ap.html#D)`, `[`A`](ap.html#A)`>.ap(ff: `[`ReaderOf`](-reader-of.html)`<`[`D`](ap.html#D)`, (`[`A`](ap.html#A)`) -> `[`B`](ap.html#B)`>): `[`Reader`](-reader.html)`<`[`D`](ap.html#D)`, `[`B`](ap.html#B)`>`

Apply a function `(A) -> B` that operates within the context of [Reader](-reader.html).

### Parameters

`ff` - function that maps [A](ap.html#A) to [B](ap.html#B) within the [Reader](-reader.html) context.