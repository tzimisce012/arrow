---
title: ConstEqInstance - arrow-instances-core
---

[arrow-instances-core](../../index.html) / [arrow.instances](../index.html) / [ConstEqInstance](./index.html)

# ConstEqInstance

`@extension interface ConstEqInstance<A, T> : Eq<Const<`[`A`](index.html#A)`, `[`T`](index.html#T)`>>`

### Functions

| [EQ](-e-q.html) | `abstract fun EQ(): Eq<`[`A`](index.html#A)`>` |
| [eqv](eqv.html) | `open fun Const<`[`A`](index.html#A)`, `[`T`](index.html#T)`>.eqv(b: Const<`[`A`](index.html#A)`, `[`T`](index.html#T)`>): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |

### Inheritors

| [ConstHashInstance](../-const-hash-instance/index.html) | `interface ConstHashInstance<A, T> : Hash<Const<`[`A`](../-const-hash-instance/index.html#A)`, `[`T`](../-const-hash-instance/index.html#T)`>>, `[`ConstEqInstance`](./index.html)`<`[`A`](../-const-hash-instance/index.html#A)`, `[`T`](../-const-hash-instance/index.html#T)`>` |

