---
title: Monad.binding - arrow-typeclasses
---

[arrow-typeclasses](../../index.html) / [arrow.typeclasses](../index.html) / [Monad](index.html) / [binding](./binding.html)

# binding

`open fun <B> binding(c: suspend `[`MonadContinuation`](../-monad-continuation/index.html)`<`[`F`](index.html#F)`, *>.() -> `[`B`](binding.html#B)`): Kind<`[`F`](index.html#F)`, `[`B`](binding.html#B)`>`

Entry point for monad bindings which enables for comprehension. The underlying implementation is based on coroutines.
A coroutine is initiated and suspended inside [MonadErrorContinuation](../-monad-error-continuation/index.html) yielding to [Monad.flatMap](flat-map.html). Once all the flatMap binds are completed
the underlying monad is returned from the act of executing the coroutine

