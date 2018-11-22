---
title: arrow.effects.deferredk.applicativeError.arrow.Kind - arrow-effects-kotlinx-coroutines-instances
---

[arrow-effects-kotlinx-coroutines-instances](../../index.html) / [arrow.effects.deferredk.applicativeError](../index.html) / [arrow.Kind](./index.html)

### Extensions for arrow.Kind

| [attempt](attempt.html) | `fun <A> Kind<ForDeferredK, `[`A`](attempt.html#A)`>.attempt(): DeferredK<Either<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, `[`A`](attempt.html#A)`>>` |
| [fromOption](from-option.html) | `fun <A> Kind<ForOption, `[`A`](from-option.html#A)`>.fromOption(arg1: () -> `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`): DeferredK<`[`A`](from-option.html#A)`>` |
| [fromTry](from-try.html) | `fun <A> Kind<ForTry, `[`A`](from-try.html#A)`>.fromTry(arg1: (`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`) -> `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`): DeferredK<`[`A`](from-try.html#A)`>` |
| [handleError](handle-error.html) | `fun <A> Kind<ForDeferredK, `[`A`](handle-error.html#A)`>.handleError(arg1: (`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`) -> `[`A`](handle-error.html#A)`): DeferredK<`[`A`](handle-error.html#A)`>` |
| [handleErrorWith](handle-error-with.html) | `fun <A> Kind<ForDeferredK, `[`A`](handle-error-with.html#A)`>.handleErrorWith(arg1: (`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`) -> Kind<ForDeferredK, `[`A`](handle-error-with.html#A)`>): DeferredK<`[`A`](handle-error-with.html#A)`>` |

