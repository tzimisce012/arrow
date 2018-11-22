---
title: StackSafeMonadContinuation.bind - arrow-free
---

[arrow-free](../../index.html) / [arrow.free](../index.html) / [StackSafeMonadContinuation](index.html) / [bind](./bind.html)

# bind

`suspend fun <B> Kind<`[`F`](index.html#F)`, `[`B`](bind.html#B)`>.bind(): `[`B`](bind.html#B)
`suspend fun <B> `[`Free`](../-free/index.html)`<`[`F`](index.html#F)`, `[`B`](bind.html#B)`>.bind(): `[`B`](bind.html#B)
`suspend fun <B> bind(m: () -> `[`Free`](../-free/index.html)`<`[`F`](index.html#F)`, `[`B`](bind.html#B)`>): `[`B`](bind.html#B)