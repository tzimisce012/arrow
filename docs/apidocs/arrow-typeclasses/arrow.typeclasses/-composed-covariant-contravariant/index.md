---
title: ComposedCovariantContravariant - arrow-typeclasses
---

[arrow-typeclasses](../../index.html) / [arrow.typeclasses](../index.html) / [ComposedCovariantContravariant](./index.html)

# ComposedCovariantContravariant

`interface ComposedCovariantContravariant<F, G> : `[`Contravariant`](../-contravariant/index.html)`<`[`Nested`](../-nested.html)`<`[`F`](index.html#F)`, `[`G`](index.html#G)`>>`

### Functions

| [F](-f.html) | `abstract fun F(): `[`Functor`](../-functor/index.html)`<`[`F`](index.html#F)`>` |
| [G](-g.html) | `abstract fun G(): `[`Contravariant`](../-contravariant/index.html)`<`[`G`](index.html#G)`>` |
| [contramap](contramap.html) | `open fun <A, B> `[`NestedType`](../-nested-type.html)`<`[`F`](index.html#F)`, `[`G`](index.html#G)`, `[`A`](contramap.html#A)`>.contramap(f: (`[`B`](contramap.html#B)`) -> `[`A`](contramap.html#A)`): `[`NestedType`](../-nested-type.html)`<`[`F`](index.html#F)`, `[`G`](index.html#G)`, `[`B`](contramap.html#B)`>` |

### Inherited Functions

| [imap](../-contravariant/imap.html) | `open fun <A, B> Kind<`[`F`](../-contravariant/index.html#F)`, `[`A`](../-contravariant/imap.html#A)`>.imap(f: (`[`A`](../-contravariant/imap.html#A)`) -> `[`B`](../-contravariant/imap.html#B)`, g: (`[`B`](../-contravariant/imap.html#B)`) -> `[`A`](../-contravariant/imap.html#A)`): Kind<`[`F`](../-contravariant/index.html#F)`, `[`B`](../-contravariant/imap.html#B)`>` |
| [lift](../-contravariant/lift.html) | `open fun <A, B> lift(f: (`[`A`](../-contravariant/lift.html#A)`) -> `[`B`](../-contravariant/lift.html#B)`, dummy: `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)` = Unit): (Kind<`[`F`](../-contravariant/index.html#F)`, `[`B`](../-contravariant/lift.html#B)`>) -> Kind<`[`F`](../-contravariant/index.html#F)`, `[`A`](../-contravariant/lift.html#A)`>` |
| [narrow](../-contravariant/narrow.html) | `open fun <A, B : `[`A`](../-contravariant/narrow.html#A)`> Kind<`[`F`](../-contravariant/index.html#F)`, `[`A`](../-contravariant/narrow.html#A)`>.narrow(): Kind<`[`F`](../-contravariant/index.html#F)`, `[`B`](../-contravariant/narrow.html#B)`>` |

### Companion Object Functions

| [invoke](invoke.html) | `operator fun <F, G> invoke(FF: `[`Functor`](../-functor/index.html)`<`[`F`](invoke.html#F)`>, GF: `[`Contravariant`](../-contravariant/index.html)`<`[`G`](invoke.html#G)`>): `[`Contravariant`](../-contravariant/index.html)`<`[`Nested`](../-nested.html)`<`[`F`](invoke.html#F)`, `[`G`](invoke.html#G)`>>` |

### Extension Functions

| [compose](../compose.html) | `fun <F, G> `[`Invariant`](../-invariant/index.html)`<`[`F`](../compose.html#F)`>.compose(GF: `[`Invariant`](../-invariant/index.html)`<`[`G`](../compose.html#G)`>): `[`Invariant`](../-invariant/index.html)`<`[`Nested`](../-nested.html)`<`[`F`](../compose.html#F)`, `[`G`](../compose.html#G)`>>`<br>`fun <F, G> `[`Contravariant`](../-contravariant/index.html)`<`[`F`](../compose.html#F)`>.compose(GF: `[`Contravariant`](../-contravariant/index.html)`<`[`G`](../compose.html#G)`>): `[`Functor`](../-functor/index.html)`<`[`Nested`](../-nested.html)`<`[`F`](../compose.html#F)`, `[`G`](../compose.html#G)`>>` |
| [composeContravariant](../compose-contravariant.html) | `fun <F, G> `[`Invariant`](../-invariant/index.html)`<`[`F`](../compose-contravariant.html#F)`>.composeContravariant(GF: `[`Contravariant`](../-contravariant/index.html)`<`[`G`](../compose-contravariant.html#G)`>): `[`Invariant`](../-invariant/index.html)`<`[`Nested`](../-nested.html)`<`[`F`](../compose-contravariant.html#F)`, `[`G`](../compose-contravariant.html#G)`>>` |
| [composeFunctor](../compose-functor.html) | `fun <F, G> `[`Invariant`](../-invariant/index.html)`<`[`F`](../compose-functor.html#F)`>.composeFunctor(GF: `[`Functor`](../-functor/index.html)`<`[`G`](../compose-functor.html#G)`>): `[`Invariant`](../-invariant/index.html)`<`[`Nested`](../-nested.html)`<`[`F`](../compose-functor.html#F)`, `[`G`](../compose-functor.html#G)`>>`<br>`fun <F, G> `[`Contravariant`](../-contravariant/index.html)`<`[`F`](../compose-functor.html#F)`>.composeFunctor(GF: `[`Functor`](../-functor/index.html)`<`[`G`](../compose-functor.html#G)`>): `[`Contravariant`](../-contravariant/index.html)`<`[`Nested`](../-nested.html)`<`[`F`](../compose-functor.html#F)`, `[`G`](../compose-functor.html#G)`>>` |

