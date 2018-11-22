---
title: run - arrow-streams
---

[arrow-streams](../../index.html) / [arrow.streams.internal](../index.html) / [arrow.Kind](index.html) / [run](./run.html)

# run

`fun <F, R> `[`FreeCOf`](../-free-c-of.html)`<`[`F`](run.html#F)`, `[`R`](run.html#R)`>.run(ME: MonadError<`[`F`](run.html#F)`, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>): Kind<`[`F`](run.html#F)`, Option<`[`R`](run.html#R)`>>`

Runs a [FreeC](../-free-c/index.html) structure with [MonadError](#) in context of [F](run.html#F).

**Return**
[None](#) indicates that the [FreeC](../-free-c/index.html) was [FreeC.Interrupted](#).

