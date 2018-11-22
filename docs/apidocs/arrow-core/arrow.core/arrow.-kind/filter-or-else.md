---
title: filterOrElse - arrow-core
---

[arrow-core](../../index.html) / [arrow.core](../index.html) / [arrow.Kind](index.html) / [filterOrElse](./filter-or-else.html)

# filterOrElse

`inline fun <A, B> `[`EitherOf`](../-either-of.html)`<`[`A`](filter-or-else.html#A)`, `[`B`](filter-or-else.html#B)`>.filterOrElse(predicate: (`[`B`](filter-or-else.html#B)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`, default: () -> `[`A`](filter-or-else.html#A)`): `[`Either`](../-either/index.html)`<`[`A`](filter-or-else.html#A)`, `[`B`](filter-or-else.html#B)`>`
* Returns [Either.Right](../-either/-right/index.html) with the existing value of [Either.Right](../-either/-right/index.html) if this is a [Either.Right](../-either/-right/index.html) and the given predicate
holds for the right value.
* Returns `Left(default)` if this is a [Either.Right](../-either/-right/index.html) and the given predicate does not
hold for the right value.
* Returns [Either.Left](../-either/-left/index.html) with the existing value of [Either.Left](../-either/-left/index.html) if this is a [Either.Left](../-either/-left/index.html).

Example:

```
Right(12).filterOrElse({ it > 10 }, { -1 }) // Result: Right(12)
Right(7).filterOrElse({ it > 10 }, { -1 })  // Result: Left(-1)

val left: Either<Int, Int> = Left(12)
left.filterOrElse({ it > 10 }, { -1 })      // Result: Left(12)
```

