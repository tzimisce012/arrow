---
title: OptionTraverseFilterInstance - arrow-mtl
---

[arrow-mtl](../../index.html) / [arrow.mtl.instances](../index.html) / [OptionTraverseFilterInstance](./index.html)

# OptionTraverseFilterInstance

`@extension interface OptionTraverseFilterInstance : `[`TraverseFilter`](../../arrow.mtl.typeclasses/-traverse-filter/index.html)`<ForOption>`

### Functions

| [exists](exists.html) | `open fun <A> Kind<ForOption, `[`A`](exists.html#A)`>.exists(p: (`[`A`](exists.html#A)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [filter](filter.html) | `open fun <A> Kind<ForOption, `[`A`](filter.html#A)`>.filter(f: (`[`A`](filter.html#A)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): Option<`[`A`](filter.html#A)`>`<br>Apply a filter to a structure such that the output structure contains all A elements in the input structure that satisfy the predicate f but none that don't. |
| [foldLeft](fold-left.html) | `open fun <A, B> Kind<ForOption, `[`A`](fold-left.html#A)`>.foldLeft(b: `[`B`](fold-left.html#B)`, f: (`[`B`](fold-left.html#B)`, `[`A`](fold-left.html#A)`) -> `[`B`](fold-left.html#B)`): `[`B`](fold-left.html#B) |
| [foldRight](fold-right.html) | `open fun <A, B> Kind<ForOption, `[`A`](fold-right.html#A)`>.foldRight(lb: Eval<`[`B`](fold-right.html#B)`>, f: (`[`A`](fold-right.html#A)`, Eval<`[`B`](fold-right.html#B)`>) -> Eval<`[`B`](fold-right.html#B)`>): Eval<`[`B`](fold-right.html#B)`>` |
| [forAll](for-all.html) | `open fun <A> OptionOf<`[`A`](for-all.html#A)`>.forAll(p: (`[`A`](for-all.html#A)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [isEmpty](is-empty.html) | `open fun <A> Kind<ForOption, `[`A`](is-empty.html#A)`>.isEmpty(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [map](map.html) | `open fun <A, B> Kind<ForOption, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): Option<`[`B`](map.html#B)`>` |
| [nonEmpty](non-empty.html) | `open fun <A> Kind<ForOption, `[`A`](non-empty.html#A)`>.nonEmpty(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [traverse](traverse.html) | `open fun <G, A, B> Kind<ForOption, `[`A`](traverse.html#A)`>.traverse(AP: Applicative<`[`G`](traverse.html#G)`>, f: (`[`A`](traverse.html#A)`) -> Kind<`[`G`](traverse.html#G)`, `[`B`](traverse.html#B)`>): Kind<`[`G`](traverse.html#G)`, Option<`[`B`](traverse.html#B)`>>` |
| [traverseFilter](traverse-filter.html) | `open fun <G, A, B> Kind<ForOption, `[`A`](traverse-filter.html#A)`>.traverseFilter(AP: Applicative<`[`G`](traverse-filter.html#G)`>, f: (`[`A`](traverse-filter.html#A)`) -> Kind<`[`G`](traverse-filter.html#G)`, Option<`[`B`](traverse-filter.html#B)`>>): Kind<`[`G`](traverse-filter.html#G)`, Option<`[`B`](traverse-filter.html#B)`>>` |

### Inherited Functions

| [filterA](../../arrow.mtl.typeclasses/-traverse-filter/filter-a.html) | `open fun <G, A> Kind<`[`F`](../../arrow.mtl.typeclasses/-traverse-filter/index.html#F)`, `[`A`](../../arrow.mtl.typeclasses/-traverse-filter/filter-a.html#A)`>.filterA(f: (`[`A`](../../arrow.mtl.typeclasses/-traverse-filter/filter-a.html#A)`) -> Kind<`[`G`](../../arrow.mtl.typeclasses/-traverse-filter/filter-a.html#G)`, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>, GA: Applicative<`[`G`](../../arrow.mtl.typeclasses/-traverse-filter/filter-a.html#G)`>): Kind<`[`G`](../../arrow.mtl.typeclasses/-traverse-filter/filter-a.html#G)`, Kind<`[`F`](../../arrow.mtl.typeclasses/-traverse-filter/index.html#F)`, `[`A`](../../arrow.mtl.typeclasses/-traverse-filter/filter-a.html#A)`>>` |
| [mapFilter](../../arrow.mtl.typeclasses/-traverse-filter/map-filter.html) | `open fun <A, B> Kind<`[`F`](../../arrow.mtl.typeclasses/-traverse-filter/index.html#F)`, `[`A`](../../arrow.mtl.typeclasses/-traverse-filter/map-filter.html#A)`>.mapFilter(f: (`[`A`](../../arrow.mtl.typeclasses/-traverse-filter/map-filter.html#A)`) -> Option<`[`B`](../../arrow.mtl.typeclasses/-traverse-filter/map-filter.html#B)`>): Kind<`[`F`](../../arrow.mtl.typeclasses/-traverse-filter/index.html#F)`, `[`B`](../../arrow.mtl.typeclasses/-traverse-filter/map-filter.html#B)`>`<br>A combined map and filter. Filtering is handled via Option instead of Boolean such that the output type B can be different than the input type A. |

