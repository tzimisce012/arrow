---
title: Kleisli.local - arrow-data
---

[arrow-data](../../index.html) / [arrow.data](../index.html) / [Kleisli](index.html) / [local](./local.html)

# local

`fun <DD> local(f: (`[`DD`](local.html#DD)`) -> `[`D`](index.html#D)`): `[`Kleisli`](index.html)`<`[`F`](index.html#F)`, `[`DD`](local.html#DD)`, `[`A`](index.html#A)`>`

Compose this arrow with another function to transform the input of the arrow.

### Parameters

`f` - function that transforms new arrow head [DD](local.html#DD) to [D](index.html#D).