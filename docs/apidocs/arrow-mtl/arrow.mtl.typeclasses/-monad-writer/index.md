---
title: MonadWriter - arrow-mtl
---

[arrow-mtl](../../index.html) / [arrow.mtl.typeclasses](../index.html) / [MonadWriter](./index.html)

# MonadWriter

`interface MonadWriter<F, W> : Monad<`[`F`](index.html#F)`>`


A monad that support monoidal accumulation (e.g. logging List of String)

### Functions

| [censor](censor.html) | `open fun <A> Kind<`[`F`](index.html#F)`, `[`A`](censor.html#A)`>.censor(f: (`[`W`](index.html#W)`) -> `[`W`](index.html#W)`): Kind<`[`F`](index.html#F)`, `[`A`](censor.html#A)`>`<br>Modify the accumulator |
| [listen](listen.html) | `abstract fun <A> Kind<`[`F`](index.html#F)`, `[`A`](listen.html#A)`>.listen(): Kind<`[`F`](index.html#F)`, Tuple2<`[`W`](index.html#W)`, `[`A`](listen.html#A)`>>`<br>Run the effect and pair the accumulator with the result |
| [listens](listens.html) | `open fun <A, B> Kind<`[`F`](index.html#F)`, `[`A`](listens.html#A)`>.listens(f: (`[`W`](index.html#W)`) -> `[`B`](listens.html#B)`): Kind<`[`F`](index.html#F)`, Tuple2<`[`B`](listens.html#B)`, `[`A`](listens.html#A)`>>`<br>Pair the value with an inspection of the accumulator |
| [pass](pass.html) | `abstract fun <A> Kind<`[`F`](index.html#F)`, Tuple2<(`[`W`](index.html#W)`) -> `[`W`](index.html#W)`, `[`A`](pass.html#A)`>>.pass(): Kind<`[`F`](index.html#F)`, `[`A`](pass.html#A)`>`<br>Apply the effectful function to the accumulator |
| [tell](tell.html) | `open fun tell(w: `[`W`](index.html#W)`): Kind<`[`F`](index.html#F)`, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>`<br>Lift the log into the effect |
| [writer](writer.html) | `abstract fun <A> writer(aw: Tuple2<`[`W`](index.html#W)`, `[`A`](writer.html#A)`>): Kind<`[`F`](index.html#F)`, `[`A`](writer.html#A)`>`<br>Lift a writer action into the effect |

### Inheritors

| [WriterTMonadWriterInstance](../../arrow.mtl.instances/-writer-t-monad-writer-instance/index.html) | `interface WriterTMonadWriterInstance<F, W> : `[`MonadWriter`](./index.html)`<WriterTPartialOf<`[`F`](../../arrow.mtl.instances/-writer-t-monad-writer-instance/index.html#F)`, `[`W`](../../arrow.mtl.instances/-writer-t-monad-writer-instance/index.html#W)`>, `[`W`](../../arrow.mtl.instances/-writer-t-monad-writer-instance/index.html#W)`>, WriterTMonadInstance<`[`F`](../../arrow.mtl.instances/-writer-t-monad-writer-instance/index.html#F)`, `[`W`](../../arrow.mtl.instances/-writer-t-monad-writer-instance/index.html#W)`>` |




## Type Class Hierarchy

<canvas id="arrow.mtl.typeclasses-hierarchy-diagram"></canvas>
<script>
  drawNomNomlDiagram('arrow.mtl.typeclasses-hierarchy-diagram', 'arrow.mtl.typeclasses-diagram.nomnol')
</script>

