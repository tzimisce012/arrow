---
title: Ref.update - arrow-effects
---

[arrow-effects](../../index.html) / [arrow.effects](../index.html) / [Ref](index.html) / [update](./update.html)

# update

`abstract fun update(f: (`[`A`](index.html#A)`) -> `[`A`](index.html#A)`): Kind<`[`F`](index.html#F)`, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>`

Updates the current value using the supplied function [f](update.html#arrow.effects.Ref$update(kotlin.Function1((arrow.effects.Ref.A, )))/f).

If another modification occurs between the time the current value is read and subsequently updated,
the modification is retried using the new value. Hence, [f](update.html#arrow.effects.Ref$update(kotlin.Function1((arrow.effects.Ref.A, )))/f) may be invoked multiple times.

