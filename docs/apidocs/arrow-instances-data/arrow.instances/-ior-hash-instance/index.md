---
title: IorHashInstance - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [IorHashInstance](./index.html)

# IorHashInstance

`@extension interface IorHashInstance<L, R> : Hash<Ior<`[`L`](index.html#L)`, `[`R`](index.html#R)`>>, `[`IorEqInstance`](../-ior-eq-instance/index.html)`<`[`L`](index.html#L)`, `[`R`](index.html#R)`>`

### Functions

| [EQL](-e-q-l.html) | `open fun EQL(): Eq<`[`L`](index.html#L)`>` |
| [EQR](-e-q-r.html) | `open fun EQR(): Eq<`[`R`](index.html#R)`>` |
| [HL](-h-l.html) | `abstract fun HL(): Hash<`[`L`](index.html#L)`>` |
| [HR](-h-r.html) | `abstract fun HR(): Hash<`[`R`](index.html#R)`>` |
| [hash](hash.html) | `open fun Ior<`[`L`](index.html#L)`, `[`R`](index.html#R)`>.hash(): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |

