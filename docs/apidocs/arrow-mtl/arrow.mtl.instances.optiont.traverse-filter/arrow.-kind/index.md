---
title: arrow.mtl.instances.optiont.traverseFilter.arrow.Kind - arrow-mtl
---

[arrow-mtl](../../index.html) / [arrow.mtl.instances.optiont.traverseFilter](../index.html) / [arrow.Kind](./index.html)

### Extensions for arrow.Kind

| [filter](filter.html) | `fun <F, A> Kind<Kind<ForOptionT, `[`F`](filter.html#F)`>, `[`A`](filter.html#A)`>.filter(f: (`[`A`](filter.html#A)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`, FFF: `[`TraverseFilter`](../../arrow.mtl.typeclasses/-traverse-filter/index.html)`<`[`F`](filter.html#F)`>): OptionT<`[`F`](filter.html#F)`, `[`A`](filter.html#A)`>` |
| [filterA](filter-a.html) | `fun <F, G, A> Kind<Kind<ForOptionT, `[`F`](filter-a.html#F)`>, `[`A`](filter-a.html#A)`>.filterA(f: (`[`A`](filter-a.html#A)`) -> Kind<`[`G`](filter-a.html#G)`, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>, GA: Applicative<`[`G`](filter-a.html#G)`>, FFF: `[`TraverseFilter`](../../arrow.mtl.typeclasses/-traverse-filter/index.html)`<`[`F`](filter-a.html#F)`>): Kind<`[`G`](filter-a.html#G)`, Kind<Kind<ForOptionT, `[`F`](filter-a.html#F)`>, `[`A`](filter-a.html#A)`>>` |
| [mapFilter](map-filter.html) | `fun <F, A, B> Kind<Kind<ForOptionT, `[`F`](map-filter.html#F)`>, `[`A`](map-filter.html#A)`>.mapFilter(f: (`[`A`](map-filter.html#A)`) -> Option<`[`B`](map-filter.html#B)`>, FFF: `[`TraverseFilter`](../../arrow.mtl.typeclasses/-traverse-filter/index.html)`<`[`F`](map-filter.html#F)`>): OptionT<`[`F`](map-filter.html#F)`, `[`B`](map-filter.html#B)`>` |
| [traverseFilter](traverse-filter.html) | `fun <F, G, A, B> Kind<Kind<ForOptionT, `[`F`](traverse-filter.html#F)`>, `[`A`](traverse-filter.html#A)`>.traverseFilter(AP: Applicative<`[`G`](traverse-filter.html#G)`>, f: (`[`A`](traverse-filter.html#A)`) -> Kind<`[`G`](traverse-filter.html#G)`, Option<`[`B`](traverse-filter.html#B)`>>, FFF: `[`TraverseFilter`](../../arrow.mtl.typeclasses/-traverse-filter/index.html)`<`[`F`](traverse-filter.html#F)`>): Kind<`[`G`](traverse-filter.html#G)`, Kind<Kind<ForOptionT, `[`F`](traverse-filter.html#F)`>, `[`B`](traverse-filter.html#B)`>>` |

