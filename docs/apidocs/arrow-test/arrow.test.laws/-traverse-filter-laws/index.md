---
title: TraverseFilterLaws - arrow-test
---

[arrow-test](../../index.html) / [arrow.test.laws](../index.html) / [TraverseFilterLaws](./index.html)

# TraverseFilterLaws

`object TraverseFilterLaws`

### Functions

| [filterAconsistentWithTraverseFilter](filter-aconsistent-with-traverse-filter.html) | `fun <F> TraverseFilter<`[`F`](filter-aconsistent-with-traverse-filter.html#F)`>.filterAconsistentWithTraverseFilter(GA: Applicative<`[`F`](filter-aconsistent-with-traverse-filter.html#F)`>, EQ: Eq<Kind<`[`F`](filter-aconsistent-with-traverse-filter.html#F)`, Kind<`[`F`](filter-aconsistent-with-traverse-filter.html#F)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>>> = Eq.any()): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [identityTraverseFilter](identity-traverse-filter.html) | `fun <F> TraverseFilter<`[`F`](identity-traverse-filter.html#F)`>.identityTraverseFilter(GA: Applicative<`[`F`](identity-traverse-filter.html#F)`>, EQ: Eq<Kind<`[`F`](identity-traverse-filter.html#F)`, Kind<`[`F`](identity-traverse-filter.html#F)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>>> = Eq.any()): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [laws](laws.html) | `fun <F> laws(TF: TraverseFilter<`[`F`](laws.html#F)`>, GA: Applicative<`[`F`](laws.html#F)`>, cf: (`[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`) -> Kind<`[`F`](laws.html#F)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>, EQ: Eq<Kind<`[`F`](laws.html#F)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>>, EQ_NESTED: Eq<Kind<`[`F`](laws.html#F)`, Kind<`[`F`](laws.html#F)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>>> = Eq.any()): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Law`](../-law/index.html)`>` |

