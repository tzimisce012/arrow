---
title: arrow.instances.kleisli.applicativeError.arrow.Kind - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances.kleisli.applicativeError](../index.html) / [arrow.Kind](./index.html)

### Extensions for arrow.Kind

| [attempt](attempt.html) | `fun <F, D, E, A> Kind<Kind<Kind<ForKleisli, `[`F`](attempt.html#F)`>, `[`D`](attempt.html#D)`>, `[`A`](attempt.html#A)`>.attempt(AE: ApplicativeError<`[`F`](attempt.html#F)`, `[`E`](attempt.html#E)`>): Kind<`[`D`](attempt.html#D)`, Either<`[`E`](attempt.html#E)`, `[`A`](attempt.html#A)`>>` |
| [fromOption](from-option.html) | `fun <F, D, E, A> Kind<ForOption, `[`A`](from-option.html#A)`>.fromOption(arg1: () -> `[`E`](from-option.html#E)`, AE: ApplicativeError<`[`F`](from-option.html#F)`, `[`E`](from-option.html#E)`>): Kind<`[`D`](from-option.html#D)`, `[`A`](from-option.html#A)`>` |
| [fromTry](from-try.html) | `fun <F, D, E, A> Kind<ForTry, `[`A`](from-try.html#A)`>.fromTry(arg1: (`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`) -> `[`E`](from-try.html#E)`, AE: ApplicativeError<`[`F`](from-try.html#F)`, `[`E`](from-try.html#E)`>): Kind<`[`D`](from-try.html#D)`, `[`A`](from-try.html#A)`>` |
| [handleError](handle-error.html) | `fun <F, D, E, A> Kind<Kind<Kind<ForKleisli, `[`F`](handle-error.html#F)`>, `[`D`](handle-error.html#D)`>, `[`A`](handle-error.html#A)`>.handleError(arg1: (`[`E`](handle-error.html#E)`) -> `[`A`](handle-error.html#A)`, AE: ApplicativeError<`[`F`](handle-error.html#F)`, `[`E`](handle-error.html#E)`>): Kind<`[`D`](handle-error.html#D)`, `[`A`](handle-error.html#A)`>` |
| [handleErrorWith](handle-error-with.html) | `fun <F, D, E, A> Kind<Kind<Kind<ForKleisli, `[`F`](handle-error-with.html#F)`>, `[`D`](handle-error-with.html#D)`>, `[`A`](handle-error-with.html#A)`>.handleErrorWith(arg1: (`[`E`](handle-error-with.html#E)`) -> Kind<Kind<Kind<ForKleisli, `[`F`](handle-error-with.html#F)`>, `[`D`](handle-error-with.html#D)`>, `[`A`](handle-error-with.html#A)`>, AE: ApplicativeError<`[`F`](handle-error-with.html#F)`, `[`E`](handle-error-with.html#E)`>): Kind<`[`D`](handle-error-with.html#D)`, `[`A`](handle-error-with.html#A)`>` |

