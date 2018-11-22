---
title: Tuple3HashInstance - arrow-instances-core
---

[arrow-instances-core](../../index.html) / [arrow.instances](../index.html) / [Tuple3HashInstance](./index.html)

# Tuple3HashInstance

`@extension interface Tuple3HashInstance<A, B, C> : Hash<Tuple3<`[`A`](index.html#A)`, `[`B`](index.html#B)`, `[`C`](index.html#C)`>>, `[`Tuple3EqInstance`](../-tuple3-eq-instance/index.html)`<`[`A`](index.html#A)`, `[`B`](index.html#B)`, `[`C`](index.html#C)`>`

### Functions

| [EQA](-e-q-a.html) | `open fun EQA(): Eq<`[`A`](index.html#A)`>` |
| [EQB](-e-q-b.html) | `open fun EQB(): Eq<`[`B`](index.html#B)`>` |
| [EQC](-e-q-c.html) | `open fun EQC(): Eq<`[`C`](index.html#C)`>` |
| [HA](-h-a.html) | `abstract fun HA(): Hash<`[`A`](index.html#A)`>` |
| [HB](-h-b.html) | `abstract fun HB(): Hash<`[`B`](index.html#B)`>` |
| [HC](-h-c.html) | `abstract fun HC(): Hash<`[`C`](index.html#C)`>` |
| [hash](hash.html) | `open fun Tuple3<`[`A`](index.html#A)`, `[`B`](index.html#B)`, `[`C`](index.html#C)`>.hash(): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |

