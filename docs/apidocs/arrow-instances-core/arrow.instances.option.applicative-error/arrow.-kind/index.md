---
title: arrow.instances.option.applicativeError.arrow.Kind - arrow-instances-core
---

[arrow-instances-core](../../index.html) / [arrow.instances.option.applicativeError](../index.html) / [arrow.Kind](./index.html)

### Extensions for arrow.Kind

| [attempt](attempt.html) | `fun <A> Kind<ForOption, `[`A`](attempt.html#A)`>.attempt(): Option<Either<`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`, `[`A`](attempt.html#A)`>>` |
| [fromOption](from-option.html) | `fun <A> Kind<ForOption, `[`A`](from-option.html#A)`>.fromOption(arg1: () -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): Option<`[`A`](from-option.html#A)`>` |
| [fromTry](from-try.html) | `fun <A> Kind<ForTry, `[`A`](from-try.html#A)`>.fromTry(arg1: (`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`) -> `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`): Option<`[`A`](from-try.html#A)`>` |
| [handleError](handle-error.html) | `fun <A> Kind<ForOption, `[`A`](handle-error.html#A)`>.handleError(arg1: (`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`) -> `[`A`](handle-error.html#A)`): Option<`[`A`](handle-error.html#A)`>` |
| [handleErrorWith](handle-error-with.html) | `fun <A> Kind<ForOption, `[`A`](handle-error-with.html#A)`>.handleErrorWith(arg1: (`[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`) -> Kind<ForOption, `[`A`](handle-error-with.html#A)`>): Option<`[`A`](handle-error-with.html#A)`>` |

