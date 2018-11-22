---
title: Ior.toEither - arrow-data
---

[arrow-data](../../index.html) / [arrow.data](../index.html) / [Ior](index.html) / [toEither](./to-either.html)

# toEither

`fun toEither(): Either<`[`A`](index.html#A)`, `[`B`](index.html#B)`>`

Returns a [Either.Right](#) containing the [Right](-right/index.html) value or `B` if this is [Right](-right/index.html) or [Both](-both/index.html)
and [Either.Left](#) if this is a [Left](-left/index.html).

Example:

```
Right(12).toEither() // Result: Either.Right(12)
Left(12).toEither()  // Result: Either.Left(12)
Both("power", 12).toEither()  // Result: Either.Right(12)
```

