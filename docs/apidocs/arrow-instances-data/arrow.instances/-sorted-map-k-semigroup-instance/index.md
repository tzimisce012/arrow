---
title: SortedMapKSemigroupInstance - arrow-instances-data
---

[arrow-instances-data](../../index.html) / [arrow.instances](../index.html) / [SortedMapKSemigroupInstance](./index.html)

# SortedMapKSemigroupInstance

`interface SortedMapKSemigroupInstance<A : `[`Comparable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html)`<`[`A`](index.html#A)`>, B> : Semigroup<SortedMapKOf<`[`A`](index.html#A)`, `[`B`](index.html#B)`>>`

### Functions

| [SG](-s-g.html) | `abstract fun SG(): Semigroup<`[`B`](index.html#B)`>` |
| [combine](combine.html) | `open fun SortedMapKOf<`[`A`](index.html#A)`, `[`B`](index.html#B)`>.combine(b: SortedMapKOf<`[`A`](index.html#A)`, `[`B`](index.html#B)`>): SortedMapKOf<`[`A`](index.html#A)`, `[`B`](index.html#B)`>` |

### Inheritors

| [SortedMapKMonoidInstance](../-sorted-map-k-monoid-instance/index.html) | `interface SortedMapKMonoidInstance<A : `[`Comparable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-comparable/index.html)`<`[`A`](../-sorted-map-k-monoid-instance/index.html#A)`>, B> : Monoid<SortedMapKOf<`[`A`](../-sorted-map-k-monoid-instance/index.html#A)`, `[`B`](../-sorted-map-k-monoid-instance/index.html#B)`>>, `[`SortedMapKSemigroupInstance`](./index.html)`<`[`A`](../-sorted-map-k-monoid-instance/index.html#A)`, `[`B`](../-sorted-map-k-monoid-instance/index.html#B)`>` |

