---
title: CoproductComonadInstance - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [CoproductComonadInstance](./index.html)

# CoproductComonadInstance

`@extension interface CoproductComonadInstance<F, G> : Comonad<CoproductPartialOf<`[`F`](index.html#F)`, `[`G`](index.html#G)`>>`

### Functions

| [CF](-c-f.html) | `abstract fun CF(): Comonad<`[`F`](index.html#F)`>` |
| [CG](-c-g.html) | `abstract fun CG(): Comonad<`[`G`](index.html#G)`>` |
| [coflatMap](coflat-map.html) | `open fun <A, B> Kind<CoproductPartialOf<`[`F`](index.html#F)`, `[`G`](index.html#G)`>, `[`A`](coflat-map.html#A)`>.coflatMap(f: (Kind<CoproductPartialOf<`[`F`](index.html#F)`, `[`G`](index.html#G)`>, `[`A`](coflat-map.html#A)`>) -> `[`B`](coflat-map.html#B)`): Coproduct<`[`F`](index.html#F)`, `[`G`](index.html#G)`, `[`B`](coflat-map.html#B)`>` |
| [extract](extract.html) | `open fun <A> Kind<CoproductPartialOf<`[`F`](index.html#F)`, `[`G`](index.html#G)`>, `[`A`](extract.html#A)`>.extract(): `[`A`](extract.html#A) |
| [map](map.html) | `open fun <A, B> Kind<CoproductPartialOf<`[`F`](index.html#F)`, `[`G`](index.html#G)`>, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): Coproduct<`[`F`](index.html#F)`, `[`G`](index.html#G)`, `[`B`](map.html#B)`>` |

