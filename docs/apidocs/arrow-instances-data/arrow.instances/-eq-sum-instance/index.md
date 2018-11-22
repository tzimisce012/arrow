---
title: EqSumInstance - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [EqSumInstance](./index.html)

# EqSumInstance

`@extension interface EqSumInstance<F, G, A> : Eq<Sum<`[`F`](index.html#F)`, `[`G`](index.html#G)`, `[`A`](index.html#A)`>>`

### Functions

| [EQF](-e-q-f.html) | `abstract fun EQF(): Eq<Kind<`[`F`](index.html#F)`, `[`A`](index.html#A)`>>` |
| [EQG](-e-q-g.html) | `abstract fun EQG(): Eq<Kind<`[`G`](index.html#G)`, `[`A`](index.html#A)`>>` |
| [eqv](eqv.html) | `open fun Sum<`[`F`](index.html#F)`, `[`G`](index.html#G)`, `[`A`](index.html#A)`>.eqv(b: Sum<`[`F`](index.html#F)`, `[`G`](index.html#G)`, `[`A`](index.html#A)`>): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |

### Inheritors

| [HashSumInstance](../-hash-sum-instance/index.html) | `interface HashSumInstance<F, G, A> : Hash<Sum<`[`F`](../-hash-sum-instance/index.html#F)`, `[`G`](../-hash-sum-instance/index.html#G)`, `[`A`](../-hash-sum-instance/index.html#A)`>>, `[`EqSumInstance`](./index.html)`<`[`F`](../-hash-sum-instance/index.html#F)`, `[`G`](../-hash-sum-instance/index.html#G)`, `[`A`](../-hash-sum-instance/index.html#A)`>` |

