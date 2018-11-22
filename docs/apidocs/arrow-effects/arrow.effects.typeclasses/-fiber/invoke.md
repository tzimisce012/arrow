---
title: Fiber.invoke - arrow-effects
---

[arrow-effects](../../index.html) / [arrow.effects.typeclasses](../index.html) / [Fiber](index.html) / [invoke](./invoke.html)

# invoke

`operator fun <F, A> invoke(join: Kind<`[`F`](invoke.html#F)`, `[`A`](invoke.html#A)`>, cancel: CancelToken<`[`F`](invoke.html#F)`>): `[`Fiber`](index.html)`<`[`F`](invoke.html#F)`, `[`A`](invoke.html#A)`>`

[Fiber](index.html) constructor.

### Parameters

`join` - task that will trigger the cancellation.

`cancel` - task that will await for the completion of the underlying fiber.