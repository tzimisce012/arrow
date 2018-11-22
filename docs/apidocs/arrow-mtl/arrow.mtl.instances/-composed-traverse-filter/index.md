---
title: ComposedTraverseFilter - arrow-mtl
---

[arrow-mtl](../../index.html) / [arrow.mtl.instances](../index.html) / [ComposedTraverseFilter](./index.html)

# ComposedTraverseFilter

`interface ComposedTraverseFilter<F, G> : `[`TraverseFilter`](../../arrow.mtl.typeclasses/-traverse-filter/index.html)`<Nested<`[`F`](index.html#F)`, `[`G`](index.html#G)`>>, ComposedTraverse<`[`F`](index.html#F)`, `[`G`](index.html#G)`>`

### Functions

| [FT](-f-t.html) | `abstract fun FT(): Traverse<`[`F`](index.html#F)`>` |
| [GA](-g-a.html) | `abstract fun GA(): Applicative<`[`G`](index.html#G)`>` |
| [GT](-g-t.html) | `abstract fun GT(): `[`TraverseFilter`](../../arrow.mtl.typeclasses/-traverse-filter/index.html)`<`[`G`](index.html#G)`>` |
| [traverseFilter](traverse-filter.html) | `open fun <H, A, B> Kind<Nested<`[`F`](index.html#F)`, `[`G`](index.html#G)`>, `[`A`](traverse-filter.html#A)`>.traverseFilter(AP: Applicative<`[`H`](traverse-filter.html#H)`>, f: (`[`A`](traverse-filter.html#A)`) -> Kind<`[`H`](traverse-filter.html#H)`, Option<`[`B`](traverse-filter.html#B)`>>): Kind<`[`H`](traverse-filter.html#H)`, Kind<Nested<`[`F`](index.html#F)`, `[`G`](index.html#G)`>, `[`B`](traverse-filter.html#B)`>>` |
| [traverseFilterC](traverse-filter-c.html) | `open fun <H, A, B> traverseFilterC(fa: Kind<`[`F`](index.html#F)`, Kind<`[`G`](index.html#G)`, `[`A`](traverse-filter-c.html#A)`>>, f: (`[`A`](traverse-filter-c.html#A)`) -> Kind<`[`H`](traverse-filter-c.html#H)`, Option<`[`B`](traverse-filter-c.html#B)`>>, HA: Applicative<`[`H`](traverse-filter-c.html#H)`>): Kind<`[`H`](traverse-filter-c.html#H)`, Kind<Nested<`[`F`](index.html#F)`, `[`G`](index.html#G)`>, `[`B`](traverse-filter-c.html#B)`>>` |

### Inherited Functions

| [filter](../../arrow.mtl.typeclasses/-traverse-filter/filter.html) | `open fun <A> Kind<`[`F`](../../arrow.mtl.typeclasses/-traverse-filter/index.html#F)`, `[`A`](../../arrow.mtl.typeclasses/-traverse-filter/filter.html#A)`>.filter(f: (`[`A`](../../arrow.mtl.typeclasses/-traverse-filter/filter.html#A)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): Kind<`[`F`](../../arrow.mtl.typeclasses/-traverse-filter/index.html#F)`, `[`A`](../../arrow.mtl.typeclasses/-traverse-filter/filter.html#A)`>`<br>Apply a filter to a structure such that the output structure contains all A elements in the input structure that satisfy the predicate f but none that don't. |
| [filterA](../../arrow.mtl.typeclasses/-traverse-filter/filter-a.html) | `open fun <G, A> Kind<`[`F`](../../arrow.mtl.typeclasses/-traverse-filter/index.html#F)`, `[`A`](../../arrow.mtl.typeclasses/-traverse-filter/filter-a.html#A)`>.filterA(f: (`[`A`](../../arrow.mtl.typeclasses/-traverse-filter/filter-a.html#A)`) -> Kind<`[`G`](../../arrow.mtl.typeclasses/-traverse-filter/filter-a.html#G)`, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>, GA: Applicative<`[`G`](../../arrow.mtl.typeclasses/-traverse-filter/filter-a.html#G)`>): Kind<`[`G`](../../arrow.mtl.typeclasses/-traverse-filter/filter-a.html#G)`, Kind<`[`F`](../../arrow.mtl.typeclasses/-traverse-filter/index.html#F)`, `[`A`](../../arrow.mtl.typeclasses/-traverse-filter/filter-a.html#A)`>>` |
| [mapFilter](../../arrow.mtl.typeclasses/-traverse-filter/map-filter.html) | `open fun <A, B> Kind<`[`F`](../../arrow.mtl.typeclasses/-traverse-filter/index.html#F)`, `[`A`](../../arrow.mtl.typeclasses/-traverse-filter/map-filter.html#A)`>.mapFilter(f: (`[`A`](../../arrow.mtl.typeclasses/-traverse-filter/map-filter.html#A)`) -> Option<`[`B`](../../arrow.mtl.typeclasses/-traverse-filter/map-filter.html#B)`>): Kind<`[`F`](../../arrow.mtl.typeclasses/-traverse-filter/index.html#F)`, `[`B`](../../arrow.mtl.typeclasses/-traverse-filter/map-filter.html#B)`>`<br>A combined map and filter. Filtering is handled via Option instead of Boolean such that the output type B can be different than the input type A. |

### Companion Object Functions

| [invoke](invoke.html) | `operator fun <F, G> invoke(FF: Traverse<`[`F`](invoke.html#F)`>, GF: `[`TraverseFilter`](../../arrow.mtl.typeclasses/-traverse-filter/index.html)`<`[`G`](invoke.html#G)`>, GA: Applicative<`[`G`](invoke.html#G)`>): `[`ComposedTraverseFilter`](./index.html)`<`[`F`](invoke.html#F)`, `[`G`](invoke.html#G)`>` |

