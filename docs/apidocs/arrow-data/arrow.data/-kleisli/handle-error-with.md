---
title: Kleisli.handleErrorWith - arrow-data
---

[arrow-data](../../index.html) / [arrow.data](../index.html) / [Kleisli](index.html) / [handleErrorWith](./handle-error-with.html)

# handleErrorWith

`fun <E> handleErrorWith(AE: ApplicativeError<`[`F`](index.html#F)`, `[`E`](handle-error-with.html#E)`>, f: (`[`E`](handle-error-with.html#E)`) -> `[`KleisliOf`](../-kleisli-of.html)`<`[`F`](index.html#F)`, `[`D`](index.html#D)`, `[`A`](index.html#A)`>): `[`Kleisli`](index.html)`<`[`F`](index.html#F)`, `[`D`](index.html#D)`, `[`A`](index.html#A)`>`

Handle error within context of [F](index.html#F) given a [ApplicativeError](#) is defined for [F](index.html#F).

### Parameters

`f` - function to handle error.

`AE` - [ApplicativeError](#) for the context [F](index.html#F).