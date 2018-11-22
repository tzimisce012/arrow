---
title: MonadWriterLaws - arrow-test
---

[arrow-test](../../index.html) / [arrow.test.laws](../index.html) / [MonadWriterLaws](./index.html)

# MonadWriterLaws

`object MonadWriterLaws`

### Functions

| [laws](laws.html) | `fun <F, W> laws(MF: Monad<`[`F`](laws.html#F)`>, MW: MonadWriter<`[`F`](laws.html#F)`, `[`W`](laws.html#W)`>, MOW: Monoid<`[`W`](laws.html#W)`>, genW: Gen<`[`W`](laws.html#W)`>, genTupleWA: Gen<Tuple2<`[`W`](laws.html#W)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>>, EqInt: Eq<Kind<`[`F`](laws.html#F)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>>, EqTupleWA: Eq<Kind<`[`F`](laws.html#F)`, Tuple2<`[`W`](laws.html#W)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>>>): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`Law`](../-law/index.html)`>` |
| [monadWriterListenJust](monad-writer-listen-just.html) | `fun <F, W> MonadWriter<`[`F`](monad-writer-listen-just.html#F)`, `[`W`](monad-writer-listen-just.html#W)`>.monadWriterListenJust(MOW: Monoid<`[`W`](monad-writer-listen-just.html#W)`>, EqTupleWA: Eq<Kind<`[`F`](monad-writer-listen-just.html#F)`, Tuple2<`[`W`](monad-writer-listen-just.html#W)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>>>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [monadWriterListenWriter](monad-writer-listen-writer.html) | `fun <F, W> MonadWriter<`[`F`](monad-writer-listen-writer.html#F)`, `[`W`](monad-writer-listen-writer.html#W)`>.monadWriterListenWriter(genTupleWA: Gen<Tuple2<`[`W`](monad-writer-listen-writer.html#W)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>>, EqTupleWA: Eq<Kind<`[`F`](monad-writer-listen-writer.html#F)`, Tuple2<`[`W`](monad-writer-listen-writer.html#W)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>>>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [monadWriterTellFusion](monad-writer-tell-fusion.html) | `fun <F, W> MonadWriter<`[`F`](monad-writer-tell-fusion.html#F)`, `[`W`](monad-writer-tell-fusion.html#W)`>.monadWriterTellFusion(genW: Gen<`[`W`](monad-writer-tell-fusion.html#W)`>, MOW: Monoid<`[`W`](monad-writer-tell-fusion.html#W)`>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |
| [monadWriterWriterJust](monad-writer-writer-just.html) | `fun <F, W> MonadWriter<`[`F`](monad-writer-writer-just.html#F)`, `[`W`](monad-writer-writer-just.html#W)`>.monadWriterWriterJust(MOW: Monoid<`[`W`](monad-writer-writer-just.html#W)`>, EQ: Eq<Kind<`[`F`](monad-writer-writer-just.html#F)`, `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`>>): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |

