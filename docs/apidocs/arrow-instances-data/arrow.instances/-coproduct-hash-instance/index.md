---
title: CoproductHashInstance - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [CoproductHashInstance](./index.html)

# CoproductHashInstance

`@extension interface CoproductHashInstance<F, G, A> : Hash<Coproduct<`[`F`](index.html#F)`, `[`G`](index.html#G)`, `[`A`](index.html#A)`>>, `[`CoproductEqInstance`](../-coproduct-eq-instance/index.html)`<`[`F`](index.html#F)`, `[`G`](index.html#G)`, `[`A`](index.html#A)`>`

### Functions

| [EQF](-e-q-f.html) | `open fun EQF(): Eq<Kind<`[`F`](index.html#F)`, `[`A`](index.html#A)`>>` |
| [EQG](-e-q-g.html) | `open fun EQG(): Eq<Kind<`[`G`](index.html#G)`, `[`A`](index.html#A)`>>` |
| [HF](-h-f.html) | `abstract fun HF(): Hash<Kind<`[`F`](index.html#F)`, `[`A`](index.html#A)`>>` |
| [HG](-h-g.html) | `abstract fun HG(): Hash<Kind<`[`G`](index.html#G)`, `[`A`](index.html#A)`>>` |
| [hash](hash.html) | `open fun Coproduct<`[`F`](index.html#F)`, `[`G`](index.html#G)`, `[`A`](index.html#A)`>.hash(): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |

