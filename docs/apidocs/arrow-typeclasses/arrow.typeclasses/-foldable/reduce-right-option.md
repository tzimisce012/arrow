---
title: Foldable.reduceRightOption - arrow-typeclasses
---

[arrow-typeclasses](../../index.html) / [arrow.typeclasses](../index.html) / [Foldable](index.html) / [reduceRightOption](./reduce-right-option.html)

# reduceRightOption

`open fun <A> Kind<`[`F`](index.html#F)`, `[`A`](reduce-right-option.html#A)`>.reduceRightOption(f: (`[`A`](reduce-right-option.html#A)`, Eval<`[`A`](reduce-right-option.html#A)`>) -> Eval<`[`A`](reduce-right-option.html#A)`>): Eval<Option<`[`A`](reduce-right-option.html#A)`>>`

Reduce the elements of this structure down to a single value by applying the provided aggregation function in
a right-associative manner.

**Return**
None if the structure is empty, otherwise the result of combining the cumulative right-associative
result of the f operation over the A elements.

