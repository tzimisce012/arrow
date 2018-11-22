---
title: Foldable.traverse_ - arrow-typeclasses
---

[arrow-typeclasses](../../index.html) / [arrow.typeclasses](../index.html) / [Foldable](index.html) / [traverse_](./traverse_.html)

# traverse_

`open fun <G, A, B> Kind<`[`F`](index.html#F)`, `[`A`](traverse_.html#A)`>.traverse_(GA: `[`Applicative`](../-applicative/index.html)`<`[`G`](traverse_.html#G)`>, f: (`[`A`](traverse_.html#A)`) -> Kind<`[`G`](traverse_.html#G)`, `[`B`](traverse_.html#B)`>): Kind<`[`G`](traverse_.html#G)`, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>`

Traverse F using Applicative.

A typed values will be mapped into G by function f and combined using Applicative#map2.

This method is primarily useful when G&lt;_&gt; represents an action or effect, and the specific A aspect of G is
not otherwise needed.

