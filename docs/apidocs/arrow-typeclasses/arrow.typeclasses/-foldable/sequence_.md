---
title: Foldable.sequence_ - arrow-typeclasses
---

[arrow-typeclasses](../../index.html) / [arrow.typeclasses](../index.html) / [Foldable](index.html) / [sequence_](./sequence_.html)

# sequence_

`open fun <G, A> Kind<`[`F`](index.html#F)`, Kind<`[`G`](sequence_.html#G)`, `[`A`](sequence_.html#A)`>>.sequence_(ag: `[`Applicative`](../-applicative/index.html)`<`[`G`](sequence_.html#G)`>): Kind<`[`G`](sequence_.html#G)`, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>`

Sequence F&lt;G&gt; using Applicative.

Similar to traverse except it operates on F&lt;G&gt; values, so no additional functions are needed.

