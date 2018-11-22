---
title: CocomposedFunctor - arrow-typeclasses
---

[arrow-typeclasses](../../index.html) / [arrow.typeclasses](../index.html) / [CocomposedFunctor](./index.html)

# CocomposedFunctor

`interface CocomposedFunctor<F, X> : `[`Functor`](../-functor/index.html)`<`[`Conested`](../-conested.html)`<`[`F`](index.html#F)`, `[`X`](index.html#X)`>>`

### Functions

| [F](-f.html) | `abstract fun F(): `[`Bifunctor`](../-bifunctor/index.html)`<`[`F`](index.html#F)`>` |
| [map](map.html) | `open fun <A, B> Kind<`[`Conested`](../-conested.html)`<`[`F`](index.html#F)`, `[`X`](index.html#X)`>, `[`A`](map.html#A)`>.map(f: (`[`A`](map.html#A)`) -> `[`B`](map.html#B)`): Kind<`[`Conested`](../-conested.html)`<`[`F`](index.html#F)`, `[`X`](index.html#X)`>, `[`B`](map.html#B)`>` |
| [mapC](map-c.html) | `open fun <A, B> `[`CounnestedType`](../-counnested-type.html)`<`[`F`](index.html#F)`, `[`A`](map-c.html#A)`, `[`X`](index.html#X)`>.mapC(f: (`[`A`](map-c.html#A)`) -> `[`B`](map-c.html#B)`): Kind2<`[`F`](index.html#F)`, `[`B`](map-c.html#B)`, `[`X`](index.html#X)`>` |

### Inherited Functions

| [as](../-functor/as.html) | `open fun <A, B> Kind<`[`F`](../-functor/index.html#F)`, `[`A`](../-functor/as.html#A)`>.as(b: `[`B`](../-functor/as.html#B)`): Kind<`[`F`](../-functor/index.html#F)`, `[`B`](../-functor/as.html#B)`>` |
| [fproduct](../-functor/fproduct.html) | `open fun <A, B> Kind<`[`F`](../-functor/index.html#F)`, `[`A`](../-functor/fproduct.html#A)`>.fproduct(f: (`[`A`](../-functor/fproduct.html#A)`) -> `[`B`](../-functor/fproduct.html#B)`): Kind<`[`F`](../-functor/index.html#F)`, Tuple2<`[`A`](../-functor/fproduct.html#A)`, `[`B`](../-functor/fproduct.html#B)`>>` |
| [imap](../-functor/imap.html) | `open fun <A, B> Kind<`[`F`](../-functor/index.html#F)`, `[`A`](../-functor/imap.html#A)`>.imap(f: (`[`A`](../-functor/imap.html#A)`) -> `[`B`](../-functor/imap.html#B)`, g: (`[`B`](../-functor/imap.html#B)`) -> `[`A`](../-functor/imap.html#A)`): Kind<`[`F`](../-functor/index.html#F)`, `[`B`](../-functor/imap.html#B)`>` |
| [lift](../-functor/lift.html) | `open fun <A, B> lift(f: (`[`A`](../-functor/lift.html#A)`) -> `[`B`](../-functor/lift.html#B)`): (Kind<`[`F`](../-functor/index.html#F)`, `[`A`](../-functor/lift.html#A)`>) -> Kind<`[`F`](../-functor/index.html#F)`, `[`B`](../-functor/lift.html#B)`>` |
| [tupleLeft](../-functor/tuple-left.html) | `open fun <A, B> Kind<`[`F`](../-functor/index.html#F)`, `[`A`](../-functor/tuple-left.html#A)`>.tupleLeft(b: `[`B`](../-functor/tuple-left.html#B)`): Kind<`[`F`](../-functor/index.html#F)`, Tuple2<`[`B`](../-functor/tuple-left.html#B)`, `[`A`](../-functor/tuple-left.html#A)`>>` |
| [tupleRight](../-functor/tuple-right.html) | `open fun <A, B> Kind<`[`F`](../-functor/index.html#F)`, `[`A`](../-functor/tuple-right.html#A)`>.tupleRight(b: `[`B`](../-functor/tuple-right.html#B)`): Kind<`[`F`](../-functor/index.html#F)`, Tuple2<`[`A`](../-functor/tuple-right.html#A)`, `[`B`](../-functor/tuple-right.html#B)`>>` |
| [void](../-functor/void.html) | `open fun <A> Kind<`[`F`](../-functor/index.html#F)`, `[`A`](../-functor/void.html#A)`>.void(): Kind<`[`F`](../-functor/index.html#F)`, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>` |
| [widen](../-functor/widen.html) | `open fun <B, A : `[`B`](../-functor/widen.html#B)`> Kind<`[`F`](../-functor/index.html#F)`, `[`A`](../-functor/widen.html#A)`>.widen(): Kind<`[`F`](../-functor/index.html#F)`, `[`B`](../-functor/widen.html#B)`>` |

### Companion Object Functions

| [invoke](invoke.html) | `operator fun <F, X> invoke(BF: `[`Bifunctor`](../-bifunctor/index.html)`<`[`F`](invoke.html#F)`>): `[`Functor`](../-functor/index.html)`<`[`Conested`](../-conested.html)`<`[`F`](invoke.html#F)`, `[`X`](invoke.html#X)`>>` |

### Extension Functions

| [compose](../compose.html) | `fun <F, G> `[`Invariant`](../-invariant/index.html)`<`[`F`](../compose.html#F)`>.compose(GF: `[`Invariant`](../-invariant/index.html)`<`[`G`](../compose.html#G)`>): `[`Invariant`](../-invariant/index.html)`<`[`Nested`](../-nested.html)`<`[`F`](../compose.html#F)`, `[`G`](../compose.html#G)`>>`<br>`fun <F, G> `[`Functor`](../-functor/index.html)`<`[`F`](../compose.html#F)`>.compose(GF: `[`Functor`](../-functor/index.html)`<`[`G`](../compose.html#G)`>): `[`Functor`](../-functor/index.html)`<`[`Nested`](../-nested.html)`<`[`F`](../compose.html#F)`, `[`G`](../compose.html#G)`>>` |
| [composeContravariant](../compose-contravariant.html) | `fun <F, G> `[`Invariant`](../-invariant/index.html)`<`[`F`](../compose-contravariant.html#F)`>.composeContravariant(GF: `[`Contravariant`](../-contravariant/index.html)`<`[`G`](../compose-contravariant.html#G)`>): `[`Invariant`](../-invariant/index.html)`<`[`Nested`](../-nested.html)`<`[`F`](../compose-contravariant.html#F)`, `[`G`](../compose-contravariant.html#G)`>>`<br>`fun <F, G> `[`Functor`](../-functor/index.html)`<`[`F`](../compose-contravariant.html#F)`>.composeContravariant(GF: `[`Contravariant`](../-contravariant/index.html)`<`[`G`](../compose-contravariant.html#G)`>): `[`Contravariant`](../-contravariant/index.html)`<`[`Nested`](../-nested.html)`<`[`F`](../compose-contravariant.html#F)`, `[`G`](../compose-contravariant.html#G)`>>` |
| [composeFunctor](../compose-functor.html) | `fun <F, G> `[`Invariant`](../-invariant/index.html)`<`[`F`](../compose-functor.html#F)`>.composeFunctor(GF: `[`Functor`](../-functor/index.html)`<`[`G`](../compose-functor.html#G)`>): `[`Invariant`](../-invariant/index.html)`<`[`Nested`](../-nested.html)`<`[`F`](../compose-functor.html#F)`, `[`G`](../compose-functor.html#G)`>>` |

