---
title: MonadDefer.bindingCancellable - arrow-effects
---

[arrow-effects](../../index.html) / [arrow.effects.typeclasses](../index.html) / [MonadDefer](index.html) / [bindingCancellable](./binding-cancellable.html)

# bindingCancellable

`open fun <B> bindingCancellable(c: suspend `[`MonadDeferCancellableContinuation`](../-monad-defer-cancellable-continuation/index.html)`<`[`F`](index.html#F)`, *>.() -> `[`B`](binding-cancellable.html#B)`): Tuple2<Kind<`[`F`](index.html#F)`, `[`B`](binding-cancellable.html#B)`>, `[`Disposable`](../-disposable.html)`>`

Entry point for monad bindings which enables for comprehensions. The underlying impl is based on coroutines.
A coroutines is initiated and inside [MonadDeferCancellableContinuation](../-monad-defer-cancellable-continuation/index.html) suspended yielding to [Monad.flatMap](#). Once all the flatMap binds are completed
the underlying monad is returned from the act of executing the coroutine

This one operates over [MonadError](#) instances that can support [Throwable](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html) in their error type automatically lifting
errors as failed computations in their monadic context and not letting exceptions thrown as the regular monad binding does.

This operation is cancellable by calling invoke on the [Disposable](../-disposable.html) return.
If [Disposable.invoke](#) is called the binding result will become a lifted [BindingCancellationException](../../arrow.effects.data.internal/-binding-cancellation-exception/index.html).

