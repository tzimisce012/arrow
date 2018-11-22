---
title: Validated.fromOption - arrow-data
---

[arrow-data](../../index.html) / [arrow.data](../index.html) / [Validated](index.html) / [fromOption](./from-option.html)

# fromOption

`fun <E, A> fromOption(o: Option<`[`A`](from-option.html#A)`>, ifNone: () -> `[`E`](from-option.html#E)`): `[`Validated`](index.html)`<`[`E`](from-option.html#E)`, `[`A`](from-option.html#A)`>`

Converts an `Option<B>` to an `Validated<A, B>`, where the provided `ifNone` values is returned on
the invalid of the `Validated` when the specified `Option` is `None`.

