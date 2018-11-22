---
title: SumContext - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [SumContext](./index.html)

# SumContext

`class SumContext<F, G> : `[`ComonadSumInstance`](../-comonad-sum-instance/index.html)`<`[`F`](index.html#F)`, `[`G`](index.html#G)`>`

### Constructors

| [&lt;init&gt;](-init-.html) | `SumContext(CF: Comonad<`[`F`](index.html#F)`>, CG: Comonad<`[`G`](index.html#G)`>)` |

### Properties

| [CF](-c-f.html) | `val CF: Comonad<`[`F`](index.html#F)`>` |
| [CG](-c-g.html) | `val CG: Comonad<`[`G`](index.html#G)`>` |

### Functions

| [CF](-c-f.html) | `fun CF(): Comonad<`[`F`](index.html#F)`>` |
| [CG](-c-g.html) | `fun CG(): Comonad<`[`G`](index.html#G)`>` |

### Inherited Functions

| [coflatMap](../-comonad-sum-instance/coflat-map.html) | `open fun <A, B> Kind<SumPartialOf<`[`F`](../-comonad-sum-instance/index.html#F)`, `[`G`](../-comonad-sum-instance/index.html#G)`>, `[`A`](../-comonad-sum-instance/coflat-map.html#A)`>.coflatMap(f: (Kind<SumPartialOf<`[`F`](../-comonad-sum-instance/index.html#F)`, `[`G`](../-comonad-sum-instance/index.html#G)`>, `[`A`](../-comonad-sum-instance/coflat-map.html#A)`>) -> `[`B`](../-comonad-sum-instance/coflat-map.html#B)`): Sum<`[`F`](../-comonad-sum-instance/index.html#F)`, `[`G`](../-comonad-sum-instance/index.html#G)`, `[`B`](../-comonad-sum-instance/coflat-map.html#B)`>` |
| [extract](../-comonad-sum-instance/extract.html) | `open fun <A> Kind<SumPartialOf<`[`F`](../-comonad-sum-instance/index.html#F)`, `[`G`](../-comonad-sum-instance/index.html#G)`>, `[`A`](../-comonad-sum-instance/extract.html#A)`>.extract(): `[`A`](../-comonad-sum-instance/extract.html#A) |
| [map](../-comonad-sum-instance/map.html) | `open fun <A, B> Kind<SumPartialOf<`[`F`](../-comonad-sum-instance/index.html#F)`, `[`G`](../-comonad-sum-instance/index.html#G)`>, `[`A`](../-comonad-sum-instance/map.html#A)`>.map(f: (`[`A`](../-comonad-sum-instance/map.html#A)`) -> `[`B`](../-comonad-sum-instance/map.html#B)`): Sum<`[`F`](../-comonad-sum-instance/index.html#F)`, `[`G`](../-comonad-sum-instance/index.html#G)`, `[`B`](../-comonad-sum-instance/map.html#B)`>` |

