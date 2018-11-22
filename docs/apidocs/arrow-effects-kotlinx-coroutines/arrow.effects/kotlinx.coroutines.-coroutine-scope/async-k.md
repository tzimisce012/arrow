---
title: asyncK - arrow-effects-kotlinx-coroutines
---

[arrow-effects-kotlinx-coroutines](../../index.html) / [arrow.effects](../index.html) / [kotlinx.coroutines.CoroutineScope](index.html) / [asyncK](./async-k.html)

# asyncK

`fun <A> CoroutineScope.asyncK(ctx: `[`CoroutineContext`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.coroutines/-coroutine-context/index.html)` = Dispatchers.Default, start: CoroutineStart = CoroutineStart.LAZY, f: suspend CoroutineScope.() -> `[`A`](async-k.html#A)`): `[`DeferredK`](../-deferred-k/index.html)`<`[`A`](async-k.html#A)`>`