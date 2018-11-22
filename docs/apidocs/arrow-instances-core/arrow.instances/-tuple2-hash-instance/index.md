---
title: Tuple2HashInstance - arrow-instances-core
---

[arrow-instances-core](../../index.html) / [arrow.instances](../index.html) / [Tuple2HashInstance](./index.html)

# Tuple2HashInstance

`@extension interface Tuple2HashInstance<A, B> : Hash<Tuple2<`[`A`](index.html#A)`, `[`B`](index.html#B)`>>, `[`Tuple2EqInstance`](../-tuple2-eq-instance/index.html)`<`[`A`](index.html#A)`, `[`B`](index.html#B)`>`

### Functions

| [EQA](-e-q-a.html) | `open fun EQA(): Eq<`[`A`](index.html#A)`>` |
| [EQB](-e-q-b.html) | `open fun EQB(): Eq<`[`B`](index.html#B)`>` |
| [HA](-h-a.html) | `abstract fun HA(): Hash<`[`A`](index.html#A)`>` |
| [HB](-h-b.html) | `abstract fun HB(): Hash<`[`B`](index.html#B)`>` |
| [hash](hash.html) | `open fun Tuple2<`[`A`](index.html#A)`, `[`B`](index.html#B)`>.hash(): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |

