---
title: arrow.effects.deferredk.bracket.arrow.Kind - arrow-effects-kotlinx-coroutines-instances
---

[arrow-effects-kotlinx-coroutines-instances](../../index.html) / [arrow.effects.deferredk.bracket](../index.html) / [arrow.Kind](./index.html)

### Extensions for arrow.Kind

| [bracket](bracket.html) | `fun <A, B> Kind<ForDeferredK, `[`A`](bracket.html#A)`>.bracket(arg1: (`[`A`](bracket.html#A)`) -> Kind<ForDeferredK, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>, arg2: (`[`A`](bracket.html#A)`) -> Kind<ForDeferredK, `[`B`](bracket.html#B)`>): DeferredK<`[`B`](bracket.html#B)`>` |
| [bracketCase](bracket-case.html) | `fun <A, B> Kind<ForDeferredK, `[`A`](bracket-case.html#A)`>.bracketCase(arg1: (`[`A`](bracket-case.html#A)`, ExitCase<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>) -> Kind<ForDeferredK, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>, arg2: (`[`A`](bracket-case.html#A)`) -> Kind<ForDeferredK, `[`B`](bracket-case.html#B)`>): DeferredK<`[`B`](bracket-case.html#B)`>` |
| [guarantee](guarantee.html) | `fun <A> Kind<ForDeferredK, `[`A`](guarantee.html#A)`>.guarantee(arg1: Kind<ForDeferredK, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>): DeferredK<`[`A`](guarantee.html#A)`>` |
| [guaranteeCase](guarantee-case.html) | `fun <A> Kind<ForDeferredK, `[`A`](guarantee-case.html#A)`>.guaranteeCase(arg1: (ExitCase<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>) -> Kind<ForDeferredK, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>): DeferredK<`[`A`](guarantee-case.html#A)`>` |
| [uncancelable](uncancelable.html) | `fun <A> Kind<ForDeferredK, `[`A`](uncancelable.html#A)`>.uncancelable(): DeferredK<`[`A`](uncancelable.html#A)`>` |

