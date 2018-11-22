---
title: ApplicativeDayInstance - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [ApplicativeDayInstance](./index.html)

# ApplicativeDayInstance

`@extension interface ApplicativeDayInstance<F, G> : Applicative<DayPartialOf<`[`F`](index.html#F)`, `[`G`](index.html#G)`>>`

### Functions

| [AF](-a-f.html) | `abstract fun AF(): Applicative<`[`F`](index.html#F)`>` |
| [AG](-a-g.html) | `abstract fun AG(): Applicative<`[`G`](index.html#G)`>` |
| [ap](ap.html) | `open fun <A, B> Kind<DayPartialOf<`[`F`](index.html#F)`, `[`G`](index.html#G)`>, `[`A`](ap.html#A)`>.ap(ff: Kind<DayPartialOf<`[`F`](index.html#F)`, `[`G`](index.html#G)`>, (`[`A`](ap.html#A)`) -> `[`B`](ap.html#B)`>): Day<`[`F`](index.html#F)`, `[`G`](index.html#G)`, `[`B`](ap.html#B)`>` |
| [just](just.html) | `open fun <A> just(a: `[`A`](just.html#A)`): Day<`[`F`](index.html#F)`, `[`G`](index.html#G)`, `[`A`](just.html#A)`>` |
| [map](map.html) | `open fun <A, B> DayOf<`[`F`](index.html#F)`, `[`G`](index.html#G)`, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): Day<`[`F`](index.html#F)`, `[`G`](index.html#G)`, `[`B`](map.html#B)`>` |

### Inheritors

| [DayContext](../-day-context/index.html) | `class DayContext<F, G> : `[`ComonadDayInstance`](../-comonad-day-instance/index.html)`<`[`F`](../-day-context/index.html#F)`, `[`G`](../-day-context/index.html#G)`>, `[`ApplicativeDayInstance`](./index.html)`<`[`F`](../-day-context/index.html#F)`, `[`G`](../-day-context/index.html#G)`>` |

