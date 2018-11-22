---
title: OptionTTraverseFilterInstance - arrow-mtl
---

[arrow-mtl](../../index.html) / [arrow.mtl.instances](../index.html) / [OptionTTraverseFilterInstance](./index.html)

# OptionTTraverseFilterInstance

`@extension interface OptionTTraverseFilterInstance<F> : `[`TraverseFilter`](../../arrow.mtl.typeclasses/-traverse-filter/index.html)`<OptionTPartialOf<`[`F`](index.html#F)`>>, OptionTTraverseInstance<`[`F`](index.html#F)`>`

### Functions

| [FFF](-f-f-f.html) | `abstract fun FFF(): `[`TraverseFilter`](../../arrow.mtl.typeclasses/-traverse-filter/index.html)`<`[`F`](index.html#F)`>` |
| [FFT](-f-f-t.html) | `open fun FFT(): Traverse<`[`F`](index.html#F)`>` |
| [traverseFilter](traverse-filter.html) | `open fun <G, A, B> Kind<OptionTPartialOf<`[`F`](index.html#F)`>, `[`A`](traverse-filter.html#A)`>.traverseFilter(AP: Applicative<`[`G`](traverse-filter.html#G)`>, f: (`[`A`](traverse-filter.html#A)`) -> Kind<`[`G`](traverse-filter.html#G)`, Option<`[`B`](traverse-filter.html#B)`>>): Kind<`[`G`](traverse-filter.html#G)`, OptionT<`[`F`](index.html#F)`, `[`B`](traverse-filter.html#B)`>>` |

### Inherited Functions

| [filter](../../arrow.mtl.typeclasses/-traverse-filter/filter.html) | `open fun <A> Kind<`[`F`](../../arrow.mtl.typeclasses/-traverse-filter/index.html#F)`, `[`A`](../../arrow.mtl.typeclasses/-traverse-filter/filter.html#A)`>.filter(f: (`[`A`](../../arrow.mtl.typeclasses/-traverse-filter/filter.html#A)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): Kind<`[`F`](../../arrow.mtl.typeclasses/-traverse-filter/index.html#F)`, `[`A`](../../arrow.mtl.typeclasses/-traverse-filter/filter.html#A)`>`<br>Apply a filter to a structure such that the output structure contains all A elements in the input structure that satisfy the predicate f but none that don't. |
| [filterA](../../arrow.mtl.typeclasses/-traverse-filter/filter-a.html) | `open fun <G, A> Kind<`[`F`](../../arrow.mtl.typeclasses/-traverse-filter/index.html#F)`, `[`A`](../../arrow.mtl.typeclasses/-traverse-filter/filter-a.html#A)`>.filterA(f: (`[`A`](../../arrow.mtl.typeclasses/-traverse-filter/filter-a.html#A)`) -> Kind<`[`G`](../../arrow.mtl.typeclasses/-traverse-filter/filter-a.html#G)`, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>, GA: Applicative<`[`G`](../../arrow.mtl.typeclasses/-traverse-filter/filter-a.html#G)`>): Kind<`[`G`](../../arrow.mtl.typeclasses/-traverse-filter/filter-a.html#G)`, Kind<`[`F`](../../arrow.mtl.typeclasses/-traverse-filter/index.html#F)`, `[`A`](../../arrow.mtl.typeclasses/-traverse-filter/filter-a.html#A)`>>` |
| [mapFilter](../../arrow.mtl.typeclasses/-traverse-filter/map-filter.html) | `open fun <A, B> Kind<`[`F`](../../arrow.mtl.typeclasses/-traverse-filter/index.html#F)`, `[`A`](../../arrow.mtl.typeclasses/-traverse-filter/map-filter.html#A)`>.mapFilter(f: (`[`A`](../../arrow.mtl.typeclasses/-traverse-filter/map-filter.html#A)`) -> Option<`[`B`](../../arrow.mtl.typeclasses/-traverse-filter/map-filter.html#B)`>): Kind<`[`F`](../../arrow.mtl.typeclasses/-traverse-filter/index.html#F)`, `[`B`](../../arrow.mtl.typeclasses/-traverse-filter/map-filter.html#B)`>`<br>A combined map and filter. Filtering is handled via Option instead of Boolean such that the output type B can be different than the input type A. |

### Inheritors

| [OptionTMtlContext](../-option-t-mtl-context/index.html) | `class OptionTMtlContext<F> : OptionTMonadInstance<`[`F`](../-option-t-mtl-context/index.html#F)`>, OptionTMonoidKInstance<`[`F`](../-option-t-mtl-context/index.html#F)`>, `[`OptionTTraverseFilterInstance`](./index.html)`<`[`F`](../-option-t-mtl-context/index.html#F)`>` |

