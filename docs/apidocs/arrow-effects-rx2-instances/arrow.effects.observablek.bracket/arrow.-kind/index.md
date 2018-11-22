---
title: arrow.effects.observablek.bracket.arrow.Kind - arrow-effects-rx2-instances
---

[arrow-effects-rx2-instances](../../index.html) / [arrow.effects.observablek.bracket](../index.html) / [arrow.Kind](./index.html)

### Extensions for arrow.Kind

| [bracket](bracket.html) | `fun <A, B> Kind<ForObservableK, `[`A`](bracket.html#A)`>.bracket(arg1: (`[`A`](bracket.html#A)`) -> Kind<ForObservableK, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>, arg2: (`[`A`](bracket.html#A)`) -> Kind<ForObservableK, `[`B`](bracket.html#B)`>): ObservableK<`[`B`](bracket.html#B)`>` |
| [bracketCase](bracket-case.html) | `fun <A, B> Kind<ForObservableK, `[`A`](bracket-case.html#A)`>.bracketCase(arg1: (`[`A`](bracket-case.html#A)`, ExitCase<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>) -> Kind<ForObservableK, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>, arg2: (`[`A`](bracket-case.html#A)`) -> Kind<ForObservableK, `[`B`](bracket-case.html#B)`>): ObservableK<`[`B`](bracket-case.html#B)`>` |
| [guarantee](guarantee.html) | `fun <A> Kind<ForObservableK, `[`A`](guarantee.html#A)`>.guarantee(arg1: Kind<ForObservableK, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>): ObservableK<`[`A`](guarantee.html#A)`>` |
| [guaranteeCase](guarantee-case.html) | `fun <A> Kind<ForObservableK, `[`A`](guarantee-case.html#A)`>.guaranteeCase(arg1: (ExitCase<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>) -> Kind<ForObservableK, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>): ObservableK<`[`A`](guarantee-case.html#A)`>` |
| [uncancelable](uncancelable.html) | `fun <A> Kind<ForObservableK, `[`A`](uncancelable.html#A)`>.uncancelable(): ObservableK<`[`A`](uncancelable.html#A)`>` |

