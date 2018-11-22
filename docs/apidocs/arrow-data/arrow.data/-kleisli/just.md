---
title: Kleisli.just - arrow-data
---

[arrow-data](../../index.html) / [arrow.data](../index.html) / [Kleisli](index.html) / [just](./just.html)

# just

`fun <F, D, A> just(AF: Applicative<`[`F`](just.html#F)`>, x: `[`A`](just.html#A)`): `[`Kleisli`](index.html)`<`[`F`](just.html#F)`, `[`D`](just.html#D)`, `[`A`](just.html#A)`>`

Create an arrow for a value of [A](just.html#A).

### Parameters

`x` - value of [A](just.html#A).

`AF` - [Applicative](#) for context [F](just.html#F).