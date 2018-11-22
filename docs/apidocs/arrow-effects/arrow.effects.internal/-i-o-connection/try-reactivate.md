---
title: IOConnection.tryReactivate - arrow-effects
---

[arrow-effects](../../index.html) / [arrow.effects.internal](../index.html) / [IOConnection](index.html) / [tryReactivate](./try-reactivate.html)

# tryReactivate

`abstract fun tryReactivate(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)

Tries to reset an IOConnection, from a cancelled state, back to a pristine state, but only if possible.

**Return**
true on success, false if there was a race condition (i.e. the connection wasn't cancelled) or if
the type of the connection cannot be reactivated.

