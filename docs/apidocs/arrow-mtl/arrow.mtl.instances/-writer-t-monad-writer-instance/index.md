---
title: WriterTMonadWriterInstance - arrow-mtl
---

[arrow-mtl](../../index.html) / [arrow.mtl.instances](../index.html) / [WriterTMonadWriterInstance](./index.html)

# WriterTMonadWriterInstance

`@extension interface WriterTMonadWriterInstance<F, W> : `[`MonadWriter`](../../arrow.mtl.typeclasses/-monad-writer/index.html)`<WriterTPartialOf<`[`F`](index.html#F)`, `[`W`](index.html#W)`>, `[`W`](index.html#W)`>, WriterTMonadInstance<`[`F`](index.html#F)`, `[`W`](index.html#W)`>`

### Functions

| [MF](-m-f.html) | `abstract fun MF(): Monad<`[`F`](index.html#F)`>` |
| [MM](-m-m.html) | `abstract fun MM(): Monoid<`[`W`](index.html#W)`>` |
| [listen](listen.html) | `open fun <A> Kind<WriterTPartialOf<`[`F`](index.html#F)`, `[`W`](index.html#W)`>, `[`A`](listen.html#A)`>.listen(): Kind<WriterTPartialOf<`[`F`](index.html#F)`, `[`W`](index.html#W)`>, Tuple2<`[`W`](index.html#W)`, `[`A`](listen.html#A)`>>`<br>Run the effect and pair the accumulator with the result |
| [pass](pass.html) | `open fun <A> Kind<WriterTPartialOf<`[`F`](index.html#F)`, `[`W`](index.html#W)`>, Tuple2<(`[`W`](index.html#W)`) -> `[`W`](index.html#W)`, `[`A`](pass.html#A)`>>.pass(): WriterT<`[`F`](index.html#F)`, `[`W`](index.html#W)`, `[`A`](pass.html#A)`>`<br>Apply the effectful function to the accumulator |
| [tell](tell.html) | `open fun tell(w: `[`W`](index.html#W)`): Kind<WriterTPartialOf<`[`F`](index.html#F)`, `[`W`](index.html#W)`>, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>`<br>Lift the log into the effect |
| [writer](writer.html) | `open fun <A> writer(aw: Tuple2<`[`W`](index.html#W)`, `[`A`](writer.html#A)`>): WriterT<`[`F`](index.html#F)`, `[`W`](index.html#W)`, `[`A`](writer.html#A)`>`<br>Lift a writer action into the effect |

### Inherited Functions

| [censor](../../arrow.mtl.typeclasses/-monad-writer/censor.html) | `open fun <A> Kind<`[`F`](../../arrow.mtl.typeclasses/-monad-writer/index.html#F)`, `[`A`](../../arrow.mtl.typeclasses/-monad-writer/censor.html#A)`>.censor(f: (`[`W`](../../arrow.mtl.typeclasses/-monad-writer/index.html#W)`) -> `[`W`](../../arrow.mtl.typeclasses/-monad-writer/index.html#W)`): Kind<`[`F`](../../arrow.mtl.typeclasses/-monad-writer/index.html#F)`, `[`A`](../../arrow.mtl.typeclasses/-monad-writer/censor.html#A)`>`<br>Modify the accumulator |
| [listens](../../arrow.mtl.typeclasses/-monad-writer/listens.html) | `open fun <A, B> Kind<`[`F`](../../arrow.mtl.typeclasses/-monad-writer/index.html#F)`, `[`A`](../../arrow.mtl.typeclasses/-monad-writer/listens.html#A)`>.listens(f: (`[`W`](../../arrow.mtl.typeclasses/-monad-writer/index.html#W)`) -> `[`B`](../../arrow.mtl.typeclasses/-monad-writer/listens.html#B)`): Kind<`[`F`](../../arrow.mtl.typeclasses/-monad-writer/index.html#F)`, Tuple2<`[`B`](../../arrow.mtl.typeclasses/-monad-writer/listens.html#B)`, `[`A`](../../arrow.mtl.typeclasses/-monad-writer/listens.html#A)`>>`<br>Pair the value with an inspection of the accumulator |

### Inheritors

| [WriterTMtlContext](../-writer-t-mtl-context/index.html) | `class WriterTMtlContext<F, W> : `[`WriterTMonadWriterInstance`](./index.html)`<`[`F`](../-writer-t-mtl-context/index.html#F)`, `[`W`](../-writer-t-mtl-context/index.html#W)`>` |

