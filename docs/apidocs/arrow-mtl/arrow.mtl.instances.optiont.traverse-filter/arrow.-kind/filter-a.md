---
title: filterA - arrow-mtl
---

[arrow-mtl](../../index.html) / [arrow.mtl.instances.optiont.traverseFilter](../index.html) / [arrow.Kind](index.html) / [filterA](./filter-a.html)

# filterA

`@JvmName("filterA") fun <F, G, A> Kind<Kind<ForOptionT, `[`F`](filter-a.html#F)`>, `[`A`](filter-a.html#A)`>.filterA(f: (`[`A`](filter-a.html#A)`) -> Kind<`[`G`](filter-a.html#G)`, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>, GA: Applicative<`[`G`](filter-a.html#G)`>, FFF: `[`TraverseFilter`](../../arrow.mtl.typeclasses/-traverse-filter/index.html)`<`[`F`](filter-a.html#F)`>): Kind<`[`G`](filter-a.html#G)`, Kind<Kind<ForOptionT, `[`F`](filter-a.html#F)`>, `[`A`](filter-a.html#A)`>>`