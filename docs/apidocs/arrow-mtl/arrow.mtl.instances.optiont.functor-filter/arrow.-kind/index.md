---
title: arrow.mtl.instances.optiont.functorFilter.arrow.Kind - arrow-mtl
---

[arrow-mtl](../../index.html) / [arrow.mtl.instances.optiont.functorFilter](../index.html) / [arrow.Kind](./index.html)

### Extensions for arrow.Kind

| [collect](collect.html) | `fun <F, A, B> Kind<Kind<ForOptionT, `[`F`](collect.html#F)`>, `[`A`](collect.html#A)`>.collect(f: PartialFunction<`[`A`](collect.html#A)`, `[`B`](collect.html#B)`>, FF: Functor<`[`F`](collect.html#F)`>): OptionT<`[`F`](collect.html#F)`, `[`B`](collect.html#B)`>` |
| [filter](filter.html) | `fun <F, A> Kind<Kind<ForOptionT, `[`F`](filter.html#F)`>, `[`A`](filter.html#A)`>.filter(f: (`[`A`](filter.html#A)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`, FF: Functor<`[`F`](filter.html#F)`>): OptionT<`[`F`](filter.html#F)`, `[`A`](filter.html#A)`>` |
| [flattenOption](flatten-option.html) | `fun <F, A> Kind<Kind<ForOptionT, `[`F`](flatten-option.html#F)`>, Option<`[`A`](flatten-option.html#A)`>>.flattenOption(FF: Functor<`[`F`](flatten-option.html#F)`>): OptionT<`[`F`](flatten-option.html#F)`, `[`A`](flatten-option.html#A)`>` |
| [mapFilter](map-filter.html) | `fun <F, A, B> Kind<Kind<ForOptionT, `[`F`](map-filter.html#F)`>, `[`A`](map-filter.html#A)`>.mapFilter(f: (`[`A`](map-filter.html#A)`) -> Option<`[`B`](map-filter.html#B)`>, FF: Functor<`[`F`](map-filter.html#F)`>): OptionT<`[`F`](map-filter.html#F)`, `[`B`](map-filter.html#B)`>` |

