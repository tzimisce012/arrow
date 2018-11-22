---
title: Tuple2EqInstance - arrow-instances-core
---

[arrow-instances-core](../../index.html) / [arrow.instances](../index.html) / [Tuple2EqInstance](./index.html)

# Tuple2EqInstance

`@extension interface Tuple2EqInstance<A, B> : Eq<Tuple2<`[`A`](index.html#A)`, `[`B`](index.html#B)`>>`

### Functions

| [EQA](-e-q-a.html) | `abstract fun EQA(): Eq<`[`A`](index.html#A)`>` |
| [EQB](-e-q-b.html) | `abstract fun EQB(): Eq<`[`B`](index.html#B)`>` |
| [eqv](eqv.html) | `open fun Tuple2<`[`A`](index.html#A)`, `[`B`](index.html#B)`>.eqv(b: Tuple2<`[`A`](index.html#A)`, `[`B`](index.html#B)`>): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |

### Inheritors

| [Tuple2HashInstance](../-tuple2-hash-instance/index.html) | `interface Tuple2HashInstance<A, B> : Hash<Tuple2<`[`A`](../-tuple2-hash-instance/index.html#A)`, `[`B`](../-tuple2-hash-instance/index.html#B)`>>, `[`Tuple2EqInstance`](./index.html)`<`[`A`](../-tuple2-hash-instance/index.html#A)`, `[`B`](../-tuple2-hash-instance/index.html#B)`>` |

