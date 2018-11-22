---
title: Monoid - arrow-typeclasses
---

[arrow-typeclasses](../../index.html) / [arrow.typeclasses](../index.html) / [Monoid](./index.html)

# Monoid

`interface Monoid<A> : `[`Semigroup`](../-semigroup/index.html)`<`[`A`](index.html#A)`>, `[`MonoidOf`](../-monoid-of.html)`<`[`A`](index.html#A)`>`



### Functions

| [combineAll](combine-all.html) | `open fun `[`Collection`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html)`<`[`A`](index.html#A)`>.combineAll(): `[`A`](index.html#A)<br>Combine an [Collection](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-collection/index.html) of [A](index.html#A) values.`open fun combineAll(elems: `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`A`](index.html#A)`>): `[`A`](index.html#A)<br>Combine an array of [A](index.html#A) values. |
| [empty](empty.html) | `abstract fun empty(): `[`A`](index.html#A)<br>A zero value for this A |

### Inherited Functions

| [combine](../-semigroup/combine.html) | `abstract fun `[`A`](../-semigroup/index.html#A)`.combine(b: `[`A`](../-semigroup/index.html#A)`): `[`A`](../-semigroup/index.html#A)<br>Combine two [A](../-semigroup/index.html#A) values. |
| [maybeCombine](../-semigroup/maybe-combine.html) | `open fun `[`A`](../-semigroup/index.html#A)`.maybeCombine(b: `[`A`](../-semigroup/index.html#A)`?): `[`A`](../-semigroup/index.html#A) |
| [plus](../-semigroup/plus.html) | `open operator fun `[`A`](../-semigroup/index.html#A)`.plus(b: `[`A`](../-semigroup/index.html#A)`): `[`A`](../-semigroup/index.html#A) |

### Extension Functions

| [ap](../arrow.-kind/ap.html) | `fun <A, T, U> `[`ConstOf`](../-const-of.html)`<`[`A`](../arrow.-kind/ap.html#A)`, `[`T`](../arrow.-kind/ap.html#T)`>.ap(SG: `[`Semigroup`](../-semigroup/index.html)`<`[`A`](../arrow.-kind/ap.html#A)`>, ff: `[`ConstOf`](../-const-of.html)`<`[`A`](../arrow.-kind/ap.html#A)`, (`[`T`](../arrow.-kind/ap.html#T)`) -> `[`U`](../arrow.-kind/ap.html#U)`>): `[`Const`](../-const/index.html)`<`[`A`](../arrow.-kind/ap.html#A)`, `[`U`](../arrow.-kind/ap.html#U)`>` |
| [biunnest](../arrow.-kind/biunnest.html) | `fun <F, G, A, B> `[`BinestedType`](../-binested-type.html)`<`[`F`](../arrow.-kind/biunnest.html#F)`, `[`G`](../arrow.-kind/biunnest.html#G)`, `[`A`](../arrow.-kind/biunnest.html#A)`, `[`B`](../arrow.-kind/biunnest.html#B)`>.biunnest(): `[`BiunnestedType`](../-biunnested-type.html)`<`[`F`](../arrow.-kind/biunnest.html#F)`, `[`G`](../arrow.-kind/biunnest.html#G)`, `[`A`](../arrow.-kind/biunnest.html#A)`, `[`B`](../arrow.-kind/biunnest.html#B)`>` |
| [combine](../arrow.-kind/combine.html) | `fun <A, T> `[`ConstOf`](../-const-of.html)`<`[`A`](../arrow.-kind/combine.html#A)`, `[`T`](../arrow.-kind/combine.html#T)`>.combine(SG: `[`Semigroup`](../-semigroup/index.html)`<`[`A`](../arrow.-kind/combine.html#A)`>, that: `[`ConstOf`](../-const-of.html)`<`[`A`](../arrow.-kind/combine.html#A)`, `[`T`](../arrow.-kind/combine.html#T)`>): `[`Const`](../-const/index.html)`<`[`A`](../arrow.-kind/combine.html#A)`, `[`T`](../arrow.-kind/combine.html#T)`>` |
| [conest](../arrow.-kind/conest.html) | `fun <F, A, B> `[`CounnestedType`](../-counnested-type.html)`<`[`F`](../arrow.-kind/conest.html#F)`, `[`A`](../arrow.-kind/conest.html#A)`, `[`B`](../arrow.-kind/conest.html#B)`>.conest(): `[`ConestedType`](../-conested-type.html)`<`[`F`](../arrow.-kind/conest.html#F)`, `[`A`](../arrow.-kind/conest.html#A)`, `[`B`](../arrow.-kind/conest.html#B)`>` |
| [counnest](../arrow.-kind/counnest.html) | `fun <F, A, B> `[`ConestedType`](../-conested-type.html)`<`[`F`](../arrow.-kind/counnest.html#F)`, `[`A`](../arrow.-kind/counnest.html#A)`, `[`B`](../arrow.-kind/counnest.html#B)`>.counnest(): `[`CounnestedType`](../-counnested-type.html)`<`[`F`](../arrow.-kind/counnest.html#F)`, `[`A`](../arrow.-kind/counnest.html#A)`, `[`B`](../arrow.-kind/counnest.html#B)`>` |
| [nest](../arrow.-kind/nest.html) | `fun <F, G, A> `[`UnnestedType`](../-unnested-type.html)`<`[`F`](../arrow.-kind/nest.html#F)`, `[`G`](../arrow.-kind/nest.html#G)`, `[`A`](../arrow.-kind/nest.html#A)`>.nest(): `[`NestedType`](../-nested-type.html)`<`[`F`](../arrow.-kind/nest.html#F)`, `[`G`](../arrow.-kind/nest.html#G)`, `[`A`](../arrow.-kind/nest.html#A)`>` |
| [unnest](../arrow.-kind/unnest.html) | `fun <F, G, A> `[`NestedType`](../-nested-type.html)`<`[`F`](../arrow.-kind/unnest.html#F)`, `[`G`](../arrow.-kind/unnest.html#G)`, `[`A`](../arrow.-kind/unnest.html#A)`>.unnest(): `[`UnnestedType`](../-unnested-type.html)`<`[`F`](../arrow.-kind/unnest.html#F)`, `[`G`](../arrow.-kind/unnest.html#G)`, `[`A`](../arrow.-kind/unnest.html#A)`>` |
| [value](../arrow.-kind/value.html) | `fun <A, T> `[`ConstOf`](../-const-of.html)`<`[`A`](../arrow.-kind/value.html#A)`, `[`T`](../arrow.-kind/value.html#T)`>.value(): `[`A`](../arrow.-kind/value.html#A) |




## Type Class Hierarchy

<canvas id="arrow.typeclasses-hierarchy-diagram"></canvas>
<script>
  drawNomNomlDiagram('arrow.typeclasses-hierarchy-diagram', 'arrow.typeclasses-diagram.nomnol')
</script>

