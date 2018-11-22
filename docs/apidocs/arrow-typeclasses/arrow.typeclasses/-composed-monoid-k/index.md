---
title: ComposedMonoidK - arrow-typeclasses
---

[arrow-typeclasses](../../index.html) / [arrow.typeclasses](../index.html) / [ComposedMonoidK](./index.html)

# ComposedMonoidK

`interface ComposedMonoidK<F, G> : `[`MonoidK`](../-monoid-k/index.html)`<`[`Nested`](../-nested.html)`<`[`F`](index.html#F)`, `[`G`](index.html#G)`>>, `[`ComposedSemigroupK`](../-composed-semigroup-k/index.html)`<`[`F`](index.html#F)`, `[`G`](index.html#G)`>`

### Functions

| [F](-f.html) | `abstract fun F(): `[`MonoidK`](../-monoid-k/index.html)`<`[`F`](index.html#F)`>` |
| [empty](empty.html) | `open fun <A> empty(): `[`NestedType`](../-nested-type.html)`<`[`F`](index.html#F)`, `[`G`](index.html#G)`, `[`A`](empty.html#A)`>`<br>Given a type A, create an "empty" F value. |
| [emptyC](empty-c.html) | `open fun <A> emptyC(): `[`UnnestedType`](../-unnested-type.html)`<`[`F`](index.html#F)`, `[`G`](index.html#G)`, `[`A`](empty-c.html#A)`>` |

### Inherited Functions

| [algebra](../-monoid-k/algebra.html) | `open fun <A> algebra(): `[`Monoid`](../-monoid/index.html)`<Kind<`[`F`](../-monoid-k/index.html#F)`, `[`A`](../-monoid-k/algebra.html#A)`>>`<br>Given a type A, create a concrete Semigroup&lt;F&gt;. |
| [combineKC](../-composed-semigroup-k/combine-k-c.html) | `open fun <A> `[`UnnestedType`](../-unnested-type.html)`<`[`F`](../-composed-semigroup-k/index.html#F)`, `[`G`](../-composed-semigroup-k/index.html#G)`, `[`A`](../-composed-semigroup-k/combine-k-c.html#A)`>.combineKC(y: `[`UnnestedType`](../-unnested-type.html)`<`[`F`](../-composed-semigroup-k/index.html#F)`, `[`G`](../-composed-semigroup-k/index.html#G)`, `[`A`](../-composed-semigroup-k/combine-k-c.html#A)`>): `[`NestedType`](../-nested-type.html)`<`[`F`](../-composed-semigroup-k/index.html#F)`, `[`G`](../-composed-semigroup-k/index.html#G)`, `[`A`](../-composed-semigroup-k/combine-k-c.html#A)`>` |

### Companion Object Functions

| [invoke](invoke.html) | `operator fun <F, G> invoke(MK: `[`MonoidK`](../-monoid-k/index.html)`<`[`F`](invoke.html#F)`>): `[`MonoidK`](../-monoid-k/index.html)`<`[`Nested`](../-nested.html)`<`[`F`](invoke.html#F)`, `[`G`](invoke.html#G)`>>` |

### Inheritors

| [ComposedAlternative](../-composed-alternative/index.html) | `interface ComposedAlternative<F, G> : `[`Alternative`](../-alternative.html)`<`[`Nested`](../-nested.html)`<`[`F`](../-composed-alternative/index.html#F)`, `[`G`](../-composed-alternative/index.html#G)`>>, `[`ComposedApplicative`](../-composed-applicative/index.html)`<`[`F`](../-composed-alternative/index.html#F)`, `[`G`](../-composed-alternative/index.html#G)`>, `[`ComposedMonoidK`](./index.html)`<`[`F`](../-composed-alternative/index.html#F)`, `[`G`](../-composed-alternative/index.html#G)`>` |

