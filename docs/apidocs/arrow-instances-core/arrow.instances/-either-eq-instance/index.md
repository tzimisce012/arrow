---
title: EitherEqInstance - arrow-instances-core
---

[arrow-instances-core](../../index.html) / [arrow.instances](../index.html) / [EitherEqInstance](./index.html)

# EitherEqInstance

`@extension interface EitherEqInstance<in L, in R> : Eq<Either<`[`L`](index.html#L)`, `[`R`](index.html#R)`>>`

### Functions

| [EQL](-e-q-l.html) | `abstract fun EQL(): Eq<`[`L`](index.html#L)`>` |
| [EQR](-e-q-r.html) | `abstract fun EQR(): Eq<`[`R`](index.html#R)`>` |
| [eqv](eqv.html) | `open fun Either<`[`L`](index.html#L)`, `[`R`](index.html#R)`>.eqv(b: Either<`[`L`](index.html#L)`, `[`R`](index.html#R)`>): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |

### Inheritors

| [EitherHashInstance](../-either-hash-instance/index.html) | `interface EitherHashInstance<L, R> : Hash<Either<`[`L`](../-either-hash-instance/index.html#L)`, `[`R`](../-either-hash-instance/index.html#R)`>>, `[`EitherEqInstance`](./index.html)`<`[`L`](../-either-hash-instance/index.html#L)`, `[`R`](../-either-hash-instance/index.html#R)`>` |

