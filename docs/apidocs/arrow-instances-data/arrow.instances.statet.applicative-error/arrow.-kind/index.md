---
title: arrow.instances.statet.applicativeError.arrow.Kind - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances.statet.applicativeError](../index.html) / [arrow.Kind](./index.html)

### Extensions for arrow.Kind

| [attempt](attempt.html) | `fun <F, S, E, A> Kind<Kind<Kind<ForStateT, `[`F`](attempt.html#F)`>, `[`S`](attempt.html#S)`>, `[`A`](attempt.html#A)`>.attempt(ME: MonadError<`[`F`](attempt.html#F)`, `[`E`](attempt.html#E)`>): Kind<`[`S`](attempt.html#S)`, Either<`[`E`](attempt.html#E)`, `[`A`](attempt.html#A)`>>` |
| [fromOption](from-option.html) | `fun <F, S, E, A> Kind<ForOption, `[`A`](from-option.html#A)`>.fromOption(arg1: () -> `[`E`](from-option.html#E)`, ME: MonadError<`[`F`](from-option.html#F)`, `[`E`](from-option.html#E)`>): Kind<`[`S`](from-option.html#S)`, `[`A`](from-option.html#A)`>` |
| [fromTry](from-try.html) | `fun <F, S, E, A> Kind<ForTry, `[`A`](from-try.html#A)`>.fromTry(arg1: (`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`) -> `[`E`](from-try.html#E)`, ME: MonadError<`[`F`](from-try.html#F)`, `[`E`](from-try.html#E)`>): Kind<`[`S`](from-try.html#S)`, `[`A`](from-try.html#A)`>` |
| [handleError](handle-error.html) | `fun <F, S, E, A> Kind<Kind<Kind<ForStateT, `[`F`](handle-error.html#F)`>, `[`S`](handle-error.html#S)`>, `[`A`](handle-error.html#A)`>.handleError(arg1: (`[`E`](handle-error.html#E)`) -> `[`A`](handle-error.html#A)`, ME: MonadError<`[`F`](handle-error.html#F)`, `[`E`](handle-error.html#E)`>): Kind<`[`S`](handle-error.html#S)`, `[`A`](handle-error.html#A)`>` |
| [handleErrorWith](handle-error-with.html) | `fun <F, S, E, A> Kind<Kind<Kind<ForStateT, `[`F`](handle-error-with.html#F)`>, `[`S`](handle-error-with.html#S)`>, `[`A`](handle-error-with.html#A)`>.handleErrorWith(arg1: (`[`E`](handle-error-with.html#E)`) -> Kind<Kind<Kind<ForStateT, `[`F`](handle-error-with.html#F)`>, `[`S`](handle-error-with.html#S)`>, `[`A`](handle-error-with.html#A)`>, ME: MonadError<`[`F`](handle-error-with.html#F)`, `[`E`](handle-error-with.html#E)`>): Kind<`[`S`](handle-error-with.html#S)`, `[`A`](handle-error-with.html#A)`>` |

