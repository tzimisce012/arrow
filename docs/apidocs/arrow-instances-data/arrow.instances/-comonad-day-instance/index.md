---
title: ComonadDayInstance - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [ComonadDayInstance](./index.html)

# ComonadDayInstance

`@extension interface ComonadDayInstance<F, G> : Comonad<DayPartialOf<`[`F`](index.html#F)`, `[`G`](index.html#G)`>>`

### Functions

| [CF](-c-f.html) | `abstract fun CF(): Comonad<`[`F`](index.html#F)`>` |
| [CG](-c-g.html) | `abstract fun CG(): Comonad<`[`G`](index.html#G)`>` |
| [coflatMap](coflat-map.html) | `open fun <A, B> DayOf<`[`F`](index.html#F)`, `[`G`](index.html#G)`, `[`A`](coflat-map.html#A)`>.coflatMap(f: (DayOf<`[`F`](index.html#F)`, `[`G`](index.html#G)`, `[`A`](coflat-map.html#A)`>) -> `[`B`](coflat-map.html#B)`): Day<`[`F`](index.html#F)`, `[`G`](index.html#G)`, `[`B`](coflat-map.html#B)`>` |
| [extract](extract.html) | `open fun <A> DayOf<`[`F`](index.html#F)`, `[`G`](index.html#G)`, `[`A`](extract.html#A)`>.extract(): `[`A`](extract.html#A) |
| [map](map.html) | `open fun <A, B> DayOf<`[`F`](index.html#F)`, `[`G`](index.html#G)`, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): Day<`[`F`](index.html#F)`, `[`G`](index.html#G)`, `[`B`](map.html#B)`>` |

### Inheritors

| [DayContext](../-day-context/index.html) | `class DayContext<F, G> : `[`ComonadDayInstance`](./index.html)`<`[`F`](../-day-context/index.html#F)`, `[`G`](../-day-context/index.html#G)`>, `[`ApplicativeDayInstance`](../-applicative-day-instance/index.html)`<`[`F`](../-day-context/index.html#F)`, `[`G`](../-day-context/index.html#G)`>` |

