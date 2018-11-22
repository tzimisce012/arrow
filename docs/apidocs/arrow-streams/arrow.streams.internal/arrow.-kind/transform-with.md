---
title: transformWith - arrow-streams
---

[arrow-streams](../../index.html) / [arrow.streams.internal](../index.html) / [arrow.Kind](index.html) / [transformWith](./transform-with.html)

# transformWith

`fun <F, R, R2> `[`FreeCOf`](../-free-c-of.html)`<`[`F`](transform-with.html#F)`, `[`R`](transform-with.html#R)`>.transformWith(f: (`[`Result`](../-free-c/-result/index.html)`<`[`R`](transform-with.html#R)`>) -> `[`FreeC`](../-free-c/index.html)`<`[`F`](transform-with.html#F)`, `[`R2`](transform-with.html#R2)`>): `[`FreeC`](../-free-c/index.html)`<`[`F`](transform-with.html#F)`, `[`R2`](transform-with.html#R2)`>`

Transform [FreeC](../-free-c/index.html) while being able to inspect the [Result](../-free-c/-result/index.html) type.

