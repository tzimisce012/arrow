---
title: MaybeKBracketInstance.bracketCase - arrow-effects-rx2-instances
---

[arrow-effects-rx2-instances](../../index.html) / [arrow.effects](../index.html) / [MaybeKBracketInstance](index.html) / [bracketCase](./bracket-case.html)

# bracketCase

`open fun <A, B> Kind<ForMaybeK, `[`A`](bracket-case.html#A)`>.bracketCase(release: (`[`A`](bracket-case.html#A)`, ExitCase<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>) -> Kind<ForMaybeK, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>, use: (`[`A`](bracket-case.html#A)`) -> Kind<ForMaybeK, `[`B`](bracket-case.html#B)`>): MaybeK<`[`B`](bracket-case.html#B)`>`