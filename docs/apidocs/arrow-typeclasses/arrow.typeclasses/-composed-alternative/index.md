---
title: ComposedAlternative - arrow-typeclasses
---

[arrow-typeclasses](../../index.html) / [arrow.typeclasses](../index.html) / [ComposedAlternative](./index.html)

# ComposedAlternative

`interface ComposedAlternative<F, G> : `[`Alternative`](../-alternative.html)`<`[`Nested`](../-nested.html)`<`[`F`](index.html#F)`, `[`G`](index.html#G)`>>, `[`ComposedApplicative`](../-composed-applicative/index.html)`<`[`F`](index.html#F)`, `[`G`](index.html#G)`>, `[`ComposedMonoidK`](../-composed-monoid-k/index.html)`<`[`F`](index.html#F)`, `[`G`](index.html#G)`>`

### Functions

| [F](-f.html) | `abstract fun F(): `[`Alternative`](../-alternative.html)`<`[`F`](index.html#F)`>` |

### Inherited Functions

| [G](../-composed-applicative/-g.html) | `abstract fun G(): `[`Applicative`](../-applicative/index.html)`<`[`G`](../-composed-applicative/index.html#G)`>` |
| [apC](../-composed-applicative/ap-c.html) | `open fun <A, B> `[`UnnestedType`](../-unnested-type.html)`<`[`F`](../-composed-applicative/index.html#F)`, `[`G`](../-composed-applicative/index.html#G)`, `[`A`](../-composed-applicative/ap-c.html#A)`>.apC(ff: Kind<`[`F`](../-composed-applicative/index.html#F)`, Kind<`[`G`](../-composed-applicative/index.html#G)`, (`[`A`](../-composed-applicative/ap-c.html#A)`) -> `[`B`](../-composed-applicative/ap-c.html#B)`>>): `[`UnnestedType`](../-unnested-type.html)`<`[`F`](../-composed-applicative/index.html#F)`, `[`G`](../-composed-applicative/index.html#G)`, `[`B`](../-composed-applicative/ap-c.html#B)`>` |
| [emptyC](../-composed-monoid-k/empty-c.html) | `open fun <A> emptyC(): `[`UnnestedType`](../-unnested-type.html)`<`[`F`](../-composed-monoid-k/index.html#F)`, `[`G`](../-composed-monoid-k/index.html#G)`, `[`A`](../-composed-monoid-k/empty-c.html#A)`>` |

### Companion Object Functions

| [invoke](invoke.html) | `operator fun <F, G> invoke(AF: `[`Alternative`](../-alternative.html)`<`[`F`](invoke.html#F)`>, AG: `[`Applicative`](../-applicative/index.html)`<`[`G`](invoke.html#G)`>): `[`Alternative`](../-alternative.html)`<`[`Nested`](../-nested.html)`<`[`F`](invoke.html#F)`, `[`G`](invoke.html#G)`>>` |

### Extension Functions

| [compose](../compose.html) | `fun <F, G> `[`Invariant`](../-invariant/index.html)`<`[`F`](../compose.html#F)`>.compose(GF: `[`Invariant`](../-invariant/index.html)`<`[`G`](../compose.html#G)`>): `[`Invariant`](../-invariant/index.html)`<`[`Nested`](../-nested.html)`<`[`F`](../compose.html#F)`, `[`G`](../compose.html#G)`>>`<br>`fun <F, G> `[`Functor`](../-functor/index.html)`<`[`F`](../compose.html#F)`>.compose(GF: `[`Functor`](../-functor/index.html)`<`[`G`](../compose.html#G)`>): `[`Functor`](../-functor/index.html)`<`[`Nested`](../-nested.html)`<`[`F`](../compose.html#F)`, `[`G`](../compose.html#G)`>>`<br>`fun <F, G> `[`Applicative`](../-applicative/index.html)`<`[`F`](../compose.html#F)`>.compose(GA: `[`Applicative`](../-applicative/index.html)`<`[`G`](../compose.html#G)`>): `[`Applicative`](../-applicative/index.html)`<`[`Nested`](../-nested.html)`<`[`F`](../compose.html#F)`, `[`G`](../compose.html#G)`>>`<br>`fun <F, G> `[`Alternative`](../-alternative.html)`<`[`F`](../compose.html#F)`>.compose(GA: `[`Applicative`](../-applicative/index.html)`<`[`G`](../compose.html#G)`>): `[`Alternative`](../-alternative.html)`<`[`Nested`](../-nested.html)`<`[`F`](../compose.html#F)`, `[`G`](../compose.html#G)`>>` |
| [composeContravariant](../compose-contravariant.html) | `fun <F, G> `[`Invariant`](../-invariant/index.html)`<`[`F`](../compose-contravariant.html#F)`>.composeContravariant(GF: `[`Contravariant`](../-contravariant/index.html)`<`[`G`](../compose-contravariant.html#G)`>): `[`Invariant`](../-invariant/index.html)`<`[`Nested`](../-nested.html)`<`[`F`](../compose-contravariant.html#F)`, `[`G`](../compose-contravariant.html#G)`>>`<br>`fun <F, G> `[`Functor`](../-functor/index.html)`<`[`F`](../compose-contravariant.html#F)`>.composeContravariant(GF: `[`Contravariant`](../-contravariant/index.html)`<`[`G`](../compose-contravariant.html#G)`>): `[`Contravariant`](../-contravariant/index.html)`<`[`Nested`](../-nested.html)`<`[`F`](../compose-contravariant.html#F)`, `[`G`](../compose-contravariant.html#G)`>>` |
| [composeFunctor](../compose-functor.html) | `fun <F, G> `[`Invariant`](../-invariant/index.html)`<`[`F`](../compose-functor.html#F)`>.composeFunctor(GF: `[`Functor`](../-functor/index.html)`<`[`G`](../compose-functor.html#G)`>): `[`Invariant`](../-invariant/index.html)`<`[`Nested`](../-nested.html)`<`[`F`](../compose-functor.html#F)`, `[`G`](../compose-functor.html#G)`>>` |

