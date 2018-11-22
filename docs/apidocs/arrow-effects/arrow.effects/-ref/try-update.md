---
title: Ref.tryUpdate - arrow-effects
---

[arrow-effects](../../index.html) / [arrow.effects](../index.html) / [Ref](index.html) / [tryUpdate](./try-update.html)

# tryUpdate

`abstract fun tryUpdate(f: (`[`A`](index.html#A)`) -> `[`A`](index.html#A)`): Kind<`[`F`](index.html#F)`, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>`

Attempts to modify the current value once, in contrast to [update](update.html) which calls [f](try-update.html#arrow.effects.Ref$tryUpdate(kotlin.Function1((arrow.effects.Ref.A, )))/f) until it succeeds.

**Returns**
`false` if concurrent modification completes between the time the variable is read and the time it is set.

