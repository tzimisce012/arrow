---
title: MonoidKLaws - arrow-test
---

[arrow-test](../../index.html) / [arrow.test.laws](../index.html) / [MonoidKLaws](./index.html)

# MonoidKLaws

`object MonoidKLaws`

### Functions

| [laws](laws.html) | `fun <F> laws(SGK: MonoidK<`[`F`](laws.html#F)`>, AP: Applicative<`[`F`](laws.html#F)`>, EQ: Eq<Kind<`[`F`](laws.html#F)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>>): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Law`](../-law/index.html)`>`<br>`fun <F> laws(SGK: MonoidK<`[`F`](laws.html#F)`>, f: (`[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`) -> Kind<`[`F`](laws.html#F)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>, EQ: Eq<Kind<`[`F`](laws.html#F)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>>): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Law`](../-law/index.html)`>` |
| [monoidKFold](monoid-k-fold.html) | `fun <F> MonoidK<`[`F`](monoid-k-fold.html#F)`>.monoidKFold(f: (`[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`) -> Kind<`[`F`](monoid-k-fold.html#F)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>, EQ: Eq<Kind<`[`F`](monoid-k-fold.html#F)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [monoidKLeftIdentity](monoid-k-left-identity.html) | `fun <F> MonoidK<`[`F`](monoid-k-left-identity.html#F)`>.monoidKLeftIdentity(f: (`[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`) -> Kind<`[`F`](monoid-k-left-identity.html#F)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>, EQ: Eq<Kind<`[`F`](monoid-k-left-identity.html#F)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [monoidKRightIdentity](monoid-k-right-identity.html) | `fun <F> MonoidK<`[`F`](monoid-k-right-identity.html#F)`>.monoidKRightIdentity(f: (`[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`) -> Kind<`[`F`](monoid-k-right-identity.html#F)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>, EQ: Eq<Kind<`[`F`](monoid-k-right-identity.html#F)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |

