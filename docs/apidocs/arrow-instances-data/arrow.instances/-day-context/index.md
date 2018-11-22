---
title: DayContext - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [DayContext](./index.html)

# DayContext

`class DayContext<F, G> : `[`ComonadDayInstance`](../-comonad-day-instance/index.html)`<`[`F`](index.html#F)`, `[`G`](index.html#G)`>, `[`ApplicativeDayInstance`](../-applicative-day-instance/index.html)`<`[`F`](index.html#F)`, `[`G`](index.html#G)`>`

### Constructors

| [&lt;init&gt;](-init-.html) | `DayContext(AF: Applicative<`[`F`](index.html#F)`>, AG: Applicative<`[`G`](index.html#G)`>, CF: Comonad<`[`F`](index.html#F)`>, CG: Comonad<`[`G`](index.html#G)`>)` |

### Properties

| [AF](-a-f.html) | `val AF: Applicative<`[`F`](index.html#F)`>` |
| [AG](-a-g.html) | `val AG: Applicative<`[`G`](index.html#G)`>` |
| [CF](-c-f.html) | `val CF: Comonad<`[`F`](index.html#F)`>` |
| [CG](-c-g.html) | `val CG: Comonad<`[`G`](index.html#G)`>` |

### Functions

| [AF](-a-f.html) | `fun AF(): Applicative<`[`F`](index.html#F)`>` |
| [AG](-a-g.html) | `fun AG(): Applicative<`[`G`](index.html#G)`>` |
| [CF](-c-f.html) | `fun CF(): Comonad<`[`F`](index.html#F)`>` |
| [CG](-c-g.html) | `fun CG(): Comonad<`[`G`](index.html#G)`>` |
| [map](map.html) | `fun <A, B> DayOf<`[`F`](index.html#F)`, `[`G`](index.html#G)`, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): Day<`[`F`](index.html#F)`, `[`G`](index.html#G)`, `[`B`](map.html#B)`>` |

### Inherited Functions

| [ap](../-applicative-day-instance/ap.html) | `open fun <A, B> Kind<DayPartialOf<`[`F`](../-applicative-day-instance/index.html#F)`, `[`G`](../-applicative-day-instance/index.html#G)`>, `[`A`](../-applicative-day-instance/ap.html#A)`>.ap(ff: Kind<DayPartialOf<`[`F`](../-applicative-day-instance/index.html#F)`, `[`G`](../-applicative-day-instance/index.html#G)`>, (`[`A`](../-applicative-day-instance/ap.html#A)`) -> `[`B`](../-applicative-day-instance/ap.html#B)`>): Day<`[`F`](../-applicative-day-instance/index.html#F)`, `[`G`](../-applicative-day-instance/index.html#G)`, `[`B`](../-applicative-day-instance/ap.html#B)`>` |
| [coflatMap](../-comonad-day-instance/coflat-map.html) | `open fun <A, B> DayOf<`[`F`](../-comonad-day-instance/index.html#F)`, `[`G`](../-comonad-day-instance/index.html#G)`, `[`A`](../-comonad-day-instance/coflat-map.html#A)`>.coflatMap(f: (DayOf<`[`F`](../-comonad-day-instance/index.html#F)`, `[`G`](../-comonad-day-instance/index.html#G)`, `[`A`](../-comonad-day-instance/coflat-map.html#A)`>) -> `[`B`](../-comonad-day-instance/coflat-map.html#B)`): Day<`[`F`](../-comonad-day-instance/index.html#F)`, `[`G`](../-comonad-day-instance/index.html#G)`, `[`B`](../-comonad-day-instance/coflat-map.html#B)`>` |
| [extract](../-comonad-day-instance/extract.html) | `open fun <A> DayOf<`[`F`](../-comonad-day-instance/index.html#F)`, `[`G`](../-comonad-day-instance/index.html#G)`, `[`A`](../-comonad-day-instance/extract.html#A)`>.extract(): `[`A`](../-comonad-day-instance/extract.html#A) |
| [just](../-applicative-day-instance/just.html) | `open fun <A> just(a: `[`A`](../-applicative-day-instance/just.html#A)`): Day<`[`F`](../-applicative-day-instance/index.html#F)`, `[`G`](../-applicative-day-instance/index.html#G)`, `[`A`](../-applicative-day-instance/just.html#A)`>` |

