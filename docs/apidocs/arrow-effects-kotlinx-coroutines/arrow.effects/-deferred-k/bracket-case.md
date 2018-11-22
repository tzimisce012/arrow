---
title: DeferredK.bracketCase - arrow-effects-kotlinx-coroutines
---

[arrow-effects-kotlinx-coroutines](../../index.html) / [arrow.effects](../index.html) / [DeferredK](index.html) / [bracketCase](./bracket-case.html)

# bracketCase

`fun <B> bracketCase(use: (`[`A`](index.html#A)`) -> `[`DeferredK`](index.html)`<`[`B`](bracket-case.html#B)`>, release: (`[`A`](index.html#A)`, ExitCase<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>) -> `[`DeferredK`](index.html)`<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>): `[`DeferredK`](index.html)`<`[`B`](bracket-case.html#B)`>`