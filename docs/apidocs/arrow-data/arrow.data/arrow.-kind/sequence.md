---
title: sequence - arrow-data
---

[arrow-data](../../index.html) / [arrow.data](../index.html) / [arrow.Kind](index.html) / [sequence](./sequence.html)

# sequence

`fun <F, G, A, H> `[`CoproductOf`](../-coproduct-of.html)`<`[`F`](sequence.html#F)`, `[`G`](sequence.html#G)`, Kind<`[`H`](sequence.html#H)`, `[`A`](sequence.html#A)`>>.sequence(HA: Applicative<`[`H`](sequence.html#H)`>, FT: Traverse<`[`F`](sequence.html#F)`>, GT: Traverse<`[`G`](sequence.html#G)`>): Kind<`[`H`](sequence.html#H)`, `[`Coproduct`](../-coproduct/index.html)`<`[`F`](sequence.html#F)`, `[`G`](sequence.html#G)`, `[`A`](sequence.html#A)`>>`
`fun <A, B, G> `[`IorOf`](../-ior-of.html)`<`[`A`](sequence.html#A)`, Kind<`[`G`](sequence.html#G)`, `[`B`](sequence.html#B)`>>.sequence(GA: Applicative<`[`G`](sequence.html#G)`>): Kind<`[`G`](sequence.html#G)`, `[`Ior`](../-ior/index.html)`<`[`A`](sequence.html#A)`, `[`B`](sequence.html#B)`>>`
`fun <K, V, G> `[`MapKOf`](../-map-k-of.html)`<`[`K`](sequence.html#K)`, Kind<`[`G`](sequence.html#G)`, `[`V`](sequence.html#V)`>>.sequence(GA: Applicative<`[`G`](sequence.html#G)`>): Kind<`[`G`](sequence.html#G)`, `[`MapK`](../-map-k/index.html)`<`[`K`](sequence.html#K)`, `[`V`](sequence.html#V)`>>`
`fun <A, G> `[`NonEmptyListOf`](../-non-empty-list-of.html)`<Kind<`[`G`](sequence.html#G)`, `[`A`](sequence.html#A)`>>.sequence(GA: Applicative<`[`G`](sequence.html#G)`>): Kind<`[`G`](sequence.html#G)`, `[`NonEmptyList`](../-non-empty-list/index.html)`<`[`A`](sequence.html#A)`>>`
`fun <A, G> `[`SequenceKOf`](../-sequence-k-of.html)`<Kind<`[`G`](sequence.html#G)`, `[`A`](sequence.html#A)`>>.sequence(GA: Applicative<`[`G`](sequence.html#G)`>): Kind<`[`G`](sequence.html#G)`, `[`SequenceK`](../-sequence-k/index.html)`<`[`A`](sequence.html#A)`>>`
`fun <K : `[`Comparable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html)`<`[`K`](sequence.html#K)`>, V, G> `[`SortedMapKOf`](../-sorted-map-k-of.html)`<`[`K`](sequence.html#K)`, Kind<`[`G`](sequence.html#G)`, `[`V`](sequence.html#V)`>>.sequence(GA: Applicative<`[`G`](sequence.html#G)`>): Kind<`[`G`](sequence.html#G)`, `[`SortedMapK`](../-sorted-map-k/index.html)`<`[`K`](sequence.html#K)`, `[`V`](sequence.html#V)`>>`
`fun <G, E, A> `[`ValidatedOf`](../-validated-of.html)`<`[`E`](sequence.html#E)`, Kind<`[`G`](sequence.html#G)`, `[`A`](sequence.html#A)`>>.sequence(GA: Applicative<`[`G`](sequence.html#G)`>): Kind<`[`G`](sequence.html#G)`, `[`Validated`](../-validated/index.html)`<`[`E`](sequence.html#E)`, `[`A`](sequence.html#A)`>>`