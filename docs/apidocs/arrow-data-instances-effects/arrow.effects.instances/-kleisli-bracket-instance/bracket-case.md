---
title: KleisliBracketInstance.bracketCase - arrow-data-instances-effects
---

[arrow-data-instances-effects](../../index.html) / [arrow.effects.instances](../index.html) / [KleisliBracketInstance](index.html) / [bracketCase](./bracket-case.html)

# bracketCase

`open fun <A, B> Kind<KleisliPartialOf<`[`F`](index.html#F)`, `[`R`](index.html#R)`>, `[`A`](bracket-case.html#A)`>.bracketCase(release: (`[`A`](bracket-case.html#A)`, ExitCase<`[`E`](index.html#E)`>) -> Kind<KleisliPartialOf<`[`F`](index.html#F)`, `[`R`](index.html#R)`>, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>, use: (`[`A`](bracket-case.html#A)`) -> Kind<KleisliPartialOf<`[`F`](index.html#F)`, `[`R`](index.html#R)`>, `[`B`](bracket-case.html#B)`>): Kleisli<`[`F`](index.html#F)`, `[`R`](index.html#R)`, `[`B`](bracket-case.html#B)`>`