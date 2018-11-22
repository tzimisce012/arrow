---
title: ComposedBifunctor - arrow-typeclasses
---

[arrow-typeclasses](../../index.html) / [arrow.typeclasses](../index.html) / [ComposedBifunctor](./index.html)

# ComposedBifunctor

`interface ComposedBifunctor<F, G> : `[`Bifunctor`](../-bifunctor/index.html)`<`[`Nested`](../-nested.html)`<`[`F`](index.html#F)`, `[`G`](index.html#G)`>>`

### Functions

| [F](-f.html) | `abstract fun F(): `[`Bifunctor`](../-bifunctor/index.html)`<`[`F`](index.html#F)`>` |
| [G](-g.html) | `abstract fun G(): `[`Bifunctor`](../-bifunctor/index.html)`<`[`G`](index.html#G)`>` |
| [bimap](bimap.html) | `open fun <A, B, C, D> `[`BinestedType`](../-binested-type.html)`<`[`F`](index.html#F)`, `[`G`](index.html#G)`, `[`A`](bimap.html#A)`, `[`B`](bimap.html#B)`>.bimap(fl: (`[`A`](bimap.html#A)`) -> `[`C`](bimap.html#C)`, fr: (`[`B`](bimap.html#B)`) -> `[`D`](bimap.html#D)`): `[`BinestedType`](../-binested-type.html)`<`[`F`](index.html#F)`, `[`G`](index.html#G)`, `[`C`](bimap.html#C)`, `[`D`](bimap.html#D)`>`<br>Maps both types of Kind2. |
| [bimapC](bimap-c.html) | `open fun <A, B, C, D> `[`BiunnestedType`](../-biunnested-type.html)`<`[`F`](index.html#F)`, `[`G`](index.html#G)`, `[`A`](bimap-c.html#A)`, `[`B`](bimap-c.html#B)`>.bimapC(fl: (`[`A`](bimap-c.html#A)`) -> `[`C`](bimap-c.html#C)`, fr: (`[`B`](bimap-c.html#B)`) -> `[`D`](bimap-c.html#D)`): `[`BiunnestedType`](../-biunnested-type.html)`<`[`F`](index.html#F)`, `[`G`](index.html#G)`, `[`C`](bimap-c.html#C)`, `[`D`](bimap-c.html#D)`>` |

### Inherited Functions

| [leftFunctor](../-bifunctor/left-functor.html) | `open fun <X> leftFunctor(): `[`Functor`](../-functor/index.html)`<`[`Conested`](../-conested.html)`<`[`F`](../-bifunctor/index.html#F)`, `[`X`](../-bifunctor/left-functor.html#X)`>>`<br>Returns a [Functor](../-functor/index.html) acting on the type of the left side. |
| [leftWiden](../-bifunctor/left-widen.html) | `open fun <AA, B, A : `[`AA`](../-bifunctor/left-widen.html#AA)`> Kind2<`[`F`](../-bifunctor/index.html#F)`, `[`A`](../-bifunctor/left-widen.html#A)`, `[`B`](../-bifunctor/left-widen.html#B)`>.leftWiden(): Kind2<`[`F`](../-bifunctor/index.html#F)`, `[`AA`](../-bifunctor/left-widen.html#AA)`, `[`B`](../-bifunctor/left-widen.html#B)`>` |
| [lift](../-bifunctor/lift.html) | `open fun <A, B, C, D> lift(fl: (`[`A`](../-bifunctor/lift.html#A)`) -> `[`C`](../-bifunctor/lift.html#C)`, fr: (`[`B`](../-bifunctor/lift.html#B)`) -> `[`D`](../-bifunctor/lift.html#D)`): (Kind2<`[`F`](../-bifunctor/index.html#F)`, `[`A`](../-bifunctor/lift.html#A)`, `[`B`](../-bifunctor/lift.html#B)`>) -> Kind2<`[`F`](../-bifunctor/index.html#F)`, `[`C`](../-bifunctor/lift.html#C)`, `[`D`](../-bifunctor/lift.html#D)`>`<br>Lifts two functions to the Bifunctor type. |
| [mapLeft](../-bifunctor/map-left.html) | `open fun <A, B, C> Kind2<`[`F`](../-bifunctor/index.html#F)`, `[`A`](../-bifunctor/map-left.html#A)`, `[`B`](../-bifunctor/map-left.html#B)`>.mapLeft(f: (`[`A`](../-bifunctor/map-left.html#A)`) -> `[`C`](../-bifunctor/map-left.html#C)`): Kind2<`[`F`](../-bifunctor/index.html#F)`, `[`C`](../-bifunctor/map-left.html#C)`, `[`B`](../-bifunctor/map-left.html#B)`>`<br>Map the left side type of Kind2 |
| [rightFunctor](../-bifunctor/right-functor.html) | `open fun <X> rightFunctor(): `[`Functor`](../-functor/index.html)`<Kind<`[`F`](../-bifunctor/index.html#F)`, `[`X`](../-bifunctor/right-functor.html#X)`>>`<br>Returns a [Functor](../-functor/index.html) acting on the type of the right side. |

### Companion Object Functions

| [invoke](invoke.html) | `operator fun <F, G> invoke(BF: `[`Bifunctor`](../-bifunctor/index.html)`<`[`F`](invoke.html#F)`>, BG: `[`Bifunctor`](../-bifunctor/index.html)`<`[`G`](invoke.html#G)`>): `[`ComposedBifunctor`](./index.html)`<`[`F`](invoke.html#F)`, `[`G`](invoke.html#G)`>` |

### Extension Functions

| [compose](../compose.html) | `fun <F, G> `[`Bifunctor`](../-bifunctor/index.html)`<`[`F`](../compose.html#F)`>.compose(BG: `[`Bifunctor`](../-bifunctor/index.html)`<`[`G`](../compose.html#G)`>): `[`Bifunctor`](../-bifunctor/index.html)`<`[`Nested`](../-nested.html)`<`[`F`](../compose.html#F)`, `[`G`](../compose.html#G)`>>` |

