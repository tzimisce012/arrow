---
title: IO.bracketCase - arrow-effects
---

[arrow-effects](../../index.html) / [arrow.effects](../index.html) / [IO](index.html) / [bracketCase](./bracket-case.html)

# bracketCase

`fun <B> bracketCase(release: (`[`A`](index.html#A)`, `[`ExitCase`](../../arrow.effects.typeclasses/-exit-case/index.html)`<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>) -> `[`IO`](index.html)`<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>, use: (`[`A`](index.html#A)`) -> `[`IO`](index.html)`<`[`B`](bracket-case.html#B)`>): `[`IO`](index.html)`<`[`B`](bracket-case.html#B)`>`