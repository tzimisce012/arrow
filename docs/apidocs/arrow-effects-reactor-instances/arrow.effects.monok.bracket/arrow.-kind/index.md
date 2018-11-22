---
title: arrow.effects.monok.bracket.arrow.Kind - arrow-effects-reactor-instances
---

[arrow-effects-reactor-instances](../../index.html) / [arrow.effects.monok.bracket](../index.html) / [arrow.Kind](./index.html)

### Extensions for arrow.Kind

| [bracket](bracket.html) | `fun <A, B> Kind<ForMonoK, `[`A`](bracket.html#A)`>.bracket(arg1: (`[`A`](bracket.html#A)`) -> Kind<ForMonoK, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>, arg2: (`[`A`](bracket.html#A)`) -> Kind<ForMonoK, `[`B`](bracket.html#B)`>): MonoK<`[`B`](bracket.html#B)`>` |
| [bracketCase](bracket-case.html) | `fun <A, B> Kind<ForMonoK, `[`A`](bracket-case.html#A)`>.bracketCase(arg1: (`[`A`](bracket-case.html#A)`, ExitCase<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>) -> Kind<ForMonoK, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>, arg2: (`[`A`](bracket-case.html#A)`) -> Kind<ForMonoK, `[`B`](bracket-case.html#B)`>): MonoK<`[`B`](bracket-case.html#B)`>` |
| [guarantee](guarantee.html) | `fun <A> Kind<ForMonoK, `[`A`](guarantee.html#A)`>.guarantee(arg1: Kind<ForMonoK, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>): MonoK<`[`A`](guarantee.html#A)`>` |
| [guaranteeCase](guarantee-case.html) | `fun <A> Kind<ForMonoK, `[`A`](guarantee-case.html#A)`>.guaranteeCase(arg1: (ExitCase<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>) -> Kind<ForMonoK, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>): MonoK<`[`A`](guarantee-case.html#A)`>` |
| [uncancelable](uncancelable.html) | `fun <A> Kind<ForMonoK, `[`A`](uncancelable.html#A)`>.uncancelable(): MonoK<`[`A`](uncancelable.html#A)`>` |

