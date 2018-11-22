---
title: arrow.typeclasses.arrow.Kind - arrow-typeclasses
---

[arrow-typeclasses](../../index.html) / [arrow.typeclasses](../index.html) / [arrow.Kind](./index.html)

### Extensions for arrow.Kind

| [ap](ap.html) | `fun <A, T, U> `[`ConstOf`](../-const-of.html)`<`[`A`](ap.html#A)`, `[`T`](ap.html#T)`>.ap(SG: `[`Semigroup`](../-semigroup/index.html)`<`[`A`](ap.html#A)`>, ff: `[`ConstOf`](../-const-of.html)`<`[`A`](ap.html#A)`, (`[`T`](ap.html#T)`) -> `[`U`](ap.html#U)`>): `[`Const`](../-const/index.html)`<`[`A`](ap.html#A)`, `[`U`](ap.html#U)`>` |
| [binest](binest.html) | `fun <F, G, A, B> `[`BiunnestedType`](../-biunnested-type.html)`<`[`F`](binest.html#F)`, `[`G`](binest.html#G)`, `[`A`](binest.html#A)`, `[`B`](binest.html#B)`>.binest(): `[`BinestedType`](../-binested-type.html)`<`[`F`](binest.html#F)`, `[`G`](binest.html#G)`, `[`A`](binest.html#A)`, `[`B`](binest.html#B)`>` |
| [biunnest](biunnest.html) | `fun <F, G, A, B> `[`BinestedType`](../-binested-type.html)`<`[`F`](biunnest.html#F)`, `[`G`](biunnest.html#G)`, `[`A`](biunnest.html#A)`, `[`B`](biunnest.html#B)`>.biunnest(): `[`BiunnestedType`](../-biunnested-type.html)`<`[`F`](biunnest.html#F)`, `[`G`](biunnest.html#G)`, `[`A`](biunnest.html#A)`, `[`B`](biunnest.html#B)`>` |
| [combine](combine.html) | `fun <A, T> `[`ConstOf`](../-const-of.html)`<`[`A`](combine.html#A)`, `[`T`](combine.html#T)`>.combine(SG: `[`Semigroup`](../-semigroup/index.html)`<`[`A`](combine.html#A)`>, that: `[`ConstOf`](../-const-of.html)`<`[`A`](combine.html#A)`, `[`T`](combine.html#T)`>): `[`Const`](../-const/index.html)`<`[`A`](combine.html#A)`, `[`T`](combine.html#T)`>` |
| [conest](conest.html) | `fun <F, A, B> `[`CounnestedType`](../-counnested-type.html)`<`[`F`](conest.html#F)`, `[`A`](conest.html#A)`, `[`B`](conest.html#B)`>.conest(): `[`ConestedType`](../-conested-type.html)`<`[`F`](conest.html#F)`, `[`A`](conest.html#A)`, `[`B`](conest.html#B)`>` |
| [counnest](counnest.html) | `fun <F, A, B> `[`ConestedType`](../-conested-type.html)`<`[`F`](counnest.html#F)`, `[`A`](counnest.html#A)`, `[`B`](counnest.html#B)`>.counnest(): `[`CounnestedType`](../-counnested-type.html)`<`[`F`](counnest.html#F)`, `[`A`](counnest.html#A)`, `[`B`](counnest.html#B)`>` |
| [fix](fix.html) | `fun <A, T> `[`ConstOf`](../-const-of.html)`<`[`A`](fix.html#A)`, `[`T`](fix.html#T)`>.fix(): `[`Const`](../-const/index.html)`<`[`A`](fix.html#A)`, `[`T`](fix.html#T)`>`<br>`fun <A> `[`MonoidOf`](../-monoid-of.html)`<`[`A`](fix.html#A)`>.fix(): `[`Monoid`](../-monoid/index.html)`<`[`A`](fix.html#A)`>` |
| [nest](nest.html) | `fun <F, G, A> `[`UnnestedType`](../-unnested-type.html)`<`[`F`](nest.html#F)`, `[`G`](nest.html#G)`, `[`A`](nest.html#A)`>.nest(): `[`NestedType`](../-nested-type.html)`<`[`F`](nest.html#F)`, `[`G`](nest.html#G)`, `[`A`](nest.html#A)`>` |
| [sequence](sequence.html) | `fun <T, A, G> `[`ConstOf`](../-const-of.html)`<`[`A`](sequence.html#A)`, Kind<`[`G`](sequence.html#G)`, `[`T`](sequence.html#T)`>>.sequence(GA: `[`Applicative`](../-applicative/index.html)`<`[`G`](sequence.html#G)`>): Kind<`[`G`](sequence.html#G)`, `[`Const`](../-const/index.html)`<`[`A`](sequence.html#A)`, `[`T`](sequence.html#T)`>>` |
| [unnest](unnest.html) | `fun <F, G, A> `[`NestedType`](../-nested-type.html)`<`[`F`](unnest.html#F)`, `[`G`](unnest.html#G)`, `[`A`](unnest.html#A)`>.unnest(): `[`UnnestedType`](../-unnested-type.html)`<`[`F`](unnest.html#F)`, `[`G`](unnest.html#G)`, `[`A`](unnest.html#A)`>` |
| [value](value.html) | `fun <A, T> `[`ConstOf`](../-const-of.html)`<`[`A`](value.html#A)`, `[`T`](value.html#T)`>.value(): `[`A`](value.html#A) |

