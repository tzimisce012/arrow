---
title: arrow.mtl.instances.option.functorFilter.arrow.Kind - arrow-mtl
---

[arrow-mtl](../../index.html) / [arrow.mtl.instances.option.functorFilter](../index.html) / [arrow.Kind](./index.html)

### Extensions for arrow.Kind

| [collect](collect.html) | `fun <A, B> Kind<ForOption, `[`A`](collect.html#A)`>.collect(f: PartialFunction<`[`A`](collect.html#A)`, `[`B`](collect.html#B)`>): Option<`[`B`](collect.html#B)`>` |
| [filter](filter.html) | `fun <A> Kind<ForOption, `[`A`](filter.html#A)`>.filter(f: (`[`A`](filter.html#A)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): Option<`[`A`](filter.html#A)`>` |
| [flattenOption](flatten-option.html) | `fun <A> Kind<ForOption, Option<`[`A`](flatten-option.html#A)`>>.flattenOption(): Option<`[`A`](flatten-option.html#A)`>` |
| [mapFilter](map-filter.html) | `fun <A, B> Kind<ForOption, `[`A`](map-filter.html#A)`>.mapFilter(f: (`[`A`](map-filter.html#A)`) -> Option<`[`B`](map-filter.html#B)`>): Option<`[`B`](map-filter.html#B)`>` |

