---
title: arrow.test.laws - arrow-test
---

[arrow-test](../index.html) / [arrow.test.laws](./index.html)

## Package arrow.test.laws

### Types

| [AlternativeLaws](-alternative-laws/index.html) | `object AlternativeLaws` |
| [ApplicativeErrorLaws](-applicative-error-laws/index.html) | `object ApplicativeErrorLaws` |
| [ApplicativeLaws](-applicative-laws/index.html) | `object ApplicativeLaws` |
| [AsyncLaws](-async-laws/index.html) | `object AsyncLaws` |
| [BifoldableLaws](-bifoldable-laws/index.html) | `object BifoldableLaws` |
| [BifunctorLaws](-bifunctor-laws/index.html) | `object BifunctorLaws` |
| [BirecursiveLaws](-birecursive-laws/index.html) | `object BirecursiveLaws` |
| [BracketLaws](-bracket-laws/index.html) | `object BracketLaws` |
| [CategoryLaws](-category-laws/index.html) | `object CategoryLaws` |
| [ComonadLaws](-comonad-laws/index.html) | `object ComonadLaws` |
| [ContravariantLaws](-contravariant-laws/index.html) | `object ContravariantLaws` |
| [CorecursiveLaws](-corecursive-laws/index.html) | `object CorecursiveLaws` |
| [EqLaws](-eq-laws/index.html) | `object EqLaws` |
| [FoldableLaws](-foldable-laws/index.html) | `object FoldableLaws` |
| [FunctorFilterLaws](-functor-filter-laws/index.html) | `object FunctorFilterLaws` |
| [FunctorLaws](-functor-laws/index.html) | `object FunctorLaws` |
| [HashLaws](-hash-laws/index.html) | `object HashLaws` |
| [InvariantLaws](-invariant-laws/index.html) | `object InvariantLaws` |
| [IsoLaws](-iso-laws/index.html) | `object IsoLaws` |
| [Law](-law/index.html) | `data class Law` |
| [LensLaws](-lens-laws/index.html) | `object LensLaws` |
| [MonadCombineLaws](-monad-combine-laws/index.html) | `object MonadCombineLaws` |
| [MonadDeferLaws](-monad-defer-laws/index.html) | `object MonadDeferLaws` |
| [MonadErrorLaws](-monad-error-laws/index.html) | `object MonadErrorLaws` |
| [MonadFilterLaws](-monad-filter-laws/index.html) | `object MonadFilterLaws` |
| [MonadLaws](-monad-laws/index.html) | `object MonadLaws` |
| [MonadStateLaws](-monad-state-laws/index.html) | `object MonadStateLaws` |
| [MonadWriterLaws](-monad-writer-laws/index.html) | `object MonadWriterLaws` |
| [MonoidKLaws](-monoid-k-laws/index.html) | `object MonoidKLaws` |
| [MonoidLaws](-monoid-laws/index.html) | `object MonoidLaws` |
| [OptionalLaws](-optional-laws/index.html) | `object OptionalLaws` |
| [OrderLaws](-order-laws/index.html) | `object OrderLaws` |
| [PrismLaws](-prism-laws/index.html) | `object PrismLaws` |
| [ProfunctorLaws](-profunctor-laws/index.html) | `object ProfunctorLaws` |
| [RecursiveLaws](-recursive-laws/index.html) | `object RecursiveLaws` |
| [ReducibleLaws](-reducible-laws/index.html) | `object ReducibleLaws` |
| [SemigroupKLaws](-semigroup-k-laws/index.html) | `object SemigroupKLaws` |
| [SemigroupLaws](-semigroup-laws/index.html) | `object SemigroupLaws` |
| [SetterLaws](-setter-laws/index.html) | `object SetterLaws` |
| [ShowLaws](-show-laws/index.html) | `object ShowLaws` |
| [TIC](-t-i-c/index.html) | `data class TIC<out A> : `[`TIK`](-t-i-k.html)`<`[`A`](-t-i-c/index.html#A)`>` |
| [TIF](-t-i-f.html) | `class TIF` |
| [TraversalLaws](-traversal-laws/index.html) | `object TraversalLaws` |
| [TraverseFilterLaws](-traverse-filter-laws/index.html) | `object TraverseFilterLaws` |
| [TraverseLaws](-traverse-laws/index.html) | `object TraverseLaws` |

### Type Aliases

| [TI](-t-i.html) | `typealias TI<A> = Tuple2<IdOf<`[`A`](-t-i.html#A)`>, IdOf<`[`A`](-t-i.html#A)`>>` |
| [TIK](-t-i-k.html) | `typealias TIK<A> = Kind<`[`TIF`](-t-i-f.html)`, `[`A`](-t-i-k.html#A)`>` |

### Extensions for External Classes

| [arrow.Kind](arrow.-kind/index.html) |  |

### Functions

| [equalUnderTheLaw](equal-under-the-law.html) | `fun <A> `[`A`](equal-under-the-law.html#A)`.equalUnderTheLaw(b: `[`A`](equal-under-the-law.html#A)`, eq: Eq<`[`A`](equal-under-the-law.html#A)`>): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [forFew](for-few.html) | `fun <A> forFew(amount: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, gena: Gen<`[`A`](for-few.html#A)`>, fn: (a: `[`A`](for-few.html#A)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`fun <A, B> forFew(amount: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, gena: Gen<`[`A`](for-few.html#A)`>, genb: Gen<`[`B`](for-few.html#B)`>, fn: (a: `[`A`](for-few.html#A)`, b: `[`B`](for-few.html#B)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`fun <A, B, C> forFew(amount: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, gena: Gen<`[`A`](for-few.html#A)`>, genb: Gen<`[`B`](for-few.html#B)`>, genc: Gen<`[`C`](for-few.html#C)`>, fn: (a: `[`A`](for-few.html#A)`, b: `[`B`](for-few.html#B)`, c: `[`C`](for-few.html#C)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`fun <A, B, C, D> forFew(amount: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, gena: Gen<`[`A`](for-few.html#A)`>, genb: Gen<`[`B`](for-few.html#B)`>, genc: Gen<`[`C`](for-few.html#C)`>, gend: Gen<`[`D`](for-few.html#D)`>, fn: (a: `[`A`](for-few.html#A)`, b: `[`B`](for-few.html#B)`, c: `[`C`](for-few.html#C)`, d: `[`D`](for-few.html#D)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)<br>`fun <A, B, C, D, E> forFew(amount: `[`Int`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)`, gena: Gen<`[`A`](for-few.html#A)`>, genb: Gen<`[`B`](for-few.html#B)`>, genc: Gen<`[`C`](for-few.html#C)`>, gend: Gen<`[`D`](for-few.html#D)`>, gene: Gen<`[`E`](for-few.html#E)`>, fn: (a: `[`A`](for-few.html#A)`, b: `[`B`](for-few.html#B)`, c: `[`C`](for-few.html#C)`, d: `[`D`](for-few.html#D)`, e: `[`E`](for-few.html#E)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html) |

