---
title: IorEqInstance - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [IorEqInstance](./index.html)

# IorEqInstance

`@extension interface IorEqInstance<L, R> : Eq<Ior<`[`L`](index.html#L)`, `[`R`](index.html#R)`>>`

### Functions

| [EQL](-e-q-l.html) | `abstract fun EQL(): Eq<`[`L`](index.html#L)`>` |
| [EQR](-e-q-r.html) | `abstract fun EQR(): Eq<`[`R`](index.html#R)`>` |
| [eqv](eqv.html) | `open fun Ior<`[`L`](index.html#L)`, `[`R`](index.html#R)`>.eqv(b: Ior<`[`L`](index.html#L)`, `[`R`](index.html#R)`>): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |

### Inheritors

| [IorHashInstance](../-ior-hash-instance/index.html) | `interface IorHashInstance<L, R> : Hash<Ior<`[`L`](../-ior-hash-instance/index.html#L)`, `[`R`](../-ior-hash-instance/index.html#R)`>>, `[`IorEqInstance`](./index.html)`<`[`L`](../-ior-hash-instance/index.html#L)`, `[`R`](../-ior-hash-instance/index.html#R)`>` |

