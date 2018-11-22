---
title: HashSumInstance - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [HashSumInstance](./index.html)

# HashSumInstance

`@extension interface HashSumInstance<F, G, A> : Hash<Sum<`[`F`](index.html#F)`, `[`G`](index.html#G)`, `[`A`](index.html#A)`>>, `[`EqSumInstance`](../-eq-sum-instance/index.html)`<`[`F`](index.html#F)`, `[`G`](index.html#G)`, `[`A`](index.html#A)`>`

### Functions

| [EQF](-e-q-f.html) | `open fun EQF(): Eq<Kind<`[`F`](index.html#F)`, `[`A`](index.html#A)`>>` |
| [EQG](-e-q-g.html) | `open fun EQG(): Eq<Kind<`[`G`](index.html#G)`, `[`A`](index.html#A)`>>` |
| [HF](-h-f.html) | `abstract fun HF(): Hash<Kind<`[`F`](index.html#F)`, `[`A`](index.html#A)`>>` |
| [HG](-h-g.html) | `abstract fun HG(): Hash<Kind<`[`G`](index.html#G)`, `[`A`](index.html#A)`>>` |
| [hash](hash.html) | `open fun Sum<`[`F`](index.html#F)`, `[`G`](index.html#G)`, `[`A`](index.html#A)`>.hash(): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |

