---
title: DeferredK.async - arrow-effects-kotlinx-coroutines
---

[arrow-effects-kotlinx-coroutines](../../index.html) / [arrow.effects](../index.html) / [DeferredK](index.html) / [async](./async.html)

# async

`fun <A> async(scope: CoroutineScope = GlobalScope, ctx: `[`CoroutineContext`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.coroutines/-coroutine-context/index.html)` = Dispatchers.Default, start: CoroutineStart = CoroutineStart.DEFAULT, fa: Proc<`[`A`](async.html#A)`>): `[`DeferredK`](index.html)`<`[`A`](async.html#A)`>`

Starts a coroutine that'll run [Proc](#).

Matching the behavior of [async](./async.html),
its [CoroutineContext](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.coroutines/-coroutine-context/index.html) is set to [DefaultDispatcher](#)
and its [CoroutineStart](#) is [CoroutineStart.DEFAULT](#).

