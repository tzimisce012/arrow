---
title: CoproductContravariantInstance - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [CoproductContravariantInstance](./index.html)

# CoproductContravariantInstance

`@extension interface CoproductContravariantInstance<F, G> : Contravariant<CoproductPartialOf<`[`F`](index.html#F)`, `[`G`](index.html#G)`>>`

### Functions

| [CF](-c-f.html) | `abstract fun CF(): Contravariant<`[`F`](index.html#F)`>` |
| [CG](-c-g.html) | `abstract fun CG(): Contravariant<`[`G`](index.html#G)`>` |
| [contramap](contramap.html) | `open fun <A, B> Kind<CoproductPartialOf<`[`F`](index.html#F)`, `[`G`](index.html#G)`>, `[`A`](contramap.html#A)`>.contramap(f: (`[`B`](contramap.html#B)`) -> `[`A`](contramap.html#A)`): Coproduct<`[`F`](index.html#F)`, `[`G`](index.html#G)`, `[`B`](contramap.html#B)`>` |

