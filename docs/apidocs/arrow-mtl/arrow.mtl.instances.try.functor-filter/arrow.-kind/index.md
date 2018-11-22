---
title: arrow.mtl.instances.try.functorFilter.arrow.Kind - arrow-mtl
---

[arrow-mtl](../../index.html) / [arrow.mtl.instances.try.functorFilter](../index.html) / [arrow.Kind](./index.html)

### Extensions for arrow.Kind

| [collect](collect.html) | `fun <A, B> Kind<ForTry, `[`A`](collect.html#A)`>.collect(f: PartialFunction<`[`A`](collect.html#A)`, `[`B`](collect.html#B)`>): Try<`[`B`](collect.html#B)`>` |
| [filter](filter.html) | `fun <A> Kind<ForTry, `[`A`](filter.html#A)`>.filter(f: (`[`A`](filter.html#A)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): Try<`[`A`](filter.html#A)`>` |
| [flattenOption](flatten-option.html) | `fun <A> Kind<ForTry, Option<`[`A`](flatten-option.html#A)`>>.flattenOption(): Try<`[`A`](flatten-option.html#A)`>` |
| [mapFilter](map-filter.html) | `fun <A, B> Kind<ForTry, `[`A`](map-filter.html#A)`>.mapFilter(f: (`[`A`](map-filter.html#A)`) -> Option<`[`B`](map-filter.html#B)`>): Try<`[`B`](map-filter.html#B)`>` |

