---
title: foldMap - arrow-streams
---

[arrow-streams](../../index.html) / [arrow.streams.internal](../index.html) / [arrow.Kind](index.html) / [foldMap](./fold-map.html)

# foldMap

`fun <M, S, A> `[`FreeCOf`](../-free-c-of.html)`<`[`S`](fold-map.html#S)`, `[`A`](fold-map.html#A)`>.foldMap(f: FunctionK<`[`S`](fold-map.html#S)`, `[`M`](fold-map.html#M)`>, MM: MonadError<`[`M`](fold-map.html#M)`, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>): Kind<`[`M`](fold-map.html#M)`, Option<`[`A`](fold-map.html#A)`>>`

Catamorphism for `FreeC`.

Run to completion, mapping the suspension with the given
transformation at each step and accumulating into the monad `M`.

This method uses `tailRecM` to provide stack-safety.

