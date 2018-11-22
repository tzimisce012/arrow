---
title: arrow.mtl.instances - arrow-mtl
---

[arrow-mtl](../index.html) / [arrow.mtl.instances](./index.html)

## Package arrow.mtl.instances

### Types

| [ComposedFunctorFilter](-composed-functor-filter/index.html) | `interface ComposedFunctorFilter<F, G> : `[`FunctorFilter`](../arrow.mtl.typeclasses/-functor-filter/index.html)`<Nested<`[`F`](-composed-functor-filter/index.html#F)`, `[`G`](-composed-functor-filter/index.html#G)`>>, ComposedFunctor<`[`F`](-composed-functor-filter/index.html#F)`, `[`G`](-composed-functor-filter/index.html#G)`>` |
| [ComposedTraverseFilter](-composed-traverse-filter/index.html) | `interface ComposedTraverseFilter<F, G> : `[`TraverseFilter`](../arrow.mtl.typeclasses/-traverse-filter/index.html)`<Nested<`[`F`](-composed-traverse-filter/index.html#F)`, `[`G`](-composed-traverse-filter/index.html#G)`>>, ComposedTraverse<`[`F`](-composed-traverse-filter/index.html#F)`, `[`G`](-composed-traverse-filter/index.html#G)`>` |
| [ConstMtlContext](-const-mtl-context/index.html) | `class ConstMtlContext<A> : ConstApplicativeInstance<`[`A`](-const-mtl-context/index.html#A)`>, `[`ConstTraverseFilterInstance`](-const-traverse-filter-instance/index.html)`<`[`A`](-const-mtl-context/index.html#A)`>` |
| [ConstMtlContextPartiallyApplied](-const-mtl-context-partially-applied/index.html) | `class ConstMtlContextPartiallyApplied<L>` |
| [ConstTraverseFilterInstance](-const-traverse-filter-instance/index.html) | `interface ConstTraverseFilterInstance<X> : `[`TraverseFilter`](../arrow.mtl.typeclasses/-traverse-filter/index.html)`<ConstPartialOf<`[`X`](-const-traverse-filter-instance/index.html#X)`>>, ConstTraverseInstance<`[`X`](-const-traverse-filter-instance/index.html#X)`>` |
| [Function1MonadReaderInstance](-function1-monad-reader-instance/index.html) | `interface Function1MonadReaderInstance<I> : `[`MonadReader`](../arrow.mtl.typeclasses/-monad-reader/index.html)`<Function1PartialOf<`[`I`](-function1-monad-reader-instance/index.html#I)`>, `[`I`](-function1-monad-reader-instance/index.html#I)`>, Function1MonadInstance<`[`I`](-function1-monad-reader-instance/index.html#I)`>` |
| [Function1MtlContext](-function1-mtl-context/index.html) | `class Function1MtlContext<A> : `[`Function1MonadReaderInstance`](-function1-monad-reader-instance/index.html)`<`[`A`](-function1-mtl-context/index.html#A)`>` |
| [Function1MtlContextPartiallyApplied](-function1-mtl-context-partially-applied/index.html) | `class Function1MtlContextPartiallyApplied<L>` |
| [KleisliMonadReaderInstance](-kleisli-monad-reader-instance/index.html) | `interface KleisliMonadReaderInstance<F, D> : `[`MonadReader`](../arrow.mtl.typeclasses/-monad-reader/index.html)`<KleisliPartialOf<`[`F`](-kleisli-monad-reader-instance/index.html#F)`, `[`D`](-kleisli-monad-reader-instance/index.html#D)`>, `[`D`](-kleisli-monad-reader-instance/index.html#D)`>, KleisliMonadInstance<`[`F`](-kleisli-monad-reader-instance/index.html#F)`, `[`D`](-kleisli-monad-reader-instance/index.html#D)`>` |
| [KleisliMtlContext](-kleisli-mtl-context/index.html) | `class KleisliMtlContext<F, D, E> : `[`KleisliMonadReaderInstance`](-kleisli-monad-reader-instance/index.html)`<`[`F`](-kleisli-mtl-context/index.html#F)`, `[`D`](-kleisli-mtl-context/index.html#D)`>, KleisliMonadErrorInstance<`[`F`](-kleisli-mtl-context/index.html#F)`, `[`D`](-kleisli-mtl-context/index.html#D)`, `[`E`](-kleisli-mtl-context/index.html#E)`>` |
| [KleisliMtlContextPartiallyApplied](-kleisli-mtl-context-partially-applied/index.html) | `class KleisliMtlContextPartiallyApplied<F, D, E>` |
| [ListKFunctorFilterInstance](-list-k-functor-filter-instance/index.html) | `interface ListKFunctorFilterInstance : `[`FunctorFilter`](../arrow.mtl.typeclasses/-functor-filter/index.html)`<ForListK>` |
| [ListKMonadCombineInstance](-list-k-monad-combine-instance/index.html) | `interface ListKMonadCombineInstance : `[`MonadCombine`](../arrow.mtl.typeclasses/-monad-combine/index.html)`<ForListK>` |
| [ListKMonadFilterInstance](-list-k-monad-filter-instance/index.html) | `interface ListKMonadFilterInstance : `[`MonadFilter`](../arrow.mtl.typeclasses/-monad-filter/index.html)`<ForListK>` |
| [ListKMtlContext](-list-k-mtl-context/index.html) | `object ListKMtlContext : `[`ListKMonadCombineInstance`](-list-k-monad-combine-instance/index.html)`, ListKTraverseInstance, ListKMonoidKInstance` |
| [NonEmptyListFunctorFilterInstance](-non-empty-list-functor-filter-instance/index.html) | `interface NonEmptyListFunctorFilterInstance : `[`FunctorFilter`](../arrow.mtl.typeclasses/-functor-filter/index.html)`<ForNonEmptyList>` |
| [OptionFunctorFilterInstance](-option-functor-filter-instance/index.html) | `interface OptionFunctorFilterInstance : `[`FunctorFilter`](../arrow.mtl.typeclasses/-functor-filter/index.html)`<ForOption>` |
| [OptionMonadCombineInstance](-option-monad-combine-instance/index.html) | `interface OptionMonadCombineInstance : `[`MonadCombine`](../arrow.mtl.typeclasses/-monad-combine/index.html)`<ForOption>` |
| [OptionMonadFilterInstance](-option-monad-filter-instance/index.html) | `interface OptionMonadFilterInstance : `[`MonadFilter`](../arrow.mtl.typeclasses/-monad-filter/index.html)`<ForOption>` |
| [OptionMtlContext](-option-mtl-context/index.html) | `object OptionMtlContext : `[`OptionMonadCombineInstance`](-option-monad-combine-instance/index.html)`, OptionTraverseInstance, OptionMonoidKInstance` |
| [OptionTFunctorFilterInstance](-option-t-functor-filter-instance/index.html) | `interface OptionTFunctorFilterInstance<F> : `[`FunctorFilter`](../arrow.mtl.typeclasses/-functor-filter/index.html)`<OptionTPartialOf<`[`F`](-option-t-functor-filter-instance/index.html#F)`>>, OptionTFunctorInstance<`[`F`](-option-t-functor-filter-instance/index.html#F)`>` |
| [OptionTMtlContext](-option-t-mtl-context/index.html) | `class OptionTMtlContext<F> : OptionTMonadInstance<`[`F`](-option-t-mtl-context/index.html#F)`>, OptionTMonoidKInstance<`[`F`](-option-t-mtl-context/index.html#F)`>, `[`OptionTTraverseFilterInstance`](-option-t-traverse-filter-instance/index.html)`<`[`F`](-option-t-mtl-context/index.html#F)`>` |
| [OptionTMtlContextPartiallyApplied](-option-t-mtl-context-partially-applied/index.html) | `class OptionTMtlContextPartiallyApplied<F>` |
| [OptionTTraverseFilterInstance](-option-t-traverse-filter-instance/index.html) | `interface OptionTTraverseFilterInstance<F> : `[`TraverseFilter`](../arrow.mtl.typeclasses/-traverse-filter/index.html)`<OptionTPartialOf<`[`F`](-option-t-traverse-filter-instance/index.html#F)`>>, OptionTTraverseInstance<`[`F`](-option-t-traverse-filter-instance/index.html#F)`>` |
| [OptionTraverseFilterInstance](-option-traverse-filter-instance/index.html) | `interface OptionTraverseFilterInstance : `[`TraverseFilter`](../arrow.mtl.typeclasses/-traverse-filter/index.html)`<ForOption>` |
| [SequenceKFunctorFilterInstance](-sequence-k-functor-filter-instance/index.html) | `interface SequenceKFunctorFilterInstance : `[`FunctorFilter`](../arrow.mtl.typeclasses/-functor-filter/index.html)`<ForSequenceK>` |
| [SequenceKMonadCombineInstance](-sequence-k-monad-combine-instance/index.html) | `interface SequenceKMonadCombineInstance : `[`MonadCombine`](../arrow.mtl.typeclasses/-monad-combine/index.html)`<ForSequenceK>` |
| [SequenceKMonadFilterInstance](-sequence-k-monad-filter-instance/index.html) | `interface SequenceKMonadFilterInstance : `[`MonadFilter`](../arrow.mtl.typeclasses/-monad-filter/index.html)`<ForSequenceK>` |
| [SequenceKMtlContext](-sequence-k-mtl-context/index.html) | `object SequenceKMtlContext : `[`SequenceKMonadCombineInstance`](-sequence-k-monad-combine-instance/index.html)`, SequenceKTraverseInstance, SequenceKMonoidKInstance` |
| [StateTMonadCombineInstance](-state-t-monad-combine-instance/index.html) | `interface StateTMonadCombineInstance<F, S> : `[`MonadCombine`](../arrow.mtl.typeclasses/-monad-combine/index.html)`<StateTPartialOf<`[`F`](-state-t-monad-combine-instance/index.html#F)`, `[`S`](-state-t-monad-combine-instance/index.html#S)`>>, StateTMonadInstance<`[`F`](-state-t-monad-combine-instance/index.html#F)`, `[`S`](-state-t-monad-combine-instance/index.html#S)`>, StateTSemigroupKInstance<`[`F`](-state-t-monad-combine-instance/index.html#F)`, `[`S`](-state-t-monad-combine-instance/index.html#S)`>` |
| [StateTMonadStateInstance](-state-t-monad-state-instance/index.html) | `interface StateTMonadStateInstance<F, S> : `[`MonadState`](../arrow.mtl.typeclasses/-monad-state/index.html)`<StateTPartialOf<`[`F`](-state-t-monad-state-instance/index.html#F)`, `[`S`](-state-t-monad-state-instance/index.html#S)`>, `[`S`](-state-t-monad-state-instance/index.html#S)`>, StateTMonadInstance<`[`F`](-state-t-monad-state-instance/index.html#F)`, `[`S`](-state-t-monad-state-instance/index.html#S)`>` |
| [StateTMtlContext](-state-t-mtl-context/index.html) | `class StateTMtlContext<F, S, E> : `[`StateTMonadStateInstance`](-state-t-monad-state-instance/index.html)`<`[`F`](-state-t-mtl-context/index.html#F)`, `[`S`](-state-t-mtl-context/index.html#S)`>, StateTMonadErrorInstance<`[`F`](-state-t-mtl-context/index.html#F)`, `[`S`](-state-t-mtl-context/index.html#S)`, `[`E`](-state-t-mtl-context/index.html#E)`>` |
| [StateTMtlContextPartiallyApplied](-state-t-mtl-context-partially-applied/index.html) | `class StateTMtlContextPartiallyApplied<F, S, E>` |
| [TryFunctorFilterInstance](-try-functor-filter-instance/index.html) | `interface TryFunctorFilterInstance : `[`FunctorFilter`](../arrow.mtl.typeclasses/-functor-filter/index.html)`<ForTry>` |
| [WriterTMonadFilterInstance](-writer-t-monad-filter-instance/index.html) | `interface WriterTMonadFilterInstance<F, W> : `[`MonadFilter`](../arrow.mtl.typeclasses/-monad-filter/index.html)`<WriterTPartialOf<`[`F`](-writer-t-monad-filter-instance/index.html#F)`, `[`W`](-writer-t-monad-filter-instance/index.html#W)`>>, WriterTMonadInstance<`[`F`](-writer-t-monad-filter-instance/index.html#F)`, `[`W`](-writer-t-monad-filter-instance/index.html#W)`>` |
| [WriterTMonadWriterInstance](-writer-t-monad-writer-instance/index.html) | `interface WriterTMonadWriterInstance<F, W> : `[`MonadWriter`](../arrow.mtl.typeclasses/-monad-writer/index.html)`<WriterTPartialOf<`[`F`](-writer-t-monad-writer-instance/index.html#F)`, `[`W`](-writer-t-monad-writer-instance/index.html#W)`>, `[`W`](-writer-t-monad-writer-instance/index.html#W)`>, WriterTMonadInstance<`[`F`](-writer-t-monad-writer-instance/index.html#F)`, `[`W`](-writer-t-monad-writer-instance/index.html#W)`>` |
| [WriterTMtlContext](-writer-t-mtl-context/index.html) | `class WriterTMtlContext<F, W> : `[`WriterTMonadWriterInstance`](-writer-t-monad-writer-instance/index.html)`<`[`F`](-writer-t-mtl-context/index.html#F)`, `[`W`](-writer-t-mtl-context/index.html#W)`>` |
| [WriterTMtlContextPartiallyApplied](-writer-t-mtl-context-partially-applied/index.html) | `class WriterTMtlContextPartiallyApplied<F, W>` |

### Extensions for External Classes

| [arrow.core.ForOption](arrow.core.-for-option/index.html) |  |
| [arrow.data.ForListK](arrow.data.-for-list-k/index.html) |  |
| [arrow.data.ForSequenceK](arrow.data.-for-sequence-k/index.html) |  |
| [arrow.data.OptionT](arrow.data.-option-t/index.html) |  |

### Functions

| [ForConst](-for-const.html) | `fun <L> ForConst(MA: Monoid<`[`L`](-for-const.html#L)`>): `[`ConstMtlContextPartiallyApplied`](-const-mtl-context-partially-applied/index.html)`<`[`L`](-for-const.html#L)`>` |
| [ForForFunction1](-for-for-function1.html) | `fun <L> ForForFunction1(): `[`Function1MtlContextPartiallyApplied`](-function1-mtl-context-partially-applied/index.html)`<`[`L`](-for-for-function1.html#L)`>` |
| [ForKleisli](-for-kleisli.html) | `fun <F, D, E> ForKleisli(MF: MonadError<`[`F`](-for-kleisli.html#F)`, `[`E`](-for-kleisli.html#E)`>): `[`KleisliMtlContextPartiallyApplied`](-kleisli-mtl-context-partially-applied/index.html)`<`[`F`](-for-kleisli.html#F)`, `[`D`](-for-kleisli.html#D)`, `[`E`](-for-kleisli.html#E)`>` |
| [ForOptionT](-for-option-t.html) | `fun <F> ForOptionT(MF: Monad<`[`F`](-for-option-t.html#F)`>, TF: `[`TraverseFilter`](../arrow.mtl.typeclasses/-traverse-filter/index.html)`<`[`F`](-for-option-t.html#F)`>): `[`OptionTMtlContextPartiallyApplied`](-option-t-mtl-context-partially-applied/index.html)`<`[`F`](-for-option-t.html#F)`>` |
| [ForStateT](-for-state-t.html) | `fun <F, S, E> ForStateT(ME: MonadError<`[`F`](-for-state-t.html#F)`, `[`E`](-for-state-t.html#E)`>): `[`StateTMtlContextPartiallyApplied`](-state-t-mtl-context-partially-applied/index.html)`<`[`F`](-for-state-t.html#F)`, `[`S`](-for-state-t.html#S)`, `[`E`](-for-state-t.html#E)`>` |
| [ForWriterT](-for-writer-t.html) | `fun <F, W> ForWriterT(MF: Monad<`[`F`](-for-writer-t.html#F)`>, MW: Monoid<`[`W`](-for-writer-t.html#W)`>): `[`WriterTMtlContextPartiallyApplied`](-writer-t-mtl-context-partially-applied/index.html)`<`[`F`](-for-writer-t.html#F)`, `[`W`](-for-writer-t.html#W)`>` |

