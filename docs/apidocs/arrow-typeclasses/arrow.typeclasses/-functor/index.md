---
title: Functor - arrow-typeclasses
---

[arrow-typeclasses](../../index.html) / [arrow.typeclasses](../index.html) / [Functor](./index.html)

# Functor

`interface Functor<F> : `[`Invariant`](../-invariant/index.html)`<`[`F`](index.html#F)`>`



### Functions

| [as](as.html) | `open fun <A, B> Kind<`[`F`](index.html#F)`, `[`A`](as.html#A)`>.as(b: `[`B`](as.html#B)`): Kind<`[`F`](index.html#F)`, `[`B`](as.html#B)`>` |
| [fproduct](fproduct.html) | `open fun <A, B> Kind<`[`F`](index.html#F)`, `[`A`](fproduct.html#A)`>.fproduct(f: (`[`A`](fproduct.html#A)`) -> `[`B`](fproduct.html#B)`): Kind<`[`F`](index.html#F)`, Tuple2<`[`A`](fproduct.html#A)`, `[`B`](fproduct.html#B)`>>` |
| [imap](imap.html) | `open fun <A, B> Kind<`[`F`](index.html#F)`, `[`A`](imap.html#A)`>.imap(f: (`[`A`](imap.html#A)`) -> `[`B`](imap.html#B)`, g: (`[`B`](imap.html#B)`) -> `[`A`](imap.html#A)`): Kind<`[`F`](index.html#F)`, `[`B`](imap.html#B)`>` |
| [lift](lift.html) | `open fun <A, B> lift(f: (`[`A`](lift.html#A)`) -> `[`B`](lift.html#B)`): (Kind<`[`F`](index.html#F)`, `[`A`](lift.html#A)`>) -> Kind<`[`F`](index.html#F)`, `[`B`](lift.html#B)`>` |
| [map](map.html) | `abstract fun <A, B> Kind<`[`F`](index.html#F)`, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): Kind<`[`F`](index.html#F)`, `[`B`](map.html#B)`>` |
| [tupleLeft](tuple-left.html) | `open fun <A, B> Kind<`[`F`](index.html#F)`, `[`A`](tuple-left.html#A)`>.tupleLeft(b: `[`B`](tuple-left.html#B)`): Kind<`[`F`](index.html#F)`, Tuple2<`[`B`](tuple-left.html#B)`, `[`A`](tuple-left.html#A)`>>` |
| [tupleRight](tuple-right.html) | `open fun <A, B> Kind<`[`F`](index.html#F)`, `[`A`](tuple-right.html#A)`>.tupleRight(b: `[`B`](tuple-right.html#B)`): Kind<`[`F`](index.html#F)`, Tuple2<`[`A`](tuple-right.html#A)`, `[`B`](tuple-right.html#B)`>>` |
| [void](void.html) | `open fun <A> Kind<`[`F`](index.html#F)`, `[`A`](void.html#A)`>.void(): Kind<`[`F`](index.html#F)`, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>` |
| [widen](widen.html) | `open fun <B, A : `[`B`](widen.html#B)`> Kind<`[`F`](index.html#F)`, `[`A`](widen.html#A)`>.widen(): Kind<`[`F`](index.html#F)`, `[`B`](widen.html#B)`>` |

### Extension Functions

| [compose](../compose.html) | `fun <F, G> `[`Functor`](./index.html)`<`[`F`](../compose.html#F)`>.compose(GF: `[`Functor`](./index.html)`<`[`G`](../compose.html#G)`>): `[`Functor`](./index.html)`<`[`Nested`](../-nested.html)`<`[`F`](../compose.html#F)`, `[`G`](../compose.html#G)`>>`<br>`fun <F, G> `[`Invariant`](../-invariant/index.html)`<`[`F`](../compose.html#F)`>.compose(GF: `[`Invariant`](../-invariant/index.html)`<`[`G`](../compose.html#G)`>): `[`Invariant`](../-invariant/index.html)`<`[`Nested`](../-nested.html)`<`[`F`](../compose.html#F)`, `[`G`](../compose.html#G)`>>` |
| [composeContravariant](../compose-contravariant.html) | `fun <F, G> `[`Functor`](./index.html)`<`[`F`](../compose-contravariant.html#F)`>.composeContravariant(GF: `[`Contravariant`](../-contravariant/index.html)`<`[`G`](../compose-contravariant.html#G)`>): `[`Contravariant`](../-contravariant/index.html)`<`[`Nested`](../-nested.html)`<`[`F`](../compose-contravariant.html#F)`, `[`G`](../compose-contravariant.html#G)`>>`<br>`fun <F, G> `[`Invariant`](../-invariant/index.html)`<`[`F`](../compose-contravariant.html#F)`>.composeContravariant(GF: `[`Contravariant`](../-contravariant/index.html)`<`[`G`](../compose-contravariant.html#G)`>): `[`Invariant`](../-invariant/index.html)`<`[`Nested`](../-nested.html)`<`[`F`](../compose-contravariant.html#F)`, `[`G`](../compose-contravariant.html#G)`>>` |
| [composeFunctor](../compose-functor.html) | `fun <F, G> `[`Invariant`](../-invariant/index.html)`<`[`F`](../compose-functor.html#F)`>.composeFunctor(GF: `[`Functor`](./index.html)`<`[`G`](../compose-functor.html#G)`>): `[`Invariant`](../-invariant/index.html)`<`[`Nested`](../-nested.html)`<`[`F`](../compose-functor.html#F)`, `[`G`](../compose-functor.html#G)`>>` |

### Inheritors

| [Applicative](../-applicative/index.html) | `interface Applicative<F> : `[`Functor`](./index.html)`<`[`F`](../-applicative/index.html#F)`>`<br> |
| [CocomposedFunctor](../-cocomposed-functor/index.html) | `interface CocomposedFunctor<F, X> : `[`Functor`](./index.html)`<`[`Conested`](../-conested.html)`<`[`F`](../-cocomposed-functor/index.html#F)`, `[`X`](../-cocomposed-functor/index.html#X)`>>` |
| [Comonad](../-comonad/index.html) | `interface Comonad<F> : `[`Functor`](./index.html)`<`[`F`](../-comonad/index.html#F)`>`<br> |
| [ComposedContravariant](../-composed-contravariant/index.html) | `interface ComposedContravariant<F, G> : `[`Functor`](./index.html)`<`[`Nested`](../-nested.html)`<`[`F`](../-composed-contravariant/index.html#F)`, `[`G`](../-composed-contravariant/index.html#G)`>>` |
| [ComposedFunctor](../-composed-functor/index.html) | `interface ComposedFunctor<F, G> : `[`Functor`](./index.html)`<`[`Nested`](../-nested.html)`<`[`F`](../-composed-functor/index.html#F)`, `[`G`](../-composed-functor/index.html#G)`>>` |
| [Traverse](../-traverse/index.html) | `interface Traverse<F> : `[`Functor`](./index.html)`<`[`F`](../-traverse/index.html#F)`>, `[`Foldable`](../-foldable/index.html)`<`[`F`](../-traverse/index.html#F)`>`<br> |




## Type Class Hierarchy

<canvas id="arrow.typeclasses-hierarchy-diagram"></canvas>
<script>
  drawNomNomlDiagram('arrow.typeclasses-hierarchy-diagram', 'arrow.typeclasses-diagram.nomnol')
</script>

