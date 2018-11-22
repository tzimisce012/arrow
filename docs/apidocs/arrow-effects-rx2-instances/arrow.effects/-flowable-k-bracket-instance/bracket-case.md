---
title: FlowableKBracketInstance.bracketCase - arrow-effects-rx2-instances
---

[arrow-effects-rx2-instances](../../index.html) / [arrow.effects](../index.html) / [FlowableKBracketInstance](index.html) / [bracketCase](./bracket-case.html)

# bracketCase

`open fun <A, B> Kind<ForFlowableK, `[`A`](bracket-case.html#A)`>.bracketCase(release: (`[`A`](bracket-case.html#A)`, ExitCase<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>) -> Kind<ForFlowableK, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>, use: (`[`A`](bracket-case.html#A)`) -> Kind<ForFlowableK, `[`B`](bracket-case.html#B)`>): FlowableK<`[`B`](bracket-case.html#B)`>`