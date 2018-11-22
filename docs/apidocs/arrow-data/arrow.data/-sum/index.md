---
title: Sum - arrow-data
---

[arrow-data](../../index.html) / [arrow.data](../index.html) / [Sum](./index.html)

# Sum

`@higherkind data class Sum<F, G, V> : `[`SumOf`](../-sum-of.html)`<`[`F`](index.html#F)`, `[`G`](index.html#G)`, `[`V`](index.html#V)`>, `[`SumKindedJ`](../-sum-kinded-j.html)`<`[`F`](index.html#F)`, `[`G`](index.html#G)`, `[`V`](index.html#V)`>`

### Types

| [Side](-side/index.html) | `sealed class Side` |

### Constructors

| [&lt;init&gt;](-init-.html) | `Sum(left: Kind<`[`F`](index.html#F)`, `[`V`](index.html#V)`>, right: Kind<`[`G`](index.html#G)`, `[`V`](index.html#V)`>, side: `[`Side`](-side/index.html)` = Side.Left)` |

### Properties

| [left](left.html) | `val left: Kind<`[`F`](index.html#F)`, `[`V`](index.html#V)`>` |
| [right](right.html) | `val right: Kind<`[`G`](index.html#G)`, `[`V`](index.html#V)`>` |
| [side](side.html) | `val side: `[`Side`](-side/index.html) |

### Functions

| [changeSide](change-side.html) | `fun changeSide(side: `[`Side`](-side/index.html)`): `[`Sum`](./index.html)`<`[`F`](index.html#F)`, `[`G`](index.html#G)`, `[`V`](index.html#V)`>` |
| [coflatmap](coflatmap.html) | `fun <A> coflatmap(CF: Comonad<`[`F`](index.html#F)`>, CG: Comonad<`[`G`](index.html#G)`>, f: (`[`Sum`](./index.html)`<`[`F`](index.html#F)`, `[`G`](index.html#G)`, `[`V`](index.html#V)`>) -> `[`A`](coflatmap.html#A)`): `[`Sum`](./index.html)`<`[`F`](index.html#F)`, `[`G`](index.html#G)`, `[`A`](coflatmap.html#A)`>` |
| [extract](extract.html) | `fun extract(CF: Comonad<`[`F`](index.html#F)`>, CG: Comonad<`[`G`](index.html#G)`>): `[`V`](index.html#V) |
| [map](map.html) | `fun <A> map(FF: Functor<`[`F`](index.html#F)`>, FG: Functor<`[`G`](index.html#G)`>, f: (`[`V`](index.html#V)`) -> `[`A`](map.html#A)`): `[`Sum`](./index.html)`<`[`F`](index.html#F)`, `[`G`](index.html#G)`, `[`A`](map.html#A)`>` |

### Companion Object Functions

| [left](left.html) | `fun <F, G, V> left(ls: Kind<`[`F`](left.html#F)`, `[`V`](left.html#V)`>, rs: Kind<`[`G`](left.html#G)`, `[`V`](left.html#V)`>): `[`Sum`](./index.html)`<`[`F`](left.html#F)`, `[`G`](left.html#G)`, `[`V`](left.html#V)`>` |
| [right](right.html) | `fun <F, G, V> right(ls: Kind<`[`F`](right.html#F)`, `[`V`](right.html#V)`>, rs: Kind<`[`G`](right.html#G)`, `[`V`](right.html#V)`>): `[`Sum`](./index.html)`<`[`F`](right.html#F)`, `[`G`](right.html#G)`, `[`V`](right.html#V)`>` |

### Extension Functions

| [ap](../arrow.-kind/ap.html) | `fun <E, A, B> `[`ValidatedOf`](../-validated-of.html)`<`[`E`](../arrow.-kind/ap.html#E)`, `[`A`](../arrow.-kind/ap.html#A)`>.ap(SE: Semigroup<`[`E`](../arrow.-kind/ap.html#E)`>, f: `[`Validated`](../-validated/index.html)`<`[`E`](../arrow.-kind/ap.html#E)`, (`[`A`](../arrow.-kind/ap.html#A)`) -> `[`B`](../arrow.-kind/ap.html#B)`>): `[`Validated`](../-validated/index.html)`<`[`E`](../arrow.-kind/ap.html#E)`, `[`B`](../arrow.-kind/ap.html#B)`>`<br>From Apply: if both the function and this value are Valid, apply the function |
| [combine](../arrow.-kind/combine.html) | `fun <E, A> `[`ValidatedOf`](../-validated-of.html)`<`[`E`](../arrow.-kind/combine.html#E)`, `[`A`](../arrow.-kind/combine.html#A)`>.combine(SE: Semigroup<`[`E`](../arrow.-kind/combine.html#E)`>, SA: Semigroup<`[`A`](../arrow.-kind/combine.html#A)`>, y: `[`ValidatedOf`](../-validated-of.html)`<`[`E`](../arrow.-kind/combine.html#E)`, `[`A`](../arrow.-kind/combine.html#A)`>): `[`Validated`](../-validated/index.html)`<`[`E`](../arrow.-kind/combine.html#E)`, `[`A`](../arrow.-kind/combine.html#A)`>` |
| [combineK](../arrow.-kind/combine-k.html) | `fun <A> `[`ListKOf`](../-list-k-of.html)`<`[`A`](../arrow.-kind/combine-k.html#A)`>.combineK(y: `[`ListKOf`](../-list-k-of.html)`<`[`A`](../arrow.-kind/combine-k.html#A)`>): `[`ListK`](../-list-k/index.html)`<`[`A`](../arrow.-kind/combine-k.html#A)`>`<br>`fun <A> `[`NonEmptyListOf`](../-non-empty-list-of.html)`<`[`A`](../arrow.-kind/combine-k.html#A)`>.combineK(y: `[`NonEmptyListOf`](../-non-empty-list-of.html)`<`[`A`](../arrow.-kind/combine-k.html#A)`>): `[`NonEmptyList`](../-non-empty-list/index.html)`<`[`A`](../arrow.-kind/combine-k.html#A)`>`<br>`fun <A> `[`SequenceKOf`](../-sequence-k-of.html)`<`[`A`](../arrow.-kind/combine-k.html#A)`>.combineK(y: `[`SequenceKOf`](../-sequence-k-of.html)`<`[`A`](../arrow.-kind/combine-k.html#A)`>): `[`SequenceK`](../-sequence-k/index.html)`<`[`A`](../arrow.-kind/combine-k.html#A)`>`<br>`fun <A> `[`SetKOf`](../-set-k-of.html)`<`[`A`](../arrow.-kind/combine-k.html#A)`>.combineK(y: `[`SetKOf`](../-set-k-of.html)`<`[`A`](../arrow.-kind/combine-k.html#A)`>): `[`SetK`](../-set-k/index.html)`<`[`A`](../arrow.-kind/combine-k.html#A)`>`<br>`fun <E, A> `[`ValidatedOf`](../-validated-of.html)`<`[`E`](../arrow.-kind/combine-k.html#E)`, `[`A`](../arrow.-kind/combine-k.html#A)`>.combineK(SE: Semigroup<`[`E`](../arrow.-kind/combine-k.html#E)`>, y: `[`ValidatedOf`](../-validated-of.html)`<`[`E`](../arrow.-kind/combine-k.html#E)`, `[`A`](../arrow.-kind/combine-k.html#A)`>): `[`Validated`](../-validated/index.html)`<`[`E`](../arrow.-kind/combine-k.html#E)`, `[`A`](../arrow.-kind/combine-k.html#A)`>` |
| [findValid](../arrow.-kind/find-valid.html) | `fun <E, A> `[`ValidatedOf`](../-validated-of.html)`<`[`E`](../arrow.-kind/find-valid.html#E)`, `[`A`](../arrow.-kind/find-valid.html#A)`>.findValid(SE: Semigroup<`[`E`](../arrow.-kind/find-valid.html#E)`>, that: () -> `[`Validated`](../-validated/index.html)`<`[`E`](../arrow.-kind/find-valid.html#E)`, `[`A`](../arrow.-kind/find-valid.html#A)`>): `[`Validated`](../-validated/index.html)`<`[`E`](../arrow.-kind/find-valid.html#E)`, `[`A`](../arrow.-kind/find-valid.html#A)`>`<br>If `this` is valid return `this`, otherwise if `that` is valid return `that`, otherwise combine the failures. This is similar to [orElse](../arrow.-kind/or-else.html) except that here failures are accumulated. |
| [getOrElse](../arrow.-kind/get-or-else.html) | `fun <E, B> `[`ValidatedOf`](../-validated-of.html)`<`[`E`](../arrow.-kind/get-or-else.html#E)`, `[`B`](../arrow.-kind/get-or-else.html#B)`>.getOrElse(default: () -> `[`B`](../arrow.-kind/get-or-else.html#B)`): `[`B`](../arrow.-kind/get-or-else.html#B)<br>Return the Valid value, or the default if Invalid |
| [handleLeftWith](../arrow.-kind/handle-left-with.html) | `fun <E, A> `[`ValidatedOf`](../-validated-of.html)`<`[`E`](../arrow.-kind/handle-left-with.html#E)`, `[`A`](../arrow.-kind/handle-left-with.html#A)`>.handleLeftWith(f: (`[`E`](../arrow.-kind/handle-left-with.html#E)`) -> `[`ValidatedOf`](../-validated-of.html)`<`[`E`](../arrow.-kind/handle-left-with.html#E)`, `[`A`](../arrow.-kind/handle-left-with.html#A)`>): `[`Validated`](../-validated/index.html)`<`[`E`](../arrow.-kind/handle-left-with.html#E)`, `[`A`](../arrow.-kind/handle-left-with.html#A)`>` |
| [mapFilter](../arrow.-kind/map-filter.html) | `fun <F, A, B> `[`OptionTOf`](../-option-t-of.html)`<`[`F`](../arrow.-kind/map-filter.html#F)`, `[`A`](../arrow.-kind/map-filter.html#A)`>.mapFilter(FF: Functor<`[`F`](../arrow.-kind/map-filter.html#F)`>, f: (`[`A`](../arrow.-kind/map-filter.html#A)`) -> Option<`[`B`](../arrow.-kind/map-filter.html#B)`>): `[`OptionT`](../-option-t/index.html)`<`[`F`](../arrow.-kind/map-filter.html#F)`, `[`B`](../arrow.-kind/map-filter.html#B)`>` |
| [orElse](../arrow.-kind/or-else.html) | `fun <E, A> `[`ValidatedOf`](../-validated-of.html)`<`[`E`](../arrow.-kind/or-else.html#E)`, `[`A`](../arrow.-kind/or-else.html#A)`>.orElse(default: () -> `[`Validated`](../-validated/index.html)`<`[`E`](../arrow.-kind/or-else.html#E)`, `[`A`](../arrow.-kind/or-else.html#A)`>): `[`Validated`](../-validated/index.html)`<`[`E`](../arrow.-kind/or-else.html#E)`, `[`A`](../arrow.-kind/or-else.html#A)`>`<br>Return this if it is Valid, or else fall back to the given default. The functionality is similar to that of [findValid](../arrow.-kind/find-valid.html) except for failure accumulation, where here only the error on the right is preserved and the error on the left is ignored. |
| [orNull](../arrow.-kind/or-null.html) | `fun <E, B> `[`ValidatedOf`](../-validated-of.html)`<`[`E`](../arrow.-kind/or-null.html#E)`, `[`B`](../arrow.-kind/or-null.html#B)`>.orNull(): `[`B`](../arrow.-kind/or-null.html#B)`?`<br>Return the Valid value, or null if Invalid |
| [runM](../arrow.-kind/run-m.html) | `fun <F, S, A> `[`StateTOf`](../-state-t-of.html)`<`[`F`](../arrow.-kind/run-m.html#F)`, `[`S`](../arrow.-kind/run-m.html#S)`, `[`A`](../arrow.-kind/run-m.html#A)`>.runM(MF: Monad<`[`F`](../arrow.-kind/run-m.html#F)`>, initial: `[`S`](../arrow.-kind/run-m.html#S)`): Kind<`[`F`](../arrow.-kind/run-m.html#F)`, Tuple2<`[`S`](../arrow.-kind/run-m.html#S)`, `[`A`](../arrow.-kind/run-m.html#A)`>>`<br>Run the stateful computation within the context `F`. |
| [stateT](../arrow.-kind/state-t.html) | `fun <F, S, A> `[`StateTFunOf`](../-state-t-fun-of.html)`<`[`F`](../arrow.-kind/state-t.html#F)`, `[`S`](../arrow.-kind/state-t.html#S)`, `[`A`](../arrow.-kind/state-t.html#A)`>.stateT(): `[`StateT`](../-state-t/index.html)`<`[`F`](../arrow.-kind/state-t.html#F)`, `[`S`](../arrow.-kind/state-t.html#S)`, `[`A`](../arrow.-kind/state-t.html#A)`>`<br>Wrap the function with [StateT](../-state-t/index.html). |
| [toIor](../arrow.-kind/to-ior.html) | `fun <E, A> `[`ValidatedOf`](../-validated-of.html)`<`[`E`](../arrow.-kind/to-ior.html#E)`, `[`A`](../arrow.-kind/to-ior.html#A)`>.toIor(): `[`Ior`](../-ior/index.html)`<`[`E`](../arrow.-kind/to-ior.html#E)`, `[`A`](../arrow.-kind/to-ior.html#A)`>`<br>Converts the value to an Ior&lt;E, A&gt; |
| [toList](../arrow.-kind/to-list.html) | `fun <A> `[`SequenceKOf`](../-sequence-k-of.html)`<`[`A`](../arrow.-kind/to-list.html#A)`>.toList(): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`A`](../arrow.-kind/to-list.html#A)`>` |
| [traverse](../arrow.-kind/traverse.html) | `fun <G, E, A, B> `[`ValidatedOf`](../-validated-of.html)`<`[`E`](../arrow.-kind/traverse.html#E)`, `[`A`](../arrow.-kind/traverse.html#A)`>.traverse(GA: Applicative<`[`G`](../arrow.-kind/traverse.html#G)`>, f: (`[`A`](../arrow.-kind/traverse.html#A)`) -> Kind<`[`G`](../arrow.-kind/traverse.html#G)`, `[`B`](../arrow.-kind/traverse.html#B)`>): Kind<`[`G`](../arrow.-kind/traverse.html#G)`, `[`Validated`](../-validated/index.html)`<`[`E`](../arrow.-kind/traverse.html#E)`, `[`B`](../arrow.-kind/traverse.html#B)`>>` |
| [valueOr](../arrow.-kind/value-or.html) | `fun <E, B> `[`ValidatedOf`](../-validated-of.html)`<`[`E`](../arrow.-kind/value-or.html#E)`, `[`B`](../arrow.-kind/value-or.html#B)`>.valueOr(f: (`[`E`](../arrow.-kind/value-or.html#E)`) -> `[`B`](../arrow.-kind/value-or.html#B)`): `[`B`](../arrow.-kind/value-or.html#B)<br>Return the Valid value, or the result of f if Invalid |

