---
title: IOConnection.cancel - arrow-effects
---

[arrow-effects](../../index.html) / [arrow.effects.internal](../index.html) / [IOConnection](index.html) / [cancel](./cancel.html)

# cancel

`abstract fun cancel(): CancelToken<`[`ForIO`](../../arrow.effects/-for-i-o.html)`>`

Cancels the unit of work represented by this reference.

Guaranteed idempotency - calling it multiple times should have the same side-effect as calling it only
once. Implementations of this method should also be thread-safe.

