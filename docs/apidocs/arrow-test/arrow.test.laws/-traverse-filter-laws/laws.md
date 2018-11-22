---
title: TraverseFilterLaws.laws - arrow-test
---

[arrow-test](../../index.html) / [arrow.test.laws](../index.html) / [TraverseFilterLaws](index.html) / [laws](./laws.html)

# laws

`fun <F> laws(TF: TraverseFilter<`[`F`](laws.html#F)`>, GA: Applicative<`[`F`](laws.html#F)`>, cf: (`[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`) -> Kind<`[`F`](laws.html#F)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>, EQ: Eq<Kind<`[`F`](laws.html#F)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>>, EQ_NESTED: Eq<Kind<`[`F`](laws.html#F)`, Kind<`[`F`](laws.html#F)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>>> = Eq.any()): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Law`](../-law/index.html)`>`