---
title: Tuple3EqInstance - arrow-instances-core
---

[arrow-instances-core](../../index.html) / [arrow.instances](../index.html) / [Tuple3EqInstance](./index.html)

# Tuple3EqInstance

`@extension interface Tuple3EqInstance<A, B, C> : Eq<Tuple3<`[`A`](index.html#A)`, `[`B`](index.html#B)`, `[`C`](index.html#C)`>>`

### Functions

| [EQA](-e-q-a.html) | `abstract fun EQA(): Eq<`[`A`](index.html#A)`>` |
| [EQB](-e-q-b.html) | `abstract fun EQB(): Eq<`[`B`](index.html#B)`>` |
| [EQC](-e-q-c.html) | `abstract fun EQC(): Eq<`[`C`](index.html#C)`>` |
| [eqv](eqv.html) | `open fun Tuple3<`[`A`](index.html#A)`, `[`B`](index.html#B)`, `[`C`](index.html#C)`>.eqv(b: Tuple3<`[`A`](index.html#A)`, `[`B`](index.html#B)`, `[`C`](index.html#C)`>): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |

### Inheritors

| [Tuple3HashInstance](../-tuple3-hash-instance/index.html) | `interface Tuple3HashInstance<A, B, C> : Hash<Tuple3<`[`A`](../-tuple3-hash-instance/index.html#A)`, `[`B`](../-tuple3-hash-instance/index.html#B)`, `[`C`](../-tuple3-hash-instance/index.html#C)`>>, `[`Tuple3EqInstance`](./index.html)`<`[`A`](../-tuple3-hash-instance/index.html#A)`, `[`B`](../-tuple3-hash-instance/index.html#B)`, `[`C`](../-tuple3-hash-instance/index.html#C)`>` |

