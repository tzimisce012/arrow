---
title: AsyncLaws - arrow-test
---

[arrow-test](../../index.html) / [arrow.test.laws](../index.html) / [AsyncLaws](./index.html)

# AsyncLaws

`object AsyncLaws`

### Functions

| [asyncConstructor](async-constructor.html) | `fun <F> Async<`[`F`](async-constructor.html#F)`>.asyncConstructor(EQ: Eq<Kind<`[`F`](async-constructor.html#F)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [asyncError](async-error.html) | `fun <F> Async<`[`F`](async-error.html#F)`>.asyncError(EQ: Eq<Kind<`[`F`](async-error.html#F)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [asyncSuccess](async-success.html) | `fun <F> Async<`[`F`](async-success.html#F)`>.asyncSuccess(EQ: Eq<Kind<`[`F`](async-success.html#F)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [continueOn](continue-on.html) | `fun <F> Async<`[`F`](continue-on.html#F)`>.continueOn(EQ: Eq<Kind<`[`F`](continue-on.html#F)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [continueOnComprehension](continue-on-comprehension.html) | `fun <F> Async<`[`F`](continue-on-comprehension.html#F)`>.continueOnComprehension(EQ: Eq<Kind<`[`F`](continue-on-comprehension.html#F)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [laws](laws.html) | `fun <F> laws(AC: Async<`[`F`](laws.html#F)`>, EQ: Eq<Kind<`[`F`](laws.html#F)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>>, EQ_EITHER: Eq<Kind<`[`F`](laws.html#F)`, Either<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>>>, EQERR: Eq<Kind<`[`F`](laws.html#F)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>> = EQ): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Law`](../-law/index.html)`>` |

