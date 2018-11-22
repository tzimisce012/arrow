---
title: FluxKBracketInstance.bracketCase - arrow-effects-reactor-instances
---

[arrow-effects-reactor-instances](../../index.html) / [arrow.effects](../index.html) / [FluxKBracketInstance](index.html) / [bracketCase](./bracket-case.html)

# bracketCase

`open fun <A, B> Kind<ForFluxK, `[`A`](bracket-case.html#A)`>.bracketCase(release: (`[`A`](bracket-case.html#A)`, ExitCase<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>) -> Kind<ForFluxK, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>, use: (`[`A`](bracket-case.html#A)`) -> Kind<ForFluxK, `[`B`](bracket-case.html#B)`>): FluxK<`[`B`](bracket-case.html#B)`>`