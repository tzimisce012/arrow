---
title: Kleisli.ap - arrow-data
---

[arrow-data](../../index.html) / [arrow.data](../index.html) / [Kleisli](index.html) / [ap](./ap.html)

# ap

`fun <B> ap(AF: Applicative<`[`F`](index.html#F)`>, ff: `[`KleisliOf`](../-kleisli-of.html)`<`[`F`](index.html#F)`, `[`D`](index.html#D)`, (`[`A`](index.html#A)`) -> `[`B`](ap.html#B)`>): `[`Kleisli`](index.html)`<`[`F`](index.html#F)`, `[`D`](index.html#D)`, `[`B`](ap.html#B)`>`

Apply a function `(A) -> B` that operates within the [Kleisli](index.html) context.

### Parameters

`ff` - function with the [Kleisli](index.html) context.

`AF` - [Applicative](#) for the context [F](index.html#F).