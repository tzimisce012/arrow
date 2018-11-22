---
title: handleErrorWith - arrow-streams
---

[arrow-streams](../../index.html) / [arrow.streams.internal](../index.html) / [arrow.Kind](index.html) / [handleErrorWith](./handle-error-with.html)

# handleErrorWith

`fun <F, R> `[`FreeCOf`](../-free-c-of.html)`<`[`F`](handle-error-with.html#F)`, `[`R`](handle-error-with.html#R)`>.handleErrorWith(h: (`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`) -> `[`FreeCOf`](../-free-c-of.html)`<`[`F`](handle-error-with.html#F)`, `[`R`](handle-error-with.html#R)`>): `[`FreeC`](../-free-c/index.html)`<`[`F`](handle-error-with.html#F)`, `[`R`](handle-error-with.html#R)`>`

Handle any error, potentially recovering from it, by mapping it to a [FreeCOf](../-free-c-of.html) value by [h](handle-error-with.html#arrow.streams.internal$handleErrorWith(arrow.Kind((arrow.Kind((arrow.streams.internal.ForFreeC, arrow.streams.internal.handleErrorWith.F)), arrow.streams.internal.handleErrorWith.R)), kotlin.Function1((kotlin.Throwable, arrow.Kind((arrow.Kind((arrow.streams.internal.ForFreeC, arrow.streams.internal.handleErrorWith.F)), arrow.streams.internal.handleErrorWith.R)))))/h).

