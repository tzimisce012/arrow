---
title: Ior - arrow-data
---

[arrow-data](../../index.html) / [arrow.data](../index.html) / [Ior](./index.html)

# Ior

`@higherkind sealed class Ior<out A, out B> : `[`IorOf`](../-ior-of.html)`<`[`A`](index.html#A)`, `[`B`](index.html#B)`>`

Port of https://github.com/typelevel/cats/blob/v0.9.0/core/src/main/scala/cats/data/Ior.scala

Represents a right-biased disjunction that is either an `A`, or a `B`, or both an `A` and a `B`.

An instance of [Ior](./index.html)&lt;`A`,`B`&gt; is one of:

* [Ior.Left](-left/index.html) &lt;`A`&gt;
* [Ior.Right](-right/index.html) &lt;`B`&gt;
* [Ior.Both](-both/index.html)&lt;`A`,`B`&gt;

[Ior](./index.html)&lt;`A`,`B`&gt; is similar to [Either](#)&lt;`A`,`B`&gt;, except that it can represent the simultaneous presence of
an `A` and a `B`. It is right-biased so methods such as `map` and `flatMap` operate on the
`B` value. Some methods, like `flatMap`, handle the presence of two [Ior.Both](-both/index.html) values using a
`[Semigroup]<`A`>, while other methods, like [toEither], ignore the `A` value in a [Ior.Both Both](#).

[Ior](./index.html)&lt;`A`,`B`&gt; is isomorphic to [Either](#)&lt;[Either](#)&lt;`A`,`B`&gt;, [Pair](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/index.html)&lt;`A`,`B`&gt;&gt;, but provides methods biased toward `B`
values, regardless of whether the `B` values appear in a [Ior.Right](-right/index.html) or a [Ior.Both](-both/index.html).
The isomorphic Either form can be accessed via the [unwrap](unwrap.html) method.

### Types

| [Both](-both/index.html) | `data class Both<out A, out B> : `[`Ior`](./index.html)`<`[`A`](-both/index.html#A)`, `[`B`](-both/index.html#B)`>` |
| [Left](-left/index.html) | `data class Left<out A, out B> : `[`Ior`](./index.html)`<`[`A`](-left/index.html#A)`, `[`B`](-left/index.html#B)`>` |
| [Right](-right/index.html) | `data class Right<out A, out B> : `[`Ior`](./index.html)`<`[`A`](-right/index.html#A)`, `[`B`](-right/index.html#B)`>` |

### Properties

| [isBoth](is-both.html) | `abstract val isBoth: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Returns `true` if this is a [Left](-left/index.html), `false` otherwise. |
| [isLeft](is-left.html) | `abstract val isLeft: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Returns `true` if this is a [Left](-left/index.html), `false` otherwise. |
| [isRight](is-right.html) | `abstract val isRight: `[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Returns `true` if this is a [Right](-right/index.html), `false` otherwise. |

### Functions

| [bimap](bimap.html) | `fun <C, D> bimap(fa: (`[`A`](index.html#A)`) -> `[`C`](bimap.html#C)`, fb: (`[`B`](index.html#B)`) -> `[`D`](bimap.html#D)`): `[`Ior`](./index.html)`<`[`C`](bimap.html#C)`, `[`D`](bimap.html#D)`>`<br>Apply `fa` if this is a [Left](-left/index.html) or [Both](-both/index.html) to `A` and apply `fb` if this is [Right](-right/index.html) or [Both](-both/index.html) to `B` |
| [fold](fold.html) | `fun <C> fold(fa: (`[`A`](index.html#A)`) -> `[`C`](fold.html#C)`, fb: (`[`B`](index.html#B)`) -> `[`C`](fold.html#C)`, fab: (`[`A`](index.html#A)`, `[`B`](index.html#B)`) -> `[`C`](fold.html#C)`): `[`C`](fold.html#C)<br>Applies `fa` if this is a [Left](-left/index.html), `fb` if this is a [Right](-right/index.html) or `fab` if this is a [Both](-both/index.html) |
| [foldLeft](fold-left.html) | `fun <C> foldLeft(c: `[`C`](fold-left.html#C)`, f: (`[`C`](fold-left.html#C)`, `[`B`](index.html#B)`) -> `[`C`](fold-left.html#C)`): `[`C`](fold-left.html#C) |
| [foldRight](fold-right.html) | `fun <C> foldRight(lc: Eval<`[`C`](fold-right.html#C)`>, f: (`[`B`](index.html#B)`, Eval<`[`C`](fold-right.html#C)`>) -> Eval<`[`C`](fold-right.html#C)`>): Eval<`[`C`](fold-right.html#C)`>` |
| [map](map.html) | `fun <D> map(f: (`[`B`](index.html#B)`) -> `[`D`](map.html#D)`): `[`Ior`](./index.html)`<`[`A`](index.html#A)`, `[`D`](map.html#D)`>`<br>The given function is applied if this is a [Right](-right/index.html) or [Both](-both/index.html) to `B`. |
| [mapLeft](map-left.html) | `fun <C> mapLeft(fa: (`[`A`](index.html#A)`) -> `[`C`](map-left.html#C)`): `[`Ior`](./index.html)`<`[`C`](map-left.html#C)`, `[`B`](index.html#B)`>`<br>The given function is applied if this is a [Left](-left/index.html) or [Both](-both/index.html) to `A`. |
| [pad](pad.html) | `fun pad(): `[`Pair`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/index.html)`<Option<`[`A`](index.html#A)`>, Option<`[`B`](index.html#B)`>>`<br>Return this [Ior](./index.html) as [Pair](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/index.html) of [Option](#) |
| [swap](swap.html) | `fun swap(): `[`Ior`](./index.html)`<`[`B`](index.html#B)`, `[`A`](index.html#A)`>`<br>If this is a [Left](-left/index.html), then return the left value in [Right](-right/index.html) or vice versa, when this is [Both](-both/index.html) , left and right values are swap |
| [toEither](to-either.html) | `fun toEither(): Either<`[`A`](index.html#A)`, `[`B`](index.html#B)`>`<br>Returns a [Either.Right](#) containing the [Right](-right/index.html) value or `B` if this is [Right](-right/index.html) or [Both](-both/index.html) and [Either.Left](#) if this is a [Left](-left/index.html). |
| [toOption](to-option.html) | `fun toOption(): Option<`[`B`](index.html#B)`>`<br>Returns a [Some](#) containing the [Right](-right/index.html) value or `B` if this is [Right](-right/index.html) or [Both](-both/index.html) and [None](#) if this is a [Left](-left/index.html). |
| [toValidated](to-validated.html) | `fun toValidated(): `[`Validated`](../-validated/index.html)`<`[`A`](index.html#A)`, `[`B`](index.html#B)`>`<br>Returns a [Validated.Valid](../-validated/-valid/index.html) containing the [Right](-right/index.html) value or `B` if this is [Right](-right/index.html) or [Both](-both/index.html) and [Validated.Invalid](../-validated/-invalid/index.html) if this is a [Left](-left/index.html). |
| [traverse](traverse.html) | `fun <G, C> traverse(GA: Applicative<`[`G`](traverse.html#G)`>, f: (`[`B`](index.html#B)`) -> Kind<`[`G`](traverse.html#G)`, `[`C`](traverse.html#C)`>): Kind<`[`G`](traverse.html#G)`, `[`Ior`](./index.html)`<`[`A`](index.html#A)`, `[`C`](traverse.html#C)`>>` |
| [unwrap](unwrap.html) | `fun unwrap(): Either<Either<`[`A`](index.html#A)`, `[`B`](index.html#B)`>, `[`Pair`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/index.html)`<`[`A`](index.html#A)`, `[`B`](index.html#B)`>>`<br>Return the isomorphic [Either](#) of this [Ior](./index.html) |

### Companion Object Functions

| [bothNel](both-nel.html) | `fun <A, B> bothNel(a: `[`A`](both-nel.html#A)`, b: `[`B`](both-nel.html#B)`): `[`IorNel`](../-ior-nel.html)`<`[`A`](both-nel.html#A)`, `[`B`](both-nel.html#B)`>` |
| [fromOptions](from-options.html) | `fun <A, B> fromOptions(oa: Option<`[`A`](from-options.html#A)`>, ob: Option<`[`B`](from-options.html#B)`>): Option<`[`Ior`](./index.html)`<`[`A`](from-options.html#A)`, `[`B`](from-options.html#B)`>>`<br>Create an [Ior](./index.html) from two Options if at least one of them is defined. |
| [leftNel](left-nel.html) | `fun <A, B> leftNel(a: `[`A`](left-nel.html#A)`): `[`IorNel`](../-ior-nel.html)`<`[`A`](left-nel.html#A)`, `[`B`](left-nel.html#B)`>` |
| [tailRecM](tail-rec-m.html) | `fun <L, A, B> tailRecM(a: `[`A`](tail-rec-m.html#A)`, f: (`[`A`](tail-rec-m.html#A)`) -> `[`IorOf`](../-ior-of.html)`<`[`L`](tail-rec-m.html#L)`, Either<`[`A`](tail-rec-m.html#A)`, `[`B`](tail-rec-m.html#B)`>>, SL: Semigroup<`[`L`](tail-rec-m.html#L)`>): `[`Ior`](./index.html)`<`[`L`](tail-rec-m.html#L)`, `[`B`](tail-rec-m.html#B)`>` |

### Extension Functions

| [ap](../ap.html) | `fun <A, B, D> `[`Ior`](./index.html)`<`[`A`](../ap.html#A)`, `[`B`](../ap.html#B)`>.ap(SG: Semigroup<`[`A`](../ap.html#A)`>, ff: `[`IorOf`](../-ior-of.html)`<`[`A`](../ap.html#A)`, (`[`B`](../ap.html#B)`) -> `[`D`](../ap.html#D)`>): `[`Ior`](./index.html)`<`[`A`](../ap.html#A)`, `[`D`](../ap.html#D)`>` |
| [ap](../arrow.-kind/ap.html) | `fun <E, A, B> `[`ValidatedOf`](../-validated-of.html)`<`[`E`](../arrow.-kind/ap.html#E)`, `[`A`](../arrow.-kind/ap.html#A)`>.ap(SE: Semigroup<`[`E`](../arrow.-kind/ap.html#E)`>, f: `[`Validated`](../-validated/index.html)`<`[`E`](../arrow.-kind/ap.html#E)`, (`[`A`](../arrow.-kind/ap.html#A)`) -> `[`B`](../arrow.-kind/ap.html#B)`>): `[`Validated`](../-validated/index.html)`<`[`E`](../arrow.-kind/ap.html#E)`, `[`B`](../arrow.-kind/ap.html#B)`>`<br>From Apply: if both the function and this value are Valid, apply the function |
| [combine](../arrow.-kind/combine.html) | `fun <E, A> `[`ValidatedOf`](../-validated-of.html)`<`[`E`](../arrow.-kind/combine.html#E)`, `[`A`](../arrow.-kind/combine.html#A)`>.combine(SE: Semigroup<`[`E`](../arrow.-kind/combine.html#E)`>, SA: Semigroup<`[`A`](../arrow.-kind/combine.html#A)`>, y: `[`ValidatedOf`](../-validated-of.html)`<`[`E`](../arrow.-kind/combine.html#E)`, `[`A`](../arrow.-kind/combine.html#A)`>): `[`Validated`](../-validated/index.html)`<`[`E`](../arrow.-kind/combine.html#E)`, `[`A`](../arrow.-kind/combine.html#A)`>` |
| [combineK](../arrow.-kind/combine-k.html) | `fun <A> `[`ListKOf`](../-list-k-of.html)`<`[`A`](../arrow.-kind/combine-k.html#A)`>.combineK(y: `[`ListKOf`](../-list-k-of.html)`<`[`A`](../arrow.-kind/combine-k.html#A)`>): `[`ListK`](../-list-k/index.html)`<`[`A`](../arrow.-kind/combine-k.html#A)`>`<br>`fun <A> `[`NonEmptyListOf`](../-non-empty-list-of.html)`<`[`A`](../arrow.-kind/combine-k.html#A)`>.combineK(y: `[`NonEmptyListOf`](../-non-empty-list-of.html)`<`[`A`](../arrow.-kind/combine-k.html#A)`>): `[`NonEmptyList`](../-non-empty-list/index.html)`<`[`A`](../arrow.-kind/combine-k.html#A)`>`<br>`fun <A> `[`SequenceKOf`](../-sequence-k-of.html)`<`[`A`](../arrow.-kind/combine-k.html#A)`>.combineK(y: `[`SequenceKOf`](../-sequence-k-of.html)`<`[`A`](../arrow.-kind/combine-k.html#A)`>): `[`SequenceK`](../-sequence-k/index.html)`<`[`A`](../arrow.-kind/combine-k.html#A)`>`<br>`fun <A> `[`SetKOf`](../-set-k-of.html)`<`[`A`](../arrow.-kind/combine-k.html#A)`>.combineK(y: `[`SetKOf`](../-set-k-of.html)`<`[`A`](../arrow.-kind/combine-k.html#A)`>): `[`SetK`](../-set-k/index.html)`<`[`A`](../arrow.-kind/combine-k.html#A)`>`<br>`fun <E, A> `[`ValidatedOf`](../-validated-of.html)`<`[`E`](../arrow.-kind/combine-k.html#E)`, `[`A`](../arrow.-kind/combine-k.html#A)`>.combineK(SE: Semigroup<`[`E`](../arrow.-kind/combine-k.html#E)`>, y: `[`ValidatedOf`](../-validated-of.html)`<`[`E`](../arrow.-kind/combine-k.html#E)`, `[`A`](../arrow.-kind/combine-k.html#A)`>): `[`Validated`](../-validated/index.html)`<`[`E`](../arrow.-kind/combine-k.html#E)`, `[`A`](../arrow.-kind/combine-k.html#A)`>` |
| [findValid](../arrow.-kind/find-valid.html) | `fun <E, A> `[`ValidatedOf`](../-validated-of.html)`<`[`E`](../arrow.-kind/find-valid.html#E)`, `[`A`](../arrow.-kind/find-valid.html#A)`>.findValid(SE: Semigroup<`[`E`](../arrow.-kind/find-valid.html#E)`>, that: () -> `[`Validated`](../-validated/index.html)`<`[`E`](../arrow.-kind/find-valid.html#E)`, `[`A`](../arrow.-kind/find-valid.html#A)`>): `[`Validated`](../-validated/index.html)`<`[`E`](../arrow.-kind/find-valid.html#E)`, `[`A`](../arrow.-kind/find-valid.html#A)`>`<br>If `this` is valid return `this`, otherwise if `that` is valid return `that`, otherwise combine the failures. This is similar to [orElse](../arrow.-kind/or-else.html) except that here failures are accumulated. |
| [flatMap](../flat-map.html) | `fun <A, B, D> `[`Ior`](./index.html)`<`[`A`](../flat-map.html#A)`, `[`B`](../flat-map.html#B)`>.flatMap(SG: Semigroup<`[`A`](../flat-map.html#A)`>, f: (`[`B`](../flat-map.html#B)`) -> `[`Ior`](./index.html)`<`[`A`](../flat-map.html#A)`, `[`D`](../flat-map.html#D)`>): `[`Ior`](./index.html)`<`[`A`](../flat-map.html#A)`, `[`D`](../flat-map.html#D)`>`<br>Binds the given function across [Ior.Right](-right/index.html). |
| [getOrElse](../get-or-else.html) | `fun <A, B> `[`Ior`](./index.html)`<`[`A`](../get-or-else.html#A)`, `[`B`](../get-or-else.html#B)`>.getOrElse(default: () -> `[`B`](../get-or-else.html#B)`): `[`B`](../get-or-else.html#B) |
| [getOrElse](../arrow.-kind/get-or-else.html) | `fun <E, B> `[`ValidatedOf`](../-validated-of.html)`<`[`E`](../arrow.-kind/get-or-else.html#E)`, `[`B`](../arrow.-kind/get-or-else.html#B)`>.getOrElse(default: () -> `[`B`](../arrow.-kind/get-or-else.html#B)`): `[`B`](../arrow.-kind/get-or-else.html#B)<br>Return the Valid value, or the default if Invalid |
| [handleLeftWith](../arrow.-kind/handle-left-with.html) | `fun <E, A> `[`ValidatedOf`](../-validated-of.html)`<`[`E`](../arrow.-kind/handle-left-with.html#E)`, `[`A`](../arrow.-kind/handle-left-with.html#A)`>.handleLeftWith(f: (`[`E`](../arrow.-kind/handle-left-with.html#E)`) -> `[`ValidatedOf`](../-validated-of.html)`<`[`E`](../arrow.-kind/handle-left-with.html#E)`, `[`A`](../arrow.-kind/handle-left-with.html#A)`>): `[`Validated`](../-validated/index.html)`<`[`E`](../arrow.-kind/handle-left-with.html#E)`, `[`A`](../arrow.-kind/handle-left-with.html#A)`>` |
| [mapFilter](../arrow.-kind/map-filter.html) | `fun <F, A, B> `[`OptionTOf`](../-option-t-of.html)`<`[`F`](../arrow.-kind/map-filter.html#F)`, `[`A`](../arrow.-kind/map-filter.html#A)`>.mapFilter(FF: Functor<`[`F`](../arrow.-kind/map-filter.html#F)`>, f: (`[`A`](../arrow.-kind/map-filter.html#A)`) -> Option<`[`B`](../arrow.-kind/map-filter.html#B)`>): `[`OptionT`](../-option-t/index.html)`<`[`F`](../arrow.-kind/map-filter.html#F)`, `[`B`](../arrow.-kind/map-filter.html#B)`>` |
| [orElse](../arrow.-kind/or-else.html) | `fun <E, A> `[`ValidatedOf`](../-validated-of.html)`<`[`E`](../arrow.-kind/or-else.html#E)`, `[`A`](../arrow.-kind/or-else.html#A)`>.orElse(default: () -> `[`Validated`](../-validated/index.html)`<`[`E`](../arrow.-kind/or-else.html#E)`, `[`A`](../arrow.-kind/or-else.html#A)`>): `[`Validated`](../-validated/index.html)`<`[`E`](../arrow.-kind/or-else.html#E)`, `[`A`](../arrow.-kind/or-else.html#A)`>`<br>Return this if it is Valid, or else fall back to the given default. The functionality is similar to that of [findValid](../arrow.-kind/find-valid.html) except for failure accumulation, where here only the error on the right is preserved and the error on the left is ignored. |
| [orNull](../arrow.-kind/or-null.html) | `fun <E, B> `[`ValidatedOf`](../-validated-of.html)`<`[`E`](../arrow.-kind/or-null.html#E)`, `[`B`](../arrow.-kind/or-null.html#B)`>.orNull(): `[`B`](../arrow.-kind/or-null.html#B)`?`<br>Return the Valid value, or null if Invalid |
| [runM](../arrow.-kind/run-m.html) | `fun <F, S, A> `[`StateTOf`](../-state-t-of.html)`<`[`F`](../arrow.-kind/run-m.html#F)`, `[`S`](../arrow.-kind/run-m.html#S)`, `[`A`](../arrow.-kind/run-m.html#A)`>.runM(MF: Monad<`[`F`](../arrow.-kind/run-m.html#F)`>, initial: `[`S`](../arrow.-kind/run-m.html#S)`): Kind<`[`F`](../arrow.-kind/run-m.html#F)`, Tuple2<`[`S`](../arrow.-kind/run-m.html#S)`, `[`A`](../arrow.-kind/run-m.html#A)`>>`<br>Run the stateful computation within the context `F`. |
| [stateT](../arrow.-kind/state-t.html) | `fun <F, S, A> `[`StateTFunOf`](../-state-t-fun-of.html)`<`[`F`](../arrow.-kind/state-t.html#F)`, `[`S`](../arrow.-kind/state-t.html#S)`, `[`A`](../arrow.-kind/state-t.html#A)`>.stateT(): `[`StateT`](../-state-t/index.html)`<`[`F`](../arrow.-kind/state-t.html#F)`, `[`S`](../arrow.-kind/state-t.html#S)`, `[`A`](../arrow.-kind/state-t.html#A)`>`<br>Wrap the function with [StateT](../-state-t/index.html). |
| [toIor](../arrow.-kind/to-ior.html) | `fun <E, A> `[`ValidatedOf`](../-validated-of.html)`<`[`E`](../arrow.-kind/to-ior.html#E)`, `[`A`](../arrow.-kind/to-ior.html#A)`>.toIor(): `[`Ior`](./index.html)`<`[`E`](../arrow.-kind/to-ior.html#E)`, `[`A`](../arrow.-kind/to-ior.html#A)`>`<br>Converts the value to an Ior&lt;E, A&gt; |
| [toList](../arrow.-kind/to-list.html) | `fun <A> `[`SequenceKOf`](../-sequence-k-of.html)`<`[`A`](../arrow.-kind/to-list.html#A)`>.toList(): `[`List`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)`<`[`A`](../arrow.-kind/to-list.html#A)`>` |
| [traverse](../arrow.-kind/traverse.html) | `fun <G, E, A, B> `[`ValidatedOf`](../-validated-of.html)`<`[`E`](../arrow.-kind/traverse.html#E)`, `[`A`](../arrow.-kind/traverse.html#A)`>.traverse(GA: Applicative<`[`G`](../arrow.-kind/traverse.html#G)`>, f: (`[`A`](../arrow.-kind/traverse.html#A)`) -> Kind<`[`G`](../arrow.-kind/traverse.html#G)`, `[`B`](../arrow.-kind/traverse.html#B)`>): Kind<`[`G`](../arrow.-kind/traverse.html#G)`, `[`Validated`](../-validated/index.html)`<`[`E`](../arrow.-kind/traverse.html#E)`, `[`B`](../arrow.-kind/traverse.html#B)`>>` |
| [valueOr](../arrow.-kind/value-or.html) | `fun <E, B> `[`ValidatedOf`](../-validated-of.html)`<`[`E`](../arrow.-kind/value-or.html#E)`, `[`B`](../arrow.-kind/value-or.html#B)`>.valueOr(f: (`[`E`](../arrow.-kind/value-or.html#E)`) -> `[`B`](../arrow.-kind/value-or.html#B)`): `[`B`](../arrow.-kind/value-or.html#B)<br>Return the Valid value, or the result of f if Invalid |

### Inheritors

| [Both](-both/index.html) | `data class Both<out A, out B> : `[`Ior`](./index.html)`<`[`A`](-both/index.html#A)`, `[`B`](-both/index.html#B)`>` |
| [Left](-left/index.html) | `data class Left<out A, out B> : `[`Ior`](./index.html)`<`[`A`](-left/index.html#A)`, `[`B`](-left/index.html#B)`>` |
| [Right](-right/index.html) | `data class Right<out A, out B> : `[`Ior`](./index.html)`<`[`A`](-right/index.html#A)`, `[`B`](-right/index.html#B)`>` |

