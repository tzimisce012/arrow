---
title: Traversal - arrow-optics
---

[arrow-optics](../index.html) / [arrow.optics](index.html) / [Traversal](./-traversal.html)

# Traversal

`typealias Traversal<S, A> = `[`PTraversal`](-p-traversal/index.html)`<`[`S`](-traversal.html#S)`, `[`S`](-traversal.html#S)`, `[`A`](-traversal.html#A)`, `[`A`](-traversal.html#A)`>`

[Traversal](./-traversal.html) is a type alias for [PTraversal](-p-traversal/index.html) which fixes the type arguments
and restricts the [PTraversal](-p-traversal/index.html) to monomorphic updates.

### Inheritors

| [ListTraversal](../arrow.optics.instances/-list-traversal/index.html) | `interface ListTraversal<A> : `[`Traversal`](./-traversal.html)`<`[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`A`](../arrow.optics.instances/-list-traversal/index.html#A)`>, `[`A`](../arrow.optics.instances/-list-traversal/index.html#A)`>`<br>[Traversal](./-traversal.html) for [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html) that focuses in each [A](../arrow.optics.instances/-list-traversal/index.html#A) of the source [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html). |
| [MapTraversal](../arrow.optics.instances/-map-traversal/index.html) | `interface MapTraversal<K, V> : `[`Traversal`](./-traversal.html)`<`[`Map`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html)`<`[`K`](../arrow.optics.instances/-map-traversal/index.html#K)`, `[`V`](../arrow.optics.instances/-map-traversal/index.html#V)`>, `[`V`](../arrow.optics.instances/-map-traversal/index.html#V)`>`<br>[Traversal](./-traversal.html) for [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html) that focuses in each [V](../arrow.optics.instances/-map-traversal/index.html#V) of the source [Map](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-map/index.html). |

