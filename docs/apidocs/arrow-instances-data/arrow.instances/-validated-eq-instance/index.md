---
title: ValidatedEqInstance - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [ValidatedEqInstance](./index.html)

# ValidatedEqInstance

`@extension interface ValidatedEqInstance<L, R> : Eq<Validated<`[`L`](index.html#L)`, `[`R`](index.html#R)`>>`

### Functions

| [EQL](-e-q-l.html) | `abstract fun EQL(): Eq<`[`L`](index.html#L)`>` |
| [EQR](-e-q-r.html) | `abstract fun EQR(): Eq<`[`R`](index.html#R)`>` |
| [eqv](eqv.html) | `open fun Validated<`[`L`](index.html#L)`, `[`R`](index.html#R)`>.eqv(b: Validated<`[`L`](index.html#L)`, `[`R`](index.html#R)`>): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |

### Inheritors

| [ValidatedHashInstance](../-validated-hash-instance/index.html) | `interface ValidatedHashInstance<L, R> : Hash<Validated<`[`L`](../-validated-hash-instance/index.html#L)`, `[`R`](../-validated-hash-instance/index.html#R)`>>, `[`ValidatedEqInstance`](./index.html)`<`[`L`](../-validated-hash-instance/index.html#L)`, `[`R`](../-validated-hash-instance/index.html#R)`>` |

