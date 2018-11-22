---
title: arrow.streams.internal.freec.applicativeError.arrow.Kind - arrow-streams
---

[arrow-streams](../../index.html) / [arrow.streams.internal.freec.applicativeError](../index.html) / [arrow.Kind](./index.html)

### Extensions for arrow.Kind

| [attempt](attempt.html) | `fun <F, A> Kind<Kind<`[`ForFreeC`](../../arrow.streams.internal/-for-free-c.html)`, `[`F`](attempt.html#F)`>, `[`A`](attempt.html#A)`>.attempt(): `[`FreeC`](../../arrow.streams.internal/-free-c/index.html)`<`[`F`](attempt.html#F)`, Either<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, `[`A`](attempt.html#A)`>>` |
| [fromOption](from-option.html) | `fun <F, A> Kind<ForOption, `[`A`](from-option.html#A)`>.fromOption(arg1: () -> `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`): `[`FreeC`](../../arrow.streams.internal/-free-c/index.html)`<`[`F`](from-option.html#F)`, `[`A`](from-option.html#A)`>` |
| [fromTry](from-try.html) | `fun <F, A> Kind<ForTry, `[`A`](from-try.html#A)`>.fromTry(arg1: (`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`) -> `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`): `[`FreeC`](../../arrow.streams.internal/-free-c/index.html)`<`[`F`](from-try.html#F)`, `[`A`](from-try.html#A)`>` |
| [handleError](handle-error.html) | `fun <F, A> Kind<Kind<`[`ForFreeC`](../../arrow.streams.internal/-for-free-c.html)`, `[`F`](handle-error.html#F)`>, `[`A`](handle-error.html#A)`>.handleError(arg1: (`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`) -> `[`A`](handle-error.html#A)`): `[`FreeC`](../../arrow.streams.internal/-free-c/index.html)`<`[`F`](handle-error.html#F)`, `[`A`](handle-error.html#A)`>` |
| [handleErrorWith](handle-error-with.html) | `fun <F, A> Kind<Kind<`[`ForFreeC`](../../arrow.streams.internal/-for-free-c.html)`, `[`F`](handle-error-with.html#F)`>, `[`A`](handle-error-with.html#A)`>.handleErrorWith(arg1: (`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`) -> Kind<Kind<`[`ForFreeC`](../../arrow.streams.internal/-for-free-c.html)`, `[`F`](handle-error-with.html#F)`>, `[`A`](handle-error-with.html#A)`>): `[`FreeC`](../../arrow.streams.internal/-free-c/index.html)`<`[`F`](handle-error-with.html#F)`, `[`A`](handle-error-with.html#A)`>` |

