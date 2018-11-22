---
title: sequence_ - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances.coproduct.foldable](../index.html) / [arrow.Kind](index.html) / [sequence_](./sequence_.html)

# sequence_

`@JvmName("sequence_") fun <F, G, A> Kind<Kind<Kind<ForCoproduct, `[`F`](sequence_.html#F)`>, `[`G`](sequence_.html#G)`>, Kind<`[`G`](sequence_.html#G)`, `[`A`](sequence_.html#A)`>>.sequence_(arg1: Applicative<`[`G`](sequence_.html#G)`>, FF: Foldable<`[`F`](sequence_.html#F)`>, FG: Foldable<`[`G`](sequence_.html#G)`>): Kind<`[`G`](sequence_.html#G)`, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>`