---
title: arrow.effects.maybek.bracket.arrow.Kind - arrow-effects-rx2-instances
---

[arrow-effects-rx2-instances](../../index.html) / [arrow.effects.maybek.bracket](../index.html) / [arrow.Kind](./index.html)

### Extensions for arrow.Kind

| [bracket](bracket.html) | `fun <A, B> Kind<ForMaybeK, `[`A`](bracket.html#A)`>.bracket(arg1: (`[`A`](bracket.html#A)`) -> Kind<ForMaybeK, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>, arg2: (`[`A`](bracket.html#A)`) -> Kind<ForMaybeK, `[`B`](bracket.html#B)`>): MaybeK<`[`B`](bracket.html#B)`>` |
| [bracketCase](bracket-case.html) | `fun <A, B> Kind<ForMaybeK, `[`A`](bracket-case.html#A)`>.bracketCase(arg1: (`[`A`](bracket-case.html#A)`, ExitCase<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>) -> Kind<ForMaybeK, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>, arg2: (`[`A`](bracket-case.html#A)`) -> Kind<ForMaybeK, `[`B`](bracket-case.html#B)`>): MaybeK<`[`B`](bracket-case.html#B)`>` |
| [guarantee](guarantee.html) | `fun <A> Kind<ForMaybeK, `[`A`](guarantee.html#A)`>.guarantee(arg1: Kind<ForMaybeK, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>): MaybeK<`[`A`](guarantee.html#A)`>` |
| [guaranteeCase](guarantee-case.html) | `fun <A> Kind<ForMaybeK, `[`A`](guarantee-case.html#A)`>.guaranteeCase(arg1: (ExitCase<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>) -> Kind<ForMaybeK, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>): MaybeK<`[`A`](guarantee-case.html#A)`>` |
| [uncancelable](uncancelable.html) | `fun <A> Kind<ForMaybeK, `[`A`](uncancelable.html#A)`>.uncancelable(): MaybeK<`[`A`](uncancelable.html#A)`>` |

