---
title: Option.filterNot - arrow-core
---

[arrow-core](../../index.html) / [arrow.core](../index.html) / [Option](index.html) / [filterNot](./filter-not.html)

# filterNot

`fun filterNot(predicate: `[`Predicate`](../-predicate.html)`<`[`A`](index.html#A)`>): `[`Option`](index.html)`<`[`A`](index.html#A)`>`

Returns this $option if it is nonempty '''and''' applying the predicate $p to
this $option's value returns false. Otherwise, return $none.

### Parameters

`predicate` - the predicate used for testing.