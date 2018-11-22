---
title: MonadDeferLaws - arrow-test
---

[arrow-test](../../index.html) / [arrow.test.laws](../index.html) / [MonadDeferLaws](./index.html)

# MonadDeferLaws

`object MonadDeferLaws`

### Functions

| [asyncBind](async-bind.html) | `fun <F> MonadDefer<`[`F`](async-bind.html#F)`>.asyncBind(EQ: Eq<Kind<`[`F`](async-bind.html#F)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [asyncBindError](async-bind-error.html) | `fun <F> MonadDefer<`[`F`](async-bind-error.html#F)`>.asyncBindError(EQ: Eq<Kind<`[`F`](async-bind-error.html#F)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [asyncBindUnsafe](async-bind-unsafe.html) | `fun <F> MonadDefer<`[`F`](async-bind-unsafe.html#F)`>.asyncBindUnsafe(EQ: Eq<Kind<`[`F`](async-bind-unsafe.html#F)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [asyncBindUnsafeError](async-bind-unsafe-error.html) | `fun <F> MonadDefer<`[`F`](async-bind-unsafe-error.html#F)`>.asyncBindUnsafeError(EQ: Eq<Kind<`[`F`](async-bind-unsafe-error.html#F)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [asyncCancellationAfter](async-cancellation-after.html) | `fun <F> MonadDefer<`[`F`](async-cancellation-after.html#F)`>.asyncCancellationAfter(EQ: Eq<Kind<`[`F`](async-cancellation-after.html#F)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [asyncCancellationBefore](async-cancellation-before.html) | `fun <F> MonadDefer<`[`F`](async-cancellation-before.html#F)`>.asyncCancellationBefore(EQ: Eq<Kind<`[`F`](async-cancellation-before.html#F)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [asyncParallelBind](async-parallel-bind.html) | `fun <F> MonadDefer<`[`F`](async-parallel-bind.html#F)`>.asyncParallelBind(EQ: Eq<Kind<`[`F`](async-parallel-bind.html#F)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [inContextCancellationAfter](in-context-cancellation-after.html) | `fun <F> MonadDefer<`[`F`](in-context-cancellation-after.html#F)`>.inContextCancellationAfter(EQ: Eq<Kind<`[`F`](in-context-cancellation-after.html#F)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [inContextCancellationBefore](in-context-cancellation-before.html) | `fun <F> MonadDefer<`[`F`](in-context-cancellation-before.html#F)`>.inContextCancellationBefore(EQ: Eq<Kind<`[`F`](in-context-cancellation-before.html#F)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [inContextErrorThrow](in-context-error-throw.html) | `fun <F> MonadDefer<`[`F`](in-context-error-throw.html#F)`>.inContextErrorThrow(EQ: Eq<Kind<`[`F`](in-context-error-throw.html#F)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [laws](laws.html) | `fun <F> laws(SC: MonadDefer<`[`F`](laws.html#F)`>, EQ: Eq<Kind<`[`F`](laws.html#F)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>>, EQ_EITHER: Eq<Kind<`[`F`](laws.html#F)`, Either<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>>>, EQERR: Eq<Kind<`[`F`](laws.html#F)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>> = EQ): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Law`](../-law/index.html)`>` |
| [monadComprehensionsBindInContextEquivalent](monad-comprehensions-bind-in-context-equivalent.html) | `fun <F> MonadDefer<`[`F`](monad-comprehensions-bind-in-context-equivalent.html#F)`>.monadComprehensionsBindInContextEquivalent(EQ: Eq<Kind<`[`F`](monad-comprehensions-bind-in-context-equivalent.html#F)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |

