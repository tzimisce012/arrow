---
title: DeferredK.defer - arrow-effects-kotlinx-coroutines
---

[arrow-effects-kotlinx-coroutines](../../index.html) / [arrow.effects](../index.html) / [DeferredK](index.html) / [defer](./defer.html)

# defer

`fun <A> defer(scope: CoroutineScope = GlobalScope, ctx: `[`CoroutineContext`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.coroutines/-coroutine-context/index.html)` = Dispatchers.Default, start: CoroutineStart = CoroutineStart.LAZY, f: suspend () -> `[`A`](defer.html#A)`): `[`DeferredK`](index.html)`<`[`A`](defer.html#A)`>`
`fun <A> defer(scope: CoroutineScope = GlobalScope, ctx: `[`CoroutineContext`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.coroutines/-coroutine-context/index.html)` = Dispatchers.Default, start: CoroutineStart = CoroutineStart.LAZY, fa: () -> `[`DeferredKOf`](../-deferred-k-of.html)`<`[`A`](defer.html#A)`>): `[`DeferredK`](index.html)`<`[`A`](defer.html#A)`>`