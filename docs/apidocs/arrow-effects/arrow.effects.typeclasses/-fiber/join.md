---
title: Fiber.join - arrow-effects
---

[arrow-effects](../../index.html) / [arrow.effects.typeclasses](../index.html) / [Fiber](index.html) / [join](./join.html)

# join

`abstract val join: Kind<`[`F`](index.html#F)`, `[`A`](index.html#A)`>`

Returns a new task that will await for the completion of the
underlying fiber, (asynchronously) blocking the current run-loop
until that result is available.

