---
title: arrow.free.arrow.typeclasses.Monad - arrow-free
---

[arrow-free](../../index.html) / [arrow.free](../index.html) / [arrow.typeclasses.Monad](./index.html)

### Extensions for arrow.typeclasses.Monad

| [bindingStackSafe](binding-stack-safe.html) | `fun <F, B> Monad<`[`F`](binding-stack-safe.html#F)`>.bindingStackSafe(c: suspend `[`StackSafeMonadContinuation`](../-stack-safe-monad-continuation/index.html)`<`[`F`](binding-stack-safe.html#F)`, *>.() -> `[`B`](binding-stack-safe.html#B)`): `[`Free`](../-free/index.html)`<`[`F`](binding-stack-safe.html#F)`, `[`B`](binding-stack-safe.html#B)`>`<br>Entry point for monad bindings which enables for comprehension. The underlying impl is based on coroutines. A coroutine is initiated and inside [StackSafeMonadContinuation](../-stack-safe-monad-continuation/index.html) suspended yielding to [flatMap](../arrow.-kind/flat-map.html). Once all the flatMap binds are completed the underlying monad is returned from the act of executing the coroutine. |

