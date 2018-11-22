---
title: TraverseFilter - arrow-mtl
---

[arrow-mtl](../../index.html) / [arrow.mtl.typeclasses](../index.html) / [TraverseFilter](./index.html)

# TraverseFilter

`interface TraverseFilter<F> : Traverse<`[`F`](index.html#F)`>, `[`FunctorFilter`](../-functor-filter/index.html)`<`[`F`](index.html#F)`>`



### Functions

| [filter](filter.html) | `open fun <A> Kind<`[`F`](index.html#F)`, `[`A`](filter.html#A)`>.filter(f: (`[`A`](filter.html#A)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): Kind<`[`F`](index.html#F)`, `[`A`](filter.html#A)`>`<br>Apply a filter to a structure such that the output structure contains all A elements in the input structure that satisfy the predicate f but none that don't. |
| [filterA](filter-a.html) | `open fun <G, A> Kind<`[`F`](index.html#F)`, `[`A`](filter-a.html#A)`>.filterA(f: (`[`A`](filter-a.html#A)`) -> Kind<`[`G`](filter-a.html#G)`, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>, GA: Applicative<`[`G`](filter-a.html#G)`>): Kind<`[`G`](filter-a.html#G)`, Kind<`[`F`](index.html#F)`, `[`A`](filter-a.html#A)`>>` |
| [mapFilter](map-filter.html) | `open fun <A, B> Kind<`[`F`](index.html#F)`, `[`A`](map-filter.html#A)`>.mapFilter(f: (`[`A`](map-filter.html#A)`) -> Option<`[`B`](map-filter.html#B)`>): Kind<`[`F`](index.html#F)`, `[`B`](map-filter.html#B)`>`<br>A combined map and filter. Filtering is handled via Option instead of Boolean such that the output type B can be different than the input type A. |
| [traverseFilter](traverse-filter.html) | `abstract fun <G, A, B> Kind<`[`F`](index.html#F)`, `[`A`](traverse-filter.html#A)`>.traverseFilter(AP: Applicative<`[`G`](traverse-filter.html#G)`>, f: (`[`A`](traverse-filter.html#A)`) -> Kind<`[`G`](traverse-filter.html#G)`, Option<`[`B`](traverse-filter.html#B)`>>): Kind<`[`G`](traverse-filter.html#G)`, Kind<`[`F`](index.html#F)`, `[`B`](traverse-filter.html#B)`>>` |

### Inherited Functions

| [collect](../-functor-filter/collect.html) | `open fun <A, B> Kind<`[`F`](../-functor-filter/index.html#F)`, `[`A`](../-functor-filter/collect.html#A)`>.collect(f: PartialFunction<`[`A`](../-functor-filter/collect.html#A)`, `[`B`](../-functor-filter/collect.html#B)`>): Kind<`[`F`](../-functor-filter/index.html#F)`, `[`B`](../-functor-filter/collect.html#B)`>`<br>Similar to mapFilter but uses a partial function instead of a function that returns an Option. |
| [flattenOption](../-functor-filter/flatten-option.html) | `open fun <A> Kind<`[`F`](../-functor-filter/index.html#F)`, Option<`[`A`](../-functor-filter/flatten-option.html#A)`>>.flattenOption(): Kind<`[`F`](../-functor-filter/index.html#F)`, `[`A`](../-functor-filter/flatten-option.html#A)`>`<br>"Flatten" out a structure by collapsing Options. |

### Inheritors

| [ComposedTraverseFilter](../../arrow.mtl.instances/-composed-traverse-filter/index.html) | `interface ComposedTraverseFilter<F, G> : `[`TraverseFilter`](./index.html)`<Nested<`[`F`](../../arrow.mtl.instances/-composed-traverse-filter/index.html#F)`, `[`G`](../../arrow.mtl.instances/-composed-traverse-filter/index.html#G)`>>, ComposedTraverse<`[`F`](../../arrow.mtl.instances/-composed-traverse-filter/index.html#F)`, `[`G`](../../arrow.mtl.instances/-composed-traverse-filter/index.html#G)`>` |
| [ConstTraverseFilterInstance](../../arrow.mtl.instances/-const-traverse-filter-instance/index.html) | `interface ConstTraverseFilterInstance<X> : `[`TraverseFilter`](./index.html)`<ConstPartialOf<`[`X`](../../arrow.mtl.instances/-const-traverse-filter-instance/index.html#X)`>>, ConstTraverseInstance<`[`X`](../../arrow.mtl.instances/-const-traverse-filter-instance/index.html#X)`>` |
| [OptionTTraverseFilterInstance](../../arrow.mtl.instances/-option-t-traverse-filter-instance/index.html) | `interface OptionTTraverseFilterInstance<F> : `[`TraverseFilter`](./index.html)`<OptionTPartialOf<`[`F`](../../arrow.mtl.instances/-option-t-traverse-filter-instance/index.html#F)`>>, OptionTTraverseInstance<`[`F`](../../arrow.mtl.instances/-option-t-traverse-filter-instance/index.html#F)`>` |
| [OptionTraverseFilterInstance](../../arrow.mtl.instances/-option-traverse-filter-instance/index.html) | `interface OptionTraverseFilterInstance : `[`TraverseFilter`](./index.html)`<ForOption>` |




## Type Class Hierarchy

<canvas id="arrow.mtl.typeclasses-hierarchy-diagram"></canvas>
<script>
  drawNomNomlDiagram('arrow.mtl.typeclasses-hierarchy-diagram', 'arrow.mtl.typeclasses-diagram.nomnol')
</script>

