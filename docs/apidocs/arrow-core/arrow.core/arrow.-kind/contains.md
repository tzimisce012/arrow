---
title: contains - arrow-core
---

[arrow-core](../../index.html) / [arrow.core](../index.html) / [arrow.Kind](index.html) / [contains](./contains.html)

# contains

`fun <A, B> `[`EitherOf`](../-either-of.html)`<`[`A`](contains.html#A)`, `[`B`](contains.html#B)`>.contains(elem: `[`B`](contains.html#B)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)

Returns `true` if this is a [Either.Right](../-either/-right/index.html) and its value is equal to `elem` (as determined by `==`),
returns `false` otherwise.

Example:

```
Right("something").contains { "something" } // Result: true
Right("something").contains { "anything" }  // Result: false
Left("something").contains { "something" }  // Result: false
```

### Parameters

`elem` - the element to test.

**Return**
`true` if the option has an element that is equal (as determined by `==`) to `elem`, `false` otherwise.

