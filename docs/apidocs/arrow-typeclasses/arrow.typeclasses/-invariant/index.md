---
title: Invariant - arrow-typeclasses
---

[arrow-typeclasses](../../index.html) / [arrow.typeclasses](../index.html) / [Invariant](./index.html)

# Invariant

`interface Invariant<F>`



### Functions

| [imap](imap.html) | `abstract fun <A, B> Kind<`[`F`](index.html#F)`, `[`A`](imap.html#A)`>.imap(f: (`[`A`](imap.html#A)`) -> `[`B`](imap.html#B)`, g: (`[`B`](imap.html#B)`) -> `[`A`](imap.html#A)`): Kind<`[`F`](index.html#F)`, `[`B`](imap.html#B)`>` |

### Extension Functions

| [compose](../compose.html) | `fun <F, G> `[`Invariant`](./index.html)`<`[`F`](../compose.html#F)`>.compose(GF: `[`Invariant`](./index.html)`<`[`G`](../compose.html#G)`>): `[`Invariant`](./index.html)`<`[`Nested`](../-nested.html)`<`[`F`](../compose.html#F)`, `[`G`](../compose.html#G)`>>` |
| [composeContravariant](../compose-contravariant.html) | `fun <F, G> `[`Invariant`](./index.html)`<`[`F`](../compose-contravariant.html#F)`>.composeContravariant(GF: `[`Contravariant`](../-contravariant/index.html)`<`[`G`](../compose-contravariant.html#G)`>): `[`Invariant`](./index.html)`<`[`Nested`](../-nested.html)`<`[`F`](../compose-contravariant.html#F)`, `[`G`](../compose-contravariant.html#G)`>>` |
| [composeFunctor](../compose-functor.html) | `fun <F, G> `[`Invariant`](./index.html)`<`[`F`](../compose-functor.html#F)`>.composeFunctor(GF: `[`Functor`](../-functor/index.html)`<`[`G`](../compose-functor.html#G)`>): `[`Invariant`](./index.html)`<`[`Nested`](../-nested.html)`<`[`F`](../compose-functor.html#F)`, `[`G`](../compose-functor.html#G)`>>` |

### Inheritors

| [ComposedInvariant](../-composed-invariant/index.html) | `interface ComposedInvariant<F, G> : `[`Invariant`](./index.html)`<`[`Nested`](../-nested.html)`<`[`F`](../-composed-invariant/index.html#F)`, `[`G`](../-composed-invariant/index.html#G)`>>` |
| [ComposedInvariantContravariant](../-composed-invariant-contravariant/index.html) | `interface ComposedInvariantContravariant<F, G> : `[`Invariant`](./index.html)`<`[`Nested`](../-nested.html)`<`[`F`](../-composed-invariant-contravariant/index.html#F)`, `[`G`](../-composed-invariant-contravariant/index.html#G)`>>` |
| [ComposedInvariantCovariant](../-composed-invariant-covariant/index.html) | `interface ComposedInvariantCovariant<F, G> : `[`Invariant`](./index.html)`<`[`Nested`](../-nested.html)`<`[`F`](../-composed-invariant-covariant/index.html#F)`, `[`G`](../-composed-invariant-covariant/index.html#G)`>>` |
| [Contravariant](../-contravariant/index.html) | `interface Contravariant<F> : `[`Invariant`](./index.html)`<`[`F`](../-contravariant/index.html#F)`>`<br> |
| [Functor](../-functor/index.html) | `interface Functor<F> : `[`Invariant`](./index.html)`<`[`F`](../-functor/index.html#F)`>`<br> |




## Type Class Hierarchy

<canvas id="arrow.typeclasses-hierarchy-diagram"></canvas>
<script>
  drawNomNomlDiagram('arrow.typeclasses-hierarchy-diagram', 'arrow.typeclasses-diagram.nomnol')
</script>

