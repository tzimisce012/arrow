---
title: Option.filter - arrow-core
---

[arrow-core](../../index.html) / [arrow.core](../index.html) / [Option](index.html) / [filter](./filter.html)

# filter

`fun filter(predicate: `[`Predicate`](../-predicate.html)`<`[`A`](index.html#A)`>): `[`Option`](index.html)`<`[`A`](index.html#A)`>`

Returns this $option if it is nonempty '''and''' applying the predicate $p to
this $option's value returns true. Otherwise, return $none.

### Parameters

`predicate` - the predicate used for testing.