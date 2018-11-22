---
title: SemigroupK - arrow-typeclasses
---

[arrow-typeclasses](../../index.html) / [arrow.typeclasses](../index.html) / [SemigroupK](./index.html)

# SemigroupK

`interface SemigroupK<F>`



### Functions

| [algebra](algebra.html) | `open fun <A> algebra(): `[`Semigroup`](../-semigroup/index.html)`<Kind<`[`F`](index.html#F)`, `[`A`](algebra.html#A)`>>`<br>Given a type A, create a concrete Semigroup&lt;F&gt;. |
| [combineK](combine-k.html) | `abstract fun <A> Kind<`[`F`](index.html#F)`, `[`A`](combine-k.html#A)`>.combineK(y: Kind<`[`F`](index.html#F)`, `[`A`](combine-k.html#A)`>): Kind<`[`F`](index.html#F)`, `[`A`](combine-k.html#A)`>`<br>Combine two F values. |

### Extension Functions

| [compose](../compose.html) | `fun <F, G> `[`SemigroupK`](./index.html)`<`[`F`](../compose.html#F)`>.compose(): `[`SemigroupK`](./index.html)`<`[`Nested`](../-nested.html)`<`[`F`](../compose.html#F)`, `[`G`](../compose.html#G)`>>` |

### Inheritors

| [ComposedSemigroupK](../-composed-semigroup-k/index.html) | `interface ComposedSemigroupK<F, G> : `[`SemigroupK`](./index.html)`<`[`Nested`](../-nested.html)`<`[`F`](../-composed-semigroup-k/index.html#F)`, `[`G`](../-composed-semigroup-k/index.html#G)`>>` |
| [MonoidK](../-monoid-k/index.html) | `interface MonoidK<F> : `[`SemigroupK`](./index.html)`<`[`F`](../-monoid-k/index.html#F)`>`<br> |




## Type Class Hierarchy

<canvas id="arrow.typeclasses-hierarchy-diagram"></canvas>
<script>
  drawNomNomlDiagram('arrow.typeclasses-hierarchy-diagram', 'arrow.typeclasses-diagram.nomnol')
</script>

