---
title: SemigroupKLaws.laws - arrow-test
---

[arrow-test](../../index.html) / [arrow.test.laws](../index.html) / [SemigroupKLaws](index.html) / [laws](./laws.html)

# laws

`fun <F> laws(SGK: SemigroupK<`[`F`](laws.html#F)`>, AP: Applicative<`[`F`](laws.html#F)`>, EQ: Eq<Kind<`[`F`](laws.html#F)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>>): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Law`](../-law/index.html)`>`
`fun <F> laws(SGK: SemigroupK<`[`F`](laws.html#F)`>, f: (`[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`) -> Kind<`[`F`](laws.html#F)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>, EQ: Eq<Kind<`[`F`](laws.html#F)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>>): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Law`](../-law/index.html)`>`