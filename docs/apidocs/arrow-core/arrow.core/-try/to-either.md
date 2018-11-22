---
title: Try.toEither - arrow-core
---

[arrow-core](../../index.html) / [arrow.core](../index.html) / [Try](index.html) / [toEither](./to-either.html)

# toEither

`fun toEither(): `[`Either`](../-either/index.html)`<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, `[`A`](index.html#A)`>``fun <B> toEither(onLeft: (`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`) -> `[`B`](to-either.html#B)`): `[`Either`](../-either/index.html)`<`[`B`](to-either.html#B)`, `[`A`](index.html#A)`>`
* Convenient method to solve a common scenario when using [Try](index.html). The created [Try](index.html) object is often
converted to [Either](../-either/index.html), and right after [Either.mapLeft](../-either/map-left.html) is called to translate the [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html) to a
domain specific error object.
* To make it easier this method takes an [onLeft](to-either.html#arrow.core.Try$toEither(kotlin.Function1((kotlin.Throwable, arrow.core.Try.toEither.B)))/onLeft) error domain object supplier, which does the conversion to domain error
in the same time as conversion to [Either](../-either/index.html) occurs.
* So instead of

```
Try {
   dangerousOperation()
}.toEither()
   .mapLeft { Error.ServerError("This really went wrong", it) }
// Left(a=Error.ServerError@3ada9e34)
```

One can write

```
Try {
   dangerousOperation()
}.toEither {
   Error.ServerError("This really went wrong", it)
}
// Left(a=Error.ServerError@4a5a3234)
```

