---
title: ComposedSemigroupK - arrow-typeclasses
---

[arrow-typeclasses](../../index.html) / [arrow.typeclasses](../index.html) / [ComposedSemigroupK](./index.html)

# ComposedSemigroupK

`interface ComposedSemigroupK<F, G> : `[`SemigroupK`](../-semigroup-k/index.html)`<`[`Nested`](../-nested.html)`<`[`F`](index.html#F)`, `[`G`](index.html#G)`>>`

### Functions

| [F](-f.html) | `abstract fun F(): `[`SemigroupK`](../-semigroup-k/index.html)`<`[`F`](index.html#F)`>` |
| [combineK](combine-k.html) | `open fun <A> `[`NestedType`](../-nested-type.html)`<`[`F`](index.html#F)`, `[`G`](index.html#G)`, `[`A`](combine-k.html#A)`>.combineK(y: `[`NestedType`](../-nested-type.html)`<`[`F`](index.html#F)`, `[`G`](index.html#G)`, `[`A`](combine-k.html#A)`>): `[`NestedType`](../-nested-type.html)`<`[`F`](index.html#F)`, `[`G`](index.html#G)`, `[`A`](combine-k.html#A)`>`<br>Combine two F values. |
| [combineKC](combine-k-c.html) | `open fun <A> `[`UnnestedType`](../-unnested-type.html)`<`[`F`](index.html#F)`, `[`G`](index.html#G)`, `[`A`](combine-k-c.html#A)`>.combineKC(y: `[`UnnestedType`](../-unnested-type.html)`<`[`F`](index.html#F)`, `[`G`](index.html#G)`, `[`A`](combine-k-c.html#A)`>): `[`NestedType`](../-nested-type.html)`<`[`F`](index.html#F)`, `[`G`](index.html#G)`, `[`A`](combine-k-c.html#A)`>` |

### Inherited Functions

| [algebra](../-semigroup-k/algebra.html) | `open fun <A> algebra(): `[`Semigroup`](../-semigroup/index.html)`<Kind<`[`F`](../-semigroup-k/index.html#F)`, `[`A`](../-semigroup-k/algebra.html#A)`>>`<br>Given a type A, create a concrete Semigroup&lt;F&gt;. |

### Companion Object Functions

| [invoke](invoke.html) | `operator fun <F, G> invoke(SF: `[`SemigroupK`](../-semigroup-k/index.html)`<`[`F`](invoke.html#F)`>): `[`SemigroupK`](../-semigroup-k/index.html)`<`[`Nested`](../-nested.html)`<`[`F`](invoke.html#F)`, `[`G`](invoke.html#G)`>>` |

### Extension Functions

| [compose](../compose.html) | `fun <F, G> `[`SemigroupK`](../-semigroup-k/index.html)`<`[`F`](../compose.html#F)`>.compose(): `[`SemigroupK`](../-semigroup-k/index.html)`<`[`Nested`](../-nested.html)`<`[`F`](../compose.html#F)`, `[`G`](../compose.html#G)`>>` |

### Inheritors

| [ComposedMonoidK](../-composed-monoid-k/index.html) | `interface ComposedMonoidK<F, G> : `[`MonoidK`](../-monoid-k/index.html)`<`[`Nested`](../-nested.html)`<`[`F`](../-composed-monoid-k/index.html#F)`, `[`G`](../-composed-monoid-k/index.html#G)`>>, `[`ComposedSemigroupK`](./index.html)`<`[`F`](../-composed-monoid-k/index.html#F)`, `[`G`](../-composed-monoid-k/index.html#G)`>` |

