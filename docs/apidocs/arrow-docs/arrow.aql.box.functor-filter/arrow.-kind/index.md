---
title: arrow.aql.box.functorFilter.arrow.Kind - arrow-docs
---

[arrow-docs](../../index.html) / [arrow.aql.box.functorFilter](../index.html) / [arrow.Kind](./index.html)

### Extensions for arrow.Kind

| [collect](collect.html) | `fun <A, B> Kind<`[`ForBox`](../../arrow.aql/-for-box.html)`, `[`A`](collect.html#A)`>.collect(arg1: PartialFunction<`[`A`](collect.html#A)`, `[`B`](collect.html#B)`>): `[`Box`](../../arrow.aql/-box/index.html)`<`[`B`](collect.html#B)`>` |
| [filter](filter.html) | `fun <A> Kind<`[`ForBox`](../../arrow.aql/-for-box.html)`, `[`A`](filter.html#A)`>.filter(arg1: (`[`A`](filter.html#A)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`Box`](../../arrow.aql/-box/index.html)`<`[`A`](filter.html#A)`>` |
| [flattenOption](flatten-option.html) | `fun <A> Kind<`[`ForBox`](../../arrow.aql/-for-box.html)`, Option<`[`A`](flatten-option.html#A)`>>.flattenOption(): `[`Box`](../../arrow.aql/-box/index.html)`<`[`A`](flatten-option.html#A)`>` |
| [mapFilter](map-filter.html) | `fun <A, B> Kind<`[`ForBox`](../../arrow.aql/-for-box.html)`, `[`A`](map-filter.html#A)`>.mapFilter(arg1: (`[`A`](map-filter.html#A)`) -> Option<`[`B`](map-filter.html#B)`>): `[`Box`](../../arrow.aql/-box/index.html)`<`[`B`](map-filter.html#B)`>` |

