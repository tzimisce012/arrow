---
title: Contravariant - arrow-typeclasses
---

[arrow-typeclasses](../../index.html) / [arrow.typeclasses](../index.html) / [Contravariant](./index.html)

# Contravariant

`interface Contravariant<F> : `[`Invariant`](../-invariant/index.html)`<`[`F`](index.html#F)`>`



### Functions

| [contramap](contramap.html) | `abstract fun <A, B> Kind<`[`F`](index.html#F)`, `[`A`](contramap.html#A)`>.contramap(f: (`[`B`](contramap.html#B)`) -> `[`A`](contramap.html#A)`): Kind<`[`F`](index.html#F)`, `[`B`](contramap.html#B)`>` |
| [imap](imap.html) | `open fun <A, B> Kind<`[`F`](index.html#F)`, `[`A`](imap.html#A)`>.imap(f: (`[`A`](imap.html#A)`) -> `[`B`](imap.html#B)`, g: (`[`B`](imap.html#B)`) -> `[`A`](imap.html#A)`): Kind<`[`F`](index.html#F)`, `[`B`](imap.html#B)`>` |
| [lift](lift.html) | `open fun <A, B> lift(f: (`[`A`](lift.html#A)`) -> `[`B`](lift.html#B)`, dummy: `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)` = Unit): (Kind<`[`F`](index.html#F)`, `[`B`](lift.html#B)`>) -> Kind<`[`F`](index.html#F)`, `[`A`](lift.html#A)`>` |
| [narrow](narrow.html) | `open fun <A, B : `[`A`](narrow.html#A)`> Kind<`[`F`](index.html#F)`, `[`A`](narrow.html#A)`>.narrow(): Kind<`[`F`](index.html#F)`, `[`B`](narrow.html#B)`>` |

### Extension Functions

| [compose](../compose.html) | `fun <F, G> `[`Contravariant`](./index.html)`<`[`F`](../compose.html#F)`>.compose(GF: `[`Contravariant`](./index.html)`<`[`G`](../compose.html#G)`>): `[`Functor`](../-functor/index.html)`<`[`Nested`](../-nested.html)`<`[`F`](../compose.html#F)`, `[`G`](../compose.html#G)`>>`<br>`fun <F, G> `[`Invariant`](../-invariant/index.html)`<`[`F`](../compose.html#F)`>.compose(GF: `[`Invariant`](../-invariant/index.html)`<`[`G`](../compose.html#G)`>): `[`Invariant`](../-invariant/index.html)`<`[`Nested`](../-nested.html)`<`[`F`](../compose.html#F)`, `[`G`](../compose.html#G)`>>` |
| [composeContravariant](../compose-contravariant.html) | `fun <F, G> `[`Invariant`](../-invariant/index.html)`<`[`F`](../compose-contravariant.html#F)`>.composeContravariant(GF: `[`Contravariant`](./index.html)`<`[`G`](../compose-contravariant.html#G)`>): `[`Invariant`](../-invariant/index.html)`<`[`Nested`](../-nested.html)`<`[`F`](../compose-contravariant.html#F)`, `[`G`](../compose-contravariant.html#G)`>>` |
| [composeFunctor](../compose-functor.html) | `fun <F, G> `[`Contravariant`](./index.html)`<`[`F`](../compose-functor.html#F)`>.composeFunctor(GF: `[`Functor`](../-functor/index.html)`<`[`G`](../compose-functor.html#G)`>): `[`Contravariant`](./index.html)`<`[`Nested`](../-nested.html)`<`[`F`](../compose-functor.html#F)`, `[`G`](../compose-functor.html#G)`>>`<br>`fun <F, G> `[`Invariant`](../-invariant/index.html)`<`[`F`](../compose-functor.html#F)`>.composeFunctor(GF: `[`Functor`](../-functor/index.html)`<`[`G`](../compose-functor.html#G)`>): `[`Invariant`](../-invariant/index.html)`<`[`Nested`](../-nested.html)`<`[`F`](../compose-functor.html#F)`, `[`G`](../compose-functor.html#G)`>>` |

### Inheritors

| [ComposedContravariantCovariant](../-composed-contravariant-covariant/index.html) | `interface ComposedContravariantCovariant<F, G> : `[`Contravariant`](./index.html)`<`[`Nested`](../-nested.html)`<`[`F`](../-composed-contravariant-covariant/index.html#F)`, `[`G`](../-composed-contravariant-covariant/index.html#G)`>>` |
| [ComposedCovariantContravariant](../-composed-covariant-contravariant/index.html) | `interface ComposedCovariantContravariant<F, G> : `[`Contravariant`](./index.html)`<`[`Nested`](../-nested.html)`<`[`F`](../-composed-covariant-contravariant/index.html#F)`, `[`G`](../-composed-covariant-contravariant/index.html#G)`>>` |




## Type Class Hierarchy

<canvas id="arrow.typeclasses-hierarchy-diagram"></canvas>
<script>
  drawNomNomlDiagram('arrow.typeclasses-hierarchy-diagram', 'arrow.typeclasses-diagram.nomnol')
</script>

