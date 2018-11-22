---
title: WriterTInstances - arrow-dagger
---

[arrow-dagger](../../index.html) / [arrow.dagger.instances](../index.html) / [WriterTInstances](./index.html)

# WriterTInstances

`abstract class WriterTInstances<F, W>`

### Constructors

| [&lt;init&gt;](-init-.html) | `WriterTInstances()` |

### Functions

| [writerTApplicative](writer-t-applicative.html) | `fun writerTApplicative(ev: `[`DaggerWriterTApplicativeInstance`](../-dagger-writer-t-applicative-instance/index.html)`<`[`F`](index.html#F)`, `[`W`](index.html#W)`>): Applicative<WriterTPartialOf<`[`F`](index.html#F)`, `[`W`](index.html#W)`>>` |
| [writerTFunctor](writer-t-functor.html) | `fun writerTFunctor(ev: `[`DaggerWriterTFunctorInstance`](../-dagger-writer-t-functor-instance/index.html)`<`[`F`](index.html#F)`, `[`W`](index.html#W)`>): Functor<WriterTPartialOf<`[`F`](index.html#F)`, `[`W`](index.html#W)`>>` |
| [writerTMonad](writer-t-monad.html) | `fun writerTMonad(ev: `[`DaggerWriterTMonadInstance`](../-dagger-writer-t-monad-instance/index.html)`<`[`F`](index.html#F)`, `[`W`](index.html#W)`>): Monad<WriterTPartialOf<`[`F`](index.html#F)`, `[`W`](index.html#W)`>>` |
| [writerTMonoidK](writer-t-monoid-k.html) | `fun writerTMonoidK(ev: `[`DaggerWriterTSemigroupKInstance`](../-dagger-writer-t-semigroup-k-instance/index.html)`<`[`F`](index.html#F)`, `[`W`](index.html#W)`>): SemigroupK<WriterTPartialOf<`[`F`](index.html#F)`, `[`W`](index.html#W)`>>` |
| [writerTSemigroupK](writer-t-semigroup-k.html) | `fun writerTSemigroupK(ev: `[`DaggerWriterTSemigroupKInstance`](../-dagger-writer-t-semigroup-k-instance/index.html)`<`[`F`](index.html#F)`, `[`W`](index.html#W)`>): SemigroupK<WriterTPartialOf<`[`F`](index.html#F)`, `[`W`](index.html#W)`>>` |

