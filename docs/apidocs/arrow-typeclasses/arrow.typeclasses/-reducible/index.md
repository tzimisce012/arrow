---
title: Reducible - arrow-typeclasses
---

[arrow-typeclasses](../../index.html) / [arrow.typeclasses](../index.html) / [Reducible](./index.html)

# Reducible

`interface Reducible<F> : `[`Foldable`](../-foldable/index.html)`<`[`F`](index.html#F)`>`



Data structures that can be reduced to a summary value.

Reducible is like a non-empty Foldable. In addition to the fold methods it provides reduce
methods which do not require an initial value.

In addition to the methods needed by `Foldable`, `Reducible` is implemented in terms of two methods:

* reduceLeftTo(fa)(f)(g) eagerly reduces with an additional mapping function
* reduceRightTo(fa)(f)(g) lazily reduces with an additional mapping function

### Functions

| [isEmpty](is-empty.html) | `open fun <A> Kind<`[`F`](index.html#F)`, `[`A`](is-empty.html#A)`>.isEmpty(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Returns true if there are no elements. Otherwise false. |
| [nonEmpty](non-empty.html) | `open fun <A> Kind<`[`F`](index.html#F)`, `[`A`](non-empty.html#A)`>.nonEmpty(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [reduce](reduce.html) | `open fun <A> Kind<`[`F`](index.html#F)`, `[`A`](reduce.html#A)`>.reduce(SG: `[`Semigroup`](../-semigroup/index.html)`<`[`A`](reduce.html#A)`>): `[`A`](reduce.html#A)<br>Reduce a F value using the given Semigroup. |
| [reduceK](reduce-k.html) | `open fun <G, A> Kind<`[`F`](index.html#F)`, Kind<`[`G`](reduce-k.html#G)`, `[`A`](reduce-k.html#A)`>>.reduceK(SG: `[`SemigroupK`](../-semigroup-k/index.html)`<`[`G`](reduce-k.html#G)`>): Kind<`[`G`](reduce-k.html#G)`, `[`A`](reduce-k.html#A)`>`<br>Reduce a F&lt;G&gt; value using SemigroupK, a universal semigroup for G&lt;_&gt;. |
| [reduceLeft](reduce-left.html) | `open fun <A> Kind<`[`F`](index.html#F)`, `[`A`](reduce-left.html#A)`>.reduceLeft(f: (`[`A`](reduce-left.html#A)`, `[`A`](reduce-left.html#A)`) -> `[`A`](reduce-left.html#A)`): `[`A`](reduce-left.html#A)<br>Left-associative reduction on F using the function f. |
| [reduceLeftTo](reduce-left-to.html) | `abstract fun <A, B> Kind<`[`F`](index.html#F)`, `[`A`](reduce-left-to.html#A)`>.reduceLeftTo(f: (`[`A`](reduce-left-to.html#A)`) -> `[`B`](reduce-left-to.html#B)`, g: (`[`B`](reduce-left-to.html#B)`, `[`A`](reduce-left-to.html#A)`) -> `[`B`](reduce-left-to.html#B)`): `[`B`](reduce-left-to.html#B)<br>Apply f to the "initial element" of fa and combine it with every other value using the given function g. |
| [reduceLeftToOption](reduce-left-to-option.html) | `open fun <A, B> Kind<`[`F`](index.html#F)`, `[`A`](reduce-left-to-option.html#A)`>.reduceLeftToOption(f: (`[`A`](reduce-left-to-option.html#A)`) -> `[`B`](reduce-left-to-option.html#B)`, g: (`[`B`](reduce-left-to-option.html#B)`, `[`A`](reduce-left-to-option.html#A)`) -> `[`B`](reduce-left-to-option.html#B)`): Option<`[`B`](reduce-left-to-option.html#B)`>` |
| [reduceMap](reduce-map.html) | `open fun <A, B> Kind<`[`F`](index.html#F)`, `[`A`](reduce-map.html#A)`>.reduceMap(SG: `[`Semigroup`](../-semigroup/index.html)`<`[`B`](reduce-map.html#B)`>, f: (`[`A`](reduce-map.html#A)`) -> `[`B`](reduce-map.html#B)`): `[`B`](reduce-map.html#B)<br>Apply f to each element of fa and combine them using the given Semigroup. |
| [reduceRight](reduce-right.html) | `open fun <A> Kind<`[`F`](index.html#F)`, `[`A`](reduce-right.html#A)`>.reduceRight(f: (`[`A`](reduce-right.html#A)`, Eval<`[`A`](reduce-right.html#A)`>) -> Eval<`[`A`](reduce-right.html#A)`>): Eval<`[`A`](reduce-right.html#A)`>`<br>Right-associative reduction on F using the function f. |
| [reduceRightTo](reduce-right-to.html) | `abstract fun <A, B> Kind<`[`F`](index.html#F)`, `[`A`](reduce-right-to.html#A)`>.reduceRightTo(f: (`[`A`](reduce-right-to.html#A)`) -> `[`B`](reduce-right-to.html#B)`, g: (`[`A`](reduce-right-to.html#A)`, Eval<`[`B`](reduce-right-to.html#B)`>) -> Eval<`[`B`](reduce-right-to.html#B)`>): Eval<`[`B`](reduce-right-to.html#B)`>`<br>Apply f to the "initial element" of fa and lazily combine it with every other value using the given function g. |
| [reduceRightToOption](reduce-right-to-option.html) | `open fun <A, B> Kind<`[`F`](index.html#F)`, `[`A`](reduce-right-to-option.html#A)`>.reduceRightToOption(f: (`[`A`](reduce-right-to-option.html#A)`) -> `[`B`](reduce-right-to-option.html#B)`, g: (`[`A`](reduce-right-to-option.html#A)`, Eval<`[`B`](reduce-right-to-option.html#B)`>) -> Eval<`[`B`](reduce-right-to-option.html#B)`>): Eval<Option<`[`B`](reduce-right-to-option.html#B)`>>` |

### Inherited Functions

| [combineAll](../-foldable/combine-all.html) | `open fun <A> Kind<`[`F`](../-foldable/index.html#F)`, `[`A`](../-foldable/combine-all.html#A)`>.combineAll(MN: `[`Monoid`](../-monoid/index.html)`<`[`A`](../-foldable/combine-all.html#A)`>): `[`A`](../-foldable/combine-all.html#A)<br>Alias for fold. |
| [exists](../-foldable/exists.html) | `open fun <A> Kind<`[`F`](../-foldable/index.html#F)`, `[`A`](../-foldable/exists.html#A)`>.exists(p: (`[`A`](../-foldable/exists.html#A)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Check whether at least one element satisfies the predicate. |
| [find](../-foldable/find.html) | `open fun <A> Kind<`[`F`](../-foldable/index.html#F)`, `[`A`](../-foldable/find.html#A)`>.find(f: (`[`A`](../-foldable/find.html#A)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): Option<`[`A`](../-foldable/find.html#A)`>`<br>Find the first element matching the predicate, if one exists. |
| [fold](../-foldable/fold.html) | `open fun <A> Kind<`[`F`](../-foldable/index.html#F)`, `[`A`](../-foldable/fold.html#A)`>.fold(MN: `[`Monoid`](../-monoid/index.html)`<`[`A`](../-foldable/fold.html#A)`>): `[`A`](../-foldable/fold.html#A)<br>Fold implemented using the given Monoid instance. |
| [foldLeft](../-foldable/fold-left.html) | `abstract fun <A, B> Kind<`[`F`](../-foldable/index.html#F)`, `[`A`](../-foldable/fold-left.html#A)`>.foldLeft(b: `[`B`](../-foldable/fold-left.html#B)`, f: (`[`B`](../-foldable/fold-left.html#B)`, `[`A`](../-foldable/fold-left.html#A)`) -> `[`B`](../-foldable/fold-left.html#B)`): `[`B`](../-foldable/fold-left.html#B)<br>Left associative fold on F using the provided function. |
| [foldM](../-foldable/fold-m.html) | `open fun <G, A, B> Kind<`[`F`](../-foldable/index.html#F)`, `[`A`](../-foldable/fold-m.html#A)`>.foldM(M: `[`Monad`](../-monad/index.html)`<`[`G`](../-foldable/fold-m.html#G)`>, z: `[`B`](../-foldable/fold-m.html#B)`, f: (`[`B`](../-foldable/fold-m.html#B)`, `[`A`](../-foldable/fold-m.html#A)`) -> Kind<`[`G`](../-foldable/fold-m.html#G)`, `[`B`](../-foldable/fold-m.html#B)`>): Kind<`[`G`](../-foldable/fold-m.html#G)`, `[`B`](../-foldable/fold-m.html#B)`>`<br>Left associative monadic folding on F. |
| [foldMap](../-foldable/fold-map.html) | `open fun <A, B> Kind<`[`F`](../-foldable/index.html#F)`, `[`A`](../-foldable/fold-map.html#A)`>.foldMap(MN: `[`Monoid`](../-monoid/index.html)`<`[`B`](../-foldable/fold-map.html#B)`>, f: (`[`A`](../-foldable/fold-map.html#A)`) -> `[`B`](../-foldable/fold-map.html#B)`): `[`B`](../-foldable/fold-map.html#B)<br>Fold implemented by mapping A values into B and then combining them using the given Monoid instance. |
| [foldMapM](../-foldable/fold-map-m.html) | `open fun <G, A, B, MA : `[`Monad`](../-monad/index.html)`<`[`G`](../-foldable/fold-map-m.html#G)`>, MO : `[`Monoid`](../-monoid/index.html)`<`[`B`](../-foldable/fold-map-m.html#B)`>> Kind<`[`F`](../-foldable/index.html#F)`, `[`A`](../-foldable/fold-map-m.html#A)`>.foldMapM(ma: `[`MA`](../-foldable/fold-map-m.html#MA)`, mo: `[`MO`](../-foldable/fold-map-m.html#MO)`, f: (`[`A`](../-foldable/fold-map-m.html#A)`) -> Kind<`[`G`](../-foldable/fold-map-m.html#G)`, `[`B`](../-foldable/fold-map-m.html#B)`>): Kind<`[`G`](../-foldable/fold-map-m.html#G)`, `[`B`](../-foldable/fold-map-m.html#B)`>`<br>Monadic folding on F by mapping A values to G, combining the B values using the given Monoid instance. |
| [foldRight](../-foldable/fold-right.html) | `abstract fun <A, B> Kind<`[`F`](../-foldable/index.html#F)`, `[`A`](../-foldable/fold-right.html#A)`>.foldRight(lb: Eval<`[`B`](../-foldable/fold-right.html#B)`>, f: (`[`A`](../-foldable/fold-right.html#A)`, Eval<`[`B`](../-foldable/fold-right.html#B)`>) -> Eval<`[`B`](../-foldable/fold-right.html#B)`>): Eval<`[`B`](../-foldable/fold-right.html#B)`>`<br>Right associative lazy fold on F using the provided function. |
| [forAll](../-foldable/for-all.html) | `open fun <A> Kind<`[`F`](../-foldable/index.html#F)`, `[`A`](../-foldable/for-all.html#A)`>.forAll(p: (`[`A`](../-foldable/for-all.html#A)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Check whether all elements satisfy the predicate. |
| [get](../-foldable/get.html) | `open fun <A> Kind<`[`F`](../-foldable/index.html#F)`, `[`A`](../-foldable/get.html#A)`>.get(M: `[`Monad`](../-monad/index.html)`<Kind<ForEither, `[`A`](../-foldable/get.html#A)`>>, idx: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`): Option<`[`A`](../-foldable/get.html#A)`>`<br>Get the element at the index of the Foldable. |
| [reduceLeftOption](../-foldable/reduce-left-option.html) | `open fun <A> Kind<`[`F`](../-foldable/index.html#F)`, `[`A`](../-foldable/reduce-left-option.html#A)`>.reduceLeftOption(f: (`[`A`](../-foldable/reduce-left-option.html#A)`, `[`A`](../-foldable/reduce-left-option.html#A)`) -> `[`A`](../-foldable/reduce-left-option.html#A)`): Option<`[`A`](../-foldable/reduce-left-option.html#A)`>`<br>Reduce the elements of this structure down to a single value by applying the provided aggregation function in a left-associative manner. |
| [reduceRightOption](../-foldable/reduce-right-option.html) | `open fun <A> Kind<`[`F`](../-foldable/index.html#F)`, `[`A`](../-foldable/reduce-right-option.html#A)`>.reduceRightOption(f: (`[`A`](../-foldable/reduce-right-option.html#A)`, Eval<`[`A`](../-foldable/reduce-right-option.html#A)`>) -> Eval<`[`A`](../-foldable/reduce-right-option.html#A)`>): Eval<Option<`[`A`](../-foldable/reduce-right-option.html#A)`>>`<br>Reduce the elements of this structure down to a single value by applying the provided aggregation function in a right-associative manner. |
| [sequence_](../-foldable/sequence_.html) | `open fun <G, A> Kind<`[`F`](../-foldable/index.html#F)`, Kind<`[`G`](../-foldable/sequence_.html#G)`, `[`A`](../-foldable/sequence_.html#A)`>>.sequence_(ag: `[`Applicative`](../-applicative/index.html)`<`[`G`](../-foldable/sequence_.html#G)`>): Kind<`[`G`](../-foldable/sequence_.html#G)`, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>`<br>Sequence F&lt;G&gt; using Applicative. |
| [size](../-foldable/size.html) | `open fun <A> Kind<`[`F`](../-foldable/index.html#F)`, `[`A`](../-foldable/size.html#A)`>.size(MN: `[`Monoid`](../-monoid/index.html)`<`[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`>): `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)<br>The size of this Foldable. |
| [traverse_](../-foldable/traverse_.html) | `open fun <G, A, B> Kind<`[`F`](../-foldable/index.html#F)`, `[`A`](../-foldable/traverse_.html#A)`>.traverse_(GA: `[`Applicative`](../-applicative/index.html)`<`[`G`](../-foldable/traverse_.html#G)`>, f: (`[`A`](../-foldable/traverse_.html#A)`) -> Kind<`[`G`](../-foldable/traverse_.html#G)`, `[`B`](../-foldable/traverse_.html#B)`>): Kind<`[`G`](../-foldable/traverse_.html#G)`, `[`Unit`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html)`>`<br>Traverse F using Applicative. |

### Extension Functions

| [compose](../compose.html) | `fun <F, G> `[`Foldable`](../-foldable/index.html)`<`[`F`](../compose.html#F)`>.compose(GT: `[`Foldable`](../-foldable/index.html)`<`[`G`](../compose.html#G)`>): `[`ComposedFoldable`](../-composed-foldable/index.html)`<`[`F`](../compose.html#F)`, `[`G`](../compose.html#G)`>` |

### Inheritors

| [NonEmptyReducible](../-non-empty-reducible/index.html) | `interface NonEmptyReducible<F, G> : `[`Reducible`](./index.html)`<`[`F`](../-non-empty-reducible/index.html#F)`>`<br> |




## Type Class Hierarchy

<canvas id="arrow.typeclasses-hierarchy-diagram"></canvas>
<script>
  drawNomNomlDiagram('arrow.typeclasses-hierarchy-diagram', 'arrow.typeclasses-diagram.nomnol')
</script>

