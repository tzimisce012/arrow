---
title: bracketCase - arrow-data-instances-effects
---

[arrow-data-instances-effects](../../index.html) / [arrow.effects.instances.kleisli.bracket](../index.html) / [arrow.Kind](index.html) / [bracketCase](./bracket-case.html)

# bracketCase

`@JvmName("bracketCase") fun <F, R, E, A, B> Kind<Kind<Kind<ForKleisli, `[`F`](bracket-case.html#F)`>, `[`R`](bracket-case.html#R)`>, `[`A`](bracket-case.html#A)`>.bracketCase(arg1: (`[`A`](bracket-case.html#A)`, ExitCase<`[`E`](bracket-case.html#E)`>) -> Kind<Kind<Kind<ForKleisli, `[`F`](bracket-case.html#F)`>, `[`R`](bracket-case.html#R)`>, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>, arg2: (`[`A`](bracket-case.html#A)`) -> Kind<Kind<Kind<ForKleisli, `[`F`](bracket-case.html#F)`>, `[`R`](bracket-case.html#R)`>, `[`B`](bracket-case.html#B)`>, BF: Bracket<`[`F`](bracket-case.html#F)`, `[`E`](bracket-case.html#E)`>): Kind<`[`R`](bracket-case.html#R)`, `[`B`](bracket-case.html#B)`>`