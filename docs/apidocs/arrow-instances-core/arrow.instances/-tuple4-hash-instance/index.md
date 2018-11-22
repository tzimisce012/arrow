---
title: Tuple4HashInstance - arrow-instances-core
---

[arrow-instances-core](../../index.html) / [arrow.instances](../index.html) / [Tuple4HashInstance](./index.html)

# Tuple4HashInstance

`@extension interface Tuple4HashInstance<A, B, C, D> : Hash<Tuple4<`[`A`](index.html#A)`, `[`B`](index.html#B)`, `[`C`](index.html#C)`, `[`D`](index.html#D)`>>, `[`Tuple4EqInstance`](../-tuple4-eq-instance/index.html)`<`[`A`](index.html#A)`, `[`B`](index.html#B)`, `[`C`](index.html#C)`, `[`D`](index.html#D)`>`

### Functions

| [EQA](-e-q-a.html) | `open fun EQA(): Eq<`[`A`](index.html#A)`>` |
| [EQB](-e-q-b.html) | `open fun EQB(): Eq<`[`B`](index.html#B)`>` |
| [EQC](-e-q-c.html) | `open fun EQC(): Eq<`[`C`](index.html#C)`>` |
| [EQD](-e-q-d.html) | `open fun EQD(): Eq<`[`D`](index.html#D)`>` |
| [HA](-h-a.html) | `abstract fun HA(): Hash<`[`A`](index.html#A)`>` |
| [HB](-h-b.html) | `abstract fun HB(): Hash<`[`B`](index.html#B)`>` |
| [HC](-h-c.html) | `abstract fun HC(): Hash<`[`C`](index.html#C)`>` |
| [HD](-h-d.html) | `abstract fun HD(): Hash<`[`D`](index.html#D)`>` |
| [hash](hash.html) | `open fun Tuple4<`[`A`](index.html#A)`, `[`B`](index.html#B)`, `[`C`](index.html#C)`, `[`D`](index.html#D)`>.hash(): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |

