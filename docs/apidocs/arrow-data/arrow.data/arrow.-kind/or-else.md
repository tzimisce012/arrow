---
title: orElse - arrow-data
---

[arrow-data](../../index.html) / [arrow.data](../index.html) / [arrow.Kind](index.html) / [orElse](./or-else.html)

# orElse

`fun <E, A> `[`ValidatedOf`](../-validated-of.html)`<`[`E`](or-else.html#E)`, `[`A`](or-else.html#A)`>.orElse(default: () -> `[`Validated`](../-validated/index.html)`<`[`E`](or-else.html#E)`, `[`A`](or-else.html#A)`>): `[`Validated`](../-validated/index.html)`<`[`E`](or-else.html#E)`, `[`A`](or-else.html#A)`>`

Return this if it is Valid, or else fall back to the given default.
The functionality is similar to that of [findValid](find-valid.html) except for failure accumulation,
where here only the error on the right is preserved and the error on the left is ignored.

