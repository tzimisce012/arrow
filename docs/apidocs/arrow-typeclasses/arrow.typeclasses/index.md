---
title: arrow.typeclasses - arrow-typeclasses
---

[arrow-typeclasses](../index.html) / [arrow.typeclasses](./index.html)

## Package arrow.typeclasses

### Types

| [Alternative](-alternative.html) | `interface Alternative<F> : `[`Applicative`](-applicative/index.html)`<`[`F`](-alternative.html#F)`>, `[`MonoidK`](-monoid-k/index.html)`<`[`F`](-alternative.html#F)`>`<br> |
| [Applicative](-applicative/index.html) | `interface Applicative<F> : `[`Functor`](-functor/index.html)`<`[`F`](-applicative/index.html#F)`>`<br> |
| [ApplicativeError](-applicative-error/index.html) | `interface ApplicativeError<F, E> : `[`Applicative`](-applicative/index.html)`<`[`F`](-applicative-error/index.html#F)`>`<br> |
| [Bifoldable](-bifoldable/index.html) | `interface Bifoldable<F>`<br> |
| [Bifunctor](-bifunctor/index.html) | `interface Bifunctor<F>`<br> |
| [Bimonad](-bimonad.html) | `interface Bimonad<F> : `[`Monad`](-monad/index.html)`<`[`F`](-bimonad.html#F)`>, `[`Comonad`](-comonad/index.html)`<`[`F`](-bimonad.html#F)`>`<br> |
| [BindingInContextContinuation](-binding-in-context-continuation/index.html) | `interface BindingInContextContinuation<in T> : Continuation<`[`T`](-binding-in-context-continuation/index.html#T)`>` |
| [Category](-category/index.html) | `interface Category<F>`<br> |
| [CocomposedFunctor](-cocomposed-functor/index.html) | `interface CocomposedFunctor<F, X> : `[`Functor`](-functor/index.html)`<`[`Conested`](-conested.html)`<`[`F`](-cocomposed-functor/index.html#F)`, `[`X`](-cocomposed-functor/index.html#X)`>>` |
| [Comonad](-comonad/index.html) | `interface Comonad<F> : `[`Functor`](-functor/index.html)`<`[`F`](-comonad/index.html#F)`>`<br> |
| [ComonadContinuation](-comonad-continuation/index.html) | `open class ComonadContinuation<F, A : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> : `[`Serializable`](http://docs.oracle.com/javase/6/docs/api/java/io/Serializable.html)`, Continuation<`[`A`](-comonad-continuation/index.html#A)`>, `[`Comonad`](-comonad/index.html)`<`[`F`](-comonad-continuation/index.html#F)`>` |
| [ComposedAlternative](-composed-alternative/index.html) | `interface ComposedAlternative<F, G> : `[`Alternative`](-alternative.html)`<`[`Nested`](-nested.html)`<`[`F`](-composed-alternative/index.html#F)`, `[`G`](-composed-alternative/index.html#G)`>>, `[`ComposedApplicative`](-composed-applicative/index.html)`<`[`F`](-composed-alternative/index.html#F)`, `[`G`](-composed-alternative/index.html#G)`>, `[`ComposedMonoidK`](-composed-monoid-k/index.html)`<`[`F`](-composed-alternative/index.html#F)`, `[`G`](-composed-alternative/index.html#G)`>` |
| [ComposedApplicative](-composed-applicative/index.html) | `interface ComposedApplicative<F, G> : `[`Applicative`](-applicative/index.html)`<`[`Nested`](-nested.html)`<`[`F`](-composed-applicative/index.html#F)`, `[`G`](-composed-applicative/index.html#G)`>>, `[`ComposedFunctor`](-composed-functor/index.html)`<`[`F`](-composed-applicative/index.html#F)`, `[`G`](-composed-applicative/index.html#G)`>` |
| [ComposedBifoldable](-composed-bifoldable/index.html) | `interface ComposedBifoldable<F, G> : `[`Bifoldable`](-bifoldable/index.html)`<`[`Nested`](-nested.html)`<`[`F`](-composed-bifoldable/index.html#F)`, `[`G`](-composed-bifoldable/index.html#G)`>>` |
| [ComposedBifunctor](-composed-bifunctor/index.html) | `interface ComposedBifunctor<F, G> : `[`Bifunctor`](-bifunctor/index.html)`<`[`Nested`](-nested.html)`<`[`F`](-composed-bifunctor/index.html#F)`, `[`G`](-composed-bifunctor/index.html#G)`>>` |
| [ComposedContravariant](-composed-contravariant/index.html) | `interface ComposedContravariant<F, G> : `[`Functor`](-functor/index.html)`<`[`Nested`](-nested.html)`<`[`F`](-composed-contravariant/index.html#F)`, `[`G`](-composed-contravariant/index.html#G)`>>` |
| [ComposedContravariantCovariant](-composed-contravariant-covariant/index.html) | `interface ComposedContravariantCovariant<F, G> : `[`Contravariant`](-contravariant/index.html)`<`[`Nested`](-nested.html)`<`[`F`](-composed-contravariant-covariant/index.html#F)`, `[`G`](-composed-contravariant-covariant/index.html#G)`>>` |
| [ComposedCovariantContravariant](-composed-covariant-contravariant/index.html) | `interface ComposedCovariantContravariant<F, G> : `[`Contravariant`](-contravariant/index.html)`<`[`Nested`](-nested.html)`<`[`F`](-composed-covariant-contravariant/index.html#F)`, `[`G`](-composed-covariant-contravariant/index.html#G)`>>` |
| [ComposedFoldable](-composed-foldable/index.html) | `interface ComposedFoldable<F, G> : `[`Foldable`](-foldable/index.html)`<`[`Nested`](-nested.html)`<`[`F`](-composed-foldable/index.html#F)`, `[`G`](-composed-foldable/index.html#G)`>>` |
| [ComposedFunctor](-composed-functor/index.html) | `interface ComposedFunctor<F, G> : `[`Functor`](-functor/index.html)`<`[`Nested`](-nested.html)`<`[`F`](-composed-functor/index.html#F)`, `[`G`](-composed-functor/index.html#G)`>>` |
| [ComposedInvariant](-composed-invariant/index.html) | `interface ComposedInvariant<F, G> : `[`Invariant`](-invariant/index.html)`<`[`Nested`](-nested.html)`<`[`F`](-composed-invariant/index.html#F)`, `[`G`](-composed-invariant/index.html#G)`>>` |
| [ComposedInvariantContravariant](-composed-invariant-contravariant/index.html) | `interface ComposedInvariantContravariant<F, G> : `[`Invariant`](-invariant/index.html)`<`[`Nested`](-nested.html)`<`[`F`](-composed-invariant-contravariant/index.html#F)`, `[`G`](-composed-invariant-contravariant/index.html#G)`>>` |
| [ComposedInvariantCovariant](-composed-invariant-covariant/index.html) | `interface ComposedInvariantCovariant<F, G> : `[`Invariant`](-invariant/index.html)`<`[`Nested`](-nested.html)`<`[`F`](-composed-invariant-covariant/index.html#F)`, `[`G`](-composed-invariant-covariant/index.html#G)`>>` |
| [ComposedMonoidK](-composed-monoid-k/index.html) | `interface ComposedMonoidK<F, G> : `[`MonoidK`](-monoid-k/index.html)`<`[`Nested`](-nested.html)`<`[`F`](-composed-monoid-k/index.html#F)`, `[`G`](-composed-monoid-k/index.html#G)`>>, `[`ComposedSemigroupK`](-composed-semigroup-k/index.html)`<`[`F`](-composed-monoid-k/index.html#F)`, `[`G`](-composed-monoid-k/index.html#G)`>` |
| [ComposedSemigroupK](-composed-semigroup-k/index.html) | `interface ComposedSemigroupK<F, G> : `[`SemigroupK`](-semigroup-k/index.html)`<`[`Nested`](-nested.html)`<`[`F`](-composed-semigroup-k/index.html#F)`, `[`G`](-composed-semigroup-k/index.html#G)`>>` |
| [ComposedTraverse](-composed-traverse/index.html) | `interface ComposedTraverse<F, G> : `[`Traverse`](-traverse/index.html)`<`[`Nested`](-nested.html)`<`[`F`](-composed-traverse/index.html#F)`, `[`G`](-composed-traverse/index.html#G)`>>, `[`ComposedFoldable`](-composed-foldable/index.html)`<`[`F`](-composed-traverse/index.html#F)`, `[`G`](-composed-traverse/index.html#G)`>` |
| [Conested](-conested.html) | `interface Conested<out F, out B>`<br>A type to represent λ[α =&gt; Kind[F,α,C](#)] |
| [Const](-const/index.html) | `data class Const<A, out T> : `[`ConstOf`](-const-of.html)`<`[`A`](-const/index.html#A)`, `[`T`](-const/index.html#T)`>` |
| [Continuation](-continuation/index.html) | `interface Continuation<in T> : `[`Continuation`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.coroutines/-continuation/index.html)`<`[`T`](-continuation/index.html#T)`>` |
| [Contravariant](-contravariant/index.html) | `interface Contravariant<F> : `[`Invariant`](-invariant/index.html)`<`[`F`](-contravariant/index.html#F)`>`<br> |
| [Eq](-eq/index.html) | `interface Eq<in F>`<br> |
| [Foldable](-foldable/index.html) | `interface Foldable<F>`<br> |
| [ForConst](-for-const.html) | `class ForConst` |
| [ForMonoid](-for-monoid.html) | `class ForMonoid` |
| [Functor](-functor/index.html) | `interface Functor<F> : `[`Invariant`](-invariant/index.html)`<`[`F`](-functor/index.html#F)`>`<br> |
| [Hash](-hash/index.html) | `interface Hash<in F> : `[`Eq`](-eq/index.html)`<`[`F`](-hash/index.html#F)`>`<br>A type class used to represent hashing for objects of type [F](-hash/index.html#F) |
| [Inject](-inject/index.html) | `interface Inject<F, G>`<br>Inject type class as described in "Data types a la carte" (Swierstra 2008). |
| [Invariant](-invariant/index.html) | `interface Invariant<F>`<br> |
| [Monad](-monad/index.html) | `interface Monad<F> : `[`Applicative`](-applicative/index.html)`<`[`F`](-monad/index.html#F)`>`<br> |
| [MonadContinuation](-monad-continuation/index.html) | `open class MonadContinuation<F, A> : Continuation<Kind<`[`F`](-monad-continuation/index.html#F)`, `[`A`](-monad-continuation/index.html#A)`>>, `[`Monad`](-monad/index.html)`<`[`F`](-monad-continuation/index.html#F)`>` |
| [MonadError](-monad-error/index.html) | `interface MonadError<F, E> : `[`ApplicativeError`](-applicative-error/index.html)`<`[`F`](-monad-error/index.html#F)`, `[`E`](-monad-error/index.html#E)`>, `[`Monad`](-monad/index.html)`<`[`F`](-monad-error/index.html#F)`>`<br> |
| [MonadErrorContinuation](-monad-error-continuation/index.html) | `open class MonadErrorContinuation<F, A> : `[`MonadContinuation`](-monad-continuation/index.html)`<`[`F`](-monad-error-continuation/index.html#F)`, `[`A`](-monad-error-continuation/index.html#A)`>, `[`MonadError`](-monad-error/index.html)`<`[`F`](-monad-error-continuation/index.html#F)`, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>` |
| [MonadThrow](-monad-throw/index.html) | `interface MonadThrow<F> : `[`MonadError`](-monad-error/index.html)`<`[`F`](-monad-throw/index.html#F)`, `[`Throwable`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-throwable/index.html)`>` |
| [Monoid](-monoid/index.html) | `interface Monoid<A> : `[`Semigroup`](-semigroup/index.html)`<`[`A`](-monoid/index.html#A)`>, `[`MonoidOf`](-monoid-of.html)`<`[`A`](-monoid/index.html#A)`>`<br> |
| [MonoidK](-monoid-k/index.html) | `interface MonoidK<F> : `[`SemigroupK`](-semigroup-k/index.html)`<`[`F`](-monoid-k/index.html#F)`>`<br> |
| [Nested](-nested.html) | `interface Nested<out F, out G>`<br>A type to represent λ[α =&gt; Kind[F,C,α](#)] |
| [NonEmptyReducible](-non-empty-reducible/index.html) | `interface NonEmptyReducible<F, G> : `[`Reducible`](-reducible/index.html)`<`[`F`](-non-empty-reducible/index.html#F)`>`<br> |
| [Order](-order/index.html) | `interface Order<F> : `[`Eq`](-eq/index.html)`<`[`F`](-order/index.html#F)`>`<br> |
| [Profunctor](-profunctor/index.html) | `interface Profunctor<F>`<br> |
| [Reducible](-reducible/index.html) | `interface Reducible<F> : `[`Foldable`](-foldable/index.html)`<`[`F`](-reducible/index.html#F)`>`<br> |
| [Semigroup](-semigroup/index.html) | `interface Semigroup<A>`<br> |
| [SemigroupK](-semigroup-k/index.html) | `interface SemigroupK<F>`<br> |
| [Show](-show/index.html) | `interface Show<in A>`<br> |
| [Traverse](-traverse/index.html) | `interface Traverse<F> : `[`Functor`](-functor/index.html)`<`[`F`](-traverse/index.html#F)`>, `[`Foldable`](-foldable/index.html)`<`[`F`](-traverse/index.html#F)`>`<br> |

### Type Aliases

| [BinestedType](-binested-type.html) | `typealias BinestedType<F, G, A, B> = Kind2<`[`Nested`](-nested.html)`<`[`F`](-binested-type.html#F)`, `[`G`](-binested-type.html#G)`>, `[`A`](-binested-type.html#A)`, `[`B`](-binested-type.html#B)`>` |
| [BiunnestedType](-biunnested-type.html) | `typealias BiunnestedType<F, G, A, B> = Kind2<`[`F`](-biunnested-type.html#F)`, Kind2<`[`G`](-biunnested-type.html#G)`, `[`A`](-biunnested-type.html#A)`, `[`B`](-biunnested-type.html#B)`>, Kind2<`[`G`](-biunnested-type.html#G)`, `[`A`](-biunnested-type.html#A)`, `[`B`](-biunnested-type.html#B)`>>` |
| [ConestedType](-conested-type.html) | `typealias ConestedType<F, A, B> = Kind<`[`Conested`](-conested.html)`<`[`F`](-conested-type.html#F)`, `[`B`](-conested-type.html#B)`>, `[`A`](-conested-type.html#A)`>` |
| [ConstOf](-const-of.html) | `typealias ConstOf<A, T> = Kind2<`[`ForConst`](-for-const.html)`, `[`A`](-const-of.html#A)`, `[`T`](-const-of.html#T)`>` |
| [ConstPartialOf](-const-partial-of.html) | `typealias ConstPartialOf<A> = Kind<`[`ForConst`](-for-const.html)`, `[`A`](-const-partial-of.html#A)`>` |
| [CounnestedType](-counnested-type.html) | `typealias CounnestedType<F, A, B> = Kind<Kind<`[`F`](-counnested-type.html#F)`, `[`A`](-counnested-type.html#A)`>, `[`B`](-counnested-type.html#B)`>` |
| [MonoidOf](-monoid-of.html) | `typealias MonoidOf<A> = Kind<`[`ForMonoid`](-for-monoid.html)`, `[`A`](-monoid-of.html#A)`>` |
| [NestedType](-nested-type.html) | `typealias NestedType<F, G, A> = Kind<`[`Nested`](-nested.html)`<`[`F`](-nested-type.html#F)`, `[`G`](-nested-type.html#G)`>, `[`A`](-nested-type.html#A)`>` |
| [UnnestedType](-unnested-type.html) | `typealias UnnestedType<F, G, A> = Kind<`[`F`](-unnested-type.html#F)`, Kind<`[`G`](-unnested-type.html#G)`, `[`A`](-unnested-type.html#A)`>>` |

### Extensions for External Classes

| [arrow.Kind](arrow.-kind/index.html) |  |
| [kotlin.coroutines.Continuation](kotlin.coroutines.-continuation/index.html) |  |

### Functions

| [cobinding](cobinding.html) | `fun <F, B : `[`Any`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)`> `[`Comonad`](-comonad/index.html)`<`[`F`](cobinding.html#F)`>.cobinding(c: suspend `[`ComonadContinuation`](-comonad-continuation/index.html)`<`[`F`](cobinding.html#F)`, *>.() -> `[`B`](cobinding.html#B)`): `[`B`](cobinding.html#B)<br>Entry point for monad bindings which enables for comprehension. The underlying impl is based on coroutines. A coroutine is initiated and inside `MonadContinuation` suspended yielding to `flatMap` once all the flatMap binds are completed the underlying monad is returned from the act of executing the coroutine |
| [compose](compose.html) | `fun <F, G> `[`Foldable`](-foldable/index.html)`<`[`F`](compose.html#F)`>.compose(GT: `[`Foldable`](-foldable/index.html)`<`[`G`](compose.html#G)`>): `[`ComposedFoldable`](-composed-foldable/index.html)`<`[`F`](compose.html#F)`, `[`G`](compose.html#G)`>`<br>`fun <F, G> `[`Traverse`](-traverse/index.html)`<`[`F`](compose.html#F)`>.compose(GT: `[`Traverse`](-traverse/index.html)`<`[`G`](compose.html#G)`>, GA: `[`Applicative`](-applicative/index.html)`<`[`G`](compose.html#G)`>): `[`Traverse`](-traverse/index.html)`<`[`Nested`](-nested.html)`<`[`F`](compose.html#F)`, `[`G`](compose.html#G)`>>`<br>`fun <F, G> `[`SemigroupK`](-semigroup-k/index.html)`<`[`F`](compose.html#F)`>.compose(): `[`SemigroupK`](-semigroup-k/index.html)`<`[`Nested`](-nested.html)`<`[`F`](compose.html#F)`, `[`G`](compose.html#G)`>>`<br>`fun <F, G> `[`MonoidK`](-monoid-k/index.html)`<`[`F`](compose.html#F)`>.compose(): `[`MonoidK`](-monoid-k/index.html)`<`[`Nested`](-nested.html)`<`[`F`](compose.html#F)`, `[`G`](compose.html#G)`>>`<br>`fun <F, G> `[`Invariant`](-invariant/index.html)`<`[`F`](compose.html#F)`>.compose(GF: `[`Invariant`](-invariant/index.html)`<`[`G`](compose.html#G)`>): `[`Invariant`](-invariant/index.html)`<`[`Nested`](-nested.html)`<`[`F`](compose.html#F)`, `[`G`](compose.html#G)`>>`<br>`fun <F, G> `[`Functor`](-functor/index.html)`<`[`F`](compose.html#F)`>.compose(GF: `[`Functor`](-functor/index.html)`<`[`G`](compose.html#G)`>): `[`Functor`](-functor/index.html)`<`[`Nested`](-nested.html)`<`[`F`](compose.html#F)`, `[`G`](compose.html#G)`>>`<br>`fun <F, G> `[`Contravariant`](-contravariant/index.html)`<`[`F`](compose.html#F)`>.compose(GF: `[`Contravariant`](-contravariant/index.html)`<`[`G`](compose.html#G)`>): `[`Functor`](-functor/index.html)`<`[`Nested`](-nested.html)`<`[`F`](compose.html#F)`, `[`G`](compose.html#G)`>>`<br>`fun <F, G> `[`Applicative`](-applicative/index.html)`<`[`F`](compose.html#F)`>.compose(GA: `[`Applicative`](-applicative/index.html)`<`[`G`](compose.html#G)`>): `[`Applicative`](-applicative/index.html)`<`[`Nested`](-nested.html)`<`[`F`](compose.html#F)`, `[`G`](compose.html#G)`>>`<br>`fun <F, G> `[`Alternative`](-alternative.html)`<`[`F`](compose.html#F)`>.compose(GA: `[`Applicative`](-applicative/index.html)`<`[`G`](compose.html#G)`>): `[`Alternative`](-alternative.html)`<`[`Nested`](-nested.html)`<`[`F`](compose.html#F)`, `[`G`](compose.html#G)`>>`<br>`fun <F, G> `[`Bifoldable`](-bifoldable/index.html)`<`[`F`](compose.html#F)`>.compose(BG: `[`Bifoldable`](-bifoldable/index.html)`<`[`G`](compose.html#G)`>): `[`Bifoldable`](-bifoldable/index.html)`<`[`Nested`](-nested.html)`<`[`F`](compose.html#F)`, `[`G`](compose.html#G)`>>`<br>`fun <F, G> `[`Bifunctor`](-bifunctor/index.html)`<`[`F`](compose.html#F)`>.compose(BG: `[`Bifunctor`](-bifunctor/index.html)`<`[`G`](compose.html#G)`>): `[`Bifunctor`](-bifunctor/index.html)`<`[`Nested`](-nested.html)`<`[`F`](compose.html#F)`, `[`G`](compose.html#G)`>>` |
| [composeContravariant](compose-contravariant.html) | `fun <F, G> `[`Invariant`](-invariant/index.html)`<`[`F`](compose-contravariant.html#F)`>.composeContravariant(GF: `[`Contravariant`](-contravariant/index.html)`<`[`G`](compose-contravariant.html#G)`>): `[`Invariant`](-invariant/index.html)`<`[`Nested`](-nested.html)`<`[`F`](compose-contravariant.html#F)`, `[`G`](compose-contravariant.html#G)`>>`<br>`fun <F, G> `[`Functor`](-functor/index.html)`<`[`F`](compose-contravariant.html#F)`>.composeContravariant(GF: `[`Contravariant`](-contravariant/index.html)`<`[`G`](compose-contravariant.html#G)`>): `[`Contravariant`](-contravariant/index.html)`<`[`Nested`](-nested.html)`<`[`F`](compose-contravariant.html#F)`, `[`G`](compose-contravariant.html#G)`>>` |
| [composeFunctor](compose-functor.html) | `fun <F, G> `[`Invariant`](-invariant/index.html)`<`[`F`](compose-functor.html#F)`>.composeFunctor(GF: `[`Functor`](-functor/index.html)`<`[`G`](compose-functor.html#G)`>): `[`Invariant`](-invariant/index.html)`<`[`Nested`](-nested.html)`<`[`F`](compose-functor.html#F)`, `[`G`](compose-functor.html#G)`>>`<br>`fun <F, G> `[`Contravariant`](-contravariant/index.html)`<`[`F`](compose-functor.html#F)`>.composeFunctor(GF: `[`Functor`](-functor/index.html)`<`[`G`](compose-functor.html#G)`>): `[`Contravariant`](-contravariant/index.html)`<`[`Nested`](-nested.html)`<`[`F`](compose-functor.html#F)`, `[`G`](compose-functor.html#G)`>>` |
| [const](const.html) | `fun <A> `[`A`](const.html#A)`.const(): `[`Const`](-const/index.html)`<`[`A`](const.html#A)`, `[`Nothing`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-nothing/index.html)`>` |




## Type Class Hierarchy

<canvas id="arrow.typeclasses-hierarchy-diagram"></canvas>
<script>
  drawNomNomlDiagram('arrow.typeclasses-hierarchy-diagram', 'arrow.typeclasses-diagram.nomnol')
</script>

