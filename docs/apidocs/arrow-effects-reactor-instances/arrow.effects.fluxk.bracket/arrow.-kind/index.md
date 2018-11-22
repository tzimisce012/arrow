---
title: arrow.effects.fluxk.bracket.arrow.Kind - arrow-effects-reactor-instances
---

[arrow-effects-reactor-instances](../../index.html) / [arrow.effects.fluxk.bracket](../index.html) / [arrow.Kind](./index.html)

### Extensions for arrow.Kind

| [bracket](bracket.html) | `fun <A, B> Kind<ForFluxK, `[`A`](bracket.html#A)`>.bracket(arg1: (`[`A`](bracket.html#A)`) -> Kind<ForFluxK, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>, arg2: (`[`A`](bracket.html#A)`) -> Kind<ForFluxK, `[`B`](bracket.html#B)`>): FluxK<`[`B`](bracket.html#B)`>` |
| [bracketCase](bracket-case.html) | `fun <A, B> Kind<ForFluxK, `[`A`](bracket-case.html#A)`>.bracketCase(arg1: (`[`A`](bracket-case.html#A)`, ExitCase<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>) -> Kind<ForFluxK, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>, arg2: (`[`A`](bracket-case.html#A)`) -> Kind<ForFluxK, `[`B`](bracket-case.html#B)`>): FluxK<`[`B`](bracket-case.html#B)`>` |
| [guarantee](guarantee.html) | `fun <A> Kind<ForFluxK, `[`A`](guarantee.html#A)`>.guarantee(arg1: Kind<ForFluxK, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>): FluxK<`[`A`](guarantee.html#A)`>` |
| [guaranteeCase](guarantee-case.html) | `fun <A> Kind<ForFluxK, `[`A`](guarantee-case.html#A)`>.guaranteeCase(arg1: (ExitCase<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>) -> Kind<ForFluxK, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>): FluxK<`[`A`](guarantee-case.html#A)`>` |
| [uncancelable](uncancelable.html) | `fun <A> Kind<ForFluxK, `[`A`](uncancelable.html#A)`>.uncancelable(): FluxK<`[`A`](uncancelable.html#A)`>` |

