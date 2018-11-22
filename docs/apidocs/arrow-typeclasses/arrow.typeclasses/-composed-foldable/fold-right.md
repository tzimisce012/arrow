---
title: ComposedFoldable.foldRight - arrow-typeclasses
---

[arrow-typeclasses](../../index.html) / [arrow.typeclasses](../index.html) / [ComposedFoldable](index.html) / [foldRight](./fold-right.html)

# foldRight

`open fun <A, B> `[`NestedType`](../-nested-type.html)`<`[`F`](index.html#F)`, `[`G`](index.html#G)`, `[`A`](fold-right.html#A)`>.foldRight(lb: Eval<`[`B`](fold-right.html#B)`>, f: (`[`A`](fold-right.html#A)`, Eval<`[`B`](fold-right.html#B)`>) -> Eval<`[`B`](fold-right.html#B)`>): Eval<`[`B`](fold-right.html#B)`>`

Overrides [Foldable.foldRight](../-foldable/fold-right.html)

Right associative lazy fold on F using the provided function.

This method evaluates lb lazily (in some cases it will not be needed), and returns a lazy value. We are using
(A, Eval) =&gt; Eval to support laziness in a stack-safe way. Chained computation should be performed via
.map and .flatMap.

For more detailed information about how this method works see the documentation for Eval.

