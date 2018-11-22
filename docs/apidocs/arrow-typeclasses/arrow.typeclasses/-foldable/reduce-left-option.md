---
title: Foldable.reduceLeftOption - arrow-typeclasses
---

[arrow-typeclasses](../../index.html) / [arrow.typeclasses](../index.html) / [Foldable](index.html) / [reduceLeftOption](./reduce-left-option.html)

# reduceLeftOption

`open fun <A> Kind<`[`F`](index.html#F)`, `[`A`](reduce-left-option.html#A)`>.reduceLeftOption(f: (`[`A`](reduce-left-option.html#A)`, `[`A`](reduce-left-option.html#A)`) -> `[`A`](reduce-left-option.html#A)`): Option<`[`A`](reduce-left-option.html#A)`>`

Reduce the elements of this structure down to a single value by applying the provided aggregation function in
a left-associative manner.

**Return**
None if the structure is empty, otherwise the result of combining the cumulative left-associative result
of the f operation over all of the elements.

