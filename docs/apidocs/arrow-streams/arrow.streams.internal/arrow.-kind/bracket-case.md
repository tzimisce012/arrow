---
title: bracketCase - arrow-streams
---

[arrow-streams](../../index.html) / [arrow.streams.internal](../index.html) / [arrow.Kind](index.html) / [bracketCase](./bracket-case.html)

# bracketCase

`fun <F, A, B> `[`FreeCOf`](../-free-c-of.html)`<`[`F`](bracket-case.html#F)`, `[`A`](bracket-case.html#A)`>.bracketCase(use: (`[`A`](bracket-case.html#A)`) -> `[`FreeCOf`](../-free-c-of.html)`<`[`F`](bracket-case.html#F)`, `[`B`](bracket-case.html#B)`>, release: (`[`A`](bracket-case.html#A)`, ExitCase<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>) -> `[`FreeCOf`](../-free-c-of.html)`<`[`F`](bracket-case.html#F)`, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>): `[`FreeC`](../-free-c/index.html)`<`[`F`](bracket-case.html#F)`, `[`B`](bracket-case.html#B)`>`