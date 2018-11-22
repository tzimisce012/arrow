---
title: NonEmptyReducible.exists - arrow-typeclasses
---

[arrow-typeclasses](../../index.html) / [arrow.typeclasses](../index.html) / [NonEmptyReducible](index.html) / [exists](./exists.html)

# exists

`open fun <A> Kind<`[`F`](index.html#F)`, `[`A`](exists.html#A)`>.exists(p: (`[`A`](exists.html#A)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)

Overrides [Foldable.exists](../-foldable/exists.html)

Check whether at least one element satisfies the predicate.

If there are no elements, the result is false.

