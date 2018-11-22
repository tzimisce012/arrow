---
title: MapKSemigroupInstance - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [MapKSemigroupInstance](./index.html)

# MapKSemigroupInstance

`@extension interface MapKSemigroupInstance<K, A> : Semigroup<MapK<`[`K`](index.html#K)`, `[`A`](index.html#A)`>>`

### Functions

| [SG](-s-g.html) | `abstract fun SG(): Semigroup<`[`A`](index.html#A)`>` |
| [combine](combine.html) | `open fun MapK<`[`K`](index.html#K)`, `[`A`](index.html#A)`>.combine(b: MapK<`[`K`](index.html#K)`, `[`A`](index.html#A)`>): MapK<`[`K`](index.html#K)`, `[`A`](index.html#A)`>` |

### Inheritors

| [MapKMonoidInstance](../-map-k-monoid-instance/index.html) | `interface MapKMonoidInstance<K, A> : Monoid<MapK<`[`K`](../-map-k-monoid-instance/index.html#K)`, `[`A`](../-map-k-monoid-instance/index.html#A)`>>, `[`MapKSemigroupInstance`](./index.html)`<`[`K`](../-map-k-monoid-instance/index.html#K)`, `[`A`](../-map-k-monoid-instance/index.html#A)`>` |

