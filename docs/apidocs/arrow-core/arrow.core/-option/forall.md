---
title: Option.forall - arrow-core
---

[arrow-core](../../index.html) / [arrow.core](../index.html) / [Option](index.html) / [forall](./forall.html)

# forall

`fun forall(p: `[`Predicate`](../-predicate.html)`<`[`A`](index.html#A)`>): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)

Returns true if this option is empty '''or''' the predicate
$p returns true when applied to this $option's value.

### Parameters

`p` - the predicate to test