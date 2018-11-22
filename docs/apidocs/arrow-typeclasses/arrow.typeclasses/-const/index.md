---
title: Const - arrow-typeclasses
---

[arrow-typeclasses](../../index.html) / [arrow.typeclasses](../index.html) / [Const](./index.html)

# Const

`@higherkind data class Const<A, out T> : `[`ConstOf`](../-const-of.html)`<`[`A`](index.html#A)`, `[`T`](index.html#T)`>`

### Constructors

| [&lt;init&gt;](-init-.html) | `Const(value: `[`A`](index.html#A)`)` |

### Properties

| [value](value.html) | `val value: `[`A`](index.html#A) |

### Functions

| [retag](retag.html) | `fun <U> retag(): `[`Const`](./index.html)`<`[`A`](index.html#A)`, `[`U`](retag.html#U)`>` |
| [traverse](traverse.html) | `fun <G, U> traverse(GA: `[`Applicative`](../-applicative/index.html)`<`[`G`](traverse.html#G)`>, f: (`[`T`](index.html#T)`) -> Kind<`[`G`](traverse.html#G)`, `[`U`](traverse.html#U)`>): Kind<`[`G`](traverse.html#G)`, `[`Const`](./index.html)`<`[`A`](index.html#A)`, `[`U`](traverse.html#U)`>>` |
| [traverseFilter](traverse-filter.html) | `fun <G, U> traverseFilter(GA: `[`Applicative`](../-applicative/index.html)`<`[`G`](traverse-filter.html#G)`>, f: (`[`T`](index.html#T)`) -> Kind<`[`G`](traverse-filter.html#G)`, Option<`[`U`](traverse-filter.html#U)`>>): Kind<`[`G`](traverse-filter.html#G)`, `[`Const`](./index.html)`<`[`A`](index.html#A)`, `[`U`](traverse-filter.html#U)`>>` |

### Companion Object Functions

| [just](just.html) | `fun <A, T> just(a: `[`A`](just.html#A)`): `[`Const`](./index.html)`<`[`A`](just.html#A)`, `[`T`](just.html#T)`>` |

### Extension Functions

| [ap](../arrow.-kind/ap.html) | `fun <A, T, U> `[`ConstOf`](../-const-of.html)`<`[`A`](../arrow.-kind/ap.html#A)`, `[`T`](../arrow.-kind/ap.html#T)`>.ap(SG: `[`Semigroup`](../-semigroup/index.html)`<`[`A`](../arrow.-kind/ap.html#A)`>, ff: `[`ConstOf`](../-const-of.html)`<`[`A`](../arrow.-kind/ap.html#A)`, (`[`T`](../arrow.-kind/ap.html#T)`) -> `[`U`](../arrow.-kind/ap.html#U)`>): `[`Const`](./index.html)`<`[`A`](../arrow.-kind/ap.html#A)`, `[`U`](../arrow.-kind/ap.html#U)`>` |
| [biunnest](../arrow.-kind/biunnest.html) | `fun <F, G, A, B> `[`BinestedType`](../-binested-type.html)`<`[`F`](../arrow.-kind/biunnest.html#F)`, `[`G`](../arrow.-kind/biunnest.html#G)`, `[`A`](../arrow.-kind/biunnest.html#A)`, `[`B`](../arrow.-kind/biunnest.html#B)`>.biunnest(): `[`BiunnestedType`](../-biunnested-type.html)`<`[`F`](../arrow.-kind/biunnest.html#F)`, `[`G`](../arrow.-kind/biunnest.html#G)`, `[`A`](../arrow.-kind/biunnest.html#A)`, `[`B`](../arrow.-kind/biunnest.html#B)`>` |
| [combine](../arrow.-kind/combine.html) | `fun <A, T> `[`ConstOf`](../-const-of.html)`<`[`A`](../arrow.-kind/combine.html#A)`, `[`T`](../arrow.-kind/combine.html#T)`>.combine(SG: `[`Semigroup`](../-semigroup/index.html)`<`[`A`](../arrow.-kind/combine.html#A)`>, that: `[`ConstOf`](../-const-of.html)`<`[`A`](../arrow.-kind/combine.html#A)`, `[`T`](../arrow.-kind/combine.html#T)`>): `[`Const`](./index.html)`<`[`A`](../arrow.-kind/combine.html#A)`, `[`T`](../arrow.-kind/combine.html#T)`>` |
| [conest](../arrow.-kind/conest.html) | `fun <F, A, B> `[`CounnestedType`](../-counnested-type.html)`<`[`F`](../arrow.-kind/conest.html#F)`, `[`A`](../arrow.-kind/conest.html#A)`, `[`B`](../arrow.-kind/conest.html#B)`>.conest(): `[`ConestedType`](../-conested-type.html)`<`[`F`](../arrow.-kind/conest.html#F)`, `[`A`](../arrow.-kind/conest.html#A)`, `[`B`](../arrow.-kind/conest.html#B)`>` |
| [counnest](../arrow.-kind/counnest.html) | `fun <F, A, B> `[`ConestedType`](../-conested-type.html)`<`[`F`](../arrow.-kind/counnest.html#F)`, `[`A`](../arrow.-kind/counnest.html#A)`, `[`B`](../arrow.-kind/counnest.html#B)`>.counnest(): `[`CounnestedType`](../-counnested-type.html)`<`[`F`](../arrow.-kind/counnest.html#F)`, `[`A`](../arrow.-kind/counnest.html#A)`, `[`B`](../arrow.-kind/counnest.html#B)`>` |
| [nest](../arrow.-kind/nest.html) | `fun <F, G, A> `[`UnnestedType`](../-unnested-type.html)`<`[`F`](../arrow.-kind/nest.html#F)`, `[`G`](../arrow.-kind/nest.html#G)`, `[`A`](../arrow.-kind/nest.html#A)`>.nest(): `[`NestedType`](../-nested-type.html)`<`[`F`](../arrow.-kind/nest.html#F)`, `[`G`](../arrow.-kind/nest.html#G)`, `[`A`](../arrow.-kind/nest.html#A)`>` |
| [unnest](../arrow.-kind/unnest.html) | `fun <F, G, A> `[`NestedType`](../-nested-type.html)`<`[`F`](../arrow.-kind/unnest.html#F)`, `[`G`](../arrow.-kind/unnest.html#G)`, `[`A`](../arrow.-kind/unnest.html#A)`>.unnest(): `[`UnnestedType`](../-unnested-type.html)`<`[`F`](../arrow.-kind/unnest.html#F)`, `[`G`](../arrow.-kind/unnest.html#G)`, `[`A`](../arrow.-kind/unnest.html#A)`>` |
| [value](../arrow.-kind/value.html) | `fun <A, T> `[`ConstOf`](../-const-of.html)`<`[`A`](../arrow.-kind/value.html#A)`, `[`T`](../arrow.-kind/value.html#T)`>.value(): `[`A`](../arrow.-kind/value.html#A) |

