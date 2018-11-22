---
title: traverse_ - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances.optiont.foldable](../index.html) / [arrow.Kind](index.html) / [traverse_](./traverse_.html)

# traverse_

`@JvmName("traverse_") fun <F, G, A, B> Kind<Kind<ForOptionT, `[`F`](traverse_.html#F)`>, `[`A`](traverse_.html#A)`>.traverse_(arg1: Applicative<`[`G`](traverse_.html#G)`>, arg2: (`[`A`](traverse_.html#A)`) -> Kind<`[`G`](traverse_.html#G)`, `[`B`](traverse_.html#B)`>, FFF: Foldable<`[`F`](traverse_.html#F)`>): Kind<`[`G`](traverse_.html#G)`, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>`