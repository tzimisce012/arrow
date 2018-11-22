---
title: groupBy - arrow-query-language
---

[arrow-query-language](../index.html) / [arrow.aql.instances.try.groupBy](index.html) / [groupBy](./group-by.html)

# groupBy

`@JvmName("groupBy") infix fun <A, Z, X> `[`Query`](../arrow.aql/-query/index.html)`<ForTry, `[`A`](group-by.html#A)`, `[`Z`](group-by.html#Z)`>.groupBy(group: `[`Z`](group-by.html#Z)`.() -> `[`X`](group-by.html#X)`): `[`Query`](../arrow.aql/-query/index.html)`<ForId, `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`X`](group-by.html#X)`, `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Z`](group-by.html#Z)`>>, `[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`X`](group-by.html#X)`, `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Z`](group-by.html#Z)`>>>`