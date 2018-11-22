---
title: cobinding - arrow-typeclasses
---

[arrow-typeclasses](../index.html) / [arrow.typeclasses](index.html) / [cobinding](./cobinding.html)

# cobinding

`fun <F, B : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> `[`Comonad`](-comonad/index.html)`<`[`F`](cobinding.html#F)`>.cobinding(c: suspend `[`ComonadContinuation`](-comonad-continuation/index.html)`<`[`F`](cobinding.html#F)`, *>.() -> `[`B`](cobinding.html#B)`): `[`B`](cobinding.html#B)

Entry point for monad bindings which enables for comprehension. The underlying impl is based on coroutines.
A coroutine is initiated and inside `MonadContinuation` suspended yielding to `flatMap` once all the flatMap binds are completed
the underlying monad is returned from the act of executing the coroutine

