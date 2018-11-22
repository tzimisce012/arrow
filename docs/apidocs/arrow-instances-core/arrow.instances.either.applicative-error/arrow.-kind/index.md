---
title: arrow.instances.either.applicativeError.arrow.Kind - arrow-instances-core
---

[arrow-instances-core](../../index.html) / [arrow.instances.either.applicativeError](../index.html) / [arrow.Kind](./index.html)

### Extensions for arrow.Kind

| [attempt](attempt.html) | `fun <L, A> Kind<Kind<ForEither, `[`L`](attempt.html#L)`>, `[`A`](attempt.html#A)`>.attempt(): Either<`[`L`](attempt.html#L)`, Either<`[`L`](attempt.html#L)`, `[`A`](attempt.html#A)`>>` |
| [fromOption](from-option.html) | `fun <L, A> Kind<ForOption, `[`A`](from-option.html#A)`>.fromOption(arg1: () -> `[`L`](from-option.html#L)`): Either<`[`L`](from-option.html#L)`, `[`A`](from-option.html#A)`>` |
| [fromTry](from-try.html) | `fun <L, A> Kind<ForTry, `[`A`](from-try.html#A)`>.fromTry(arg1: (`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`) -> `[`L`](from-try.html#L)`): Either<`[`L`](from-try.html#L)`, `[`A`](from-try.html#A)`>` |
| [handleError](handle-error.html) | `fun <L, A> Kind<Kind<ForEither, `[`L`](handle-error.html#L)`>, `[`A`](handle-error.html#A)`>.handleError(arg1: (`[`L`](handle-error.html#L)`) -> `[`A`](handle-error.html#A)`): Either<`[`L`](handle-error.html#L)`, `[`A`](handle-error.html#A)`>` |
| [handleErrorWith](handle-error-with.html) | `fun <L, A> Kind<Kind<ForEither, `[`L`](handle-error-with.html#L)`>, `[`A`](handle-error-with.html#A)`>.handleErrorWith(arg1: (`[`L`](handle-error-with.html#L)`) -> Kind<Kind<ForEither, `[`L`](handle-error-with.html#L)`>, `[`A`](handle-error-with.html#A)`>): Either<`[`L`](handle-error-with.html#L)`, `[`A`](handle-error-with.html#A)`>` |

