---
title: ComposedFunctorFilter - arrow-mtl
---

[arrow-mtl](../../index.html) / [arrow.mtl.instances](../index.html) / [ComposedFunctorFilter](./index.html)

# ComposedFunctorFilter

`interface ComposedFunctorFilter<F, G> : `[`FunctorFilter`](../../arrow.mtl.typeclasses/-functor-filter/index.html)`<Nested<`[`F`](index.html#F)`, `[`G`](index.html#G)`>>, ComposedFunctor<`[`F`](index.html#F)`, `[`G`](index.html#G)`>`

### Functions

| [F](-f.html) | `abstract fun F(): Functor<`[`F`](index.html#F)`>` |
| [G](-g.html) | `abstract fun G(): `[`FunctorFilter`](../../arrow.mtl.typeclasses/-functor-filter/index.html)`<`[`G`](index.html#G)`>` |
| [mapFilter](map-filter.html) | `open fun <A, B> Kind<Nested<`[`F`](index.html#F)`, `[`G`](index.html#G)`>, `[`A`](map-filter.html#A)`>.mapFilter(f: (`[`A`](map-filter.html#A)`) -> Option<`[`B`](map-filter.html#B)`>): Kind<Nested<`[`F`](index.html#F)`, `[`G`](index.html#G)`>, `[`B`](map-filter.html#B)`>`<br>A combined map and filter. Filtering is handled via Option instead of Boolean such that the output type B can be different than the input type A. |
| [mapFilterC](map-filter-c.html) | `open fun <A, B> mapFilterC(fga: Kind<`[`F`](index.html#F)`, Kind<`[`G`](index.html#G)`, `[`A`](map-filter-c.html#A)`>>, f: (`[`A`](map-filter-c.html#A)`) -> Option<`[`B`](map-filter-c.html#B)`>): Kind<`[`F`](index.html#F)`, Kind<`[`G`](index.html#G)`, `[`B`](map-filter-c.html#B)`>>` |

### Inherited Functions

| [collect](../../arrow.mtl.typeclasses/-functor-filter/collect.html) | `open fun <A, B> Kind<`[`F`](../../arrow.mtl.typeclasses/-functor-filter/index.html#F)`, `[`A`](../../arrow.mtl.typeclasses/-functor-filter/collect.html#A)`>.collect(f: PartialFunction<`[`A`](../../arrow.mtl.typeclasses/-functor-filter/collect.html#A)`, `[`B`](../../arrow.mtl.typeclasses/-functor-filter/collect.html#B)`>): Kind<`[`F`](../../arrow.mtl.typeclasses/-functor-filter/index.html#F)`, `[`B`](../../arrow.mtl.typeclasses/-functor-filter/collect.html#B)`>`<br>Similar to mapFilter but uses a partial function instead of a function that returns an Option. |
| [filter](../../arrow.mtl.typeclasses/-functor-filter/filter.html) | `open fun <A> Kind<`[`F`](../../arrow.mtl.typeclasses/-functor-filter/index.html#F)`, `[`A`](../../arrow.mtl.typeclasses/-functor-filter/filter.html#A)`>.filter(f: (`[`A`](../../arrow.mtl.typeclasses/-functor-filter/filter.html#A)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): Kind<`[`F`](../../arrow.mtl.typeclasses/-functor-filter/index.html#F)`, `[`A`](../../arrow.mtl.typeclasses/-functor-filter/filter.html#A)`>`<br>Apply a filter to a structure such that the output structure contains all A elements in the input structure that satisfy the predicate f but none that don't. |
| [flattenOption](../../arrow.mtl.typeclasses/-functor-filter/flatten-option.html) | `open fun <A> Kind<`[`F`](../../arrow.mtl.typeclasses/-functor-filter/index.html#F)`, Option<`[`A`](../../arrow.mtl.typeclasses/-functor-filter/flatten-option.html#A)`>>.flattenOption(): Kind<`[`F`](../../arrow.mtl.typeclasses/-functor-filter/index.html#F)`, `[`A`](../../arrow.mtl.typeclasses/-functor-filter/flatten-option.html#A)`>`<br>"Flatten" out a structure by collapsing Options. |

### Companion Object Functions

| [invoke](invoke.html) | `operator fun <F, G> invoke(FF: Functor<`[`F`](invoke.html#F)`>, FFG: `[`FunctorFilter`](../../arrow.mtl.typeclasses/-functor-filter/index.html)`<`[`G`](invoke.html#G)`>): `[`ComposedFunctorFilter`](./index.html)`<`[`F`](invoke.html#F)`, `[`G`](invoke.html#G)`>` |

