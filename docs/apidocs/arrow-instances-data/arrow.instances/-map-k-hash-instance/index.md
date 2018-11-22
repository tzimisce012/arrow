---
title: MapKHashInstance - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [MapKHashInstance](./index.html)

# MapKHashInstance

`@extension interface MapKHashInstance<K, A> : Hash<MapK<`[`K`](index.html#K)`, `[`A`](index.html#A)`>>, `[`MapKEqInstance`](../-map-k-eq-instance/index.html)`<`[`K`](index.html#K)`, `[`A`](index.html#A)`>`

### Functions

| [EQA](-e-q-a.html) | `open fun EQA(): Eq<`[`A`](index.html#A)`>` |
| [EQK](-e-q-k.html) | `open fun EQK(): Eq<`[`K`](index.html#K)`>` |
| [HA](-h-a.html) | `abstract fun HA(): Hash<`[`A`](index.html#A)`>` |
| [HK](-h-k.html) | `abstract fun HK(): Hash<`[`K`](index.html#K)`>` |
| [hash](hash.html) | `open fun MapK<`[`K`](index.html#K)`, `[`A`](index.html#A)`>.hash(): `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |

