---
title: MonoidK - arrow-typeclasses
---

[arrow-typeclasses](../../index.html) / [arrow.typeclasses](../index.html) / [MonoidK](./index.html)

# MonoidK

`interface MonoidK<F> : `[`SemigroupK`](../-semigroup-k/index.html)`<`[`F`](index.html#F)`>`



MonoidK is a universal monoid which operates on kinds.

MonoidK allows two F values to be combined, for any A. It also means that for any A, there
is an "empty" F value.

### Functions

| [algebra](algebra.html) | `open fun <A> algebra(): `[`Monoid`](../-monoid/index.html)`<Kind<`[`F`](index.html#F)`, `[`A`](algebra.html#A)`>>`<br>Given a type A, create a concrete Semigroup&lt;F&gt;. |
| [empty](empty.html) | `abstract fun <A> empty(): Kind<`[`F`](index.html#F)`, `[`A`](empty.html#A)`>`<br>Given a type A, create an "empty" F value. |

### Inherited Functions

| [combineK](../-semigroup-k/combine-k.html) | `abstract fun <A> Kind<`[`F`](../-semigroup-k/index.html#F)`, `[`A`](../-semigroup-k/combine-k.html#A)`>.combineK(y: Kind<`[`F`](../-semigroup-k/index.html#F)`, `[`A`](../-semigroup-k/combine-k.html#A)`>): Kind<`[`F`](../-semigroup-k/index.html#F)`, `[`A`](../-semigroup-k/combine-k.html#A)`>`<br>Combine two F values. |

### Extension Functions

| [compose](../compose.html) | `fun <F, G> `[`MonoidK`](./index.html)`<`[`F`](../compose.html#F)`>.compose(): `[`MonoidK`](./index.html)`<`[`Nested`](../-nested.html)`<`[`F`](../compose.html#F)`, `[`G`](../compose.html#G)`>>` |

### Inheritors

| [Alternative](../-alternative.html) | `interface Alternative<F> : `[`Applicative`](../-applicative/index.html)`<`[`F`](../-alternative.html#F)`>, `[`MonoidK`](./index.html)`<`[`F`](../-alternative.html#F)`>`<br> |
| [ComposedMonoidK](../-composed-monoid-k/index.html) | `interface ComposedMonoidK<F, G> : `[`MonoidK`](./index.html)`<`[`Nested`](../-nested.html)`<`[`F`](../-composed-monoid-k/index.html#F)`, `[`G`](../-composed-monoid-k/index.html#G)`>>, `[`ComposedSemigroupK`](../-composed-semigroup-k/index.html)`<`[`F`](../-composed-monoid-k/index.html#F)`, `[`G`](../-composed-monoid-k/index.html#G)`>` |




## Type Class Hierarchy

<canvas id="arrow.typeclasses-hierarchy-diagram"></canvas>
<script>
  drawNomNomlDiagram('arrow.typeclasses-hierarchy-diagram', 'arrow.typeclasses-diagram.nomnol')
</script>

