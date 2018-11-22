---
title: WriterTMtlContext - arrow-mtl
---

[arrow-mtl](../../index.html) / [arrow.mtl.instances](../index.html) / [WriterTMtlContext](./index.html)

# WriterTMtlContext

`class WriterTMtlContext<F, W> : `[`WriterTMonadWriterInstance`](../-writer-t-monad-writer-instance/index.html)`<`[`F`](index.html#F)`, `[`W`](index.html#W)`>`

### Constructors

| [&lt;init&gt;](-init-.html) | `WriterTMtlContext(MF: Monad<`[`F`](index.html#F)`>, MW: Monoid<`[`W`](index.html#W)`>)` |

### Properties

| [MF](-m-f.html) | `val MF: Monad<`[`F`](index.html#F)`>` |
| [MW](-m-w.html) | `val MW: Monoid<`[`W`](index.html#W)`>` |

### Functions

| [FF](-f-f.html) | `fun FF(): Monad<`[`F`](index.html#F)`>` |
| [MF](-m-f.html) | `fun MF(): Monad<`[`F`](index.html#F)`>` |
| [MM](-m-m.html) | `fun MM(): Monoid<`[`W`](index.html#W)`>` |

### Inherited Functions

| [listen](../-writer-t-monad-writer-instance/listen.html) | `open fun <A> Kind<WriterTPartialOf<`[`F`](../-writer-t-monad-writer-instance/index.html#F)`, `[`W`](../-writer-t-monad-writer-instance/index.html#W)`>, `[`A`](../-writer-t-monad-writer-instance/listen.html#A)`>.listen(): Kind<WriterTPartialOf<`[`F`](../-writer-t-monad-writer-instance/index.html#F)`, `[`W`](../-writer-t-monad-writer-instance/index.html#W)`>, Tuple2<`[`W`](../-writer-t-monad-writer-instance/index.html#W)`, `[`A`](../-writer-t-monad-writer-instance/listen.html#A)`>>`<br>Run the effect and pair the accumulator with the result |
| [pass](../-writer-t-monad-writer-instance/pass.html) | `open fun <A> Kind<WriterTPartialOf<`[`F`](../-writer-t-monad-writer-instance/index.html#F)`, `[`W`](../-writer-t-monad-writer-instance/index.html#W)`>, Tuple2<(`[`W`](../-writer-t-monad-writer-instance/index.html#W)`) -> `[`W`](../-writer-t-monad-writer-instance/index.html#W)`, `[`A`](../-writer-t-monad-writer-instance/pass.html#A)`>>.pass(): WriterT<`[`F`](../-writer-t-monad-writer-instance/index.html#F)`, `[`W`](../-writer-t-monad-writer-instance/index.html#W)`, `[`A`](../-writer-t-monad-writer-instance/pass.html#A)`>`<br>Apply the effectful function to the accumulator |
| [tell](../-writer-t-monad-writer-instance/tell.html) | `open fun tell(w: `[`W`](../-writer-t-monad-writer-instance/index.html#W)`): Kind<WriterTPartialOf<`[`F`](../-writer-t-monad-writer-instance/index.html#F)`, `[`W`](../-writer-t-monad-writer-instance/index.html#W)`>, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>`<br>Lift the log into the effect |
| [writer](../-writer-t-monad-writer-instance/writer.html) | `open fun <A> writer(aw: Tuple2<`[`W`](../-writer-t-monad-writer-instance/index.html#W)`, `[`A`](../-writer-t-monad-writer-instance/writer.html#A)`>): WriterT<`[`F`](../-writer-t-monad-writer-instance/index.html#F)`, `[`W`](../-writer-t-monad-writer-instance/index.html#W)`, `[`A`](../-writer-t-monad-writer-instance/writer.html#A)`>`<br>Lift a writer action into the effect |

