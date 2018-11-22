---
title: FilterIndex.fromTraverse - arrow-optics
---

[arrow-optics](../../index.html) / [arrow.optics.typeclasses](../index.html) / [FilterIndex](index.html) / [fromTraverse](./from-traverse.html)

# fromTraverse

`fun <S, A> fromTraverse(zipWithIndex: (Kind<`[`S`](from-traverse.html#S)`, `[`A`](from-traverse.html#A)`>) -> Kind<`[`S`](from-traverse.html#S)`, Tuple2<`[`A`](from-traverse.html#A)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>>, traverse: Traverse<`[`S`](from-traverse.html#S)`>): `[`FilterIndex`](index.html)`<Kind<`[`S`](from-traverse.html#S)`, `[`A`](from-traverse.html#A)`>, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, `[`A`](from-traverse.html#A)`>`

Create an instance of [FilterIndex](index.html) from a [Traverse](#) and a function `Kind<S, A>) -> Kind<S, Tuple2<A, Int>>`

