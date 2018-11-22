---
title: IOConnection.pushPair - arrow-effects
---

[arrow-effects](../../index.html) / [arrow.effects.internal](../index.html) / [IOConnection](index.html) / [pushPair](./push-pair.html)

# pushPair

`abstract fun pushPair(lh: `[`IOConnection`](index.html)`, rh: `[`IOConnection`](index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)

Pushes a pair of IOConnection on the stack, which on cancellation will get trampolined. This is useful in
IO.race for example, because combining a whole collection of IO tasks, two by two, can lead to building a
cancelable that's stack unsafe.

