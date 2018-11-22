---
title: EitherHashInstance - arrow-instances-core
---

[arrow-instances-core](../../index.html) / [arrow.instances](../index.html) / [EitherHashInstance](./index.html)

# EitherHashInstance

`@extension interface EitherHashInstance<L, R> : Hash<Either<`[`L`](index.html#L)`, `[`R`](index.html#R)`>>, `[`EitherEqInstance`](../-either-eq-instance/index.html)`<`[`L`](index.html#L)`, `[`R`](index.html#R)`>`

### Functions

| [EQL](-e-q-l.html) | `open fun EQL(): Eq<`[`L`](index.html#L)`>` |
| [EQR](-e-q-r.html) | `open fun EQR(): Eq<`[`R`](index.html#R)`>` |
| [HL](-h-l.html) | `abstract fun HL(): Hash<`[`L`](index.html#L)`>` |
| [HR](-h-r.html) | `abstract fun HR(): Hash<`[`R`](index.html#R)`>` |
| [hash](hash.html) | `open fun Either<`[`L`](index.html#L)`, `[`R`](index.html#R)`>.hash(): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |

