---
title: Bimonad - arrow-typeclasses
---

[arrow-typeclasses](../index.html) / [arrow.typeclasses](index.html) / [Bimonad](./-bimonad.html)

# Bimonad

`interface Bimonad<F> : `[`Monad`](-monad/index.html)`<`[`F`](-bimonad.html#F)`>, `[`Comonad`](-comonad/index.html)`<`[`F`](-bimonad.html#F)`>`



### Inherited Functions

| [ap](-monad/ap.html) | `open fun <A, B> Kind<`[`F`](-monad/index.html#F)`, `[`A`](-monad/ap.html#A)`>.ap(ff: Kind<`[`F`](-monad/index.html#F)`, (`[`A`](-monad/ap.html#A)`) -> `[`B`](-monad/ap.html#B)`>): Kind<`[`F`](-monad/index.html#F)`, `[`B`](-monad/ap.html#B)`>` |
| [binding](-monad/binding.html) | `open fun <B> binding(c: suspend `[`MonadContinuation`](-monad-continuation/index.html)`<`[`F`](-monad/index.html#F)`, *>.() -> `[`B`](-monad/binding.html#B)`): Kind<`[`F`](-monad/index.html#F)`, `[`B`](-monad/binding.html#B)`>`<br>Entry point for monad bindings which enables for comprehension. The underlying implementation is based on coroutines. A coroutine is initiated and suspended inside [MonadErrorContinuation](-monad-error-continuation/index.html) yielding to [Monad.flatMap](-monad/flat-map.html). Once all the flatMap binds are completed the underlying monad is returned from the act of executing the coroutine |
| [coflatMap](-comonad/coflat-map.html) | `abstract fun <A, B> Kind<`[`F`](-comonad/index.html#F)`, `[`A`](-comonad/coflat-map.html#A)`>.coflatMap(f: (Kind<`[`F`](-comonad/index.html#F)`, `[`A`](-comonad/coflat-map.html#A)`>) -> `[`B`](-comonad/coflat-map.html#B)`): Kind<`[`F`](-comonad/index.html#F)`, `[`B`](-comonad/coflat-map.html#B)`>` |
| [duplicate](-comonad/duplicate.html) | `open fun <A> Kind<`[`F`](-comonad/index.html#F)`, `[`A`](-comonad/duplicate.html#A)`>.duplicate(): Kind<`[`F`](-comonad/index.html#F)`, Kind<`[`F`](-comonad/index.html#F)`, `[`A`](-comonad/duplicate.html#A)`>>` |
| [effectM](-monad/effect-m.html) | `open fun <A, B> Kind<`[`F`](-monad/index.html#F)`, `[`A`](-monad/effect-m.html#A)`>.effectM(f: (`[`A`](-monad/effect-m.html#A)`) -> Kind<`[`F`](-monad/index.html#F)`, `[`B`](-monad/effect-m.html#B)`>): Kind<`[`F`](-monad/index.html#F)`, `[`A`](-monad/effect-m.html#A)`>` |
| [extract](-comonad/extract.html) | `abstract fun <A> Kind<`[`F`](-comonad/index.html#F)`, `[`A`](-comonad/extract.html#A)`>.extract(): `[`A`](-comonad/extract.html#A) |
| [flatMap](-monad/flat-map.html) | `abstract fun <A, B> Kind<`[`F`](-monad/index.html#F)`, `[`A`](-monad/flat-map.html#A)`>.flatMap(f: (`[`A`](-monad/flat-map.html#A)`) -> Kind<`[`F`](-monad/index.html#F)`, `[`B`](-monad/flat-map.html#B)`>): Kind<`[`F`](-monad/index.html#F)`, `[`B`](-monad/flat-map.html#B)`>` |
| [flatten](-monad/flatten.html) | `open fun <A> Kind<`[`F`](-monad/index.html#F)`, Kind<`[`F`](-monad/index.html#F)`, `[`A`](-monad/flatten.html#A)`>>.flatten(): Kind<`[`F`](-monad/index.html#F)`, `[`A`](-monad/flatten.html#A)`>` |
| [followedBy](-monad/followed-by.html) | `open fun <A, B> Kind<`[`F`](-monad/index.html#F)`, `[`A`](-monad/followed-by.html#A)`>.followedBy(fb: Kind<`[`F`](-monad/index.html#F)`, `[`B`](-monad/followed-by.html#B)`>): Kind<`[`F`](-monad/index.html#F)`, `[`B`](-monad/followed-by.html#B)`>` |
| [followedByEval](-monad/followed-by-eval.html) | `open fun <A, B> Kind<`[`F`](-monad/index.html#F)`, `[`A`](-monad/followed-by-eval.html#A)`>.followedByEval(fb: Eval<Kind<`[`F`](-monad/index.html#F)`, `[`B`](-monad/followed-by-eval.html#B)`>>): Kind<`[`F`](-monad/index.html#F)`, `[`B`](-monad/followed-by-eval.html#B)`>` |
| [forEffect](-monad/for-effect.html) | `open fun <A, B> Kind<`[`F`](-monad/index.html#F)`, `[`A`](-monad/for-effect.html#A)`>.forEffect(fb: Kind<`[`F`](-monad/index.html#F)`, `[`B`](-monad/for-effect.html#B)`>): Kind<`[`F`](-monad/index.html#F)`, `[`A`](-monad/for-effect.html#A)`>` |
| [forEffectEval](-monad/for-effect-eval.html) | `open fun <A, B> Kind<`[`F`](-monad/index.html#F)`, `[`A`](-monad/for-effect-eval.html#A)`>.forEffectEval(fb: Eval<Kind<`[`F`](-monad/index.html#F)`, `[`B`](-monad/for-effect-eval.html#B)`>>): Kind<`[`F`](-monad/index.html#F)`, `[`A`](-monad/for-effect-eval.html#A)`>` |
| [ifM](-monad/if-m.html) | `open fun <B> Kind<`[`F`](-monad/index.html#F)`, `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`>.ifM(ifTrue: () -> Kind<`[`F`](-monad/index.html#F)`, `[`B`](-monad/if-m.html#B)`>, ifFalse: () -> Kind<`[`F`](-monad/index.html#F)`, `[`B`](-monad/if-m.html#B)`>): Kind<`[`F`](-monad/index.html#F)`, `[`B`](-monad/if-m.html#B)`>` |
| [map](-monad/map.html) | `open fun <A, B> Kind<`[`F`](-monad/index.html#F)`, `[`A`](-monad/map.html#A)`>.map(f: (`[`A`](-monad/map.html#A)`) -> `[`B`](-monad/map.html#B)`): Kind<`[`F`](-monad/index.html#F)`, `[`B`](-monad/map.html#B)`>` |
| [mproduct](-monad/mproduct.html) | `open fun <A, B> Kind<`[`F`](-monad/index.html#F)`, `[`A`](-monad/mproduct.html#A)`>.mproduct(f: (`[`A`](-monad/mproduct.html#A)`) -> Kind<`[`F`](-monad/index.html#F)`, `[`B`](-monad/mproduct.html#B)`>): Kind<`[`F`](-monad/index.html#F)`, Tuple2<`[`A`](-monad/mproduct.html#A)`, `[`B`](-monad/mproduct.html#B)`>>` |
| [tailRecM](-monad/tail-rec-m.html) | `abstract fun <A, B> tailRecM(a: `[`A`](-monad/tail-rec-m.html#A)`, f: (`[`A`](-monad/tail-rec-m.html#A)`) -> Kind<`[`F`](-monad/index.html#F)`, Either<`[`A`](-monad/tail-rec-m.html#A)`, `[`B`](-monad/tail-rec-m.html#B)`>>): Kind<`[`F`](-monad/index.html#F)`, `[`B`](-monad/tail-rec-m.html#B)`>` |

### Extension Functions

| [cobinding](cobinding.html) | `fun <F, B : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> `[`Comonad`](-comonad/index.html)`<`[`F`](cobinding.html#F)`>.cobinding(c: suspend `[`ComonadContinuation`](-comonad-continuation/index.html)`<`[`F`](cobinding.html#F)`, *>.() -> `[`B`](cobinding.html#B)`): `[`B`](cobinding.html#B)<br>Entry point for monad bindings which enables for comprehension. The underlying impl is based on coroutines. A coroutine is initiated and inside `MonadContinuation` suspended yielding to `flatMap` once all the flatMap binds are completed the underlying monad is returned from the act of executing the coroutine |
| [compose](compose.html) | `fun <F, G> `[`Invariant`](-invariant/index.html)`<`[`F`](compose.html#F)`>.compose(GF: `[`Invariant`](-invariant/index.html)`<`[`G`](compose.html#G)`>): `[`Invariant`](-invariant/index.html)`<`[`Nested`](-nested.html)`<`[`F`](compose.html#F)`, `[`G`](compose.html#G)`>>`<br>`fun <F, G> `[`Functor`](-functor/index.html)`<`[`F`](compose.html#F)`>.compose(GF: `[`Functor`](-functor/index.html)`<`[`G`](compose.html#G)`>): `[`Functor`](-functor/index.html)`<`[`Nested`](-nested.html)`<`[`F`](compose.html#F)`, `[`G`](compose.html#G)`>>`<br>`fun <F, G> `[`Applicative`](-applicative/index.html)`<`[`F`](compose.html#F)`>.compose(GA: `[`Applicative`](-applicative/index.html)`<`[`G`](compose.html#G)`>): `[`Applicative`](-applicative/index.html)`<`[`Nested`](-nested.html)`<`[`F`](compose.html#F)`, `[`G`](compose.html#G)`>>` |
| [composeContravariant](compose-contravariant.html) | `fun <F, G> `[`Invariant`](-invariant/index.html)`<`[`F`](compose-contravariant.html#F)`>.composeContravariant(GF: `[`Contravariant`](-contravariant/index.html)`<`[`G`](compose-contravariant.html#G)`>): `[`Invariant`](-invariant/index.html)`<`[`Nested`](-nested.html)`<`[`F`](compose-contravariant.html#F)`, `[`G`](compose-contravariant.html#G)`>>`<br>`fun <F, G> `[`Functor`](-functor/index.html)`<`[`F`](compose-contravariant.html#F)`>.composeContravariant(GF: `[`Contravariant`](-contravariant/index.html)`<`[`G`](compose-contravariant.html#G)`>): `[`Contravariant`](-contravariant/index.html)`<`[`Nested`](-nested.html)`<`[`F`](compose-contravariant.html#F)`, `[`G`](compose-contravariant.html#G)`>>` |
| [composeFunctor](compose-functor.html) | `fun <F, G> `[`Invariant`](-invariant/index.html)`<`[`F`](compose-functor.html#F)`>.composeFunctor(GF: `[`Functor`](-functor/index.html)`<`[`G`](compose-functor.html#G)`>): `[`Invariant`](-invariant/index.html)`<`[`Nested`](-nested.html)`<`[`F`](compose-functor.html#F)`, `[`G`](compose-functor.html#G)`>>` |




## Type Class Hierarchy

<canvas id="arrow.typeclasses-hierarchy-diagram"></canvas>
<script>
  drawNomNomlDiagram('arrow.typeclasses-hierarchy-diagram', 'arrow.typeclasses-diagram.nomnol')
</script>

