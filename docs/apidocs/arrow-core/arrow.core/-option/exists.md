---
title: Option.exists - arrow-core
---

[arrow-core](../../index.html) / [arrow.core](../index.html) / [Option](index.html) / [exists](./exists.html)

# exists

`fun exists(predicate: `[`Predicate`](../-predicate.html)`<`[`A`](index.html#A)`>): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)

Returns true if this option is nonempty '''and''' the predicate
$p returns true when applied to this $option's value.
Otherwise, returns false.

### Parameters

`predicate` - the predicate to test