---
title: MonadWriterLaws.laws - arrow-test
---

[arrow-test](../../index.html) / [arrow.test.laws](../index.html) / [MonadWriterLaws](index.html) / [laws](./laws.html)

# laws

`fun <F, W> laws(MF: Monad<`[`F`](laws.html#F)`>, MW: MonadWriter<`[`F`](laws.html#F)`, `[`W`](laws.html#W)`>, MOW: Monoid<`[`W`](laws.html#W)`>, genW: Gen<`[`W`](laws.html#W)`>, genTupleWA: Gen<Tuple2<`[`W`](laws.html#W)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>>, EqInt: Eq<Kind<`[`F`](laws.html#F)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>>, EqTupleWA: Eq<Kind<`[`F`](laws.html#F)`, Tuple2<`[`W`](laws.html#W)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>>>): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Law`](../-law/index.html)`>`