---
title: FunctorSumInstance - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [FunctorSumInstance](./index.html)

# FunctorSumInstance

`@extension interface FunctorSumInstance<F, G> : Functor<SumPartialOf<`[`F`](index.html#F)`, `[`G`](index.html#G)`>>`

### Functions

| [FF](-f-f.html) | `abstract fun FF(): Functor<`[`F`](index.html#F)`>` |
| [FG](-f-g.html) | `abstract fun FG(): Functor<`[`G`](index.html#G)`>` |
| [map](map.html) | `open fun <A, B> Kind<SumPartialOf<`[`F`](index.html#F)`, `[`G`](index.html#G)`>, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): Sum<`[`F`](index.html#F)`, `[`G`](index.html#G)`, `[`B`](map.html#B)`>` |

