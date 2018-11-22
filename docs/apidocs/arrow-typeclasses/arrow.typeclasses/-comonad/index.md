---
title: Comonad - arrow-typeclasses
---

[arrow-typeclasses](../../index.html) / [arrow.typeclasses](../index.html) / [Comonad](./index.html)

# Comonad

`interface Comonad<F> : `[`Functor`](../-functor/index.html)`<`[`F`](index.html#F)`>`



The dual of monads, used to extract values from F

### Functions

| [coflatMap](coflat-map.html) | `abstract fun <A, B> Kind<`[`F`](index.html#F)`, `[`A`](coflat-map.html#A)`>.coflatMap(f: (Kind<`[`F`](index.html#F)`, `[`A`](coflat-map.html#A)`>) -> `[`B`](coflat-map.html#B)`): Kind<`[`F`](index.html#F)`, `[`B`](coflat-map.html#B)`>` |
| [duplicate](duplicate.html) | `open fun <A> Kind<`[`F`](index.html#F)`, `[`A`](duplicate.html#A)`>.duplicate(): Kind<`[`F`](index.html#F)`, Kind<`[`F`](index.html#F)`, `[`A`](duplicate.html#A)`>>` |
| [extract](extract.html) | `abstract fun <A> Kind<`[`F`](index.html#F)`, `[`A`](extract.html#A)`>.extract(): `[`A`](extract.html#A) |

### Inherited Functions

| [as](../-functor/as.html) | `open fun <A, B> Kind<`[`F`](../-functor/index.html#F)`, `[`A`](../-functor/as.html#A)`>.as(b: `[`B`](../-functor/as.html#B)`): Kind<`[`F`](../-functor/index.html#F)`, `[`B`](../-functor/as.html#B)`>` |
| [fproduct](../-functor/fproduct.html) | `open fun <A, B> Kind<`[`F`](../-functor/index.html#F)`, `[`A`](../-functor/fproduct.html#A)`>.fproduct(f: (`[`A`](../-functor/fproduct.html#A)`) -> `[`B`](../-functor/fproduct.html#B)`): Kind<`[`F`](../-functor/index.html#F)`, Tuple2<`[`A`](../-functor/fproduct.html#A)`, `[`B`](../-functor/fproduct.html#B)`>>` |
| [imap](../-functor/imap.html) | `open fun <A, B> Kind<`[`F`](../-functor/index.html#F)`, `[`A`](../-functor/imap.html#A)`>.imap(f: (`[`A`](../-functor/imap.html#A)`) -> `[`B`](../-functor/imap.html#B)`, g: (`[`B`](../-functor/imap.html#B)`) -> `[`A`](../-functor/imap.html#A)`): Kind<`[`F`](../-functor/index.html#F)`, `[`B`](../-functor/imap.html#B)`>` |
| [lift](../-functor/lift.html) | `open fun <A, B> lift(f: (`[`A`](../-functor/lift.html#A)`) -> `[`B`](../-functor/lift.html#B)`): (Kind<`[`F`](../-functor/index.html#F)`, `[`A`](../-functor/lift.html#A)`>) -> Kind<`[`F`](../-functor/index.html#F)`, `[`B`](../-functor/lift.html#B)`>` |
| [map](../-functor/map.html) | `abstract fun <A, B> Kind<`[`F`](../-functor/index.html#F)`, `[`A`](../-functor/map.html#A)`>.map(f: (`[`A`](../-functor/map.html#A)`) -> `[`B`](../-functor/map.html#B)`): Kind<`[`F`](../-functor/index.html#F)`, `[`B`](../-functor/map.html#B)`>` |
| [tupleLeft](../-functor/tuple-left.html) | `open fun <A, B> Kind<`[`F`](../-functor/index.html#F)`, `[`A`](../-functor/tuple-left.html#A)`>.tupleLeft(b: `[`B`](../-functor/tuple-left.html#B)`): Kind<`[`F`](../-functor/index.html#F)`, Tuple2<`[`B`](../-functor/tuple-left.html#B)`, `[`A`](../-functor/tuple-left.html#A)`>>` |
| [tupleRight](../-functor/tuple-right.html) | `open fun <A, B> Kind<`[`F`](../-functor/index.html#F)`, `[`A`](../-functor/tuple-right.html#A)`>.tupleRight(b: `[`B`](../-functor/tuple-right.html#B)`): Kind<`[`F`](../-functor/index.html#F)`, Tuple2<`[`A`](../-functor/tuple-right.html#A)`, `[`B`](../-functor/tuple-right.html#B)`>>` |
| [void](../-functor/void.html) | `open fun <A> Kind<`[`F`](../-functor/index.html#F)`, `[`A`](../-functor/void.html#A)`>.void(): Kind<`[`F`](../-functor/index.html#F)`, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>` |
| [widen](../-functor/widen.html) | `open fun <B, A : `[`B`](../-functor/widen.html#B)`> Kind<`[`F`](../-functor/index.html#F)`, `[`A`](../-functor/widen.html#A)`>.widen(): Kind<`[`F`](../-functor/index.html#F)`, `[`B`](../-functor/widen.html#B)`>` |

### Extension Functions

| [cobinding](../cobinding.html) | `fun <F, B : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> `[`Comonad`](./index.html)`<`[`F`](../cobinding.html#F)`>.cobinding(c: suspend `[`ComonadContinuation`](../-comonad-continuation/index.html)`<`[`F`](../cobinding.html#F)`, *>.() -> `[`B`](../cobinding.html#B)`): `[`B`](../cobinding.html#B)<br>Entry point for monad bindings which enables for comprehension. The underlying impl is based on coroutines. A coroutine is initiated and inside `MonadContinuation` suspended yielding to `flatMap` once all the flatMap binds are completed the underlying monad is returned from the act of executing the coroutine |
| [compose](../compose.html) | `fun <F, G> `[`Invariant`](../-invariant/index.html)`<`[`F`](../compose.html#F)`>.compose(GF: `[`Invariant`](../-invariant/index.html)`<`[`G`](../compose.html#G)`>): `[`Invariant`](../-invariant/index.html)`<`[`Nested`](../-nested.html)`<`[`F`](../compose.html#F)`, `[`G`](../compose.html#G)`>>`<br>`fun <F, G> `[`Functor`](../-functor/index.html)`<`[`F`](../compose.html#F)`>.compose(GF: `[`Functor`](../-functor/index.html)`<`[`G`](../compose.html#G)`>): `[`Functor`](../-functor/index.html)`<`[`Nested`](../-nested.html)`<`[`F`](../compose.html#F)`, `[`G`](../compose.html#G)`>>` |
| [composeContravariant](../compose-contravariant.html) | `fun <F, G> `[`Invariant`](../-invariant/index.html)`<`[`F`](../compose-contravariant.html#F)`>.composeContravariant(GF: `[`Contravariant`](../-contravariant/index.html)`<`[`G`](../compose-contravariant.html#G)`>): `[`Invariant`](../-invariant/index.html)`<`[`Nested`](../-nested.html)`<`[`F`](../compose-contravariant.html#F)`, `[`G`](../compose-contravariant.html#G)`>>`<br>`fun <F, G> `[`Functor`](../-functor/index.html)`<`[`F`](../compose-contravariant.html#F)`>.composeContravariant(GF: `[`Contravariant`](../-contravariant/index.html)`<`[`G`](../compose-contravariant.html#G)`>): `[`Contravariant`](../-contravariant/index.html)`<`[`Nested`](../-nested.html)`<`[`F`](../compose-contravariant.html#F)`, `[`G`](../compose-contravariant.html#G)`>>` |
| [composeFunctor](../compose-functor.html) | `fun <F, G> `[`Invariant`](../-invariant/index.html)`<`[`F`](../compose-functor.html#F)`>.composeFunctor(GF: `[`Functor`](../-functor/index.html)`<`[`G`](../compose-functor.html#G)`>): `[`Invariant`](../-invariant/index.html)`<`[`Nested`](../-nested.html)`<`[`F`](../compose-functor.html#F)`, `[`G`](../compose-functor.html#G)`>>` |

### Inheritors

| [Bimonad](../-bimonad.html) | `interface Bimonad<F> : `[`Monad`](../-monad/index.html)`<`[`F`](../-bimonad.html#F)`>, `[`Comonad`](./index.html)`<`[`F`](../-bimonad.html#F)`>`<br> |
| [ComonadContinuation](../-comonad-continuation/index.html) | `open class ComonadContinuation<F, A : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Serializable`](http://docs.oracle.com/javase/6/docs/api/java/io/Serializable.html)`, Continuation<`[`A`](../-comonad-continuation/index.html#A)`>, `[`Comonad`](./index.html)`<`[`F`](../-comonad-continuation/index.html#F)`>` |




## Type Class Hierarchy

<canvas id="arrow.typeclasses-hierarchy-diagram"></canvas>
<script>
  drawNomNomlDiagram('arrow.typeclasses-hierarchy-diagram', 'arrow.typeclasses-diagram.nomnol')
</script>

