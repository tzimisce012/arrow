---
title: traverse_ - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances.coproduct.foldable](../index.html) / [arrow.Kind](index.html) / [traverse_](./traverse_.html)

# traverse_

`@JvmName("traverse_") fun <F, G, A, B> Kind<Kind<Kind<ForCoproduct, `[`F`](traverse_.html#F)`>, `[`G`](traverse_.html#G)`>, `[`A`](traverse_.html#A)`>.traverse_(arg1: Applicative<`[`G`](traverse_.html#G)`>, arg2: (`[`A`](traverse_.html#A)`) -> Kind<`[`G`](traverse_.html#G)`, `[`B`](traverse_.html#B)`>, FF: Foldable<`[`F`](traverse_.html#F)`>, FG: Foldable<`[`G`](traverse_.html#G)`>): Kind<`[`G`](traverse_.html#G)`, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>`