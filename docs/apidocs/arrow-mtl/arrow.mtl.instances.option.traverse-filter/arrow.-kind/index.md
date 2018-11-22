---
title: arrow.mtl.instances.option.traverseFilter.arrow.Kind - arrow-mtl
---

[arrow-mtl](../../index.html) / [arrow.mtl.instances.option.traverseFilter](../index.html) / [arrow.Kind](./index.html)

### Extensions for arrow.Kind

| [filter](filter.html) | `fun <A> Kind<ForOption, `[`A`](filter.html#A)`>.filter(f: (`[`A`](filter.html#A)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): Option<`[`A`](filter.html#A)`>` |
| [filterA](filter-a.html) | `fun <G, A> Kind<ForOption, `[`A`](filter-a.html#A)`>.filterA(f: (`[`A`](filter-a.html#A)`) -> Kind<`[`G`](filter-a.html#G)`, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>, GA: Applicative<`[`G`](filter-a.html#G)`>): Kind<`[`G`](filter-a.html#G)`, Kind<ForOption, `[`A`](filter-a.html#A)`>>` |
| [mapFilter](map-filter.html) | `fun <A, B> Kind<ForOption, `[`A`](map-filter.html#A)`>.mapFilter(f: (`[`A`](map-filter.html#A)`) -> Option<`[`B`](map-filter.html#B)`>): Option<`[`B`](map-filter.html#B)`>` |
| [traverseFilter](traverse-filter.html) | `fun <G, A, B> Kind<ForOption, `[`A`](traverse-filter.html#A)`>.traverseFilter(AP: Applicative<`[`G`](traverse-filter.html#G)`>, f: (`[`A`](traverse-filter.html#A)`) -> Kind<`[`G`](traverse-filter.html#G)`, Option<`[`B`](traverse-filter.html#B)`>>): Kind<`[`G`](traverse-filter.html#G)`, Kind<ForOption, `[`B`](traverse-filter.html#B)`>>` |

