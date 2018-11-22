---
title: MonadFilter - arrow-mtl
---

[arrow-mtl](../../index.html) / [arrow.mtl.typeclasses](../index.html) / [MonadFilter](./index.html)

# MonadFilter

`interface MonadFilter<F> : Monad<`[`F`](index.html#F)`>, `[`FunctorFilter`](../-functor-filter/index.html)`<`[`F`](index.html#F)`>`



### Functions

| [bindingFilter](binding-filter.html) | `open fun <B> bindingFilter(c: suspend `[`MonadFilterContinuation`](../-monad-filter-continuation/index.html)`<`[`F`](index.html#F)`, *>.() -> `[`B`](binding-filter.html#B)`): Kind<`[`F`](index.html#F)`, `[`B`](binding-filter.html#B)`>`<br>Entry point for monad bindings which enables for comprehension. The underlying impl is based on coroutines. A coroutine is initiated and inside [MonadContinuation](#) suspended yielding to [flatMap](#). Once all the flatMap binds are completed the underlying monad is returned from the act of executing the coroutine |
| [empty](empty.html) | `abstract fun <A> empty(): Kind<`[`F`](index.html#F)`, `[`A`](empty.html#A)`>` |
| [mapFilter](map-filter.html) | `open fun <A, B> Kind<`[`F`](index.html#F)`, `[`A`](map-filter.html#A)`>.mapFilter(f: (`[`A`](map-filter.html#A)`) -> Option<`[`B`](map-filter.html#B)`>): Kind<`[`F`](index.html#F)`, `[`B`](map-filter.html#B)`>`<br>A combined map and filter. Filtering is handled via Option instead of Boolean such that the output type B can be different than the input type A. |

### Inherited Functions

| [collect](../-functor-filter/collect.html) | `open fun <A, B> Kind<`[`F`](../-functor-filter/index.html#F)`, `[`A`](../-functor-filter/collect.html#A)`>.collect(f: PartialFunction<`[`A`](../-functor-filter/collect.html#A)`, `[`B`](../-functor-filter/collect.html#B)`>): Kind<`[`F`](../-functor-filter/index.html#F)`, `[`B`](../-functor-filter/collect.html#B)`>`<br>Similar to mapFilter but uses a partial function instead of a function that returns an Option. |
| [filter](../-functor-filter/filter.html) | `open fun <A> Kind<`[`F`](../-functor-filter/index.html#F)`, `[`A`](../-functor-filter/filter.html#A)`>.filter(f: (`[`A`](../-functor-filter/filter.html#A)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): Kind<`[`F`](../-functor-filter/index.html#F)`, `[`A`](../-functor-filter/filter.html#A)`>`<br>Apply a filter to a structure such that the output structure contains all A elements in the input structure that satisfy the predicate f but none that don't. |
| [flattenOption](../-functor-filter/flatten-option.html) | `open fun <A> Kind<`[`F`](../-functor-filter/index.html#F)`, Option<`[`A`](../-functor-filter/flatten-option.html#A)`>>.flattenOption(): Kind<`[`F`](../-functor-filter/index.html#F)`, `[`A`](../-functor-filter/flatten-option.html#A)`>`<br>"Flatten" out a structure by collapsing Options. |

### Inheritors

| [ListKMonadFilterInstance](../../arrow.mtl.instances/-list-k-monad-filter-instance/index.html) | `interface ListKMonadFilterInstance : `[`MonadFilter`](./index.html)`<ForListK>` |
| [MonadCombine](../-monad-combine/index.html) | `interface MonadCombine<F> : `[`MonadFilter`](./index.html)`<`[`F`](../-monad-combine/index.html#F)`>, Alternative<`[`F`](../-monad-combine/index.html#F)`>`<br> |
| [OptionMonadFilterInstance](../../arrow.mtl.instances/-option-monad-filter-instance/index.html) | `interface OptionMonadFilterInstance : `[`MonadFilter`](./index.html)`<ForOption>` |
| [SequenceKMonadFilterInstance](../../arrow.mtl.instances/-sequence-k-monad-filter-instance/index.html) | `interface SequenceKMonadFilterInstance : `[`MonadFilter`](./index.html)`<ForSequenceK>` |
| [WriterTMonadFilterInstance](../../arrow.mtl.instances/-writer-t-monad-filter-instance/index.html) | `interface WriterTMonadFilterInstance<F, W> : `[`MonadFilter`](./index.html)`<WriterTPartialOf<`[`F`](../../arrow.mtl.instances/-writer-t-monad-filter-instance/index.html#F)`, `[`W`](../../arrow.mtl.instances/-writer-t-monad-filter-instance/index.html#W)`>>, WriterTMonadInstance<`[`F`](../../arrow.mtl.instances/-writer-t-monad-filter-instance/index.html#F)`, `[`W`](../../arrow.mtl.instances/-writer-t-monad-filter-instance/index.html#W)`>` |




## Type Class Hierarchy

<canvas id="arrow.mtl.typeclasses-hierarchy-diagram"></canvas>
<script>
  drawNomNomlDiagram('arrow.mtl.typeclasses-hierarchy-diagram', 'arrow.mtl.typeclasses-diagram.nomnol')
</script>

