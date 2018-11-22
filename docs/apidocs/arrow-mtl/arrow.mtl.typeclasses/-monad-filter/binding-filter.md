---
title: MonadFilter.bindingFilter - arrow-mtl
---

[arrow-mtl](../../index.html) / [arrow.mtl.typeclasses](../index.html) / [MonadFilter](index.html) / [bindingFilter](./binding-filter.html)

# bindingFilter

`open fun <B> bindingFilter(c: suspend `[`MonadFilterContinuation`](../-monad-filter-continuation/index.html)`<`[`F`](index.html#F)`, *>.() -> `[`B`](binding-filter.html#B)`): Kind<`[`F`](index.html#F)`, `[`B`](binding-filter.html#B)`>`

Entry point for monad bindings which enables for comprehension. The underlying impl is based on coroutines.
A coroutine is initiated and inside [MonadContinuation](#) suspended yielding to [flatMap](#). Once all the flatMap binds are completed
the underlying monad is returned from the act of executing the coroutine

