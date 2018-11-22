---
title: arrow.mtl.instances.listk.functorFilter.arrow.Kind - arrow-mtl
---

[arrow-mtl](../../index.html) / [arrow.mtl.instances.listk.functorFilter](../index.html) / [arrow.Kind](./index.html)

### Extensions for arrow.Kind

| [collect](collect.html) | `fun <A, B> Kind<ForListK, `[`A`](collect.html#A)`>.collect(f: PartialFunction<`[`A`](collect.html#A)`, `[`B`](collect.html#B)`>): ListK<`[`B`](collect.html#B)`>` |
| [filter](filter.html) | `fun <A> Kind<ForListK, `[`A`](filter.html#A)`>.filter(f: (`[`A`](filter.html#A)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): ListK<`[`A`](filter.html#A)`>` |
| [flattenOption](flatten-option.html) | `fun <A> Kind<ForListK, Option<`[`A`](flatten-option.html#A)`>>.flattenOption(): ListK<`[`A`](flatten-option.html#A)`>` |
| [mapFilter](map-filter.html) | `fun <A, B> Kind<ForListK, `[`A`](map-filter.html#A)`>.mapFilter(f: (`[`A`](map-filter.html#A)`) -> Option<`[`B`](map-filter.html#B)`>): ListK<`[`B`](map-filter.html#B)`>` |

