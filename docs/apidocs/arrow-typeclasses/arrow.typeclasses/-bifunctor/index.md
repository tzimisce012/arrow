---
title: Bifunctor - arrow-typeclasses
---

[arrow-typeclasses](../../index.html) / [arrow.typeclasses](../index.html) / [Bifunctor](./index.html)

# Bifunctor

`interface Bifunctor<F>`



[Bifunctor](./index.html) has the same properties of [Functor](../-functor/index.html), but acting onto two types, instead of one.

It can be used to map both of its inside types.

### Functions

| [bimap](bimap.html) | `abstract fun <A, B, C, D> Kind2<`[`F`](index.html#F)`, `[`A`](bimap.html#A)`, `[`B`](bimap.html#B)`>.bimap(fl: (`[`A`](bimap.html#A)`) -> `[`C`](bimap.html#C)`, fr: (`[`B`](bimap.html#B)`) -> `[`D`](bimap.html#D)`): Kind2<`[`F`](index.html#F)`, `[`C`](bimap.html#C)`, `[`D`](bimap.html#D)`>`<br>Maps both types of Kind2. |
| [leftFunctor](left-functor.html) | `open fun <X> leftFunctor(): `[`Functor`](../-functor/index.html)`<`[`Conested`](../-conested.html)`<`[`F`](index.html#F)`, `[`X`](left-functor.html#X)`>>`<br>Returns a [Functor](../-functor/index.html) acting on the type of the left side. |
| [leftWiden](left-widen.html) | `open fun <AA, B, A : `[`AA`](left-widen.html#AA)`> Kind2<`[`F`](index.html#F)`, `[`A`](left-widen.html#A)`, `[`B`](left-widen.html#B)`>.leftWiden(): Kind2<`[`F`](index.html#F)`, `[`AA`](left-widen.html#AA)`, `[`B`](left-widen.html#B)`>` |
| [lift](lift.html) | `open fun <A, B, C, D> lift(fl: (`[`A`](lift.html#A)`) -> `[`C`](lift.html#C)`, fr: (`[`B`](lift.html#B)`) -> `[`D`](lift.html#D)`): (Kind2<`[`F`](index.html#F)`, `[`A`](lift.html#A)`, `[`B`](lift.html#B)`>) -> Kind2<`[`F`](index.html#F)`, `[`C`](lift.html#C)`, `[`D`](lift.html#D)`>`<br>Lifts two functions to the Bifunctor type. |
| [mapLeft](map-left.html) | `open fun <A, B, C> Kind2<`[`F`](index.html#F)`, `[`A`](map-left.html#A)`, `[`B`](map-left.html#B)`>.mapLeft(f: (`[`A`](map-left.html#A)`) -> `[`C`](map-left.html#C)`): Kind2<`[`F`](index.html#F)`, `[`C`](map-left.html#C)`, `[`B`](map-left.html#B)`>`<br>Map the left side type of Kind2 |
| [rightFunctor](right-functor.html) | `open fun <X> rightFunctor(): `[`Functor`](../-functor/index.html)`<Kind<`[`F`](index.html#F)`, `[`X`](right-functor.html#X)`>>`<br>Returns a [Functor](../-functor/index.html) acting on the type of the right side. |

### Extension Functions

| [compose](../compose.html) | `fun <F, G> `[`Bifunctor`](./index.html)`<`[`F`](../compose.html#F)`>.compose(BG: `[`Bifunctor`](./index.html)`<`[`G`](../compose.html#G)`>): `[`Bifunctor`](./index.html)`<`[`Nested`](../-nested.html)`<`[`F`](../compose.html#F)`, `[`G`](../compose.html#G)`>>` |

### Inheritors

| [ComposedBifunctor](../-composed-bifunctor/index.html) | `interface ComposedBifunctor<F, G> : `[`Bifunctor`](./index.html)`<`[`Nested`](../-nested.html)`<`[`F`](../-composed-bifunctor/index.html#F)`, `[`G`](../-composed-bifunctor/index.html#G)`>>` |




## Type Class Hierarchy

<canvas id="arrow.typeclasses-hierarchy-diagram"></canvas>
<script>
  drawNomNomlDiagram('arrow.typeclasses-hierarchy-diagram', 'arrow.typeclasses-diagram.nomnol')
</script>

