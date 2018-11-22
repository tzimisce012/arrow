---
title: Validated.withEither - arrow-data
---

[arrow-data](../../index.html) / [arrow.data](../index.html) / [Validated](index.html) / [withEither](./with-either.html)

# withEither

`fun <EE, B> withEither(f: (Either<`[`E`](index.html#E)`, `[`A`](index.html#A)`>) -> Either<`[`EE`](with-either.html#EE)`, `[`B`](with-either.html#B)`>): `[`Validated`](index.html)`<`[`EE`](with-either.html#EE)`, `[`B`](with-either.html#B)`>`

Convert to an Either, apply a function, convert back. This is handy
when you want to use the Monadic properties of the Either type.

