---
title: MonadStateLaws - arrow-test
---

[arrow-test](../../index.html) / [arrow.test.laws](../index.html) / [MonadStateLaws](./index.html)

# MonadStateLaws

`object MonadStateLaws`

### Functions

| [laws](laws.html) | `fun <F> laws(M: MonadState<`[`F`](laws.html#F)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>, EQ: Eq<Kind<`[`F`](laws.html#F)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>>, EQUnit: Eq<Kind<`[`F`](laws.html#F)`, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>>): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Law`](../-law/index.html)`>` |
| [monadStateGetIdempotent](monad-state-get-idempotent.html) | `fun <F> MonadState<`[`F`](monad-state-get-idempotent.html#F)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>.monadStateGetIdempotent(EQ: Eq<Kind<`[`F`](monad-state-get-idempotent.html#F)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [monadStateGetSet](monad-state-get-set.html) | `fun <F> MonadState<`[`F`](monad-state-get-set.html#F)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>.monadStateGetSet(EQ: Eq<Kind<`[`F`](monad-state-get-set.html#F)`, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [monadStateSetGet](monad-state-set-get.html) | `fun <F> MonadState<`[`F`](monad-state-set-get.html#F)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>.monadStateSetGet(EQ: Eq<Kind<`[`F`](monad-state-set-get.html#F)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [monadStateSetTwice](monad-state-set-twice.html) | `fun <F> MonadState<`[`F`](monad-state-set-twice.html#F)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>.monadStateSetTwice(EQ: Eq<Kind<`[`F`](monad-state-set-twice.html#F)`, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |

