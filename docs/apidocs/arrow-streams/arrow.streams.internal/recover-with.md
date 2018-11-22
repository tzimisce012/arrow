---
title: recoverWith - arrow-streams
---

[arrow-streams](../index.html) / [arrow.streams.internal](index.html) / [recoverWith](./recover-with.html)

# recoverWith

`fun <R> `[`Result`](-free-c/-result/index.html)`<`[`R`](recover-with.html#R)`>.recoverWith(f: (`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`) -> `[`Result`](-free-c/-result/index.html)`<`[`R`](recover-with.html#R)`>): `[`Result`](-free-c/-result/index.html)`<`[`R`](recover-with.html#R)`>`

Applies the given function [f](recover-with.html#arrow.streams.internal$recoverWith(arrow.streams.internal.FreeC.Result((arrow.streams.internal.recoverWith.R)), kotlin.Function1((kotlin.Throwable, arrow.streams.internal.FreeC.Result((arrow.streams.internal.recoverWith.R)))))/f) if this is a [FreeC.Fail](#), otherwise returns itself.
This is like [flatMap](#) for the error-side.

