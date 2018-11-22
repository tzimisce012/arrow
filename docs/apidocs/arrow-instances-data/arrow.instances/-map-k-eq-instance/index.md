---
title: MapKEqInstance - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [MapKEqInstance](./index.html)

# MapKEqInstance

`@extension interface MapKEqInstance<K, A> : Eq<MapK<`[`K`](index.html#K)`, `[`A`](index.html#A)`>>`

### Functions

| [EQA](-e-q-a.html) | `abstract fun EQA(): Eq<`[`A`](index.html#A)`>` |
| [EQK](-e-q-k.html) | `abstract fun EQK(): Eq<`[`K`](index.html#K)`>` |
| [eqv](eqv.html) | `open fun MapK<`[`K`](index.html#K)`, `[`A`](index.html#A)`>.eqv(b: MapK<`[`K`](index.html#K)`, `[`A`](index.html#A)`>): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |

### Inheritors

| [MapKHashInstance](../-map-k-hash-instance/index.html) | `interface MapKHashInstance<K, A> : Hash<MapK<`[`K`](../-map-k-hash-instance/index.html#K)`, `[`A`](../-map-k-hash-instance/index.html#A)`>>, `[`MapKEqInstance`](./index.html)`<`[`K`](../-map-k-hash-instance/index.html#K)`, `[`A`](../-map-k-hash-instance/index.html#A)`>` |

