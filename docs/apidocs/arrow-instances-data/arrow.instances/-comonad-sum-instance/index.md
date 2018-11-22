---
title: ComonadSumInstance - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [ComonadSumInstance](./index.html)

# ComonadSumInstance

`@extension interface ComonadSumInstance<F, G> : Comonad<SumPartialOf<`[`F`](index.html#F)`, `[`G`](index.html#G)`>>`

### Functions

| [CF](-c-f.html) | `abstract fun CF(): Comonad<`[`F`](index.html#F)`>` |
| [CG](-c-g.html) | `abstract fun CG(): Comonad<`[`G`](index.html#G)`>` |
| [coflatMap](coflat-map.html) | `open fun <A, B> Kind<SumPartialOf<`[`F`](index.html#F)`, `[`G`](index.html#G)`>, `[`A`](coflat-map.html#A)`>.coflatMap(f: (Kind<SumPartialOf<`[`F`](index.html#F)`, `[`G`](index.html#G)`>, `[`A`](coflat-map.html#A)`>) -> `[`B`](coflat-map.html#B)`): Sum<`[`F`](index.html#F)`, `[`G`](index.html#G)`, `[`B`](coflat-map.html#B)`>` |
| [extract](extract.html) | `open fun <A> Kind<SumPartialOf<`[`F`](index.html#F)`, `[`G`](index.html#G)`>, `[`A`](extract.html#A)`>.extract(): `[`A`](extract.html#A) |
| [map](map.html) | `open fun <A, B> Kind<SumPartialOf<`[`F`](index.html#F)`, `[`G`](index.html#G)`>, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): Sum<`[`F`](index.html#F)`, `[`G`](index.html#G)`, `[`B`](map.html#B)`>` |

### Inheritors

| [SumContext](../-sum-context/index.html) | `class SumContext<F, G> : `[`ComonadSumInstance`](./index.html)`<`[`F`](../-sum-context/index.html#F)`, `[`G`](../-sum-context/index.html#G)`>` |

