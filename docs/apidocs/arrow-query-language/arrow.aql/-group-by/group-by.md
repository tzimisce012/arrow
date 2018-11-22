---
title: GroupBy.groupBy - arrow-query-language
---

[arrow-query-language](../../index.html) / [arrow.aql](../index.html) / [GroupBy](index.html) / [groupBy](./group-by.html)

# groupBy

`open infix fun <A, Z, X> `[`Query`](../-query/index.html)`<`[`F`](index.html#F)`, `[`A`](group-by.html#A)`, `[`Z`](group-by.html#Z)`>.groupBy(group: `[`Z`](group-by.html#Z)`.() -> `[`X`](group-by.html#X)`): `[`Query`](../-query/index.html)`<ForId, `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`X`](group-by.html#X)`, `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Z`](group-by.html#Z)`>>, `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`X`](group-by.html#X)`, `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Z`](group-by.html#Z)`>>>`