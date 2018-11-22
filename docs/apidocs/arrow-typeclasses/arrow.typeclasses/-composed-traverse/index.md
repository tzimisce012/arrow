---
title: ComposedTraverse - arrow-typeclasses
---

[arrow-typeclasses](../../index.html) / [arrow.typeclasses](../index.html) / [ComposedTraverse](./index.html)

# ComposedTraverse

`interface ComposedTraverse<F, G> : `[`Traverse`](../-traverse/index.html)`<`[`Nested`](../-nested.html)`<`[`F`](index.html#F)`, `[`G`](index.html#G)`>>, `[`ComposedFoldable`](../-composed-foldable/index.html)`<`[`F`](index.html#F)`, `[`G`](index.html#G)`>`

### Functions

| [FF](-f-f.html) | `open fun FF(): `[`Foldable`](../-foldable/index.html)`<`[`F`](index.html#F)`>` |
| [FT](-f-t.html) | `abstract fun FT(): `[`Traverse`](../-traverse/index.html)`<`[`F`](index.html#F)`>` |
| [GA](-g-a.html) | `abstract fun GA(): `[`Applicative`](../-applicative/index.html)`<`[`G`](index.html#G)`>` |
| [GF](-g-f.html) | `open fun GF(): `[`Foldable`](../-foldable/index.html)`<`[`G`](index.html#G)`>` |
| [GT](-g-t.html) | `abstract fun GT(): `[`Traverse`](../-traverse/index.html)`<`[`G`](index.html#G)`>` |
| [traverse](traverse.html) | `open fun <H, A, B> `[`NestedType`](../-nested-type.html)`<`[`F`](index.html#F)`, `[`G`](index.html#G)`, `[`A`](traverse.html#A)`>.traverse(AP: `[`Applicative`](../-applicative/index.html)`<`[`H`](traverse.html#H)`>, f: (`[`A`](traverse.html#A)`) -> Kind<`[`H`](traverse.html#H)`, `[`B`](traverse.html#B)`>): Kind<`[`H`](traverse.html#H)`, Kind<`[`Nested`](../-nested.html)`<`[`F`](index.html#F)`, `[`G`](index.html#G)`>, `[`B`](traverse.html#B)`>>`<br>Given a function which returns a G effect, thread this effect through the running of this function on all the values in F, returning an F in a G context. |
| [traverseC](traverse-c.html) | `open fun <H, A, B> `[`UnnestedType`](../-unnested-type.html)`<`[`F`](index.html#F)`, `[`G`](index.html#G)`, `[`A`](traverse-c.html#A)`>.traverseC(f: (`[`A`](traverse-c.html#A)`) -> Kind<`[`H`](traverse-c.html#H)`, `[`B`](traverse-c.html#B)`>, HA: `[`Applicative`](../-applicative/index.html)`<`[`H`](traverse-c.html#H)`>): Kind<`[`H`](traverse-c.html#H)`, Kind<`[`Nested`](../-nested.html)`<`[`F`](index.html#F)`, `[`G`](index.html#G)`>, `[`B`](traverse-c.html#B)`>>` |

### Inherited Functions

| [flatTraverse](../-traverse/flat-traverse.html) | `open fun <G, A, B> Kind<`[`F`](../-traverse/index.html#F)`, `[`A`](../-traverse/flat-traverse.html#A)`>.flatTraverse(MF: `[`Monad`](../-monad/index.html)`<`[`F`](../-traverse/index.html#F)`>, AG: `[`Applicative`](../-applicative/index.html)`<`[`G`](../-traverse/flat-traverse.html#G)`>, f: (`[`A`](../-traverse/flat-traverse.html#A)`) -> Kind<`[`G`](../-traverse/flat-traverse.html#G)`, Kind<`[`F`](../-traverse/index.html#F)`, `[`B`](../-traverse/flat-traverse.html#B)`>>): Kind<`[`G`](../-traverse/flat-traverse.html#G)`, Kind<`[`F`](../-traverse/index.html#F)`, `[`B`](../-traverse/flat-traverse.html#B)`>>` |
| [foldLC](../-composed-foldable/fold-l-c.html) | `open fun <A, B> foldLC(fa: `[`UnnestedType`](../-unnested-type.html)`<`[`F`](../-composed-foldable/index.html#F)`, `[`G`](../-composed-foldable/index.html#G)`, `[`A`](../-composed-foldable/fold-l-c.html#A)`>, b: `[`B`](../-composed-foldable/fold-l-c.html#B)`, f: (`[`B`](../-composed-foldable/fold-l-c.html#B)`, `[`A`](../-composed-foldable/fold-l-c.html#A)`) -> `[`B`](../-composed-foldable/fold-l-c.html#B)`): `[`B`](../-composed-foldable/fold-l-c.html#B) |
| [foldRC](../-composed-foldable/fold-r-c.html) | `open fun <A, B> `[`UnnestedType`](../-unnested-type.html)`<`[`F`](../-composed-foldable/index.html#F)`, `[`G`](../-composed-foldable/index.html#G)`, `[`A`](../-composed-foldable/fold-r-c.html#A)`>.foldRC(lb: Eval<`[`B`](../-composed-foldable/fold-r-c.html#B)`>, f: (`[`A`](../-composed-foldable/fold-r-c.html#A)`, Eval<`[`B`](../-composed-foldable/fold-r-c.html#B)`>) -> Eval<`[`B`](../-composed-foldable/fold-r-c.html#B)`>): Eval<`[`B`](../-composed-foldable/fold-r-c.html#B)`>` |
| [map](../-traverse/map.html) | `open fun <A, B> Kind<`[`F`](../-traverse/index.html#F)`, `[`A`](../-traverse/map.html#A)`>.map(f: (`[`A`](../-traverse/map.html#A)`) -> `[`B`](../-traverse/map.html#B)`): Kind<`[`F`](../-traverse/index.html#F)`, `[`B`](../-traverse/map.html#B)`>` |
| [sequence](../-traverse/sequence.html) | `open fun <G, A> Kind<`[`F`](../-traverse/index.html#F)`, Kind<`[`G`](../-traverse/sequence.html#G)`, `[`A`](../-traverse/sequence.html#A)`>>.sequence(AG: `[`Applicative`](../-applicative/index.html)`<`[`G`](../-traverse/sequence.html#G)`>): Kind<`[`G`](../-traverse/sequence.html#G)`, Kind<`[`F`](../-traverse/index.html#F)`, `[`A`](../-traverse/sequence.html#A)`>>`<br>Thread all the G effects through the F structure to invert the structure from F&lt;G&gt; to G&lt;F&gt;. |

### Companion Object Functions

| [invoke](invoke.html) | `operator fun <F, G> invoke(FF: `[`Traverse`](../-traverse/index.html)`<`[`F`](invoke.html#F)`>, GF: `[`Traverse`](../-traverse/index.html)`<`[`G`](invoke.html#G)`>, GA: `[`Applicative`](../-applicative/index.html)`<`[`G`](invoke.html#G)`>): `[`ComposedTraverse`](./index.html)`<`[`F`](invoke.html#F)`, `[`G`](invoke.html#G)`>` |

### Extension Functions

| [compose](../compose.html) | `fun <F, G> `[`Foldable`](../-foldable/index.html)`<`[`F`](../compose.html#F)`>.compose(GT: `[`Foldable`](../-foldable/index.html)`<`[`G`](../compose.html#G)`>): `[`ComposedFoldable`](../-composed-foldable/index.html)`<`[`F`](../compose.html#F)`, `[`G`](../compose.html#G)`>`<br>`fun <F, G> `[`Traverse`](../-traverse/index.html)`<`[`F`](../compose.html#F)`>.compose(GT: `[`Traverse`](../-traverse/index.html)`<`[`G`](../compose.html#G)`>, GA: `[`Applicative`](../-applicative/index.html)`<`[`G`](../compose.html#G)`>): `[`Traverse`](../-traverse/index.html)`<`[`Nested`](../-nested.html)`<`[`F`](../compose.html#F)`, `[`G`](../compose.html#G)`>>`<br>`fun <F, G> `[`Invariant`](../-invariant/index.html)`<`[`F`](../compose.html#F)`>.compose(GF: `[`Invariant`](../-invariant/index.html)`<`[`G`](../compose.html#G)`>): `[`Invariant`](../-invariant/index.html)`<`[`Nested`](../-nested.html)`<`[`F`](../compose.html#F)`, `[`G`](../compose.html#G)`>>`<br>`fun <F, G> `[`Functor`](../-functor/index.html)`<`[`F`](../compose.html#F)`>.compose(GF: `[`Functor`](../-functor/index.html)`<`[`G`](../compose.html#G)`>): `[`Functor`](../-functor/index.html)`<`[`Nested`](../-nested.html)`<`[`F`](../compose.html#F)`, `[`G`](../compose.html#G)`>>` |
| [composeContravariant](../compose-contravariant.html) | `fun <F, G> `[`Invariant`](../-invariant/index.html)`<`[`F`](../compose-contravariant.html#F)`>.composeContravariant(GF: `[`Contravariant`](../-contravariant/index.html)`<`[`G`](../compose-contravariant.html#G)`>): `[`Invariant`](../-invariant/index.html)`<`[`Nested`](../-nested.html)`<`[`F`](../compose-contravariant.html#F)`, `[`G`](../compose-contravariant.html#G)`>>`<br>`fun <F, G> `[`Functor`](../-functor/index.html)`<`[`F`](../compose-contravariant.html#F)`>.composeContravariant(GF: `[`Contravariant`](../-contravariant/index.html)`<`[`G`](../compose-contravariant.html#G)`>): `[`Contravariant`](../-contravariant/index.html)`<`[`Nested`](../-nested.html)`<`[`F`](../compose-contravariant.html#F)`, `[`G`](../compose-contravariant.html#G)`>>` |
| [composeFunctor](../compose-functor.html) | `fun <F, G> `[`Invariant`](../-invariant/index.html)`<`[`F`](../compose-functor.html#F)`>.composeFunctor(GF: `[`Functor`](../-functor/index.html)`<`[`G`](../compose-functor.html#G)`>): `[`Invariant`](../-invariant/index.html)`<`[`Nested`](../-nested.html)`<`[`F`](../compose-functor.html#F)`, `[`G`](../compose-functor.html#G)`>>` |

