---
title: Foldable - arrow-typeclasses
---

[arrow-typeclasses](../../index.html) / [arrow.typeclasses](../index.html) / [Foldable](./index.html)

# Foldable

`interface Foldable<F>`



Data structures that can be folded to a summary value.

Foldable is implemented in terms of two basic methods:

* `fa.foldLeft(init, f)` eagerly folds `fa` from left-to-right.
* `fa.foldRight(init, f)` lazily folds `fa` from right-to-left.

Beyond these it provides many other useful methods related to folding over F values.

### Functions

| [combineAll](combine-all.html) | `open fun <A> Kind<`[`F`](index.html#F)`, `[`A`](combine-all.html#A)`>.combineAll(MN: `[`Monoid`](../-monoid/index.html)`<`[`A`](combine-all.html#A)`>): `[`A`](combine-all.html#A)<br>Alias for fold. |
| [exists](exists.html) | `open fun <A> Kind<`[`F`](index.html#F)`, `[`A`](exists.html#A)`>.exists(p: (`[`A`](exists.html#A)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Check whether at least one element satisfies the predicate. |
| [find](find.html) | `open fun <A> Kind<`[`F`](index.html#F)`, `[`A`](find.html#A)`>.find(f: (`[`A`](find.html#A)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): Option<`[`A`](find.html#A)`>`<br>Find the first element matching the predicate, if one exists. |
| [fold](fold.html) | `open fun <A> Kind<`[`F`](index.html#F)`, `[`A`](fold.html#A)`>.fold(MN: `[`Monoid`](../-monoid/index.html)`<`[`A`](fold.html#A)`>): `[`A`](fold.html#A)<br>Fold implemented using the given Monoid instance. |
| [foldLeft](fold-left.html) | `abstract fun <A, B> Kind<`[`F`](index.html#F)`, `[`A`](fold-left.html#A)`>.foldLeft(b: `[`B`](fold-left.html#B)`, f: (`[`B`](fold-left.html#B)`, `[`A`](fold-left.html#A)`) -> `[`B`](fold-left.html#B)`): `[`B`](fold-left.html#B)<br>Left associative fold on F using the provided function. |
| [foldM](fold-m.html) | `open fun <G, A, B> Kind<`[`F`](index.html#F)`, `[`A`](fold-m.html#A)`>.foldM(M: `[`Monad`](../-monad/index.html)`<`[`G`](fold-m.html#G)`>, z: `[`B`](fold-m.html#B)`, f: (`[`B`](fold-m.html#B)`, `[`A`](fold-m.html#A)`) -> Kind<`[`G`](fold-m.html#G)`, `[`B`](fold-m.html#B)`>): Kind<`[`G`](fold-m.html#G)`, `[`B`](fold-m.html#B)`>`<br>Left associative monadic folding on F. |
| [foldMap](fold-map.html) | `open fun <A, B> Kind<`[`F`](index.html#F)`, `[`A`](fold-map.html#A)`>.foldMap(MN: `[`Monoid`](../-monoid/index.html)`<`[`B`](fold-map.html#B)`>, f: (`[`A`](fold-map.html#A)`) -> `[`B`](fold-map.html#B)`): `[`B`](fold-map.html#B)<br>Fold implemented by mapping A values into B and then combining them using the given Monoid instance. |
| [foldMapM](fold-map-m.html) | `open fun <G, A, B, MA : `[`Monad`](../-monad/index.html)`<`[`G`](fold-map-m.html#G)`>, MO : `[`Monoid`](../-monoid/index.html)`<`[`B`](fold-map-m.html#B)`>> Kind<`[`F`](index.html#F)`, `[`A`](fold-map-m.html#A)`>.foldMapM(ma: `[`MA`](fold-map-m.html#MA)`, mo: `[`MO`](fold-map-m.html#MO)`, f: (`[`A`](fold-map-m.html#A)`) -> Kind<`[`G`](fold-map-m.html#G)`, `[`B`](fold-map-m.html#B)`>): Kind<`[`G`](fold-map-m.html#G)`, `[`B`](fold-map-m.html#B)`>`<br>Monadic folding on F by mapping A values to G, combining the B values using the given Monoid instance. |
| [foldRight](fold-right.html) | `abstract fun <A, B> Kind<`[`F`](index.html#F)`, `[`A`](fold-right.html#A)`>.foldRight(lb: Eval<`[`B`](fold-right.html#B)`>, f: (`[`A`](fold-right.html#A)`, Eval<`[`B`](fold-right.html#B)`>) -> Eval<`[`B`](fold-right.html#B)`>): Eval<`[`B`](fold-right.html#B)`>`<br>Right associative lazy fold on F using the provided function. |
| [forAll](for-all.html) | `open fun <A> Kind<`[`F`](index.html#F)`, `[`A`](for-all.html#A)`>.forAll(p: (`[`A`](for-all.html#A)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Check whether all elements satisfy the predicate. |
| [get](get.html) | `open fun <A> Kind<`[`F`](index.html#F)`, `[`A`](get.html#A)`>.get(M: `[`Monad`](../-monad/index.html)`<Kind<ForEither, `[`A`](get.html#A)`>>, idx: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`): Option<`[`A`](get.html#A)`>`<br>Get the element at the index of the Foldable. |
| [isEmpty](is-empty.html) | `open fun <A> Kind<`[`F`](index.html#F)`, `[`A`](is-empty.html#A)`>.isEmpty(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Returns true if there are no elements. Otherwise false. |
| [nonEmpty](non-empty.html) | `open fun <A> Kind<`[`F`](index.html#F)`, `[`A`](non-empty.html#A)`>.nonEmpty(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [reduceLeftOption](reduce-left-option.html) | `open fun <A> Kind<`[`F`](index.html#F)`, `[`A`](reduce-left-option.html#A)`>.reduceLeftOption(f: (`[`A`](reduce-left-option.html#A)`, `[`A`](reduce-left-option.html#A)`) -> `[`A`](reduce-left-option.html#A)`): Option<`[`A`](reduce-left-option.html#A)`>`<br>Reduce the elements of this structure down to a single value by applying the provided aggregation function in a left-associative manner. |
| [reduceLeftToOption](reduce-left-to-option.html) | `open fun <A, B> Kind<`[`F`](index.html#F)`, `[`A`](reduce-left-to-option.html#A)`>.reduceLeftToOption(f: (`[`A`](reduce-left-to-option.html#A)`) -> `[`B`](reduce-left-to-option.html#B)`, g: (`[`B`](reduce-left-to-option.html#B)`, `[`A`](reduce-left-to-option.html#A)`) -> `[`B`](reduce-left-to-option.html#B)`): Option<`[`B`](reduce-left-to-option.html#B)`>` |
| [reduceRightOption](reduce-right-option.html) | `open fun <A> Kind<`[`F`](index.html#F)`, `[`A`](reduce-right-option.html#A)`>.reduceRightOption(f: (`[`A`](reduce-right-option.html#A)`, Eval<`[`A`](reduce-right-option.html#A)`>) -> Eval<`[`A`](reduce-right-option.html#A)`>): Eval<Option<`[`A`](reduce-right-option.html#A)`>>`<br>Reduce the elements of this structure down to a single value by applying the provided aggregation function in a right-associative manner. |
| [reduceRightToOption](reduce-right-to-option.html) | `open fun <A, B> Kind<`[`F`](index.html#F)`, `[`A`](reduce-right-to-option.html#A)`>.reduceRightToOption(f: (`[`A`](reduce-right-to-option.html#A)`) -> `[`B`](reduce-right-to-option.html#B)`, g: (`[`A`](reduce-right-to-option.html#A)`, Eval<`[`B`](reduce-right-to-option.html#B)`>) -> Eval<`[`B`](reduce-right-to-option.html#B)`>): Eval<Option<`[`B`](reduce-right-to-option.html#B)`>>` |
| [sequence_](sequence_.html) | `open fun <G, A> Kind<`[`F`](index.html#F)`, Kind<`[`G`](sequence_.html#G)`, `[`A`](sequence_.html#A)`>>.sequence_(ag: `[`Applicative`](../-applicative/index.html)`<`[`G`](sequence_.html#G)`>): Kind<`[`G`](sequence_.html#G)`, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>`<br>Sequence F&lt;G&gt; using Applicative. |
| [size](size.html) | `open fun <A> Kind<`[`F`](index.html#F)`, `[`A`](size.html#A)`>.size(MN: `[`Monoid`](../-monoid/index.html)`<`[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`>): `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)<br>The size of this Foldable. |
| [traverse_](traverse_.html) | `open fun <G, A, B> Kind<`[`F`](index.html#F)`, `[`A`](traverse_.html#A)`>.traverse_(GA: `[`Applicative`](../-applicative/index.html)`<`[`G`](traverse_.html#G)`>, f: (`[`A`](traverse_.html#A)`) -> Kind<`[`G`](traverse_.html#G)`, `[`B`](traverse_.html#B)`>): Kind<`[`G`](traverse_.html#G)`, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>`<br>Traverse F using Applicative. |

### Companion Object Functions

| [iterateRight](iterate-right.html) | `fun <A, B> iterateRight(it: `[`Iterator`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-iterator/index.html)`<`[`A`](iterate-right.html#A)`>, lb: Eval<`[`B`](iterate-right.html#B)`>): (f: (`[`A`](iterate-right.html#A)`, Eval<`[`B`](iterate-right.html#B)`>) -> Eval<`[`B`](iterate-right.html#B)`>) -> Eval<`[`B`](iterate-right.html#B)`>` |

### Extension Functions

| [compose](../compose.html) | `fun <F, G> `[`Foldable`](./index.html)`<`[`F`](../compose.html#F)`>.compose(GT: `[`Foldable`](./index.html)`<`[`G`](../compose.html#G)`>): `[`ComposedFoldable`](../-composed-foldable/index.html)`<`[`F`](../compose.html#F)`, `[`G`](../compose.html#G)`>` |

### Inheritors

| [ComposedFoldable](../-composed-foldable/index.html) | `interface ComposedFoldable<F, G> : `[`Foldable`](./index.html)`<`[`Nested`](../-nested.html)`<`[`F`](../-composed-foldable/index.html#F)`, `[`G`](../-composed-foldable/index.html#G)`>>` |
| [Reducible](../-reducible/index.html) | `interface Reducible<F> : `[`Foldable`](./index.html)`<`[`F`](../-reducible/index.html#F)`>`<br> |
| [Traverse](../-traverse/index.html) | `interface Traverse<F> : `[`Functor`](../-functor/index.html)`<`[`F`](../-traverse/index.html#F)`>, `[`Foldable`](./index.html)`<`[`F`](../-traverse/index.html#F)`>`<br> |




## Type Class Hierarchy

<canvas id="arrow.typeclasses-hierarchy-diagram"></canvas>
<script>
  drawNomNomlDiagram('arrow.typeclasses-hierarchy-diagram', 'arrow.typeclasses-diagram.nomnol')
</script>

