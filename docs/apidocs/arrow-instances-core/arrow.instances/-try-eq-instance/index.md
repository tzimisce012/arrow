---
title: TryEqInstance - arrow-instances-core
---

[arrow-instances-core](../../index.html) / [arrow.instances](../index.html) / [TryEqInstance](./index.html)

# TryEqInstance

`@extension interface TryEqInstance<A> : Eq<Try<`[`A`](index.html#A)`>>`

### Functions

| [EQA](-e-q-a.html) | `abstract fun EQA(): Eq<`[`A`](index.html#A)`>` |
| [EQT](-e-q-t.html) | `abstract fun EQT(): Eq<`[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>` |
| [eqv](eqv.html) | `open fun Try<`[`A`](index.html#A)`>.eqv(b: Try<`[`A`](index.html#A)`>): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |

### Inheritors

| [TryHashInstance](../-try-hash-instance/index.html) | `interface TryHashInstance<A> : Hash<Try<`[`A`](../-try-hash-instance/index.html#A)`>>, `[`TryEqInstance`](./index.html)`<`[`A`](../-try-hash-instance/index.html#A)`>` |

