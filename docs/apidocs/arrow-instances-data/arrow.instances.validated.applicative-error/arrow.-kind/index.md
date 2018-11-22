---
title: arrow.instances.validated.applicativeError.arrow.Kind - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances.validated.applicativeError](../index.html) / [arrow.Kind](./index.html)

### Extensions for arrow.Kind

| [attempt](attempt.html) | `fun <E, A> Kind<Kind<ForValidated, `[`E`](attempt.html#E)`>, `[`A`](attempt.html#A)`>.attempt(SE: Semigroup<`[`E`](attempt.html#E)`>): Validated<`[`E`](attempt.html#E)`, Either<`[`E`](attempt.html#E)`, `[`A`](attempt.html#A)`>>` |
| [fromOption](from-option.html) | `fun <E, A> Kind<ForOption, `[`A`](from-option.html#A)`>.fromOption(arg1: () -> `[`E`](from-option.html#E)`, SE: Semigroup<`[`E`](from-option.html#E)`>): Validated<`[`E`](from-option.html#E)`, `[`A`](from-option.html#A)`>` |
| [fromTry](from-try.html) | `fun <E, A> Kind<ForTry, `[`A`](from-try.html#A)`>.fromTry(arg1: (`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`) -> `[`E`](from-try.html#E)`, SE: Semigroup<`[`E`](from-try.html#E)`>): Validated<`[`E`](from-try.html#E)`, `[`A`](from-try.html#A)`>` |
| [handleError](handle-error.html) | `fun <E, A> Kind<Kind<ForValidated, `[`E`](handle-error.html#E)`>, `[`A`](handle-error.html#A)`>.handleError(arg1: (`[`E`](handle-error.html#E)`) -> `[`A`](handle-error.html#A)`, SE: Semigroup<`[`E`](handle-error.html#E)`>): Validated<`[`E`](handle-error.html#E)`, `[`A`](handle-error.html#A)`>` |
| [handleErrorWith](handle-error-with.html) | `fun <E, A> Kind<Kind<ForValidated, `[`E`](handle-error-with.html#E)`>, `[`A`](handle-error-with.html#A)`>.handleErrorWith(arg1: (`[`E`](handle-error-with.html#E)`) -> Kind<Kind<ForValidated, `[`E`](handle-error-with.html#E)`>, `[`A`](handle-error-with.html#A)`>, SE: Semigroup<`[`E`](handle-error-with.html#E)`>): Validated<`[`E`](handle-error-with.html#E)`, `[`A`](handle-error-with.html#A)`>` |

