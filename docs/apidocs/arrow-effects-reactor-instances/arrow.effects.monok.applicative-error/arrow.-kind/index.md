---
title: arrow.effects.monok.applicativeError.arrow.Kind - arrow-effects-reactor-instances
---

[arrow-effects-reactor-instances](../../index.html) / [arrow.effects.monok.applicativeError](../index.html) / [arrow.Kind](./index.html)

### Extensions for arrow.Kind

| [attempt](attempt.html) | `fun <A> Kind<ForMonoK, `[`A`](attempt.html#A)`>.attempt(): MonoK<Either<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, `[`A`](attempt.html#A)`>>` |
| [fromOption](from-option.html) | `fun <A> Kind<ForOption, `[`A`](from-option.html#A)`>.fromOption(arg1: () -> `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`): MonoK<`[`A`](from-option.html#A)`>` |
| [fromTry](from-try.html) | `fun <A> Kind<ForTry, `[`A`](from-try.html#A)`>.fromTry(arg1: (`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`) -> `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`): MonoK<`[`A`](from-try.html#A)`>` |
| [handleError](handle-error.html) | `fun <A> Kind<ForMonoK, `[`A`](handle-error.html#A)`>.handleError(arg1: (`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`) -> `[`A`](handle-error.html#A)`): MonoK<`[`A`](handle-error.html#A)`>` |
| [handleErrorWith](handle-error-with.html) | `fun <A> Kind<ForMonoK, `[`A`](handle-error-with.html#A)`>.handleErrorWith(arg1: (`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`) -> Kind<ForMonoK, `[`A`](handle-error-with.html#A)`>): MonoK<`[`A`](handle-error-with.html#A)`>` |

