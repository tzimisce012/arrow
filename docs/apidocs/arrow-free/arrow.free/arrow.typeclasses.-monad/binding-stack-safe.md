---
title: bindingStackSafe - arrow-free
---

[arrow-free](../../index.html) / [arrow.free](../index.html) / [arrow.typeclasses.Monad](index.html) / [bindingStackSafe](./binding-stack-safe.html)

# bindingStackSafe

`fun <F, B> Monad<`[`F`](binding-stack-safe.html#F)`>.bindingStackSafe(c: suspend `[`StackSafeMonadContinuation`](../-stack-safe-monad-continuation/index.html)`<`[`F`](binding-stack-safe.html#F)`, *>.() -> `[`B`](binding-stack-safe.html#B)`): `[`Free`](../-free/index.html)`<`[`F`](binding-stack-safe.html#F)`, `[`B`](binding-stack-safe.html#B)`>`

Entry point for monad bindings which enables for comprehension. The underlying impl is based on coroutines.
A coroutine is initiated and inside [StackSafeMonadContinuation](../-stack-safe-monad-continuation/index.html) suspended yielding to [flatMap](../arrow.-kind/flat-map.html). Once all the flatMap binds are completed
the underlying monad is returned from the act of executing the coroutine.

This combinator ultimately returns computations lifting to [Free](../-free/index.html) to automatically for comprehend in a stack-safe way
over any stack-unsafe monads.

