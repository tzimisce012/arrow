---
title: flatten - arrow-data
---

[arrow-data](../../index.html) / [arrow.data](../index.html) / [arrow.Kind](index.html) / [flatten](./flatten.html)

# flatten

`fun <F, D, A> `[`KleisliOf`](../-kleisli-of.html)`<`[`F`](flatten.html#F)`, `[`D`](flatten.html#D)`, `[`Kleisli`](../-kleisli/index.html)`<`[`F`](flatten.html#F)`, `[`D`](flatten.html#D)`, `[`A`](flatten.html#A)`>>.flatten(MF: Monad<`[`F`](flatten.html#F)`>): `[`Kleisli`](../-kleisli/index.html)`<`[`F`](flatten.html#F)`, `[`D`](flatten.html#D)`, `[`A`](flatten.html#A)`>`

Flatten nested [Kleisli](../-kleisli/index.html) arrows.

### Parameters

`MF` - [Monad](#) for the context [F](flatten.html#F).