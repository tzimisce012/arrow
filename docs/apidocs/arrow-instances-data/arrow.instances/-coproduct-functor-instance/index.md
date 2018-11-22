---
title: CoproductFunctorInstance - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [CoproductFunctorInstance](./index.html)

# CoproductFunctorInstance

`@extension interface CoproductFunctorInstance<F, G> : Functor<CoproductPartialOf<`[`F`](index.html#F)`, `[`G`](index.html#G)`>>`

### Functions

| [FF](-f-f.html) | `abstract fun FF(): Functor<`[`F`](index.html#F)`>` |
| [FG](-f-g.html) | `abstract fun FG(): Functor<`[`G`](index.html#G)`>` |
| [map](map.html) | `open fun <A, B> Kind<CoproductPartialOf<`[`F`](index.html#F)`, `[`G`](index.html#G)`>, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): Coproduct<`[`F`](index.html#F)`, `[`G`](index.html#G)`, `[`B`](map.html#B)`>` |

