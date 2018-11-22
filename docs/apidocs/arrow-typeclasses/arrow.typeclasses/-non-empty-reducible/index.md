---
title: NonEmptyReducible - arrow-typeclasses
---

[arrow-typeclasses](../../index.html) / [arrow.typeclasses](../index.html) / [NonEmptyReducible](./index.html)

# NonEmptyReducible

`interface NonEmptyReducible<F, G> : `[`Reducible`](../-reducible/index.html)`<`[`F`](index.html#F)`>`



This class defines a Reducible in terms of a Foldable together with a split method, F -&gt; (A, G).

This class can be used on any type where the first value (A) and the "rest" of the values (G) can be easily found.

### Functions

| [FG](-f-g.html) | `abstract fun FG(): `[`Foldable`](../-foldable/index.html)`<`[`G`](index.html#G)`>` |
| [exists](exists.html) | `open fun <A> Kind<`[`F`](index.html#F)`, `[`A`](exists.html#A)`>.exists(p: (`[`A`](exists.html#A)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Check whether at least one element satisfies the predicate. |
| [find](find.html) | `open fun <A> Kind<`[`F`](index.html#F)`, `[`A`](find.html#A)`>.find(f: (`[`A`](find.html#A)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): Option<`[`A`](find.html#A)`>`<br>Find the first element matching the predicate, if one exists. |
| [fold](fold.html) | `open fun <A> Kind<`[`F`](index.html#F)`, `[`A`](fold.html#A)`>.fold(MN: `[`Monoid`](../-monoid/index.html)`<`[`A`](fold.html#A)`>): `[`A`](fold.html#A)<br>Fold implemented using the given Monoid instance. |
| [foldLeft](fold-left.html) | `open fun <A, B> Kind<`[`F`](index.html#F)`, `[`A`](fold-left.html#A)`>.foldLeft(b: `[`B`](fold-left.html#B)`, f: (`[`B`](fold-left.html#B)`, `[`A`](fold-left.html#A)`) -> `[`B`](fold-left.html#B)`): `[`B`](fold-left.html#B)<br>Left associative fold on F using the provided function. |
| [foldM_](fold-m_.html) | `open fun <A, B> Kind<`[`F`](index.html#F)`, `[`A`](fold-m_.html#A)`>.foldM_(M: `[`Monad`](../-monad/index.html)`<`[`G`](index.html#G)`>, z: `[`B`](fold-m_.html#B)`, f: (`[`B`](fold-m_.html#B)`, `[`A`](fold-m_.html#A)`) -> Kind<`[`G`](index.html#G)`, `[`B`](fold-m_.html#B)`>): Kind<`[`G`](index.html#G)`, `[`B`](fold-m_.html#B)`>` |
| [foldRight](fold-right.html) | `open fun <A, B> Kind<`[`F`](index.html#F)`, `[`A`](fold-right.html#A)`>.foldRight(lb: Eval<`[`B`](fold-right.html#B)`>, f: (`[`A`](fold-right.html#A)`, Eval<`[`B`](fold-right.html#B)`>) -> Eval<`[`B`](fold-right.html#B)`>): Eval<`[`B`](fold-right.html#B)`>`<br>Right associative lazy fold on F using the provided function. |
| [forAll](for-all.html) | `open fun <A> Kind<`[`F`](index.html#F)`, `[`A`](for-all.html#A)`>.forAll(p: (`[`A`](for-all.html#A)`) -> `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Check whether all elements satisfy the predicate. |
| [get](get.html) | `open fun <A> Kind<`[`F`](index.html#F)`, `[`A`](get.html#A)`>.get(M: `[`Monad`](../-monad/index.html)`<Kind<ForEither, `[`A`](get.html#A)`>>, idx: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`): Option<`[`A`](get.html#A)`>`<br>Get the element at the index of the Foldable. |
| [reduceLeftTo](reduce-left-to.html) | `open fun <A, B> Kind<`[`F`](index.html#F)`, `[`A`](reduce-left-to.html#A)`>.reduceLeftTo(f: (`[`A`](reduce-left-to.html#A)`) -> `[`B`](reduce-left-to.html#B)`, g: (`[`B`](reduce-left-to.html#B)`, `[`A`](reduce-left-to.html#A)`) -> `[`B`](reduce-left-to.html#B)`): `[`B`](reduce-left-to.html#B)<br>Apply f to the "initial element" of fa and combine it with every other value using the given function g. |
| [reduceRightTo](reduce-right-to.html) | `open fun <A, B> Kind<`[`F`](index.html#F)`, `[`A`](reduce-right-to.html#A)`>.reduceRightTo(f: (`[`A`](reduce-right-to.html#A)`) -> `[`B`](reduce-right-to.html#B)`, g: (`[`A`](reduce-right-to.html#A)`, Eval<`[`B`](reduce-right-to.html#B)`>) -> Eval<`[`B`](reduce-right-to.html#B)`>): Eval<`[`B`](reduce-right-to.html#B)`>`<br>Apply f to the "initial element" of fa and lazily combine it with every other value using the given function g. |
| [size](size.html) | `open fun <A> Kind<`[`F`](index.html#F)`, `[`A`](size.html#A)`>.size(MN: `[`Monoid`](../-monoid/index.html)`<`[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`>): `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)<br>The size of this Foldable. |
| [split](split.html) | `abstract fun <A> Kind<`[`F`](index.html#F)`, `[`A`](split.html#A)`>.split(): Tuple2<`[`A`](split.html#A)`, Kind<`[`G`](index.html#G)`, `[`A`](split.html#A)`>>` |

### Inherited Functions

| [isEmpty](../-reducible/is-empty.html) | `open fun <A> Kind<`[`F`](../-reducible/index.html#F)`, `[`A`](../-reducible/is-empty.html#A)`>.isEmpty(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Returns true if there are no elements. Otherwise false. |
| [nonEmpty](../-reducible/non-empty.html) | `open fun <A> Kind<`[`F`](../-reducible/index.html#F)`, `[`A`](../-reducible/non-empty.html#A)`>.nonEmpty(): `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [reduce](../-reducible/reduce.html) | `open fun <A> Kind<`[`F`](../-reducible/index.html#F)`, `[`A`](../-reducible/reduce.html#A)`>.reduce(SG: `[`Semigroup`](../-semigroup/index.html)`<`[`A`](../-reducible/reduce.html#A)`>): `[`A`](../-reducible/reduce.html#A)<br>Reduce a F value using the given Semigroup. |
| [reduceK](../-reducible/reduce-k.html) | `open fun <G, A> Kind<`[`F`](../-reducible/index.html#F)`, Kind<`[`G`](../-reducible/reduce-k.html#G)`, `[`A`](../-reducible/reduce-k.html#A)`>>.reduceK(SG: `[`SemigroupK`](../-semigroup-k/index.html)`<`[`G`](../-reducible/reduce-k.html#G)`>): Kind<`[`G`](../-reducible/reduce-k.html#G)`, `[`A`](../-reducible/reduce-k.html#A)`>`<br>Reduce a F&lt;G&gt; value using SemigroupK, a universal semigroup for G&lt;_&gt;. |
| [reduceLeft](../-reducible/reduce-left.html) | `open fun <A> Kind<`[`F`](../-reducible/index.html#F)`, `[`A`](../-reducible/reduce-left.html#A)`>.reduceLeft(f: (`[`A`](../-reducible/reduce-left.html#A)`, `[`A`](../-reducible/reduce-left.html#A)`) -> `[`A`](../-reducible/reduce-left.html#A)`): `[`A`](../-reducible/reduce-left.html#A)<br>Left-associative reduction on F using the function f. |
| [reduceLeftToOption](../-reducible/reduce-left-to-option.html) | `open fun <A, B> Kind<`[`F`](../-reducible/index.html#F)`, `[`A`](../-reducible/reduce-left-to-option.html#A)`>.reduceLeftToOption(f: (`[`A`](../-reducible/reduce-left-to-option.html#A)`) -> `[`B`](../-reducible/reduce-left-to-option.html#B)`, g: (`[`B`](../-reducible/reduce-left-to-option.html#B)`, `[`A`](../-reducible/reduce-left-to-option.html#A)`) -> `[`B`](../-reducible/reduce-left-to-option.html#B)`): Option<`[`B`](../-reducible/reduce-left-to-option.html#B)`>` |
| [reduceMap](../-reducible/reduce-map.html) | `open fun <A, B> Kind<`[`F`](../-reducible/index.html#F)`, `[`A`](../-reducible/reduce-map.html#A)`>.reduceMap(SG: `[`Semigroup`](../-semigroup/index.html)`<`[`B`](../-reducible/reduce-map.html#B)`>, f: (`[`A`](../-reducible/reduce-map.html#A)`) -> `[`B`](../-reducible/reduce-map.html#B)`): `[`B`](../-reducible/reduce-map.html#B)<br>Apply f to each element of fa and combine them using the given Semigroup. |
| [reduceRight](../-reducible/reduce-right.html) | `open fun <A> Kind<`[`F`](../-reducible/index.html#F)`, `[`A`](../-reducible/reduce-right.html#A)`>.reduceRight(f: (`[`A`](../-reducible/reduce-right.html#A)`, Eval<`[`A`](../-reducible/reduce-right.html#A)`>) -> Eval<`[`A`](../-reducible/reduce-right.html#A)`>): Eval<`[`A`](../-reducible/reduce-right.html#A)`>`<br>Right-associative reduction on F using the function f. |
| [reduceRightToOption](../-reducible/reduce-right-to-option.html) | `open fun <A, B> Kind<`[`F`](../-reducible/index.html#F)`, `[`A`](../-reducible/reduce-right-to-option.html#A)`>.reduceRightToOption(f: (`[`A`](../-reducible/reduce-right-to-option.html#A)`) -> `[`B`](../-reducible/reduce-right-to-option.html#B)`, g: (`[`A`](../-reducible/reduce-right-to-option.html#A)`, Eval<`[`B`](../-reducible/reduce-right-to-option.html#B)`>) -> Eval<`[`B`](../-reducible/reduce-right-to-option.html#B)`>): Eval<Option<`[`B`](../-reducible/reduce-right-to-option.html#B)`>>` |

### Extension Functions

| [compose](../compose.html) | `fun <F, G> `[`Foldable`](../-foldable/index.html)`<`[`F`](../compose.html#F)`>.compose(GT: `[`Foldable`](../-foldable/index.html)`<`[`G`](../compose.html#G)`>): `[`ComposedFoldable`](../-composed-foldable/index.html)`<`[`F`](../compose.html#F)`, `[`G`](../compose.html#G)`>` |




## Type Class Hierarchy

<canvas id="arrow.typeclasses-hierarchy-diagram"></canvas>
<script>
  drawNomNomlDiagram('arrow.typeclasses-hierarchy-diagram', 'arrow.typeclasses-diagram.nomnol')
</script>

