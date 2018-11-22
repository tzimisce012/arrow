---
title: IOBracketInstance.bracketCase - arrow-effects-instances
---

[arrow-effects-instances](../../index.html) / [arrow.effects.instances](../index.html) / [IOBracketInstance](index.html) / [bracketCase](./bracket-case.html)

# bracketCase

`open fun <A, B> Kind<ForIO, `[`A`](bracket-case.html#A)`>.bracketCase(release: (`[`A`](bracket-case.html#A)`, ExitCase<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>) -> Kind<ForIO, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>, use: (`[`A`](bracket-case.html#A)`) -> Kind<ForIO, `[`B`](bracket-case.html#B)`>): IO<`[`B`](bracket-case.html#B)`>`