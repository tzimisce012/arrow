---
title: arrow.data.kotlin.collections.List - arrow-data
---

[arrow-data](../../index.html) / [arrow.data](../index.html) / [kotlin.collections.List](./index.html)

### Extensions for kotlin.collections.List

| [k](k.html) | `fun <A> `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`A`](k.html#A)`>.k(): `[`ListK`](../-list-k/index.html)`<`[`A`](k.html#A)`>`<br>`fun <K, A> `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Entry`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/-entry/index.html)`<`[`K`](k.html#K)`, `[`A`](k.html#A)`>>.k(): `[`MapK`](../-map-k/index.html)`<`[`K`](k.html#K)`, `[`A`](k.html#A)`>`<br>`fun <A : `[`Comparable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html)`<`[`A`](k.html#A)`>, B> `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Entry`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/-entry/index.html)`<`[`A`](k.html#A)`, `[`B`](k.html#B)`>>.k(): `[`SortedMapK`](../-sorted-map-k/index.html)`<`[`A`](k.html#A)`, `[`B`](k.html#B)`>` |
| [stateSequential](state-sequential.html) | `fun <S, T> `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`State`](../-state.html)`<`[`S`](state-sequential.html#S)`, `[`T`](state-sequential.html#T)`>>.stateSequential(): `[`State`](../-state.html)`<`[`S`](state-sequential.html#S)`, `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`T`](state-sequential.html#T)`>>` |
| [stateTraverse](state-traverse.html) | `fun <R, S, T> `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`T`](state-traverse.html#T)`>.stateTraverse(f: (`[`T`](state-traverse.html#T)`) -> `[`State`](../-state.html)`<`[`S`](state-traverse.html#S)`, `[`R`](state-traverse.html#R)`>): `[`State`](../-state.html)`<`[`S`](state-traverse.html#S)`, `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`R`](state-traverse.html#R)`>>` |

