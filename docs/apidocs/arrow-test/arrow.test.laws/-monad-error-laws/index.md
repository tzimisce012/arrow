---
title: MonadErrorLaws - arrow-test
---

[arrow-test](../../index.html) / [arrow.test.laws](../index.html) / [MonadErrorLaws](./index.html)

# MonadErrorLaws

`object MonadErrorLaws`

### Functions

| [laws](laws.html) | `fun <F> laws(M: MonadError<`[`F`](laws.html#F)`, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>, EQERR: Eq<Kind<`[`F`](laws.html#F)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>>, EQ_EITHER: Eq<Kind<`[`F`](laws.html#F)`, Either<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>>>, EQ: Eq<Kind<`[`F`](laws.html#F)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>> = EQERR): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Law`](../-law/index.html)`>` |
| [monadErrorEnsureConsistency](monad-error-ensure-consistency.html) | `fun <F> MonadError<`[`F`](monad-error-ensure-consistency.html#F)`, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>.monadErrorEnsureConsistency(EQ: Eq<Kind<`[`F`](monad-error-ensure-consistency.html#F)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [monadErrorLeftZero](monad-error-left-zero.html) | `fun <F> MonadError<`[`F`](monad-error-left-zero.html#F)`, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>.monadErrorLeftZero(EQ: Eq<Kind<`[`F`](monad-error-left-zero.html#F)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |

