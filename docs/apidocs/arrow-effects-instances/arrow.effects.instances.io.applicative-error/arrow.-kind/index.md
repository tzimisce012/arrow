---
title: arrow.effects.instances.io.applicativeError.arrow.Kind - arrow-effects-instances
---

[arrow-effects-instances](../../index.html) / [arrow.effects.instances.io.applicativeError](../index.html) / [arrow.Kind](./index.html)

### Extensions for arrow.Kind

| [attempt](attempt.html) | `fun <A> Kind<ForIO, `[`A`](attempt.html#A)`>.attempt(): IO<Either<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, `[`A`](attempt.html#A)`>>` |
| [fromOption](from-option.html) | `fun <A> Kind<ForOption, `[`A`](from-option.html#A)`>.fromOption(arg1: () -> `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`): IO<`[`A`](from-option.html#A)`>` |
| [fromTry](from-try.html) | `fun <A> Kind<ForTry, `[`A`](from-try.html#A)`>.fromTry(arg1: (`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`) -> `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`): IO<`[`A`](from-try.html#A)`>` |
| [handleError](handle-error.html) | `fun <A> Kind<ForIO, `[`A`](handle-error.html#A)`>.handleError(arg1: (`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`) -> `[`A`](handle-error.html#A)`): IO<`[`A`](handle-error.html#A)`>` |
| [handleErrorWith](handle-error-with.html) | `fun <A> Kind<ForIO, `[`A`](handle-error-with.html#A)`>.handleErrorWith(arg1: (`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`) -> Kind<ForIO, `[`A`](handle-error-with.html#A)`>): IO<`[`A`](handle-error-with.html#A)`>` |

