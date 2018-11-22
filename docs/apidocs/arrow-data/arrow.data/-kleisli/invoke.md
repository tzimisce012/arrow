---
title: Kleisli.invoke - arrow-data
---

[arrow-data](../../index.html) / [arrow.data](../index.html) / [Kleisli](index.html) / [invoke](./invoke.html)

# invoke

`operator fun <F, D, A> invoke(run: `[`KleisliFun`](../-kleisli-fun.html)`<`[`F`](invoke.html#F)`, `[`D`](invoke.html#D)`, `[`A`](invoke.html#A)`>): `[`Kleisli`](index.html)`<`[`F`](invoke.html#F)`, `[`D`](invoke.html#D)`, `[`A`](invoke.html#A)`>`

Constructor to create `Kleisli<F, D, A>` given a [KleisliFun](../-kleisli-fun.html).

### Parameters

`run` - the arrow from [D](invoke.html#D) to a monadic value `Kind<F, A>`