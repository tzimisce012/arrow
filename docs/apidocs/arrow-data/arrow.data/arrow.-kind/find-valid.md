---
title: findValid - arrow-data
---

[arrow-data](../../index.html) / [arrow.data](../index.html) / [arrow.Kind](index.html) / [findValid](./find-valid.html)

# findValid

`fun <E, A> `[`ValidatedOf`](../-validated-of.html)`<`[`E`](find-valid.html#E)`, `[`A`](find-valid.html#A)`>.findValid(SE: Semigroup<`[`E`](find-valid.html#E)`>, that: () -> `[`Validated`](../-validated/index.html)`<`[`E`](find-valid.html#E)`, `[`A`](find-valid.html#A)`>): `[`Validated`](../-validated/index.html)`<`[`E`](find-valid.html#E)`, `[`A`](find-valid.html#A)`>`

If `this` is valid return `this`, otherwise if `that` is valid return `that`, otherwise combine the failures.
This is similar to [orElse](or-else.html) except that here failures are accumulated.

