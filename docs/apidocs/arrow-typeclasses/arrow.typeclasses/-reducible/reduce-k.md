---
title: Reducible.reduceK - arrow-typeclasses
---

[arrow-typeclasses](../../index.html) / [arrow.typeclasses](../index.html) / [Reducible](index.html) / [reduceK](./reduce-k.html)

# reduceK

`open fun <G, A> Kind<`[`F`](index.html#F)`, Kind<`[`G`](reduce-k.html#G)`, `[`A`](reduce-k.html#A)`>>.reduceK(SG: `[`SemigroupK`](../-semigroup-k/index.html)`<`[`G`](reduce-k.html#G)`>): Kind<`[`G`](reduce-k.html#G)`, `[`A`](reduce-k.html#A)`>`

Reduce a F&lt;G&gt; value using SemigroupK, a universal semigroup for G&lt;_&gt;.

This method is a generalization of reduce.

