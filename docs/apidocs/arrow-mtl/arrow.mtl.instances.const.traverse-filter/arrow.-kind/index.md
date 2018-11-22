---
title: arrow.mtl.instances.const.traverseFilter.arrow.Kind - arrow-mtl
---

[arrow-mtl](../../index.html) / [arrow.mtl.instances.const.traverseFilter](../index.html) / [arrow.Kind](./index.html)

### Extensions for arrow.Kind

| [filter](filter.html) | `fun <X, A> Kind<Kind<ForConst, `[`X`](filter.html#X)`>, `[`A`](filter.html#A)`>.filter(f: (`[`A`](filter.html#A)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): Const<`[`X`](filter.html#X)`, `[`A`](filter.html#A)`>` |
| [filterA](filter-a.html) | `fun <X, G, A> Kind<Kind<ForConst, `[`X`](filter-a.html#X)`>, `[`A`](filter-a.html#A)`>.filterA(f: (`[`A`](filter-a.html#A)`) -> Kind<`[`G`](filter-a.html#G)`, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>, GA: Applicative<`[`G`](filter-a.html#G)`>): Kind<`[`G`](filter-a.html#G)`, Kind<Kind<ForConst, `[`X`](filter-a.html#X)`>, `[`A`](filter-a.html#A)`>>` |
| [mapFilter](map-filter.html) | `fun <X, A, B> Kind<Kind<ForConst, `[`X`](map-filter.html#X)`>, `[`A`](map-filter.html#A)`>.mapFilter(f: (`[`A`](map-filter.html#A)`) -> Option<`[`B`](map-filter.html#B)`>): Const<`[`X`](map-filter.html#X)`, `[`B`](map-filter.html#B)`>` |
| [traverseFilter](traverse-filter.html) | `fun <X, G, A, B> Kind<Kind<ForConst, `[`X`](traverse-filter.html#X)`>, `[`A`](traverse-filter.html#A)`>.traverseFilter(AP: Applicative<`[`G`](traverse-filter.html#G)`>, f: (`[`A`](traverse-filter.html#A)`) -> Kind<`[`G`](traverse-filter.html#G)`, Option<`[`B`](traverse-filter.html#B)`>>): Kind<`[`G`](traverse-filter.html#G)`, Kind<Kind<ForConst, `[`X`](traverse-filter.html#X)`>, `[`B`](traverse-filter.html#B)`>>` |

