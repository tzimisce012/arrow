---
title: MonadLaws - arrow-test
---

[arrow-test](../../index.html) / [arrow.test.laws](../index.html) / [MonadLaws](./index.html)

# MonadLaws

`object MonadLaws`

### Functions

| [equivalentComprehensions](equivalent-comprehensions.html) | `fun <F> Monad<`[`F`](equivalent-comprehensions.html#F)`>.equivalentComprehensions(EQ: Eq<Kind<`[`F`](equivalent-comprehensions.html#F)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [kleisliLeftIdentity](kleisli-left-identity.html) | `fun <F> Monad<`[`F`](kleisli-left-identity.html#F)`>.kleisliLeftIdentity(EQ: Eq<Kind<`[`F`](kleisli-left-identity.html#F)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [kleisliRightIdentity](kleisli-right-identity.html) | `fun <F> Monad<`[`F`](kleisli-right-identity.html#F)`>.kleisliRightIdentity(EQ: Eq<Kind<`[`F`](kleisli-right-identity.html#F)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [laws](laws.html) | `fun <F> laws(M: Monad<`[`F`](laws.html#F)`>, EQ: Eq<Kind<`[`F`](laws.html#F)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>>): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Law`](../-law/index.html)`>` |
| [leftIdentity](left-identity.html) | `fun <F> Monad<`[`F`](left-identity.html#F)`>.leftIdentity(EQ: Eq<Kind<`[`F`](left-identity.html#F)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [mapFlatMapCoherence](map-flat-map-coherence.html) | `fun <F> Monad<`[`F`](map-flat-map-coherence.html#F)`>.mapFlatMapCoherence(EQ: Eq<Kind<`[`F`](map-flat-map-coherence.html#F)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [monadComprehensions](monad-comprehensions.html) | `fun <F> Monad<`[`F`](monad-comprehensions.html#F)`>.monadComprehensions(EQ: Eq<Kind<`[`F`](monad-comprehensions.html#F)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [monadComprehensionsBindInContext](monad-comprehensions-bind-in-context.html) | `fun <F> Monad<`[`F`](monad-comprehensions-bind-in-context.html#F)`>.monadComprehensionsBindInContext(EQ: Eq<Kind<`[`F`](monad-comprehensions-bind-in-context.html#F)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [rightIdentity](right-identity.html) | `fun <F> Monad<`[`F`](right-identity.html#F)`>.rightIdentity(EQ: Eq<Kind<`[`F`](right-identity.html#F)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [stackSafeTestProgram](stack-safe-test-program.html) | `fun <F> Monad<`[`F`](stack-safe-test-program.html#F)`>.stackSafeTestProgram(n: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, stopAt: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`): Free<`[`F`](stack-safe-test-program.html#F)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>` |
| [stackSafety](stack-safety.html) | `fun <F> Monad<`[`F`](stack-safety.html#F)`>.stackSafety(iterations: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)` = 5000, EQ: Eq<Kind<`[`F`](stack-safety.html#F)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [stackSafetyComprehensions](stack-safety-comprehensions.html) | `fun <F> Monad<`[`F`](stack-safety-comprehensions.html#F)`>.stackSafetyComprehensions(iterations: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)` = 5000, EQ: Eq<Kind<`[`F`](stack-safety-comprehensions.html#F)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |

