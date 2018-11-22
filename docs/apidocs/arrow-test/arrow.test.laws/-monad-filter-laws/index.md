---
title: MonadFilterLaws - arrow-test
---

[arrow-test](../../index.html) / [arrow.test.laws](../index.html) / [MonadFilterLaws](./index.html)

# MonadFilterLaws

`object MonadFilterLaws`

### Functions

| [laws](laws.html) | `fun <F> laws(MF: MonadFilter<`[`F`](laws.html#F)`>, cf: (`[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`) -> Kind<`[`F`](laws.html#F)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>, EQ: Eq<Kind<`[`F`](laws.html#F)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>>): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Law`](../-law/index.html)`>` |
| [monadFilterBindWithFilterComprehensions](monad-filter-bind-with-filter-comprehensions.html) | `fun <F> MonadFilter<`[`F`](monad-filter-bind-with-filter-comprehensions.html#F)`>.monadFilterBindWithFilterComprehensions(EQ: Eq<Kind<`[`F`](monad-filter-bind-with-filter-comprehensions.html#F)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [monadFilterConsistency](monad-filter-consistency.html) | `fun <F> MonadFilter<`[`F`](monad-filter-consistency.html#F)`>.monadFilterConsistency(cf: (`[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`) -> Kind<`[`F`](monad-filter-consistency.html#F)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>, EQ: Eq<Kind<`[`F`](monad-filter-consistency.html#F)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [monadFilterEmptyComprehensions](monad-filter-empty-comprehensions.html) | `fun <F> MonadFilter<`[`F`](monad-filter-empty-comprehensions.html#F)`>.monadFilterEmptyComprehensions(EQ: Eq<Kind<`[`F`](monad-filter-empty-comprehensions.html#F)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [monadFilterLeftEmpty](monad-filter-left-empty.html) | `fun <F> MonadFilter<`[`F`](monad-filter-left-empty.html#F)`>.monadFilterLeftEmpty(EQ: Eq<Kind<`[`F`](monad-filter-left-empty.html#F)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [monadFilterRightEmpty](monad-filter-right-empty.html) | `fun <F> MonadFilter<`[`F`](monad-filter-right-empty.html#F)`>.monadFilterRightEmpty(EQ: Eq<Kind<`[`F`](monad-filter-right-empty.html#F)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |

