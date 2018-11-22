---
title: CoproductEqInstance - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [CoproductEqInstance](./index.html)

# CoproductEqInstance

`@extension interface CoproductEqInstance<F, G, A> : Eq<Coproduct<`[`F`](index.html#F)`, `[`G`](index.html#G)`, `[`A`](index.html#A)`>>`

### Functions

| [EQF](-e-q-f.html) | `abstract fun EQF(): Eq<Kind<`[`F`](index.html#F)`, `[`A`](index.html#A)`>>` |
| [EQG](-e-q-g.html) | `abstract fun EQG(): Eq<Kind<`[`G`](index.html#G)`, `[`A`](index.html#A)`>>` |
| [eqv](eqv.html) | `open fun Coproduct<`[`F`](index.html#F)`, `[`G`](index.html#G)`, `[`A`](index.html#A)`>.eqv(b: Coproduct<`[`F`](index.html#F)`, `[`G`](index.html#G)`, `[`A`](index.html#A)`>): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |

### Inheritors

| [CoproductHashInstance](../-coproduct-hash-instance/index.html) | `interface CoproductHashInstance<F, G, A> : Hash<Coproduct<`[`F`](../-coproduct-hash-instance/index.html#F)`, `[`G`](../-coproduct-hash-instance/index.html#G)`, `[`A`](../-coproduct-hash-instance/index.html#A)`>>, `[`CoproductEqInstance`](./index.html)`<`[`F`](../-coproduct-hash-instance/index.html#F)`, `[`G`](../-coproduct-hash-instance/index.html#G)`, `[`A`](../-coproduct-hash-instance/index.html#A)`>` |

