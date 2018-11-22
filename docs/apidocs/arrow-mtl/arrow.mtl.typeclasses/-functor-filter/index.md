---
title: FunctorFilter - arrow-mtl
---

[arrow-mtl](../../index.html) / [arrow.mtl.typeclasses](../index.html) / [FunctorFilter](./index.html)

# FunctorFilter

`interface FunctorFilter<F> : Functor<`[`F`](index.html#F)`>`



A Functor with the ability to [mapFilter](map-filter.html).
Enables [collect](collect.html) based on [PartialFunction](#) predicates.

### Functions

| [collect](collect.html) | `open fun <A, B> Kind<`[`F`](index.html#F)`, `[`A`](collect.html#A)`>.collect(f: PartialFunction<`[`A`](collect.html#A)`, `[`B`](collect.html#B)`>): Kind<`[`F`](index.html#F)`, `[`B`](collect.html#B)`>`<br>Similar to mapFilter but uses a partial function instead of a function that returns an Option. |
| [filter](filter.html) | `open fun <A> Kind<`[`F`](index.html#F)`, `[`A`](filter.html#A)`>.filter(f: (`[`A`](filter.html#A)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): Kind<`[`F`](index.html#F)`, `[`A`](filter.html#A)`>`<br>Apply a filter to a structure such that the output structure contains all A elements in the input structure that satisfy the predicate f but none that don't. |
| [flattenOption](flatten-option.html) | `open fun <A> Kind<`[`F`](index.html#F)`, Option<`[`A`](flatten-option.html#A)`>>.flattenOption(): Kind<`[`F`](index.html#F)`, `[`A`](flatten-option.html#A)`>`<br>"Flatten" out a structure by collapsing Options. |
| [mapFilter](map-filter.html) | `abstract fun <A, B> Kind<`[`F`](index.html#F)`, `[`A`](map-filter.html#A)`>.mapFilter(f: (`[`A`](map-filter.html#A)`) -> Option<`[`B`](map-filter.html#B)`>): Kind<`[`F`](index.html#F)`, `[`B`](map-filter.html#B)`>`<br>A combined map and filter. Filtering is handled via Option instead of Boolean such that the output type B can be different than the input type A. |

### Inheritors

| [ComposedFunctorFilter](../../arrow.mtl.instances/-composed-functor-filter/index.html) | `interface ComposedFunctorFilter<F, G> : `[`FunctorFilter`](./index.html)`<Nested<`[`F`](../../arrow.mtl.instances/-composed-functor-filter/index.html#F)`, `[`G`](../../arrow.mtl.instances/-composed-functor-filter/index.html#G)`>>, ComposedFunctor<`[`F`](../../arrow.mtl.instances/-composed-functor-filter/index.html#F)`, `[`G`](../../arrow.mtl.instances/-composed-functor-filter/index.html#G)`>` |
| [ListKFunctorFilterInstance](../../arrow.mtl.instances/-list-k-functor-filter-instance/index.html) | `interface ListKFunctorFilterInstance : `[`FunctorFilter`](./index.html)`<ForListK>` |
| [MonadFilter](../-monad-filter/index.html) | `interface MonadFilter<F> : Monad<`[`F`](../-monad-filter/index.html#F)`>, `[`FunctorFilter`](./index.html)`<`[`F`](../-monad-filter/index.html#F)`>`<br> |
| [NonEmptyListFunctorFilterInstance](../../arrow.mtl.instances/-non-empty-list-functor-filter-instance/index.html) | `interface NonEmptyListFunctorFilterInstance : `[`FunctorFilter`](./index.html)`<ForNonEmptyList>` |
| [OptionFunctorFilterInstance](../../arrow.mtl.instances/-option-functor-filter-instance/index.html) | `interface OptionFunctorFilterInstance : `[`FunctorFilter`](./index.html)`<ForOption>` |
| [OptionTFunctorFilterInstance](../../arrow.mtl.instances/-option-t-functor-filter-instance/index.html) | `interface OptionTFunctorFilterInstance<F> : `[`FunctorFilter`](./index.html)`<OptionTPartialOf<`[`F`](../../arrow.mtl.instances/-option-t-functor-filter-instance/index.html#F)`>>, OptionTFunctorInstance<`[`F`](../../arrow.mtl.instances/-option-t-functor-filter-instance/index.html#F)`>` |
| [SequenceKFunctorFilterInstance](../../arrow.mtl.instances/-sequence-k-functor-filter-instance/index.html) | `interface SequenceKFunctorFilterInstance : `[`FunctorFilter`](./index.html)`<ForSequenceK>` |
| [TraverseFilter](../-traverse-filter/index.html) | `interface TraverseFilter<F> : Traverse<`[`F`](../-traverse-filter/index.html#F)`>, `[`FunctorFilter`](./index.html)`<`[`F`](../-traverse-filter/index.html#F)`>`<br> |
| [TryFunctorFilterInstance](../../arrow.mtl.instances/-try-functor-filter-instance/index.html) | `interface TryFunctorFilterInstance : `[`FunctorFilter`](./index.html)`<ForTry>` |




## Type Class Hierarchy

<canvas id="arrow.mtl.typeclasses-hierarchy-diagram"></canvas>
<script>
  drawNomNomlDiagram('arrow.mtl.typeclasses-hierarchy-diagram', 'arrow.mtl.typeclasses-diagram.nomnol')
</script>

