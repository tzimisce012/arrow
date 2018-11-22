---
title: MonadThrow.bindingCatch - arrow-typeclasses
---

[arrow-typeclasses](../../index.html) / [arrow.typeclasses](../index.html) / [MonadThrow](index.html) / [bindingCatch](./binding-catch.html)

# bindingCatch

`open fun <B> bindingCatch(c: suspend `[`MonadErrorContinuation`](../-monad-error-continuation/index.html)`<`[`F`](index.html#F)`, *>.() -> `[`B`](binding-catch.html#B)`): Kind<`[`F`](index.html#F)`, `[`B`](binding-catch.html#B)`>`

Entry point for monad bindings which enables for comprehensions. The underlying implementation is based on coroutines.
A coroutine is initiated and suspended inside [MonadErrorContinuation](../-monad-error-continuation/index.html) yielding to [Monad.flatMap](../-monad/flat-map.html). Once all the flatMap binds are completed
the underlying monad is returned from the act of executing the coroutine

This one operates over [MonadError](../-monad-error/index.html) instances that can support [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html) in their error type automatically lifting
errors as failed computations in their monadic context and not letting exceptions thrown as the regular monad binding does.

