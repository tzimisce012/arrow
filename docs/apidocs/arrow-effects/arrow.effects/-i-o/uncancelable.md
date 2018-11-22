---
title: IO.uncancelable - arrow-effects
---

[arrow-effects](../../index.html) / [arrow.effects](../index.html) / [IO](index.html) / [uncancelable](./uncancelable.html)

# uncancelable

`fun uncancelable(): `[`IO`](index.html)`<`[`A`](index.html#A)`>`

Makes the source `IO` uninterruptible such that a [Fiber.cancel](#) signal has no effect.

