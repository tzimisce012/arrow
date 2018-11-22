---
title: arrow.mtl.instances.sequencek.functorFilter.arrow.Kind - arrow-mtl
---

[arrow-mtl](../../index.html) / [arrow.mtl.instances.sequencek.functorFilter](../index.html) / [arrow.Kind](./index.html)

### Extensions for arrow.Kind

| [collect](collect.html) | `fun <A, B> Kind<ForSequenceK, `[`A`](collect.html#A)`>.collect(f: PartialFunction<`[`A`](collect.html#A)`, `[`B`](collect.html#B)`>): SequenceK<`[`B`](collect.html#B)`>` |
| [filter](filter.html) | `fun <A> Kind<ForSequenceK, `[`A`](filter.html#A)`>.filter(f: (`[`A`](filter.html#A)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): SequenceK<`[`A`](filter.html#A)`>` |
| [flattenOption](flatten-option.html) | `fun <A> Kind<ForSequenceK, Option<`[`A`](flatten-option.html#A)`>>.flattenOption(): SequenceK<`[`A`](flatten-option.html#A)`>` |
| [mapFilter](map-filter.html) | `fun <A, B> Kind<ForSequenceK, `[`A`](map-filter.html#A)`>.mapFilter(f: (`[`A`](map-filter.html#A)`) -> Option<`[`B`](map-filter.html#B)`>): SequenceK<`[`B`](map-filter.html#B)`>` |

