---
title: IOConnection.push - arrow-effects
---

[arrow-effects](../../index.html) / [arrow.effects.internal](../index.html) / [IOConnection](index.html) / [push](./push.html)

# push

`abstract fun push(token: CancelToken<`[`ForIO`](../../arrow.effects/-for-i-o.html)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Pushes a cancelable reference on the stack, to be popped or canceled later in FIFO order.

