---
title: invokeOrElse - arrow-core
---

[arrow-core](../index.html) / [arrow.core](index.html) / [invokeOrElse](./invoke-or-else.html)

# invokeOrElse

`fun <A, B : `[`B1`](invoke-or-else.html#B1)`, A1 : `[`A`](invoke-or-else.html#A)`, B1> `[`PartialFunction`](-partial-function/index.html)`<`[`A`](invoke-or-else.html#A)`, `[`B`](invoke-or-else.html#B)`>.invokeOrElse(x: `[`A1`](invoke-or-else.html#A1)`, default: (`[`A1`](invoke-or-else.html#A1)`) -> `[`B1`](invoke-or-else.html#B1)`): `[`B1`](invoke-or-else.html#B1)

Applies this partial function to the given argument when it is contained in the function domain.
Applies fallback function where this partial function is not defined.

`fun <P1, R> `[`PartialFunction`](-partial-function/index.html)`<`[`P1`](invoke-or-else.html#P1)`, `[`R`](invoke-or-else.html#R)`>.invokeOrElse(p1: `[`P1`](invoke-or-else.html#P1)`, default: `[`R`](invoke-or-else.html#R)`): `[`R`](invoke-or-else.html#R)